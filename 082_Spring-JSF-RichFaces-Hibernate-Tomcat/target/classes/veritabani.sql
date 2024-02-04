CREATE DATABASE IF NOT EXISTS `projemDB` 
				   DEFAULT CHARACTER SET utf8 ;

CREATE TABLE `projemDB`.`personel` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `adi` VARCHAR(45) NULL COMMENT '',
  `soyadi` VARCHAR(45) NULL COMMENT '',
  `cinsiyeti` VARCHAR(10) NULL COMMENT '',
  `eposta` VARCHAR(100) NULL COMMENT '',
  `numarasi` INT NULL COMMENT '',
  `parolasi` VARCHAR(100) NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '');
    
INSERT INTO `projemDB`.`personel` (`adi`, `soyadi`, `cinsiyeti`, `eposta`, `numarasi`, `parolasi`) 
VALUES ('Hüseyin', 'Aydın', '2', 'huseyinaydin99@gmail.com', '1010', '99999999');

INSERT INTO `projemDB`.`personel` (`adi`, `soyadi`,  `cinsiyeti`, `eposta`, `numarasi`, `parolasi`) 
VALUES ('Yasin', 'Aydın', '2', 'ysn5115@gmail.com', '1515',  '88888888');

INSERT INTO `projemDB`.`personel` (`adi`, `soyadi`,  `cinsiyeti`, `eposta`, `numarasi`, `parolasi`) 
VALUES ('Murat', 'Yücedağ', '2', 'omerfaruk.balarisi99@gmail.com', '1616', '9876TR');

SELECT * FROM `projemDB`.`personel`;