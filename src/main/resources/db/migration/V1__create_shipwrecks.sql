
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for shipwrecks
-- ----------------------------
DROP TABLE IF EXISTS `shipwrecks`;
CREATE TABLE `shipwrecks` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `shipwreck_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `description` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `shipwreck_condition` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `depth` int(40) NOT NULL,
  `year_discovered` int(40) NOT NULL,
  `latitude` double(255,0) DEFAULT NULL,
  `longitude`  double(255,0) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

SET FOREIGN_KEY_CHECKS = 1;