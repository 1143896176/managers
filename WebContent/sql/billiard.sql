/*
Navicat MySQL Data Transfer

Source Server         : wang
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : billiard

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-03-25 09:14:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for accounts
-- ----------------------------
DROP TABLE IF EXISTS `accounts`;
CREATE TABLE `accounts` (
  `account_id` int(11) NOT NULL COMMENT '结算编号',
  `member_id` int(20) NOT NULL COMMENT '使用者id',
  `billiard_id` int(11) NOT NULL COMMENT '台球桌id',
  `account_start` datetime NOT NULL COMMENT '开始时间',
  `account_end` datetime DEFAULT NULL COMMENT '结算时间',
  `duration` int(11) NOT NULL COMMENT '使用时长',
  `price` int(11) NOT NULL COMMENT '金额',
  `account_status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of accounts
-- ----------------------------

-- ----------------------------
-- Table structure for administrator
-- ----------------------------
DROP TABLE IF EXISTS `administrator`;
CREATE TABLE `administrator` (
  `billard_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '台球厅id',
  `admin_login_name` varchar(20) NOT NULL COMMENT '用户名',
  `password` varchar(20) NOT NULL COMMENT '密码',
  `billard_name` varchar(20) DEFAULT NULL COMMENT '台球厅名',
  `synopsis` varchar(2000) DEFAULT NULL COMMENT '简介',
  `admin_name` varchar(20) DEFAULT NULL COMMENT '负责人姓名',
  `billard_address` varchar(50) DEFAULT NULL COMMENT '地址',
  `admin_tel` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `lock_password` varchar(20) DEFAULT NULL COMMENT 'a',
  PRIMARY KEY (`billard_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of administrator
-- ----------------------------
INSERT INTO `administrator` VALUES ('1', 'wang', '123456', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for announcement
-- ----------------------------
DROP TABLE IF EXISTS `announcement`;
CREATE TABLE `announcement` (
  `announce_id` int(11) NOT NULL COMMENT '公告id',
  `billard_id` int(11) NOT NULL COMMENT '台球厅id',
  `announce_title` varchar(50) NOT NULL COMMENT '公告标题',
  `announce_date` datetime NOT NULL COMMENT '公告时间',
  `announce_content` varchar(200) NOT NULL COMMENT '公告内容',
  `announce_status` int(11) DEFAULT '1' COMMENT '公告状态'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of announcement
-- ----------------------------
INSERT INTO `announcement` VALUES ('0', '1', 'cxgckh', '2018-03-24 00:00:00', 'kgjbhuj', '1');

-- ----------------------------
-- Table structure for billiards
-- ----------------------------
DROP TABLE IF EXISTS `billiards`;
CREATE TABLE `billiards` (
  `billiard_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '台球桌id',
  `origin` varchar(200) NOT NULL COMMENT '出产地',
  `price` int(11) NOT NULL COMMENT '价格',
  `location` varchar(200) DEFAULT NULL COMMENT '位置',
  PRIMARY KEY (`billiard_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of billiards
-- ----------------------------
INSERT INTO `billiards` VALUES ('1', 'hebei', '30', '12');

-- ----------------------------
-- Table structure for members
-- ----------------------------
DROP TABLE IF EXISTS `members`;
CREATE TABLE `members` (
  `member_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '会员id',
  `billard_id` int(11) NOT NULL COMMENT '台球厅id',
  `member_name` varchar(20) NOT NULL COMMENT '姓名',
  `member_tel` varchar(20) NOT NULL COMMENT '手机号',
  `password` varchar(20) NOT NULL COMMENT '密码',
  `integrate` int(11) DEFAULT NULL COMMENT '会员id',
  `balance` int(11) DEFAULT NULL,
  `grade` int(11) DEFAULT '1',
  `member_idcard` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`member_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of members
-- ----------------------------
INSERT INTO `members` VALUES ('1', '2', '123', '15532491031', '123456123456', '20', '20', '1', '123456789456123456');

-- ----------------------------
-- Table structure for messages
-- ----------------------------
DROP TABLE IF EXISTS `messages`;
CREATE TABLE `messages` (
  `message_id` int(11) NOT NULL COMMENT '留言id',
  `message_name` varchar(20) NOT NULL COMMENT '留言者',
  `message_content` varchar(200) DEFAULT NULL COMMENT '内容',
  `message_date` datetime DEFAULT NULL COMMENT '时间',
  `message_status` int(11) NOT NULL DEFAULT '0' COMMENT '留言状态',
  `member_id` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of messages
-- ----------------------------

-- ----------------------------
-- Table structure for preferent
-- ----------------------------
DROP TABLE IF EXISTS `preferent`;
CREATE TABLE `preferent` (
  `member_grade` int(11) NOT NULL COMMENT '会员等级',
  `discount` int(11) NOT NULL COMMENT '优惠折扣'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of preferent
-- ----------------------------
INSERT INTO `preferent` VALUES ('1', '5');
INSERT INTO `preferent` VALUES ('2', '25');
INSERT INTO `preferent` VALUES ('3', '15');
INSERT INTO `preferent` VALUES ('4', '10');

-- ----------------------------
-- Table structure for reserve
-- ----------------------------
DROP TABLE IF EXISTS `reserve`;
CREATE TABLE `reserve` (
  `reserve_id` int(11) NOT NULL COMMENT '预约编号',
  `billard_id` int(11) NOT NULL COMMENT '台球桌id',
  `reserve_start` datetime NOT NULL COMMENT '预约开始时间',
  `reserve_end` datetime NOT NULL COMMENT '预约结束时间',
  `reserve_status` int(11) NOT NULL DEFAULT '1' COMMENT '预约状态',
  `member_id` varchar(20) NOT NULL COMMENT '预约者id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reserve
-- ----------------------------

-- ----------------------------
-- Table structure for useinfo
-- ----------------------------
DROP TABLE IF EXISTS `useinfo`;
CREATE TABLE `useinfo` (
  `use_id` int(11) NOT NULL COMMENT '使用编号',
  `billard_id` int(11) NOT NULL COMMENT '台球桌id',
  `use_start` datetime NOT NULL COMMENT '开始时间',
  `user_name` varchar(20) NOT NULL COMMENT '使用者姓名',
  `use_status` int(11) NOT NULL DEFAULT '1' COMMENT '使用状态'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of useinfo
-- ----------------------------
