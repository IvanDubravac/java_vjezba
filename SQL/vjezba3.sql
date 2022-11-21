#vjezba 3
# C:\Users\marko\Documents\EdunovaJP27\SQL\vjezba3.sql

drop database if exists firma;
create database firma;
use firma;

create table projekt(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    cijena decimal
);

create table programer(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    datumrodenja datetime,
    placa decimal
);

create table sudjeluje(
    projekt int,
    programer int,
    datumpocetka datetime,
    datumkraja datetime
);

alter table sudjeluje add foreign key(projekt) references projekt(sifra);
alter table sudjeluje add foreign key(programer) references programer(sifra);

