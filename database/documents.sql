USE PBZ_2;

DROP TABLE IF EXISTS documents;

CREATE TABLE documents(
id_document INT PRIMARY KEY AUTO_INCREMENT,
name_company VARCHAR(30),
type_of_document VARCHAR(15),
number_command VARCHAR(20),
date_command DATE,
check_date_performance_event VARCHAR(3)
); 

SET NAMES utf8;

INSERT INTO documents (id_document, name_company, type_of_document, number_command, date_command, check_date_performance_event) 
VALUES (1,'ТрансНефтьХио','Договор','Приказ №1','2020-10-15','Да'),
(2,'Евросетка','Займ','Приказ №235','2020-09-15','Нет'),
(3,'БелШина','Договор','Приказ №45-у','2019-12-27','Да'),
(4,'Беларсусский Агарный Завод','Взызскание','Приказ 52','2020-08-28','Да'),
(5,'Вернховный суд РБ','Постановление','Приказ №35','2020-06-08','Нет');

SELECT name_company,now(),number_command,date_command,check_date_performance_event
FROM documents
WHERE type_of_document IN ('Договор');
