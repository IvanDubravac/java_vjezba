 # c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 <  C:\Users\marko\Documents\java_vjezba\SQL\kolokvij_vjezba8.sql

drop database if exists vjezba8;
create database vjezba8;

use vjezba8;

create table prijateljica(
    sifra int not null primary key auto_increment,
    vesta varchar(50),
    nausnica int not null,
    introvertno bit not null
);

create table cura(
    sifra int not null primary key auto_increment,
    nausnica int not null,
    indiferentno bit,
    ogrlica int not null,
    gustoca decimal(12,6),
    drugiputa datetime,
    vesta varchar(33),
    prijateljica int
);

create table becar(
    sifra int not null primary key auto_increment,
    eura decimal (15,10) not null,
    treciputa datetime,
    priviputa datetime,
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
    lipa decimal(17,10),
    bojakose varchar(44),
    treciputa datetime not null,
    ogrlica int not null,
    ekstrovertno bit not null
);

create table neprijatelj(
    sifra int not null primary key auto_increment,
    kratkamajica varchar(44),
    introvertno bit,
    indiferentno bit,
    ogrlica int not null,
    becar int not null
);

create table brat(
    sifra int not null primary key auto_increment,
    introvertno bit,
    novcica decimal(14,7) not null,
    treciputa datetime,
    neprijatelj int 
);

alter table brat add foreign key (neprijatelj) references neprijatelj(sifra);
alter table neprijatelj add foreign key (becar) references becar(sifra);
alter table becar add foreign key(muskarac) references muskarac (sifra);
alter table muskarac_decko add foreign key(muskarac) references muskarac(sifra);
alter table muskarac_decko add foreign key(decko) references decko(sifra);
alter table cura add foreign key(prijateljica) references prijateljica(sifra);


insert into decko (treciputa,ogrlica,ekstrovertno)
values(2022,15,1),(2022,15,1),(2022,15,1);

insert into muskarac (drugiputa)
values(1695),(1695),(1695);

insert into muskarac_decko (muskarac,decko)
values(1,1),(1,1),(1,1);

insert into becar (eura,muskarac)
values(123.6, 1),(123.6, 1),(123.6, 1);

insert into neprijatelj (ogrlica, becar)
values(4,1),(4,1),(4,1);

update cura set indiferentno=false 
where sifra is not null ;

delete from brat 
where novcica !=12.75;

select priviputa from becar 
where treciputa is null ;

select f.bojakose , a.neprijatelj , b.introvertno 
from brat a 
inner join neprijatelj b on b.sifra = a.neprijatelj 
inner join becar c on c.sifra= b.becar 
inner join muskarac d on d.sifra = c.muskarac 
inner join muskarac_decko e on e.muskarac=d.sifra 
inner join decko f on f.sifra =e.decko 
where c.treciputa is not null and d.drugiputa is not null 
order by b.introvertno desc ;

select a.drugiputa , a.treciputa 
from muskarac a
left join muskarac_decko b on a.sifra=b.muskarac 
where b.sifra is null ;
