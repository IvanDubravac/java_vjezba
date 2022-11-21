# C:\Users\marko\Documents\EdunovaJP27\SQL\vjezba2.sql
#vjezba2 


drop database if exists regija;
create database regija;
use regija;

create table zupanija(
    sifra int not null primary key auto_increment,
    naziva varchar(50),
    zupan int
);

create table opcina(
    sifra int not null primary key auto_increment,
    zupanija int,
    naziv varchar(50)
);

alter table opcina add foreign key (zupanija) references zupanija(sifra);



