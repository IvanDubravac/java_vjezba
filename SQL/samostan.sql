# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\marko\Documents\java_vjezba\SQL\samostan.sql

drop database if exists samostan;
create database samostan default charset utf8;
use samostan;

create table svecenik(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib char(11),
    nadredeni int 
);

create table posao(
    sifra int not null primary key auto_increment,
    opis varchar(100),
    vrijeme datetime,
    mjesto varchar(50)
);

create table sluzba(
    svecenik int,
    posao int
);

alter table svecenik add foreign key(nadredeni) references svecenik(sifra);
alter table sluzba add foreign key(svecenik) references svecenik(sifra);
alter table sluzba add foreign key(posao) references posao(sifra);

insert into svecenik (ime,prezime,nadredeni)
values ('Dominik', 'Talavanić',null),
('Ivo', 'Ivić',1),
('Ivan ', 'Dubravac',1),
('Dorijan', 'Garac',2),
('Shibel', 'Ageel',3),
('Nikola', 'Juzbašić',5),
('Andrija', 'Azinić',5),
('Pero', 'Perić',7);


insert into posao (opis,vrijeme,mjesto)
values('Nedjeljna misa', '2022-05-04 8:00:00', 'Osijek'),
('Križni put', '2022-07-07 12:00:00', 'Vukovar'),('Vjenčanje', '2023-03-02 18:00:00', 'Zagreb'),
('Misa zornica', '2022-04-09 06:30:00', 'Rijeka');


insert into sluzba (svecenik,posao)
values(1,1),(2,1),(3,2),(4,2),(5,3),(6,3),(7,4),(8,4);


