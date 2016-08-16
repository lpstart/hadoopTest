/*
Navicat MySQL Data Transfer

Source Server         : localMysql
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : hadoop

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2016-05-04 10:30:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(30) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'aaa', 'aaa@aaa.com', 'aaa');
INSERT INTO `user` VALUES ('2', 'bbb', 'bbb@bbb.com', 'bbb');
INSERT INTO `user` VALUES ('3', 'ccc', 'ccc@ccc.com', 'ccc');
