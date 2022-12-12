# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\marko\Documents\java_vjezba\SQL\kolokvij_vjezna9.sql

drop database if exists vjezba9;
create database vjezba9;
use vjezba9;

create table prijateljica(
    sifra int not null primary key auto_increment,
    treciputa datetime,
    novcica decimal (16,7),
    kuna decimal(14,5) not null,
    drugiputa datetime,
    haljina varchar(45),
    kratkamajica varchar(49)
);

create table punac_prijateljica(
    sifra int not null primary key auto_increment,
    punac int not null,
    prijateljica int not null
);

create table punac(
    sifra int not null primary key auto_increment,
    narukvica int not null,
    modelnaocala varchar(30),
    kuna decimal(12,8),
    bojaociju varchar(33),
    suknja varchar(45)
);

create table cura(
    sifra int not null primary key auto_increment,
    vesta varchar(49) not null,
    ekstrovertno bit,
    carape varchar(37),
    suknja varchar(37) not null,
    punac int not null
);

create table brat(
    sifra int not null primary key auto_increment,
    novcica decimal(18,9) not null,
    ekstrovertno bit,
    vesta varchar(32) not null,
    cura int 
);

create table zarucnik(
    sifra int not null primary key auto_increment,
    gustoca decimal(17,6),
    haljina varchar(40),
    kratkamajica varchar(48) not null,
    nausnica int not null,
    brat int not null
);

create table snasa(
    sifra int not null primary key auto_increment,
    prsten int,
    drugiputa datetime not null,
    haljina varchar(38) not null,
    ostavljena int
);

create table ostavljena(
    sifra int not null primary key auto_increment,
    modelnaocala varchar(36) not null,
    suknja varchar(32),
    eura decimal(18,7) not null,
    lipa decimal(15,7) not null,
    treciputa datetime not null,
    drugiputa datetime not null
);


alter table snasa add foreign key(ostavljena) references ostavljena(sifra);
alter table zarucnik add foreign key(brat) references brat(sifra);
alter table brat add foreign key(cura) references cura(sifra);
alter table cura add foreign key(punac) references punac(sifra);
alter table punac_prijateljica add foreign key(punac) references punac(sifra);
alter table punac_prijateljica add foreign key(prijateljica) references prijateljica(sifra);



insert into punac (narukvica)
values(5),(5),(5);

insert into prijateljica (kuna)
values(15.8),(15.8),(15.8);

insert into punac_prijateljica (punac,prijateljica )
values(1,1),(1,1),(1,1);

insert into cura (vesta,suknja,punac)
values('crvena','plava',1),('crvena','plava',1),
('crvena','plava',1);

insert into brat (novcica,vesta)
values(15.8,'roza'),(15.8,'roza'),(15.8,'roza');

update snasa set drugiputa=2020-04-14
where sifra is not null ;

delete from zarucnik 
where haljina ='AB';

select carape from cura 
where ekstrovertno is null ;

select a.kuna , f.nausnica , e.ekstrovertno 
from prijateljica a
inner join punac_prijateljica b on a.sifra =b.prijateljica 
inner join punac c on c.sifra =b.punac 
inner join cura d on c.sifra =d.punac 
inner join brat e on e.cura =d.sifra 
inner join zarucnik f on f.brat =e.sifra 
where d.ekstrovertno is not null and c.modelnaocala like '%ba%'
order by e.ekstrovertno desc ;


select a.modelnaocala , a.kuna 
from punac a
left join punac_prijateljica b on a.sifra =b.punac 
where b.sifra is null ;
