create database zallpy;

create schema cadastro;

create table cadastro.usuario
(
  id        bigserial not null
    constraint usuario_pkey
      primary key,
  password  varchar(255),
  user_name varchar(255)
);

alter table cadastro.usuario
  owner to postgres;

create table cadastro.proposta
(
  id           bigserial not null
    constraint proposta_pkey
      primary key,
  cpf          varchar(11),
  dependentes  integer,
  estado       varchar(255),
  estado_civil varchar(255),
  idade        integer,
  nome         varchar(255),
  renda        double precision,
  sexo         varchar(1)
);

alter table cadastro.proposta
  owner to postgres;

create table cadastro.analise
(
  id          bigserial not null
    constraint analise_pkey
      primary key,
  limite      varchar(255),
  resultado   varchar(255),
  proposta_id bigint
    constraint fkjcepcweyyycebtj0sd3v0b5kp
      references cadastro.proposta
);

alter table cadastro.analise
  owner to postgres;

