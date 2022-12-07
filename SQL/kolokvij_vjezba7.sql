# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\marko\Documents\java_vjezba\SQL\kolokvij_vjezba7.sql

drop database if exists vjezba7;
create database vjezba7;
use vjezba7;

create table becar(
    sifra int not null primary key auto_increment,
    eura decimal(15,10) not null,
    treciputa datetime,
    prviputa datetime,
    muskarac int not null
);

create table muskarac(
    sifra int not null primary key auto_increment,
    haljina varchar(47),
    drugiputa datetime not null,
    treciputa datetime
);

create table muskarac_decko(
    sifra int not null primary key auto_increment,
    muskarac int not null,
    decko int not null
);

create table decko(
    sifra int not null primary key auto_increment,
    kuna decimal(12,10),
    lipa decimal (17,10),
    bojakose varchar(44),
    treciputa datetime not null,
    ogrlica int not null,
    ekstrovertno bit not null
);

create table brat(
    sifra int not null primary key auto_increment,
    introvertno bit ,
    novcica decimal(14,7) not null,
    treciputa datetime,
    neprijatelj int
);

create table neprijatelj(
    sifra int not null primary key auto_increment,
    kratkamajica varchar(44),
    introvertno bit,
    indiferentno bit,
    ogrlica int not null,
    becar int not null
);

create table prijateljica(
    sifra int not null primary key auto_increment,
    vesta varchar(50),
    nausnica int not null,
    introvertno bit not null
);

create table cura(
    sifra int not null primary key auto_increment,
    nausnica int not null,
    indiferentno bit ,
    ogrlica int not null,
    gustoca decimal(12,6),
    drugiputa datetime,
    vesta varchar(33),
    prijateljica int
);


alter table cura add foreign key (prijateljica) references prijateljica(sifra);
alter table brat add foreign key(neprijatelj) references neprijatelj(sifra);
alter table neprijatelj add foreign key(becar) references becar(sifra);
alter table becar add foreign key(muskarac) references muskarac(sifra);
alter table muskarac_decko add foreign key(muskarac) references muskarac(sifra);
alter table muskarac_decko add foreign key(decko) references decko(sifra);



 


insert into decko (treciputa,ogrlica,ekstrovertno)
values(2022,15,1),(1999,2323,1),(1987,66565,0);

insert into muskarac (drugiputa)
values(1895),(2005),(2000);

insert into muskarac_decko (muskarac,decko)
values(1,1),(3,3),
(2,2);

insert into becar(eura,muskarac )
values(152,1),(152,2),(152,3);

insert into neprijatelj (ogrlica,becar)
values(152,1),(232323,2),(54545,3);

update cura set indiferentno = false 
where sifra is not null ;

delete from brat 
where novcica != 12.75;

select prviputa  from becar 
where treciputa is null ;
