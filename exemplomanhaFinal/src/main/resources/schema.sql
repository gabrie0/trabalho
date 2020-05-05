drop table if exists mercado;

create table mercado(
    id_mercado bigint auto_increment,
    nome varchar(100) not null,
    salario double not null,
    primary key(id_mercado)
    );

