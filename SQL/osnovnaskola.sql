# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\marko\Documents\java_vjezba\SQL\osnovnaskola.sql

drop database if exists osnovnaskola;
create database osnovnaskola default charset utf8;
use osnovnaskola;

create table radionica(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    maxpolaznika int not null,
    uciteljica int
);

create table uciteljica(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib char(11)
);

create table dijete(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib char(11)
);

create table radionicadijete(
    radionica int,
    dijete int
);

alter table radionica add foreign key(uciteljica) references uciteljica(sifra);
alter table radionicadijete add foreign key(radionica) references radionica (sifra);
alter table radionicadijete add foreign key(dijete) references dijete(sifra);

insert into uciteljica(ime,prezime)
values('Marina','Dubravac'),('Irena','Galić'),('Dina','Jukić'),('Marina','Skender');

insert into radionica (naziv,maxpolaznika ,uciteljica)
values('Tratinčica',5,1),('Breskva',5,2),('Šuma',5,3),('Park',5,4);

insert into dijete (ime,prezime)
values('Kristijan','Ratković'),
('Kristijan','Vidaković'),
('Isidora','Karan'),
('Martina','Novoselac'),
('Lorena','Čiček'),
('Marko','Mijatović'),
('Marko','Perak'),
('Lovre','Burazer-Pavešković'),
('Krunoslav','Kasalo'),
('Karlo','Odobašić'),
('Karlo','Kapl'),
('Ivan','Dubravac'),
('Mario','Živković'),
('Toni','Stojčević'),
('Pero', 'Perić'),('Ivo', 'Ivić'),('Ivan ', 'Dubravac'),('Dorijan', 'Garac'),('Shibel', 'Ageel'),
('Nikola', 'Juzbašić');

insert into radionicadijete (radionica,dijete)
values(1,1),(1,2),(1,3),(1,4),(1,5),
(2,6),(2,7),(2,8),(2,9),(2,10),
(3,11),(3,12),(3,13),(3,14),(3,15),
(4,16),(4,7),(4,18),(4,19),(4,20);




