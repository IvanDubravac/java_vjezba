

# ljestve (hash) je komentar i on se ne izvodi
# Izvođenje naredbi na serveru
# Otvoriti CMD
# Zaljepiti sljedeću naredbu bez prvoh hash znaka
# c:\xampp\mysql\bin\mysql -uroot < C:\Users\dell\Documents\EdunovaJP27a\SQL\skripta1.sql

drop database if exists samouprava;
create database samouprava;
use samouprava;
create table zupan(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    nadredeni int
);

alter table zupan add foreign key (nadredeni) references zupan(sifra);
