/*
 Navicat Premium Data Transfer

 Source Server         : 121.36.138.105
 Source Server Type    : MySQL
 Source Server Version : 50527
 Source Host           : 121.36.138.105:3306
 Source Schema         : yhs

 Target Server Type    : MySQL
 Target Server Version : 50527
 File Encoding         : 65001

 Date: 09/12/2020 18:06:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for u_operators
-- ----------------------------
DROP TABLE IF EXISTS `u_operators`;
CREATE TABLE `u_operators`  (
  `UId` int(11) NOT NULL AUTO_INCREMENT,
  `UName` varchar(100) CHARACTER SET gb2312 COLLATE gb2312_bin NULL DEFAULT NULL,
  `UPassword` varchar(100) CHARACTER SET gb2312 COLLATE gb2312_bin NULL DEFAULT NULL,
  `UIphone` varchar(100) CHARACTER SET gb2312 COLLATE gb2312_bin NULL DEFAULT NULL,
  PRIMARY KEY (`UId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = gb2312 COLLATE = gb2312_bin ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
