/*
 Navicat Premium Data Transfer

 Source Server         : www.onecbuying.com
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 01/11/2021 14:42:44
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `email` varchar(255) DEFAULT NULL COMMENT '邮件',
  `age` int DEFAULT NULL COMMENT '年龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1017 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of student
-- ----------------------------
BEGIN;
INSERT INTO `student` VALUES (1, '赵六', 'zl@gmail.com', 19);
INSERT INTO `student` VALUES (2, '大道', '123456@qq.com', 22);
INSERT INTO `student` VALUES (3, '小芳', 'xf@qq.com', 24);
INSERT INTO `student` VALUES (44, '哈哈哈006', '123456@qq.com', 23);
INSERT INTO `student` VALUES (1001, '李四', 'lisi@qq.com', 20);
INSERT INTO `student` VALUES (1002, '王五', 'ww@sina.com', 28);
INSERT INTO `student` VALUES (1013, '周锋', 'zhoufeng@qq.com', 20);
INSERT INTO `student` VALUES (1015, '李胜利', 'zhoufeng@qq.com', 26);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
