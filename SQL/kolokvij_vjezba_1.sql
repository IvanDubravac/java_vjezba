#c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < "C:\Users\marko\Documents\java_vjezba\SQL\kolokvij_vjezba_1.sql"

drop database if exists vjezba_1 ;
create database vjezba_1;
use vjezba_1;

create table mladic(
    sifra int not null primary key auto_increment,
    suknja varchar(50) not null,
    kuna decimal(16,8) not null,
    drugiputa datetime,
    asocijalno bit,
    ekstroventno bit not null,
    dukserica varchar(48) not null,
    muskarac int
);

create table muskarac(
    sifra int not null primary key auto_increment,
    bojaociju varchar(48) not null,
    hlace varchar(30),
    modelnaocala varchar(43),
    maraka decimal(14,8) not null,
    zena int
);

create table svekar(
    sifra int not null primary key auto_increment,
    bojaociju varchar(40) not null,
    prsten int,
    dukserica varchar(41),
    lipa decimal(13,8),
    eura decimal(12,7),
    majica varchar(35)
);

create table sestra_svekar(
    sifra int not null primary key auto_increment,
    sestra int,
    svekar int
);

create table zena(
    sifra int not null primary key auto_increment,
    treciputa datetime,
    hlace varchar(46),
    kratkamajica varchar(31) not null,
    jmbag char (11) not null,
    bojaociju varchar(39) not null,
    haljina varchar(44),
    sestra int
);

create table sestra(
    sifra int not null primary key auto_increment,
    introvertno bit,
    haljina varchar(31) not null,
    maraka decimal(16,6),
    hlace varchar(46) not null,
    narukvica int not null 
); 

create table punac(
    sifra int not null primary key auto_increment,
    ogrlica int,
    gustoca decimal(14,9),
    hlace varchar(41) not null
);

create table cura(
    sifra int not null primary key auto_increment,
    novcica decimal(16,5) not null,
    gustoca decimal(18,6) not null,
    lipa decimal(13,10),
    ogrlica int not null,
    bojakose varchar(38),
    suknja varchar(36),
    punac int 
);

alter table cura add foreign key (punac) references punac (sifra);
alter table zena add foreign key (sestra) references sestra(sifra);
alter table sestra_svekar add foreign key (sestra) references sestra (sifra);
alter table sestra_svekar add foreign key (svekar) references svekar (sifra);
alter table muskarac add foreign key (zena) references zena(sifra);
alter table mladic add foreign key (muskarac) references muskarac (sifra);

select * from sestra_svekar  ;
insert into muskarac(bojaociju,maraka,modelnaocala)
values('plava',55.33,'Ray-Ban'),
('smeđa',52.22,'Armani'),
('crna',34.98,'Gucci');

insert into zena (kratkamajica,jmbag,bojaociju)
values ('Zara',29183093876,'plava'),('Stradivaranaius',73820938761,'smeđa'),
('P&B',30938746192,'zelena');

insert into sestra (haljina,hlace,maraka)
values('plava','zute',13.22),('plava','zute',13.22),('plava','zute',13.22);

insert into svekar  (bojaociju,dukserica ,lipa)
values('plava','zuta',14.22),('plava','zuta',14.22),('plava','zuta',14.22);

insert into sestra_svekar (sestra,svekar)
values (1,1),(2,2),(3,3);


select * from cura ;
update cura set gustoca=15.77
where gustoca is null;

select * from mladic ;

delete from mladic 
where kuna>15.78;

select * from zena ;

select kratkamajica from zena 
where hlace  like '%ana%';

select f.dukserica , a.asocijalno , b.hlace 
from mladic a
inner join muskarac b on a.muskarac =b.sifra 
inner join zena c on c.sifra =b.zena 
inner join sestra d on d.sifra=c.sestra 
inner join sestra_svekar e on e.sestra=d.sifra 
inner join svekar f on f.sifra = e.svekar 
where c.hlace like 'a%' and d.haljina like '%ba%'
order by 3 desc ;

select a.haljina , a.maraka 
from sestra a
left join sestra_svekar b on a.sifra=b.sestra
where b.sifra is null ;
