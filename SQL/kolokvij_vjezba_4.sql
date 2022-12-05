# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\marko\Documents\java_vjezba\SQL\kolokvij_vjezba_4.sql

drop database if exists vjezba4;
create database vjezba4;

use vjezba4;

create table prijatelj(
    sifra int not null primary key auto_increment,
    eura decimal(16,9),
    prsten int not null,
    gustoca decimal(16,5),
    jmbag char(11) not null,
    suknja varchar (47) not null,
    becar int not null
);

create table becar(
    sifra int not null primary key auto_increment,
    novcica decimal (14,5),
    kratkamajica varchar(48) not null,
    bojaociju varchar(36) not null,
    snasa int not null
);

create table snasa (
    sifra int not null primary key auto_increment,
    introvertno bit,
    treciputa datetime,
    haljina varchar(46) not null,
    zena int not null
);

create table zena(
    sifra int not null primary key auto_increment,
    suknja varchar(39) not null,
    lipa decimal(18,7),
    prsten int not null
);

create table zena_mladic(
    sifra int not null primary key auto_increment,
    zena int not null,
    mladic int not null
);
 create table mladic(
    sifra int not null primary key auto_increment,
    kuna decimal (15,9),
    lipa decimal (18,5),
    nausnica int,
    stilfrizura varchar(49),
    vesta varchar(34) not null
 );

 create table punac(
    sifra int not null primary key auto_increment,
    treciputa datetime,
    majica varchar(46),
    jmbag char(11) not null,
    novcica decimal(18,7) not null,
    maraka decimal (12,6) not null,
    ostavljen int not null
 );

 create table ostavljen(
    sifra int not null primary key auto_increment,
    modelnaocala varchar(43),
    introvertno bit,
    kuna decimal(14,10)
 );


 alter table punac add foreign key (ostavljen) references ostavljen(sifra);
 alter table prijatelj add foreign key(becar) references becar(sifra);
 alter table becar add foreign key(snasa) references snasa(sifra);
 alter table snasa add foreign key(zena) references zena(sifra);
 alter table zena_mladic add foreign key(zena) references zena(sifra);
 alter table zena_mladic add foreign key(mladic) references mladic (sifra);

 


select * from  becar ;

select * from zena;
insert into zena (suknja,prsten)
values('crvena',12),('crna',15),('plava',33);

select * from  snasa;
insert into snasa (haljina,zena)
values ('crna',1),('crvena',2),('rozna',3);

insert  into becar (kratkamajica,bojaociju,snasa)
values ('plava','crna',1),
('crna','smeđa',2),
('zelena','crna',3);



select * from mladic ;
insert into mladic(vesta)
values ('crna'),('plava'),('zelena');

insert into zena_mladic (zena,mladic)
values (1,1),(2,2),(3,3);

select * from punac ;

 update punac set majica='Osijek'
 where sifra is not null ;

delete from prijatelj 
where prsten > 17;

select haljina from snasa 
where treciputa is null ;

select f.nausnica , a.jmbag , b.kratkamajica 
from prijatelj a
inner join becar b on a.becar =b.sifra 
inner join snasa c on c.sifra =b.snasa 
inner join zena d on d.sifra =c.zena 
inner join zena_mladic e on d.sifra =e.zena 
inner join mladic f on f.sifra =e.mladic 
where c.treciputa is not null and d.lipa !=29
order by b.kratkamajica desc;

select a.lipa , a.prsten 
from zena a
left join zena_mladic b on a.sifra =b.zena
where b.sifra is null ;