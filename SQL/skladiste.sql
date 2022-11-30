# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\marko\Documents\java_vjezba\SQL\skladiste.sql
#pravljenje era dijagrama

drop database if exists protokrobe;
create database protokrobe;
use protokrobe;

create table osoba(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib char(11)

);
 create table zaposlenik(
    sifra int not null primary key auto_increment,
    osoba int,
    iban varchar(35),
    nadredeni int 

 );

create table skladiste(
    sifra int not null primary key auto_increment,
    proizvod int,
    kolicina int,
    vrijeme_dopreme TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    vrijeme_otpreme TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    zaposlenik int
);

create table prehrambeni_proizvod(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    cijena decimal(5,2),
    rok_trajanja datetime,
    zemlja_podrijetla varchar(30),
    neto_kolicina int
);

create table neprehrambeni_proizvod(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    cijena decimal(5,2),
    rok_trajanja datetime,
    zemlja_podrijetla varchar(30),
    neto_kolicina int
);

create table proizvod(
    sifra int not null primary key auto_increment,
    prehrambeni_proizvod int,
    neprehrambeni_proizvod int 
);

alter table proizvod add foreign key (prehrambeni_proizvod) references prehrambeni_proizvod(sifra);
alter table proizvod add foreign key (neprehrambeni_proizvod) references neprehrambeni_proizvod(sifra);

alter table skladiste add foreign key (proizvod) references proizvod(sifra);
alter table skladiste add foreign key (zaposlenik) references zaposlenik(sifra);

alter table zaposlenik add foreign key (osoba) references osoba(sifra);
alter table zaposlenik add foreign key (nadredeni) references zaposlenik(sifra);



