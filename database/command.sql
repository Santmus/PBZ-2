DROP TABLE IF EXISTS command;

USE PBZ_2;

CREATE TABLE command (
id_command INT PRIMARY KEY AUTO_INCREMENT,
number_command VARCHAR(10),
date_command DATE,
content_command VARCHAR(100),
event_command VARCHAR(40),
responsible_for_implementation VARCHAR(50),
date_performance_event DATE,
check_date_performance_event VARCHAR(3)
); 

SET NAMES utf8;
INSERT INTO command (id_command,number_command,date_command,content_command,event_command,responsible_for_implementation,date_performance_event,check_date_performance_event) 
VALUES (1,'№324','2020-04-18','Привести двигатели к полной готовности к 12.10.2020','Вход в Цех №12','Узумаки Наруто Ульянович','2020-06-24','Да'),
(2,'№24-У','2019-11-22','Идеалогическая беседа по повожу ситуации в стране','Кабинет 24-У','Николаев Игорь Николаевич','2019-11-25','Да'),
(3,'№111-Г','2020-10-10','Запрет об использовании мобильных средств','Кабинет 132-Г','Пахом Андрей Игоревич','2020-10-16','Нет'),
(4,'№665','2018-06-28','Поощрение рабочих','Актовый зал','Чудопал Александр Александров','2018-06-30','Да'),
(5,'№1','2020-09-03','Инструктаж по техники безопастности','Актовый зал','Ивашенко Валерьян Петрович','2020-09-12','Нет')
;