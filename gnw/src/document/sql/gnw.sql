/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50548
Source Host           : localhost:3306
Source Database       : gnw

Target Server Type    : MYSQL
Target Server Version : 50548
File Encoding         : 65001

Date: 2019-11-09 11:19:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `details_img`
-- ----------------------------
DROP TABLE IF EXISTS `details_img`;
CREATE TABLE `details_img` (
  `deta_img_id` varchar(36) NOT NULL COMMENT '璇︽儏椤靛浘鐗囩紪鍙凤紝涓婚敭锛岀敤uuid闅忔満鐢熸垚',
  `prod_details_id` varchar(36) DEFAULT NULL COMMENT '鍟嗗搧璇︽儏缂栧彿锛屽閿紙鍏宠仈product_details琛ㄧ殑prod_etails_id瀛楁锛夛紝鐢╱uid闅忔満鐢熸垚',
  `deta_img_url` varchar(64) DEFAULT NULL COMMENT '璇︽儏椤靛浘鐗嘦rl',
  `spare1` varchar(64) DEFAULT NULL,
  `spare2` varchar(64) DEFAULT NULL,
  `spare3` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`deta_img_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='璇︽儏椤靛浘鐗囪〃锛岀敤鏉ヤ繚瀛樺浘鐗囩殑涓昏淇℃伅';

-- ----------------------------
-- Records of details_img
-- ----------------------------

-- ----------------------------
-- Table structure for `order_details`
-- ----------------------------
DROP TABLE IF EXISTS `order_details`;
CREATE TABLE `order_details` (
  `order_details_id` varchar(36) NOT NULL COMMENT '璁㈠崟璇︽儏缂栧彿锛屼富閿紝鐢╱uid闅忔満鐢熸垚',
  `order_id` varchar(36) DEFAULT NULL COMMENT '璁㈠崟缂栧彿锛屽閿紙鍏宠仈order琛ㄧ殑order_id瀛楁锛夛紝鐢╱uid鐢熸垚',
  `prod_id` varchar(36) DEFAULT NULL COMMENT '鍟嗗搧缂栧彿锛屽閿紙鍏宠仈product琛ㄧ殑prod_id瀛楁锛夛紝鐢╱uid闅忔満鐢熸垚',
  `pre_price` varchar(32) DEFAULT NULL COMMENT '鍗曚环',
  `prod_count` int(11) DEFAULT NULL COMMENT '鍟嗗搧鏁伴噺',
  `total_price` varchar(32) DEFAULT NULL COMMENT '鎬讳环',
  `spare1` varchar(64) DEFAULT NULL,
  `spare2` varchar(64) DEFAULT NULL,
  `spare3` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`order_details_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='璁㈠崟璇︽儏琛紝鐢ㄦ潵淇濆瓨璁㈠崟鐨勮缁嗕俊鎭紝璁㈠崟璇︽儏缂栧彿锛岃鍗曠紪鍙凤紝鍟嗗搧缂栧彿锛屽崟浠凤紝鍟嗗搧鏁伴噺锛屾€讳环';

-- ----------------------------
-- Records of order_details
-- ----------------------------

-- ----------------------------
-- Table structure for `product_details`
-- ----------------------------
DROP TABLE IF EXISTS `product_details`;
CREATE TABLE `product_details` (
  `prod_details_id` varchar(36) NOT NULL COMMENT '鍟嗗搧璇︽儏缂栧彿锛屼富閿紝鐢╱uid闅忔満鐢熸垚',
  `cate_id` varchar(36) DEFAULT NULL COMMENT '绫诲埆缂栧彿锛屽閿紙鍏宠仈category琛ㄧ殑cate_id瀛楁锛夛紝鐢╱uid鑷姩鐢熸垚',
  `prod_details_name` varchar(32) DEFAULT NULL COMMENT '鍟嗗搧鍚嶇О',
  `prod_details_comment` varchar(255) DEFAULT NULL COMMENT '鍟嗗搧鎻忚堪',
  `show_img_url` varchar(64) DEFAULT NULL COMMENT '灞曠ず鍥剧墖Url',
  `spare1` varchar(64) DEFAULT NULL,
  `spare2` varchar(64) DEFAULT NULL,
  `spare3` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`prod_details_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='鍟嗗搧璇︽儏琛紝鐢ㄦ潵淇濆瓨鍟嗗搧鐨勮缁嗕俊鎭紝鍟嗗搧璇︽儏缂栧彿锛岀被鍒紪鍙凤紝鍟嗗搧鍚嶇О锛屽晢鍝佹弿杩帮紝灞曠ず鍥剧墖URL	';

-- ----------------------------
-- Records of product_details
-- ----------------------------
