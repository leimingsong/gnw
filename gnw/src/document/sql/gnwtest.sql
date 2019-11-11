/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : gnw

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-11-11 14:16:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for perssion
-- ----------------------------
DROP TABLE IF EXISTS `perssion`;
CREATE TABLE `perssion` (
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
-- Records of perssion
-- ----------------------------
INSERT INTO `perssion` VALUES ('1', null, null, '/add', null, null, null, null);
INSERT INTO `perssion` VALUES ('2', null, null, '/selcet', null, null, null, null);
INSERT INTO `perssion` VALUES ('3', null, null, '/hello', null, null, null, null);

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
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'user', null, null, null, null, null);
INSERT INTO `role` VALUES ('2', 'admin', null, null, null, null, null);

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
-- Records of role_right
-- ----------------------------
INSERT INTO `role_right` VALUES ('1', '1', '1', null, null, null, null);
INSERT INTO `role_right` VALUES ('2', '1', '2', null, null, null, null);
INSERT INTO `role_right` VALUES ('3', '2', '1', null, null, null, null);
INSERT INTO `role_right` VALUES ('4', '2', '2', null, null, null, null);
INSERT INTO `role_right` VALUES ('5', '1', '3', null, null, null, null);

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
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('428ca6f93bf14205acafb7e7cb5ee5d8', null, '123', null, 'eP60', 'e0b0b5ef3c96dbc9e52c70cb5d4e99fa', '2', null, null, '2019-11-11 13:51:00', '2019-11-11 13:51:00', null, null, null);

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

-- ----------------------------
-- Records of user_role
-- ----------------------------
