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

 Date: 30/12/2020 16:29:18
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
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = gb2312 COLLATE = gb2312_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES (1, '系统目录', '', 1, '', 1);
INSERT INTO `menu` VALUES (2, '页面菜单', 'menu.html', 2, '系统目录', 1);
INSERT INTO `menu` VALUES (3, '角色菜单', 'role.html', 2, '系统目录', 1);
INSERT INTO `menu` VALUES (4, '关联菜单', 'relation.html', 2, '系统目录', 1);
INSERT INTO `menu` VALUES (5, '工具目录', '', 1, '', 1);
INSERT INTO `menu` VALUES (6, '记事菜单', 'notes.html', 2, '工具目录', 1);
INSERT INTO `menu` VALUES (7, '事件类型', 'notetype.html', 2, '系统目录', 1);

-- ----------------------------
-- Table structure for note_type
-- ----------------------------
DROP TABLE IF EXISTS `note_type`;
CREATE TABLE `note_type`  (
  `id` int(5) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `text` varchar(255) CHARACTER SET gb2312 COLLATE gb2312_bin NULL DEFAULT NULL COMMENT '备注',
  `state` int(255) UNSIGNED ZEROFILL NULL DEFAULT NULL COMMENT '状态',
  `value` varchar(255) CHARACTER SET gb2312 COLLATE gb2312_bin NULL DEFAULT NULL COMMENT '内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = gb2312 COLLATE = gb2312_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of note_type
-- ----------------------------
INSERT INTO `note_type` VALUES (1, '资金记账', 000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001, '金融');
INSERT INTO `note_type` VALUES (3, '记录事情', 000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001, '事情');
INSERT INTO `note_type` VALUES (4, '生日', 000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001, '生日');

-- ----------------------------
-- Table structure for notes
-- ----------------------------
DROP TABLE IF EXISTS `notes`;
CREATE TABLE `notes`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `u_id` int(11) NOT NULL COMMENT '用户id',
  `note_Type` int(10) NULL DEFAULT NULL COMMENT '事件类型',
  `notes` text CHARACTER SET gb2312 COLLATE gb2312_bin NULL COMMENT '内容',
  `createTime` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `state` int(1) UNSIGNED ZEROFILL NULL DEFAULT NULL COMMENT '状态备用字段',
  `test` varchar(255) CHARACTER SET gb2312 COLLATE gb2312_bin NULL DEFAULT NULL COMMENT '说明',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = gb2312 COLLATE = gb2312_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of notes
-- ----------------------------
INSERT INTO `notes` VALUES (1, 1, 1, '农历11月15--fa', '2020-12-29 14:08:22', NULL, NULL);
INSERT INTO `notes` VALUES (2, 1, 1, 'saf', NULL, NULL, NULL);

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
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = gb2312 COLLATE = gb2312_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of role_menu
-- ----------------------------
INSERT INTO `role_menu` VALUES (1, '管理员', '系统目录', 1);
INSERT INTO `role_menu` VALUES (2, '管理员', '页面菜单', 1);
INSERT INTO `role_menu` VALUES (3, '管理员', '角色菜单', 1);
INSERT INTO `role_menu` VALUES (4, '管理员', '关联菜单', 1);
INSERT INTO `role_menu` VALUES (6, '管理员', '工具目录', 1);
INSERT INTO `role_menu` VALUES (7, '管理员', '记事菜单', 1);
INSERT INTO `role_menu` VALUES (8, '管理员', '事件类型', 1);

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` int(11) NOT NULL,
  `UName` varchar(255) CHARACTER SET gb2312 COLLATE gb2312_bin NULL DEFAULT NULL,
  `UPassword` varchar(255) CHARACTER SET gb2312 COLLATE gb2312_bin NULL DEFAULT NULL,
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
INSERT INTO `users` VALUES (1, '123', '8jmyM-mvvvg', NULL, NULL, NULL, NULL, NULL, 1, 1);

SET FOREIGN_KEY_CHECKS = 1;
