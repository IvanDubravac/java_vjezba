#c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\marko\Documents\java_vjezba\SQL\kolokvij_vjezba_2.sql

drop database if exists vjezba_2;
create database vjezba_2;
use vjezba_2;

create table brat (
    sifra int not null primary key auto_increment,
    suknja varchar(47),
    ogrlica int not null,
    asocijalno bit not null,
    neprijatelj int not null
);

create table neprijatelj(
    sifra int not null primary key auto_increment,
    majica varchar(32),
    haljina varchar(43) not null,
    lipa decimal(16,8),
    modelnaocala varchar(49) not null,
    kuna decimal(12,6) not null,
    jmbag char (11),
    cura int 
);

create table cura(
    sifra int not null primary key auto_increment,
    haljina varchar(32) not null,
    drugiputa datetime not null,
    suknja varchar(38),
    narukvica int,
    introvertno bit,
    majica varchar(40) not null,
    decko int 
);

create table zarucnica(
    sifra int not null primary key auto_increment,
    narukvica int,
    bojakose varchar(37) not null,
    novcica decimal(15,9),
    lipa decimal(15,8) not null,
    indiferentno bit not null
);

create table decko_zarucnica(
    sifra int not null primary key auto_increment,
    decko int,
    zarucnica int
);

create table decko(
    sifra int not null primary key auto_increment,
    indiferentno bit,
    vesta varchar(36),
    asocijalno bit not null
);

create table prijatelj(
    sifra int not null primary key auto_increment,
    modelnaocala varchar(37),
    treciputa datetime not null,
    ekstroventno bit not null,
    prviputa datetime,
    svekar int
);

create table svekar(
    sifra int not null primary key auto_increment,
    stilfrizura varchar(48),
    ogrlica int not null,
    asocijalno int not null
);


alter table brat add foreign key(neprijatelj) references neprijatelj(sifra);
alter table neprijatelj add foreign key(cura) references cura(sifra);
alter table cura add foreign key(decko) references decko(sifra);
alter table decko_zarucnica add foreign key(decko) references decko(sifra);
alter table decko_zarucnica add foreign key(zarucnica) references zarucnica(sifra);
alter table prijatelj add foreign key (svekar) references svekar(sifra);


select * from  neprijatelj ;
insert into neprijatelj (haljina,modelnaocala,kuna)
values ('Zara','Rayban',14.55),
('stradivarius','gucci',73.55),
('Armani','Prada',39.99);

select * from cura;
insert into cura (haljina,drugiputa,majica)
values('Zara',2022,'Polo'),
('Gucci',2019,'Armani'),
('Nez',1998,'Berskha');

insert into decko (asocijalno)
values(1),(0),(1);
insert into zarucnica (bojakose,lipa,indiferentno)
values('plava',14.55,1),
('smeđa',32.44,1),
('crna',23.88,0);

select * from  decko_zarucnica ;
insert into decko_zarucnica(decko,zarucnica)
values(1,1),(2,2),(3,3);


select * from  decko ;
select * from  zarucnica;

select * from prijatelj;
update prijatelj set treciputa=2020-04-30
where treciputa=null;

delete  from brat 
where ogrlica!=14;

select suknja from cura 
where drugiputa is  null ;

select f.novcica , a.neprijatelj , b.haljina 
from brat a
inner join neprijatelj b on a.neprijatelj =b.sifra 
inner join cura c on c.sifra=b.cura 
inner join decko d on d.sifra=c.decko 
inner join decko_zarucnica e on e.decko = d.sifra 
inner join zarucnica f on f.sifra =e.zarucnica 
where c.drugiputa is not null and d.vesta like '%ba%'
order by b.haljina desc;

select a.vesta , a.asocijalno 
from decko a
left join decko_zarucnica b on a.sifra =b.decko 
where b.sifra is null ;