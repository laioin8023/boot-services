/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50640
Source Host           : localhost:3306
Source Database       : ssm-dome

Target Server Type    : MYSQL
Target Server Version : 50640
File Encoding         : 65001

Date: 2018-08-10 10:33:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sd_order
-- ----------------------------
DROP TABLE IF EXISTS `sd_order`;
CREATE TABLE `sd_order` (
  `order_id` varchar(128) NOT NULL,
  `user_id` int(11) NOT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `create_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sd_order
-- ----------------------------
INSERT INTO `sd_order` VALUES ('12', '1', '12.20', '1');

-- ----------------------------
-- Table structure for sd_user
-- ----------------------------
DROP TABLE IF EXISTS `sd_user`;
CREATE TABLE `sd_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `phone` char(11) DEFAULT NULL COMMENT '手机号',
  `pwd` varchar(255) DEFAULT NULL COMMENT '密码',
  `sex` tinyint(2) NOT NULL COMMENT '性别：0 男，1 女',
  `avatar` varchar(512) DEFAULT NULL COMMENT '头像',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sd_user
-- ----------------------------
INSERT INTO `sd_user` VALUES ('1', '1', '1', '1', '1', '2018-07-25 13:48:14', '2018-07-25 13:48:14');
INSERT INTO `sd_user` VALUES ('2', '2', '2', '2', '2', '2018-07-26 14:38:54', '2018-07-26 14:38:54');
INSERT INTO `sd_user` VALUES ('3', '3', '3', '1', '3', '2018-07-26 14:39:01', '2018-07-26 16:47:21');
INSERT INTO `sd_user` VALUES ('4', '4', '4', '2', '4', '2018-07-26 14:39:10', '2018-07-26 16:47:23');
INSERT INTO `sd_user` VALUES ('5', '5', '5', '1', '5', '2018-07-26 14:39:14', '2018-07-26 16:47:26');
SET FOREIGN_KEY_CHECKS=1;
