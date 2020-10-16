DROP TABLE IF EXISTS outgoing_correspondent;

USE PBZ_2;

CREATE TABLE outgoing_correspondent (
id_correspodent INT PRIMARY KEY AUTO_INCREMENT,
name_subdivision VARCHAR(10),
position_correspodent VARCHAR(30),
surname_name VARCHAR(40)
); 

SET NAMES utf8;

INSERT INTO outgoing_correspondent (id_correspodent,name_subdivision,position_correspodent,surname_name) 
VALUES (1,'ГК-12','Инженер','Узумаки Наруто Ульянович'),
(2,'ДЛ-25','Механик-водитель','Божко Вадим Юрьевич'),
(3,'СС-45','Дворник','Вашкевич Владислав Владиславович'),
(4,'МАУ-25','Инженер-системотехник','Пахом Андрей Игоревич'),
(5,'ГИТЛ-64','Подполковник','Александров Виталий Олегович'),
(6,'ГИТЛ-64','Уборщик','Толкачёва Анна Сергеевна'),
(7,'ЛК-23','Секретарь','Иванов Иван Иванович');