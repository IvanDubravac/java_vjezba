# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\marko\Documents\java_vjezba\SQL\kolokvij_vjezba_6.sql


drop database if exists vjezba6;
create database vjezba6;

use vjezba6;

create table decko(
    sifra int not null primary key auto_increment,
    prviputa datetime,
    modelnaocala varchar(46),
    nausnica int,
    zena int 
);
create table zena  (
    sifra int not null primary key auto_increment,
    novcica decimal(14,8) not null,
    narukvica int not null,
    dukserica varchar(40) not null,
    haljina varchar(30),
    hlace varchar(32),
    brat int not null
);

create table brat (
    sifra int not null primary key auto_increment,
    nausnica int not null,
    treciputa datetime not null,
    narukvica int not null,
    hlace varchar(31),
    prijatelj int 
);

create table prijatelj(
    sifra int not null primary key auto_increment,
    haljina varchar(35),
    prsten int not null,
    introvertno bit,
    stilfrizura varchar(36) not null
);

create table prijatelj_ostavljena (
    sifra int not null primary key auto_increment,
    prijatelj int not null,
    ostavljena int not null
);

create table ostavljena(
    sifra int not null primary key auto_increment,
    prviputa datetime not null,
    kratkamajica varchar(39) not null,
    drugiputa datetime,
    maraka decimal(14,10)
);

create table svekrva  (
    sifra int not null primary key auto_increment,
    hlace varchar(48) not null,
    suknja varchar(42) not null,
    ogrlica int not null,
    treciputa datetime not null,
    dukserica varchar(32) not null,
    narukvica int not null,
    punac int 
);

create table punac (
    sifra int not null primary key auto_increment,
    ekstrovertno bit not null,
    suknja varchar(30) not null,
    majica varchar(44) not null,
    prviputa datetime not null
);


alter table decko add foreign key(zena) references zena(sifra);
alter table zena add foreign key(brat) references brat(sifra);
alter table brat add foreign key (prijatelj) references prijatelj (sifra);
alter table prijatelj_ostavljena add foreign key(prijatelj) references prijatelj(sifra);
alter table prijatelj_ostavljena add foreign key(ostavljena) references ostavljena (sifra);
alter table svekrva add foreign key(punac) references punac(sifra); 






 insert into prijatelj (prsten,stilfrizura )
 values(14, 'Rokeza'),(34, 'fudbalerka'),(56, 'roza');

insert into brat (nausnica,treciputa ,narukvica)
values(40, 2015, 1545),(43, 1994, 26564),(99, 2000, 1547);

insert into zena (novcica,narukvica,dukserica,brat)
values(154.2, 78,'bijela',1),(324.43, 434,'crna',2),
(9999.99, 343,'žuta',3);

insert into ostavljena (prviputa,kratkamajica)
values (2022, 'zara'),(2005, 'bijela'),(1999, 'crna');

insert into prijatelj_ostavljena (prijatelj, ostavljena)
values(1,1),(2,2),(3,3);

update svekrva set suknja='Osijek'
where sifra is not null;

delete from decko 
where modelnaocala < 'AB';

select narukvica from brat 
where treciputa is null;

select f.drugiputa , a.zena , b.narukvica 
from decko a
inner join zena b on  a.zena=b.sifra 
inner join brat c on c.sifra=b.brat 
inner join prijatelj d on d.sifra = c.prijatelj 
inner join  prijatelj_ostavljena e on e.prijatelj=d.sifra 
inner join ostavljena f on f.sifra=e.ostavljena 
where c.treciputa is not null and d.prsten =219
order by b.narukvica desc ;

select a.prsten , a.introvertno 
from prijatelj a
left join prijatelj_ostavljena b on a.sifra=b.prijatelj 
where b.sifra is null ;
