/*
Navicat MySQL Data Transfer

Source Server         : gnw
Source Server Version : 50726
Source Host           : localhost:3306
Source Database       : gnw

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2019-11-10 20:45:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `area`
-- ----------------------------
DROP TABLE IF EXISTS `area`;
CREATE TABLE `area` (
  `area_id` varchar(36) NOT NULL COMMENT '��ַ��ţ���������uuid�������',
  `area_name` varchar(32) DEFAULT NULL COMMENT '��ַ����',
  `par_area_id` varchar(36) DEFAULT NULL COMMENT '�ϼ���ַ��ţ���������������area_id�ֶΣ�',
  `spare1` varchar(64) DEFAULT NULL,
  `spare2` varchar(64) DEFAULT NULL,
  `spare3` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`area_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��������������������Ϣ����ַ��ţ���ַ���֣��ϼ���ַ���';

-- ----------------------------
-- Records of area
-- ----------------------------

-- ----------------------------
-- Table structure for `carousel`
-- ----------------------------
DROP TABLE IF EXISTS `carousel`;
CREATE TABLE `carousel` (
  `caro_id` varchar(36) NOT NULL COMMENT '�ֲ�ͼ��ţ���������uuid�������',
  `caro_url` varchar(64) DEFAULT NULL COMMENT '�ֲ�ͼ��ַ',
  `caro_status` varchar(32) DEFAULT NULL COMMENT '�ֲ�״̬',
  `spare1` varchar(64) DEFAULT NULL,
  `spare2` varchar(64) DEFAULT NULL,
  `spare3` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`caro_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�ֲ�������������ֲ�ͼ�������Ϣ���ֲ���ţ��ֲ�url���ֲ�״̬';

-- ----------------------------
-- Records of carousel
-- ----------------------------

-- ----------------------------
-- Table structure for `category`
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `cate_id` varchar(36) NOT NULL COMMENT '����ţ���������uuid�Զ�����',
  `par_cate_id` varchar(36) DEFAULT NULL COMMENT '�ϼ�����ţ���������������cate_id�ֶΣ�,��uuid���������',
  `cate_name` varchar(32) DEFAULT NULL COMMENT '�������',
  `cate_status` varchar(32) DEFAULT NULL COMMENT '���״̬',
  `spare1` varchar(64) DEFAULT NULL,
  `spare2` varchar(64) DEFAULT NULL,
  `spare3` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`cate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='���������������Ʒ�������Ϣ������ţ��ϼ�����ţ�������ƣ�״̬';

-- ----------------------------
-- Records of category
-- ----------------------------

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
-- Table structure for `menu`
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `menu_id` varchar(36) NOT NULL COMMENT '�˵���ţ���������uuid�Զ�����',
  `menu_name` varchar(32) DEFAULT NULL COMMENT '�˵�����',
  `menu_address` varchar(64) DEFAULT NULL COMMENT 'url��ַ',
  `par_menu_id` varchar(36) DEFAULT NULL COMMENT '�ϼ��˵�����������������menuId�ֶΣ�����uuid���������',
  `menu_status` varchar(32) DEFAULT NULL COMMENT '�˵�״̬',
  `spare1` varchar(64) DEFAULT NULL,
  `spare2` varchar(64) DEFAULT NULL,
  `spare3` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�˵������������˵���Ϣ���˵���ţ��˵����֣�url��ַ���ϼ��˵�,�˵�״̬';

-- ----------------------------
-- Records of menu
-- ----------------------------

-- ----------------------------
-- Table structure for `order1`
-- ----------------------------
DROP TABLE IF EXISTS `order1`;
CREATE TABLE `order1` (
  `order_id` varchar(36) NOT NULL COMMENT '������ţ���������uuid����',
  `user_id` varchar(36) DEFAULT NULL COMMENT '�û���ţ����������user���user_id�ֶΣ�,��uuid���������',
  `total_price` varchar(32) DEFAULT NULL COMMENT '��Ʒ�ܼ�',
  `order_time` datetime DEFAULT NULL COMMENT '��¼��������ʱ��',
  `order_count` int(11) DEFAULT NULL COMMENT '��������',
  `order_state` varchar(32) DEFAULT NULL COMMENT '����״̬',
  `per_address_id` varchar(36) DEFAULT NULL COMMENT '���˵�ַ��ţ����������perAddress���perAddressId�ֶΣ�����uuid���������',
  `spare1` varchar(64) DEFAULT NULL,
  `spare2` varchar(64) DEFAULT NULL,
  `spare3` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��������������涩������Ҫ��Ϣ��������ţ��û���ţ��ܼۣ�ʱ�䣬��������������״̬���ջ����';

-- ----------------------------
-- Records of order1
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
-- Table structure for `order_tab`
-- ----------------------------
DROP TABLE IF EXISTS `order_tab`;
CREATE TABLE `order_tab` (
  `order_id` varchar(36) NOT NULL COMMENT '������ţ���������uuid����',
  `user_id` varchar(36) DEFAULT NULL COMMENT '�û���ţ����������user���user_id�ֶΣ�,��uuid���������',
  `total_price` varchar(32) DEFAULT NULL COMMENT '��Ʒ�ܼ�',
  `order_time` datetime DEFAULT NULL COMMENT '��¼��������ʱ��',
  `order_count` int(11) DEFAULT NULL COMMENT '��������',
  `order_state` varchar(32) DEFAULT NULL COMMENT '����״̬',
  `per_address_id` varchar(36) DEFAULT NULL COMMENT '���˵�ַ��ţ����������perAddress���perAddressId�ֶΣ�����uuid���������',
  `spare1` varchar(64) DEFAULT NULL,
  `spare2` varchar(64) DEFAULT NULL,
  `spare3` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��������������涩������Ҫ��Ϣ��������ţ��û���ţ��ܼۣ�ʱ�䣬��������������״̬���ջ����';

-- ----------------------------
-- Records of order_tab
-- ----------------------------

-- ----------------------------
-- Table structure for `per_address`
-- ----------------------------
DROP TABLE IF EXISTS `per_address`;
CREATE TABLE `per_address` (
  `per_address_id` varchar(36) NOT NULL COMMENT '���˵�ַ��ţ���������uuid���������',
  `user_id` varchar(36) DEFAULT NULL COMMENT '�û���ţ����������user���user_id�ֶΣ�,��uuid���������',
  `per_address` varchar(255) DEFAULT NULL COMMENT '���˵�ַ',
  `postcode` varchar(16) DEFAULT NULL COMMENT '�ʱ�',
  `tel` varchar(32) DEFAULT NULL COMMENT '��ϵ�绰��һ������Ч��11Ϊ�绰����',
  `post_name` varchar(32) DEFAULT NULL COMMENT '�ջ�������',
  `spare1` varchar(64) DEFAULT NULL,
  `spare2` varchar(64) DEFAULT NULL,
  `spare3` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`per_address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�����ջ���ַ������������û�������ջ���Ϣ����ַ��ţ��û���ţ���ַ���ʱ࣬��ϵ�绰���ջ�������';

-- ----------------------------
-- Records of per_address
-- ----------------------------

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `prod_id` varchar(36) NOT NULL COMMENT '��Ʒ��ţ���������uuid�������',
  `prod_details_id` varchar(36) DEFAULT NULL COMMENT '��Ʒ�����ţ����������product_details���prod_details_id�ֶΣ�����uuid�������',
  `prod_status` varchar(32) DEFAULT NULL COMMENT '��Ʒ״̬',
  `update_time` datetime DEFAULT NULL COMMENT '����ʱ��',
  `real_price` varchar(32) DEFAULT NULL COMMENT '��Ʒʵ�ʼ۸�',
  `sale_price` varchar(32) DEFAULT NULL COMMENT '���ۼ۸�',
  `spare1` varchar(64) DEFAULT NULL,
  `spare2` varchar(64) DEFAULT NULL,
  `spare3` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`prod_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��Ʒ�������������Ʒ����Ҫ��Ϣ����Ʒ��ţ���Ʒ������ţ���Ʒ״̬������ʱ�䣬ʵ�ʼ۸����ۼ۸�';

-- ----------------------------
-- Records of product
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

-- ----------------------------
-- Table structure for `product_feedback`
-- ----------------------------
DROP TABLE IF EXISTS `product_feedback`;
CREATE TABLE `product_feedback` (
  `prod_feedback_id` varchar(36) NOT NULL COMMENT '��Ʒ������ţ���������uuid�������',
  `user_id` varchar(36) DEFAULT NULL COMMENT '�û���ţ����������user���user_id�ֶΣ�,��uuid���������',
  `prod_id` varchar(36) DEFAULT NULL COMMENT '��Ʒ��ţ����������product���pro_id�ֶΣ�����uuid�������',
  `feedback_time` datetime DEFAULT NULL COMMENT '����ʱ��',
  `feedback_content` varchar(255) DEFAULT NULL COMMENT '��������',
  `par_feedback_id` varchar(36) DEFAULT NULL COMMENT '�ϼ�������ţ���������������prod_feedback_id���ֶΣ�',
  `spare1` varchar(64) DEFAULT NULL,
  `spare2` varchar(64) DEFAULT NULL,
  `spare3` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`prod_feedback_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��Ʒ�����������������Ʒ�ķ�����Ϣ����Ʒ������ţ��û���ţ���Ʒ��ţ�����ʱ�䣬�������ݣ��ϼ��������';

-- ----------------------------
-- Records of product_feedback
-- ----------------------------

-- ----------------------------
-- Table structure for `right_tab`
-- ----------------------------
DROP TABLE IF EXISTS `right_tab`;
CREATE TABLE `right_tab` (
  `right_id` varchar(36) NOT NULL COMMENT 'Ȩ�ޱ�ţ���������uuid���������',
  `right_name` varchar(32) DEFAULT NULL COMMENT 'Ȩ������',
  `right_comment` varchar(255) DEFAULT NULL COMMENT 'Ȩ��������Ϣ',
  `spare1` varchar(64) DEFAULT NULL,
  `spare2` varchar(64) DEFAULT NULL,
  `spare3` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`right_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Ȩ�ޱ�����ڱ���Ȩ����Ϣ��Ȩ�ޱ�ţ�Ȩ�����֣�Ȩ������';

-- ----------------------------
-- Records of right_tab
-- ----------------------------

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` varchar(36) NOT NULL COMMENT '��ɫ��ţ���������uuid���������',
  `role_name` varchar(32) DEFAULT NULL COMMENT '��ɫ����',
  `role_comment` varchar(255) DEFAULT NULL COMMENT '��ɫ��������Ϣ',
  `spare1` varchar(64) DEFAULT NULL,
  `spare2` varchar(64) DEFAULT NULL,
  `spare3` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��ɫ������ڱ����ɫ�����Ϣ����ɫ��ţ���ɫ���֣���ɫ����';

-- ----------------------------
-- Records of role
-- ----------------------------

-- ----------------------------
-- Table structure for `role_right`
-- ----------------------------
DROP TABLE IF EXISTS `role_right`;
CREATE TABLE `role_right` (
  `role_id` varchar(36) DEFAULT NULL COMMENT '��ɫ��ţ����������role���role_id�ֶΣ�����uuid���������',
  `right_id` varchar(36) DEFAULT NULL COMMENT 'Ȩ�ޱ�ţ����������right���right_id�ֶΣ�����uuid���������',
  `spare1` varchar(64) DEFAULT NULL COMMENT '�����ֶ�1',
  `spare2` varchar(64) DEFAULT NULL COMMENT '�����ֶ�2',
  `spare3` varchar(64) DEFAULT NULL COMMENT '�����ֶ�3'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��ɫȨ�ޱ�����������ɫ��Ȩ�޵���Ϣ';

-- ----------------------------
-- Records of role_right
-- ----------------------------

-- ----------------------------
-- Table structure for `shop_car`
-- ----------------------------
DROP TABLE IF EXISTS `shop_car`;
CREATE TABLE `shop_car` (
  `shop_carId` varchar(36) NOT NULL COMMENT '���ﳵ��ţ���������uuid�������',
  `user_id` varchar(36) DEFAULT NULL COMMENT '�û���ţ����������user���user_id�ֶΣ�,��uuid���������',
  `prod_id` varchar(36) DEFAULT NULL COMMENT '��Ʒ��ţ����������product���prod_id�ֶΣ�����uuid�������',
  `count` int(16) DEFAULT NULL COMMENT '���ﳵ����',
  `spare1` varchar(64) DEFAULT NULL,
  `spare2` varchar(64) DEFAULT NULL,
  `spare3` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`shop_carId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='���ﳵ����������湺�ﳵ����Ϣ�����ﳵ��ţ��û���ţ���Ʒ��ţ�����';

-- ----------------------------
-- Records of shop_car
-- ----------------------------
