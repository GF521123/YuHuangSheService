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

 Date: 11/12/2020 17:03:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for u_menu
-- ----------------------------
DROP TABLE IF EXISTS `u_menu`;
CREATE TABLE `u_menu`  (
  `MId` int(11) NOT NULL,
  `MTitle` varchar(255) CHARACTER SET gb2312 COLLATE gb2312_bin NULL DEFAULT NULL COMMENT '标签，显示',
  `MValue` varchar(255) CHARACTER SET gb2312 COLLATE gb2312_bin NULL DEFAULT NULL COMMENT '菜单名称，关联',
  `MSort` int(255) NULL DEFAULT NULL COMMENT '排序用',
  `MUrl` varchar(255) CHARACTER SET gb2312 COLLATE gb2312_bin NULL DEFAULT NULL COMMENT 'url路径',
  `MOther` varchar(255) CHARACTER SET gb2312 COLLATE gb2312_bin NULL DEFAULT NULL COMMENT '字段备用\r\n',
  PRIMARY KEY (`MId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = gb2312 COLLATE = gb2312_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of u_menu
-- ----------------------------
INSERT INTO `u_menu` VALUES (1, '测试', '测试', 50, 'home.html', NULL);

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
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = gb2312 COLLATE = gb2312_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of u_operators
-- ----------------------------
INSERT INTO `u_operators` VALUES (1, '123', '123', '123');

SET FOREIGN_KEY_CHECKS = 1;
