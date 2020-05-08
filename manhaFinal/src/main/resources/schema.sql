drop table if exists biblioteca;

create table biblioteca(
    id_biblioteca bigint auto_increment,
    genero varchar(100) not null,
    estoque double not null,
    numero_cartao int not null,
    primary key(id_biblioteca)
    );

