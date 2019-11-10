/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : gnw

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-11-10 22:03:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for right
-- ----------------------------
DROP TABLE IF EXISTS `right`;
CREATE TABLE `right` (
  `id` varchar(36) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '权限编号，主键，用uuid来随机生成',
  `right_name` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '权限名字',
  `right_comment` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT 'v',
  `right_url` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '权限资源url',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `spare1` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `spare2` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `spare3` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='权限表：(right)';

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` varchar(36) COLLATE utf8_unicode_ci NOT NULL COMMENT '角色编号，主键，用uuid来随机生成',
  `role_name` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '角色名字',
  `role_commen` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '角色的描述信息',
  `crate_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `spare1` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `spare2` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `spare3` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='角色表：(role)';

-- ----------------------------
-- Table structure for role_right
-- ----------------------------
DROP TABLE IF EXISTS `role_right`;
CREATE TABLE `role_right` (
  `id` varchar(36) COLLATE utf8_unicode_ci NOT NULL COMMENT '角色_权限id',
  `role_id` varchar(36) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '角色id',
  `right_id` varchar(36) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '权限id',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `spare1` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `spare2` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `spare3` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='角色_权限表：(role_right)';

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(36) COLLATE utf8_unicode_ci NOT NULL COMMENT '用户编号，主键,用uuid来随机生成',
  `uDetails_id` varchar(36) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户基本信息编号，主键，用uuid来随机生成',
  `account` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户账号，唯一，可以是手机号或者邮箱',
  `nickname` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户昵称，用户自定义的名字，比如“小鬼的梦想”',
  `salt` varchar(4) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '加密盐',
  `password` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户密码,使用md5加密后的字符串',
  `role_id` varchar(36) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '角色编号，外键（关联role表的roleId字段），用uuid来随机生成',
  `user_status` varchar(16) COLLATE utf8_unicode_ci DEFAULT '0' COMMENT '用户状态 “0”表示账户正常，“1”表示用户被锁定',
  `dev` varchar(2) COLLATE utf8_unicode_ci DEFAULT '0' COMMENT '逻辑删除  ‘0’表示正常  “1”表示用户被逻辑删除，不能通过验证登录',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `del_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '删除时间',
  `spare1` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `spare2` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `spare3` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='用户表：(user)';

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` varchar(36) COLLATE utf8_unicode_ci NOT NULL COMMENT '用户角色表',
  `user_id` varchar(36) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户ID',
  `role_id` varchar(36) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '角色id',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `spare1` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `spare2` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `spare3` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='用户_角色表：(user_role)';
