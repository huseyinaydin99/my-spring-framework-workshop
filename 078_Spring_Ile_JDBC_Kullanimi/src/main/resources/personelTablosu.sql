CREATE SCHEMA huseyinDB ;

CREATE TABLE huseyinDB.personel (
  id int(11) NOT NULL AUTO_INCREMENT,
  adi varchar(50) DEFAULT NULL,
  soyadi varchar(60) DEFAULT NULL,
  tecrube varchar(2) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

SET PASSWORD FOR 'root'@'localhost' = PASSWORD('toor');

SELECT * FROM huseyinDB.personel;