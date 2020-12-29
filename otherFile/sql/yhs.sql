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

 Date: 28/12/2020 17:27:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu`  (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET gb2312 COLLATE gb2312_bin NULL DEFAULT NULL,
  `url` varchar(255) CHARACTER SET gb2312 COLLATE gb2312_bin NULL DEFAULT NULL,
  `lev` int(255) NULL DEFAULT NULL,
  `pname` varchar(255) CHARACTER SET gb2312 COLLATE gb2312_bin NULL DEFAULT NULL,
  `state` int(1) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = gb2312 COLLATE = gb2312_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES (1, '系统目录', '', 1, '', 1);
INSERT INTO `menu` VALUES (2, '页面菜单', 'menu.html', 2, '系统目录', 1);
INSERT INTO `menu` VALUES (3, '角色菜单', 'role.html', 2, '系统目录', 1);
INSERT INTO `menu` VALUES (4, '关联菜单', 'relation.html', 2, '系统目录', 1);
INSERT INTO `menu` VALUES (5, '工具目录', '', 1, '', 1);

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `rname` varchar(255) CHARACTER SET gb2312 COLLATE gb2312_bin NULL DEFAULT NULL COMMENT '角色',
  `title` varchar(255) CHARACTER SET gb2312 COLLATE gb2312_bin NULL DEFAULT NULL COMMENT '描述',
  `state` int(1) UNSIGNED ZEROFILL NULL DEFAULT NULL COMMENT '状态：0不启用（默认）1启用',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = gb2312 COLLATE = gb2312_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, '管理员', '', 1);

-- ----------------------------
-- Table structure for role_menu
-- ----------------------------
DROP TABLE IF EXISTS `role_menu`;
CREATE TABLE `role_menu`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `rname` varchar(255) CHARACTER SET gb2312 COLLATE gb2312_bin NULL DEFAULT NULL COMMENT '角色名称',
  `mname` varchar(255) CHARACTER SET gb2312 COLLATE gb2312_bin NULL DEFAULT NULL COMMENT '菜单名称',
  `state` int(1) NULL DEFAULT NULL COMMENT '状态 1启用',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = gb2312 COLLATE = gb2312_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of role_menu
-- ----------------------------
INSERT INTO `role_menu` VALUES (1, '管理员', '系统目录', 1);
INSERT INTO `role_menu` VALUES (2, '管理员', '页面菜单', 1);
INSERT INTO `role_menu` VALUES (3, '管理员', '角色菜单', 1);
INSERT INTO `role_menu` VALUES (4, '管理员', '关联菜单', 1);
INSERT INTO `role_menu` VALUES (6, '管理员', '工具目录', 1);

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` int(11) NOT NULL,
  `username` varchar(255) CHARACTER SET gb2312 COLLATE gb2312_bin NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET gb2312 COLLATE gb2312_bin NULL DEFAULT NULL,
  `sex` int(255) NULL DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET gb2312 COLLATE gb2312_bin NULL DEFAULT NULL,
  `createtime` datetime NULL DEFAULT NULL,
  `birthday` datetime NULL DEFAULT NULL,
  `touxiang` varchar(255) CHARACTER SET gb2312 COLLATE gb2312_bin NULL DEFAULT NULL,
  `rid` int(11) NULL DEFAULT NULL,
  `start` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = gb2312 COLLATE = gb2312_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, '123', '123', NULL, NULL, NULL, NULL, NULL, 1, 1);

SET FOREIGN_KEY_CHECKS = 1;
