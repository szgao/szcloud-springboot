/*
Navicat MySQL Data Transfer

Source Server         : 10.88.51.83
Source Server Version : 50614
Source Host           : 10.88.51.83:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2019-02-12 11:43:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_contract
-- ----------------------------
DROP TABLE IF EXISTS `t_contract`;
CREATE TABLE `t_contract` (
  `id` varchar(255) NOT NULL COMMENT '甲方单位',
  `employer` varchar(255) DEFAULT NULL COMMENT '甲方单位',
  `userAid` int(11) DEFAULT NULL COMMENT '甲方联系人',
  `laborer` varchar(255) DEFAULT NULL COMMENT '乙方单位',
  `userBid` int(11) DEFAULT NULL COMMENT '乙方联系人',
  `coreness` varchar(255) DEFAULT NULL COMMENT 'CPU核数',
  `monthly` varchar(255) DEFAULT NULL COMMENT '月数',
  `hours` varchar(255) DEFAULT NULL COMMENT '机时（万核小时）',
  `store` varchar(255) DEFAULT NULL COMMENT '存储（GB）',
  `startTime` datetime DEFAULT NULL COMMENT '合同开始时间',
  `endTime` datetime DEFAULT NULL COMMENT '合同截止时间',
  `projectName` varchar(255) DEFAULT NULL COMMENT '项目名称',
  `field` varchar(255) DEFAULT NULL COMMENT '所属领域',
  `status` int(11) DEFAULT '1' COMMENT '合同状态：0代表逻辑删除，1代表正常显示',
  `createTime` datetime DEFAULT NULL COMMENT '合同创建或者修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_contract
-- ----------------------------
INSERT INTO `t_contract` VALUES ('f7212', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '0', '2019-02-02 16:14:40');
INSERT INTO `t_contract` VALUES ('f7213', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '0', '2019-01-29 17:10:26');
INSERT INTO `t_contract` VALUES ('f7214', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '0', '2019-01-29 17:10:26');
INSERT INTO `t_contract` VALUES ('f7215', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '0', '2019-01-29 17:10:26');
INSERT INTO `t_contract` VALUES ('f7216', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7217', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7218', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7219', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7220', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '0', '2019-02-02 16:18:08');
INSERT INTO `t_contract` VALUES ('f7221', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7222', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7223', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7224', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7225', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7226', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7227', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7228', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7229', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7230', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7231', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7232', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7233', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7234', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7235', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7236', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7237', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7238', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7239', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7241', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7242', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7243', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7244', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7245', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7246', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7247', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7248', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7249', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '1', null);
INSERT INTO `t_contract` VALUES ('f7281', 'gaochao', '2', 'chao', '3', '1核', '1月', '1小时', '8G', '2019-01-21 11:19:40', '2019-01-21 11:19:40', '超算中心', '大数据', '0', '2019-02-02 16:18:58');
