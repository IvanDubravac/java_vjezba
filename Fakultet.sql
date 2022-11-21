#c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\marko\Documents\java_vjezba\Fakultet.sql

drop database if exists fakultet;
create database fakultet default charset utf8;
use fakultet;
create table student(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib char(11)
);

create table rok(
    sifra int not null primary key auto_increment,
    vrijeme datetime,
    predmet varchar(50) not null,
    prolazpad boolean
);

create table polaganje(
    student int not null,
    rok int not null
);

alter table polaganje add foreign key (student) references student(sifra);
alter table polaganje add foreign key (rok) references rok (sifra);


insert into student (ime ,prezime)
values 
('Kristijan','Ratković'),
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
('Toni','Stojčević');

insert into rok (vrijeme, predmet)
values('2023-05-05 13:00:00', 'Java programiranje');

insert into polaganje (student,rok)
values (1,1),(2,1),(3,1),(4,1),(5,1),(6,1),(7,1),
(8,1),(9,1),(10,1),(11,1),(12,1),(13,1),(14,1);



