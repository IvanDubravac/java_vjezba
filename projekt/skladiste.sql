# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\marko\Documents\java_vjezba\projekt\skladiste.sql
#pravljenje era dijagrama

drop database if exists protokrobe;
create database protokrobe;
use protokrobe;


 create table zaposlenik(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib char(11),
    iban varchar(35),
    nadredeni int 

 );

create table promet(
    sifra int not null primary key auto_increment,
    proizvod int,
    kolicina int,
    vrijeme TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    zaposlenik int,
    vrsta int

);

create table proizvod(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    cijena decimal(5,2),
    rok_trajanja datetime,
    zemlja_podrijetla varchar(30),
    neto_kolicina int
);


create table vrsta(
    sifra int not null primary key auto_increment,
    naziv varchar(20),
    predznak int
);


alter table promet add foreign key (proizvod) references proizvod(sifra);
alter table promet add foreign key (zaposlenik) references zaposlenik(sifra);
alter table promet add foreign key (vrsta) references vrsta(sifra);
alter table zaposlenik add foreign key (nadredeni) references zaposlenik(sifra);


insert into zaposlenik (ime,prezime,nadredeni)
values('Ivan', 'Dubravac', null),
('Andrija', 'Azinić', 1),
('Nikola', 'Juzbašić', 1),
('Sara', 'Lutring', 1),
('Antonela ', 'Pavić', 1);


insert into vrsta (naziv,predznak)
values('doprema', 1),
('otprema', (-1));



