# C:\Users\marko\Documents\EdunovaJP27\SQL\vjezba4.sql 


 drop database if exists poduzece;
 create database poduzece;
 use poduzece;

 create table zaposlenik(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    placa decimal,
    nadredeni int
 );

 alter table zaposlenik add foreign key(nadredeni) references zaposlenik(sifra);
 