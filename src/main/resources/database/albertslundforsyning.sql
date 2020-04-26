create database albertslundforsyning_db;

USE albertslundforsyning_db;

CREATE TABLE abonnenter
(
    ID int NOT NULL AUTO_INCREMENT,
    name varchar(60),
    address varchar(148),
    email varchar(48),
    phonen varchar(48),
    comment varchar(250),
    PRIMARY KEY (ID)
);
