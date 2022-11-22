#c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\marko\Documents\java_vjezba\SQL\igraonica.sql

drop database if exists igraonica;
create database igraonica default charset utf8;
use igraonica;

create table dijete(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib char(11)
);

create table skupina(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    maxclanova int not null,
    maxdob int not null,
    teta int
);

create table teta(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib char(11)
);

create table clan(
    dijete int,
    skupina int
);

alter table skupina add foreign key(teta) references teta(sifra);
alter table clan add foreign key(dijete) references dijete(sifra);
alter table clan add foreign key(skupina) references skupina(sifra);

insert into dijete (ime,prezime)
values('Marko','Marković'),('Pero','Perić'),('Niko','Nikić'),('Ivan','Ivković'),
('Marin','Marić'),('Josip','Josipić'),('Ivan ', 'Dubravac'),('Dorijan', 'Garac'),('Shibel', 'Ageel'),
('Nikola', 'Juzbašić'),('Andrija', 'Aziinić'),('Dominik', 'Talavanić');

insert into teta (ime,prezime)
values('Marina','Dubravac'),('Irena','Galić'),('Dina','Jukić'),('Marina','Skender');

insert into skupina(naziv,maxclanova,maxdob,teta)
values('Košarka',3,6,1),('Nogomet',3,10,2),
('Tenis',3,12,3),('Plivanje',3,14,4);

insert into clan (dijete,skupina)
values(1,1),(2,1),(3,1),
(4,2),(5,2),(6,2),
(7,3),(8,3),(9,3),
(10,4),(11,4),(12,4);

