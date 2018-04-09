/*
Navicat MySQL Data Transfer

Source Server         : dev
Source Server Version : 50505
Source Host           : 172.1.0.201:3306
Source Database       : yc_jplat

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2018-03-30 18:54:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_bankcode
-- ----------------------------
DROP TABLE IF EXISTS `t_bankcode`;
CREATE TABLE `t_bankcode` (
  `id` int(11) NOT NULL,
  `bankName` varchar(20) DEFAULT NULL COMMENT '银行名称',
  `bankCode` varchar(8) DEFAULT NULL COMMENT '银行代码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='银行代码';

-- ----------------------------
-- Records of t_bankcode
-- ----------------------------
INSERT INTO `t_bankcode` VALUES ('1', '中国银行', 'BKCH');
INSERT INTO `t_bankcode` VALUES ('2', '农业银行', 'ABOC');
INSERT INTO `t_bankcode` VALUES ('3', '工商银行', 'ICBK');
INSERT INTO `t_bankcode` VALUES ('4', '建设银行', 'PCBC');
INSERT INTO `t_bankcode` VALUES ('5', '邮政储蓄', 'PSBC');
INSERT INTO `t_bankcode` VALUES ('6', '交通银行', 'COMM');
INSERT INTO `t_bankcode` VALUES ('7', '招商银行', 'CMBC');
INSERT INTO `t_bankcode` VALUES ('8', '平安银行', 'SZDB');
INSERT INTO `t_bankcode` VALUES ('9', '中信银行', 'CIBK');
INSERT INTO `t_bankcode` VALUES ('10', '民生银行', 'MSBC');
INSERT INTO `t_bankcode` VALUES ('11', '广发银行', 'GDBK');
INSERT INTO `t_bankcode` VALUES ('12', '浦发银行', 'SPDB');
INSERT INTO `t_bankcode` VALUES ('13', '兴业银行', 'FJIB');
INSERT INTO `t_bankcode` VALUES ('14', '光大银行', 'EVER');
INSERT INTO `t_bankcode` VALUES ('15', '浙商银行', 'ZJCB');
INSERT INTO `t_bankcode` VALUES ('16', '澳大利亚联邦银行', 'CTBA');
INSERT INTO `t_bankcode` VALUES ('17', '鞍山银行', 'ANBK');
INSERT INTO `t_bankcode` VALUES ('18', '澳新银行', 'ANZB');
INSERT INTO `t_bankcode` VALUES ('19', '北德意志州银行', 'NOLA');
INSERT INTO `t_bankcode` VALUES ('20', '渤海银行', 'CHBH');
INSERT INTO `t_bankcode` VALUES ('21', '北京农村商业银行', 'BRCB');
INSERT INTO `t_bankcode` VALUES ('22', '北京银行', 'BJCN');
INSERT INTO `t_bankcode` VALUES ('23', '巴克莱银行', 'BARC');
INSERT INTO `t_bankcode` VALUES ('24', '巴罗达银行', 'BARB');
INSERT INTO `t_bankcode` VALUES ('25', '比利时联合银行', 'KRED');
INSERT INTO `t_bankcode` VALUES ('26', '包商银行', 'BTCB');
INSERT INTO `t_bankcode` VALUES ('27', '成都农村商业银行', 'CDRC');
INSERT INTO `t_bankcode` VALUES ('28', '成都银行', 'CBOC');
INSERT INTO `t_bankcode` VALUES ('29', '常熟农村商业银行', 'CSCB');
INSERT INTO `t_bankcode` VALUES ('30', '丹东银行', 'DDBK');
INSERT INTO `t_bankcode` VALUES ('31', '东方汇理银行', 'CRLY');
INSERT INTO `t_bankcode` VALUES ('32', '东莞银行', 'DGCB');
INSERT INTO `t_bankcode` VALUES ('33', '大华银行', 'UOVB');
INSERT INTO `t_bankcode` VALUES ('34', '大连银行', 'DLCB');
INSERT INTO `t_bankcode` VALUES ('35', '大新银行', 'DSBA');
INSERT INTO `t_bankcode` VALUES ('36', '德阳银行', 'DECC');
INSERT INTO `t_bankcode` VALUES ('37', '东亚银行', 'BEAS');
INSERT INTO `t_bankcode` VALUES ('38', '东营银行', 'DYSH');
INSERT INTO `t_bankcode` VALUES ('39', '德意志银行', 'DEUT');
INSERT INTO `t_bankcode` VALUES ('40', '富邦华一银行', 'FSBC');
INSERT INTO `t_bankcode` VALUES ('41', '富滇银行', 'KCCB');
INSERT INTO `t_bankcode` VALUES ('42', '法国巴黎银行', 'BNPA');
INSERT INTO `t_bankcode` VALUES ('43', '法国外贸银行', 'NATX');
INSERT INTO `t_bankcode` VALUES ('44', '法国兴业银行', 'SGCL');
INSERT INTO `t_bankcode` VALUES ('45', '富国银行', 'PNBP');
INSERT INTO `t_bankcode` VALUES ('46', '福建海峡银行', 'FZCB');
INSERT INTO `t_bankcode` VALUES ('47', '阜新银行', 'FXBK');
INSERT INTO `t_bankcode` VALUES ('48', '广东华兴银行', 'GDHB');
INSERT INTO `t_bankcode` VALUES ('49', '广东南海农村商业银行', 'RCNH');
INSERT INTO `t_bankcode` VALUES ('50', '广东顺德农村商业银行', 'RCCS');
INSERT INTO `t_bankcode` VALUES ('51', '国家开发银行', 'SDBC');
INSERT INTO `t_bankcode` VALUES ('52', '桂林银行', 'GLBK');
INSERT INTO `t_bankcode` VALUES ('53', '国民银行', 'CZNB');
INSERT INTO `t_bankcode` VALUES ('54', '广西北部湾银行', 'BGBK');
INSERT INTO `t_bankcode` VALUES ('55', '贵阳银行', 'GYCB');
INSERT INTO `t_bankcode` VALUES ('56', '广州农村商业银行', 'GZRC');
INSERT INTO `t_bankcode` VALUES ('57', '赣州银行', 'BKGZ');
INSERT INTO `t_bankcode` VALUES ('58', '广州银行', 'GZCB');
INSERT INTO `t_bankcode` VALUES ('59', '河北银行', 'BKSH');
INSERT INTO `t_bankcode` VALUES ('60', '邯郸银行', 'BKHD');
INSERT INTO `t_bankcode` VALUES ('61', '哈尔滨银行', 'HCCB');
INSERT INTO `t_bankcode` VALUES ('62', '汇丰银行', 'HSBC');
INSERT INTO `t_bankcode` VALUES ('63', '韩国产业银行', 'KODB');
INSERT INTO `t_bankcode` VALUES ('64', '韩国新韩银行', 'SHBK');
INSERT INTO `t_bankcode` VALUES ('65', '汉口银行', 'WHCB');
INSERT INTO `t_bankcode` VALUES ('66', '荷兰安智银行', 'INGB');
INSERT INTO `t_bankcode` VALUES ('67', '荷兰合作银行', 'RABO');
INSERT INTO `t_bankcode` VALUES ('68', '黑龙江东宁农村商业银行', 'DRCB');
INSERT INTO `t_bankcode` VALUES ('69', '华美银行', 'EWBK');
INSERT INTO `t_bankcode` VALUES ('70', '花旗银行', 'CITI');
INSERT INTO `t_bankcode` VALUES ('71', '华侨银行', 'OCBC');
INSERT INTO `t_bankcode` VALUES ('72', '恒生银行', 'HASE');
INSERT INTO `t_bankcode` VALUES ('73', '华商银行', 'CNMB');
INSERT INTO `t_bankcode` VALUES ('74', '华夏银行', 'HXBK');
INSERT INTO `t_bankcode` VALUES ('75', '韩亚银行', 'HNBN');
INSERT INTO `t_bankcode` VALUES ('76', '惠州农村商业银行', 'HRCN');
INSERT INTO `t_bankcode` VALUES ('77', '杭州银行', 'HZCB');
INSERT INTO `t_bankcode` VALUES ('78', '金华银行', 'JHCB');
INSERT INTO `t_bankcode` VALUES ('79', '九江银行', 'BOJJ');
INSERT INTO `t_bankcode` VALUES ('80', '吉林珲村农村商业银行', 'HCRR');
INSERT INTO `t_bankcode` VALUES ('81', '吉林九台农村商业银行', 'JTCB');
INSERT INTO `t_bankcode` VALUES ('82', '吉林银行', 'JLBK');
INSERT INTO `t_bankcode` VALUES ('83', '加拿大丰业银行', 'NOSC');
INSERT INTO `t_bankcode` VALUES ('84', '加拿大皇家银行', 'ROYC');
INSERT INTO `t_bankcode` VALUES ('85', '济宁银行', 'BKJN');
INSERT INTO `t_bankcode` VALUES ('86', '江苏丹阳农村商业银行', 'DYCB');
INSERT INTO `t_bankcode` VALUES ('87', '江苏海安农村商业银行', 'HRCB');
INSERT INTO `t_bankcode` VALUES ('88', '江苏海门农村商业银行', 'HMCB');
INSERT INTO `t_bankcode` VALUES ('89', '江苏靖江农村商业银行', 'RCWJ');
INSERT INTO `t_bankcode` VALUES ('90', '江苏江阴农村商业银行', 'JYCB');
INSERT INTO `t_bankcode` VALUES ('91', '江苏姜堰农村商业银行', 'JRCB');
INSERT INTO `t_bankcode` VALUES ('92', '江苏南通农村商业银行', 'NRCB');
INSERT INTO `t_bankcode` VALUES ('93', '江苏邳州农村商业银行', 'PZCB');
INSERT INTO `t_bankcode` VALUES ('94', '江苏如东农村商业银行', 'RRCB');
INSERT INTO `t_bankcode` VALUES ('95', '江苏如皋农村商业银行', 'RGCB');
INSERT INTO `t_bankcode` VALUES ('96', '江苏射阳农村商业银行', 'JSCB');
INSERT INTO `t_bankcode` VALUES ('97', '江苏吴江农村商业银行', 'WJRB');
INSERT INTO `t_bankcode` VALUES ('98', '江苏盐城黄海农村商业银行', 'JYHR');
INSERT INTO `t_bankcode` VALUES ('99', '江苏银行', 'BOJS');
INSERT INTO `t_bankcode` VALUES ('100', '晋商银行', 'JSHB');
INSERT INTO `t_bankcode` VALUES ('101', '江苏宜兴农村商业银行', 'URCC');
INSERT INTO `t_bankcode` VALUES ('102', '江苏扬州农村商业银行', 'YZRC');
INSERT INTO `t_bankcode` VALUES ('103', '江苏紫金农村商业银行', 'JRZC');
INSERT INTO `t_bankcode` VALUES ('104', '嘉兴银行', 'BOJX');
INSERT INTO `t_bankcode` VALUES ('105', '集友银行', 'CIYU');
INSERT INTO `t_bankcode` VALUES ('106', '锦州银行', 'JZCB');
INSERT INTO `t_bankcode` VALUES ('107', '昆仑银行', 'CKLB');
INSERT INTO `t_bankcode` VALUES ('108', '廊坊银行', 'BOLF');
INSERT INTO `t_bankcode` VALUES ('109', '龙江银行', 'LJBC');
INSERT INTO `t_bankcode` VALUES ('110', '乐山市商业银行', 'LSCC');
INSERT INTO `t_bankcode` VALUES ('111', '莱商银行', 'LWCB');
INSERT INTO `t_bankcode` VALUES ('112', '临商银行', 'LYCB');
INSERT INTO `t_bankcode` VALUES ('113', '辽阳银行', 'LCOM');
INSERT INTO `t_bankcode` VALUES ('114', '洛阳银行', 'BOLY');
INSERT INTO `t_bankcode` VALUES ('115', '兰州银行', 'LZCB');
INSERT INTO `t_bankcode` VALUES ('116', '柳州银行', 'LZBK');
INSERT INTO `t_bankcode` VALUES ('117', '摩根大通银行', 'CHAS');
INSERT INTO `t_bankcode` VALUES ('118', '美国建东银行', 'BOFO');
INSERT INTO `t_bankcode` VALUES ('119', '摩根士丹利国际银行', 'MSBK');
INSERT INTO `t_bankcode` VALUES ('120', '民古屋银行', 'NAGO');
INSERT INTO `t_bankcode` VALUES ('121', '美国银行', 'BOFA');
INSERT INTO `t_bankcode` VALUES ('122', '马来亚银行', 'MBBE');
INSERT INTO `t_bankcode` VALUES ('123', '蒙特利尔银行', 'BOFM');
INSERT INTO `t_bankcode` VALUES ('124', '宁波东海银行', 'DHBC');
INSERT INTO `t_bankcode` VALUES ('125', '宁波通商银行', 'BINH');
INSERT INTO `t_bankcode` VALUES ('126', '宁波银行', 'BKNB');
INSERT INTO `t_bankcode` VALUES ('127', '南充市商业银行', 'NCCC');
INSERT INTO `t_bankcode` VALUES ('128', '南昌银行', 'NCCK');
INSERT INTO `t_bankcode` VALUES ('129', '南京银行', 'NJCB');
INSERT INTO `t_bankcode` VALUES ('130', '内蒙古银行', 'HSSY');
INSERT INTO `t_bankcode` VALUES ('131', '宁夏银行', 'YCCB');
INSERT INTO `t_bankcode` VALUES ('132', '南洋商业银行', 'NYCB');
INSERT INTO `t_bankcode` VALUES ('133', '纽约银行', 'BNYM');
INSERT INTO `t_bankcode` VALUES ('134', '浦发硅谷银行', 'SSVB');
INSERT INTO `t_bankcode` VALUES ('135', '盘谷银行', 'BKKB');
INSERT INTO `t_bankcode` VALUES ('136', '青岛农村商业银行', 'QDRC');
INSERT INTO `t_bankcode` VALUES ('137', '青岛银行', 'QCCB');
INSERT INTO `t_bankcode` VALUES ('138', '青海银行', 'BOXN');
INSERT INTO `t_bankcode` VALUES ('139', '齐鲁银行', 'JNSH');
INSERT INTO `t_bankcode` VALUES ('140', '齐商银行', 'ZBBK');
INSERT INTO `t_bankcode` VALUES ('141', '企业银行', 'IBKO');
INSERT INTO `t_bankcode` VALUES ('142', '泉州农村商业银行', 'QRCB');
INSERT INTO `t_bankcode` VALUES ('143', '泉州银行', 'BKQZ');
INSERT INTO `t_bankcode` VALUES ('144', '瑞典北欧斯安银行', 'ESSE');
INSERT INTO `t_bankcode` VALUES ('145', '瑞士信贷银行', 'CRES');
INSERT INTO `t_bankcode` VALUES ('146', '瑞士银行', 'UBSW');
INSERT INTO `t_bankcode` VALUES ('147', '瑞穗银行', 'MHCB');
INSERT INTO `t_bankcode` VALUES ('148', '日照银行', 'RZCB');
INSERT INTO `t_bankcode` VALUES ('149', '山东寿光农村商业银行', 'SGRB');
INSERT INTO `t_bankcode` VALUES ('150', '首都银行', 'MBTC');
INSERT INTO `t_bankcode` VALUES ('151', '山东张店农村商业银行', 'ZDRB');
INSERT INTO `t_bankcode` VALUES ('152', '苏格兰皇家银行', 'ABNA');
INSERT INTO `t_bankcode` VALUES ('153', '上海农村商业银行', 'SHRC');
INSERT INTO `t_bankcode` VALUES ('154', '上海银行', 'BOSH');
INSERT INTO `t_bankcode` VALUES ('155', '盛京银行', 'SYCB');
INSERT INTO `t_bankcode` VALUES ('156', '三井住友银行', 'SMBC');
INSERT INTO `t_bankcode` VALUES ('157', '三菱东京日联银行', 'BOTK');
INSERT INTO `t_bankcode` VALUES ('158', '厦门国际银行', 'IBXH');
INSERT INTO `t_bankcode` VALUES ('159', '厦门农村商业银行', 'RCXM');
INSERT INTO `t_bankcode` VALUES ('160', '厦门银行', 'CBXM');
INSERT INTO `t_bankcode` VALUES ('161', '陕西药都农村商业银行', 'YDBK');
INSERT INTO `t_bankcode` VALUES ('162', '绍兴银行', 'SXCB');
INSERT INTO `t_bankcode` VALUES ('163', '深圳农村商业银行', 'SRCC');
INSERT INTO `t_bankcode` VALUES ('164', '天津滨海农村商业银行', 'BHRC');
INSERT INTO `t_bankcode` VALUES ('165', '天津农村商业银行', 'TJRC');
INSERT INTO `t_bankcode` VALUES ('166', '天津银行', 'TCCB');
INSERT INTO `t_bankcode` VALUES ('167', '唐山市商业银行', 'BOTS');
INSERT INTO `t_bankcode` VALUES ('168', '台州银行', 'TZBK');
INSERT INTO `t_bankcode` VALUES ('169', '潍坊农村商业银行', 'WRCB');
INSERT INTO `t_bankcode` VALUES ('170', '潍坊银行', 'WFCB');
INSERT INTO `t_bankcode` VALUES ('171', '武汉农村商业银行', 'WRCC');
INSERT INTO `t_bankcode` VALUES ('172', '外换银行', 'KOEX');
INSERT INTO `t_bankcode` VALUES ('173', '威海银行', 'WHBK');
INSERT INTO `t_bankcode` VALUES ('174', '乌鲁木齐商业银行', 'UCCB');
INSERT INTO `t_bankcode` VALUES ('175', '微商银行', 'HFCB');
INSERT INTO `t_bankcode` VALUES ('176', '温州银行', 'WZCB');
INSERT INTO `t_bankcode` VALUES ('177', '西安银行', 'IXAB');
INSERT INTO `t_bankcode` VALUES ('178', '协和银行', 'CBNB');
INSERT INTO `t_bankcode` VALUES ('179', '新加坡发展银行', 'DBSS');
INSERT INTO `t_bankcode` VALUES ('180', '新联商业银行', 'COXI');
INSERT INTO `t_bankcode` VALUES ('181', '西太平洋银行', 'WPAC');
INSERT INTO `t_bankcode` VALUES ('182', '延边农村商业银行', 'YBRC');
INSERT INTO `t_bankcode` VALUES ('183', '意大利联合圣保罗银行', 'BCIT');
INSERT INTO `t_bankcode` VALUES ('184', '意大利联合信贷', 'BROM');
INSERT INTO `t_bankcode` VALUES ('185', '永亨银行', 'WIHB');
INSERT INTO `t_bankcode` VALUES ('186', '营口银行', 'YKCB');
INSERT INTO `t_bankcode` VALUES ('187', '友利银行', 'HVBK');
INSERT INTO `t_bankcode` VALUES ('188', '烟台农村商业银行', 'ZFRB');
INSERT INTO `t_bankcode` VALUES ('189', '长春农村商业银行', 'CRCK');
INSERT INTO `t_bankcode` VALUES ('190', '渣打银行', 'SCBL');
INSERT INTO `t_bankcode` VALUES ('191', '兆丰国际商业银行', 'ICBC');
INSERT INTO `t_bankcode` VALUES ('192', '中国进出口银行', 'EIBC');
INSERT INTO `t_bankcode` VALUES ('193', '中国农业发展银行', 'ADBN');
INSERT INTO `t_bankcode` VALUES ('194', '中国信托银行', 'CTCB');
INSERT INTO `t_bankcode` VALUES ('195', '珠海农村商业银行', 'ZRCB');
INSERT INTO `t_bankcode` VALUES ('196', '浙江稠州银行', 'CZCB');
INSERT INTO `t_bankcode` VALUES ('197', '浙江禾城农村商业银行', 'HCRC');
INSERT INTO `t_bankcode` VALUES ('198', '浙江杭州余杭农村商业银行', 'YHBK');
INSERT INTO `t_bankcode` VALUES ('199', '浙江民泰商业银行', 'ZJMT');
INSERT INTO `t_bankcode` VALUES ('200', '浙江泰隆商业银行', 'ZJTL');
INSERT INTO `t_bankcode` VALUES ('201', '浙江温州鹿城农村商业银行', 'LCBK');
INSERT INTO `t_bankcode` VALUES ('202', '浙江新昌农村商业银行', 'ZXBK');
INSERT INTO `t_bankcode` VALUES ('203', '浙江义乌农村商业银行', 'YWBK');
INSERT INTO `t_bankcode` VALUES ('204', '浙江诸暨农村商业银行', 'ZJRB');
INSERT INTO `t_bankcode` VALUES ('205', '浙江舟山普陀农村商业银行', 'ZJPT');
INSERT INTO `t_bankcode` VALUES ('206', '重庆农村商业银行', 'CQRB');
INSERT INTO `t_bankcode` VALUES ('207', '重庆三峡银行', 'CTGB');
INSERT INTO `t_bankcode` VALUES ('208', '重庆银行', 'CQCB');
INSERT INTO `t_bankcode` VALUES ('209', '长沙银行', 'CHCC');
INSERT INTO `t_bankcode` VALUES ('210', '正信银行', 'ZXBC');
INSERT INTO `t_bankcode` VALUES ('211', '郑州银行', 'ZZBK');
INSERT INTO `t_bankcode` VALUES ('212', '其他（如第三方支付牌照）', '9999');
