use dbinfo;

create table tbos(
os int primary key auto_increment,
marca varchar(20) not null,
modelo varchar(20) not null,
ano varchar(15) not null,
placa varchar(10) not null,
servico varchar(2000) not null,
idcli int not null,
foreign key(idcli) references tbcliente(idcli)
);
ALTER TABLE tbos ADD CONSTRAINT FOREIGN KEY(idcli) REFERENCES tbcliente(idcli);
select * from tbcliente;
select * from tbos;
drop table tbos;
alter table tbclientes add foreign key(idcli) references tbcliente(idcli);

describe tbos;

drop table tbclientes;

update tbusers set perfil='admin' where iduser=1;
update tbusers set perfil='user' where iduser=2;


insert into tbcliente(cpfcli, dnscli, nomecli, enderecocli, numcli, phonecli, emailcli, cidadecli, cepcli)
values('13494266603', '10111994', 'Lucas Gonçalves', 'Rua Nilo Peçanha', '53', '11942021791', 'goncalves.10.lucas@gmail.com', 'são paulo', '03103040');

update tbcliente set  phonecli='(11) 94202-1791', cepcli='03103-040', dnscli='10/11/1994' where cpfcli='13494266603';
delete from tbcliente where cepcli='03103040';

update tbcliente set dnscli=?, nomecli=?, enderecocli=?, numcli=?, phonecli=?, emailcli=?, cidadecli=?, cepcli=? where cpfcli=?