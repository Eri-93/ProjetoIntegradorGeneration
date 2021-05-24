-- Criando o banco de dados
create database db_rede_social;

-- Referenciando o banco de dados que será utilizado
use db_rede_social;

-- Criando a tabela de usuários

create table tb_usuarios(
id bigint auto_increment,
nome varchar(100) not null,
data_nascimento date,
login varchar(256) unique not null,
senha varchar(30) not null,
nome_start_up varchar(100),
resumo varchar(500),
link_linkedin varchar(2048),
link_twitter varchar(2048),
link_instagram varchar(2048),
link_facebook varchar(2048),
primary key(id)
);

-- Criando a tabela de temas
create table tb_temas(
id bigint auto_increment,
tema varchar(255) not null unique,
qtd_postagens bigint,
tendencia_semana boolean,
primary key (id)
);

-- Criando a tabela de postagens
create table tb_postagens(
id bigint auto_increment,
data_postagem datetime,
midia varchar(2048),
descricao varchar(1300),
curtidas bigint,
compartilhamentos bigint,
usuario_id bigint,
tema_id bigint,
primary key (id),
foreign key (usuario_id) references tb_usuarios(id),
foreign key (tema_id) references tb_temas(id)
);

-- Vamos inserir um dado em cada tabela para testarmos
insert into tb_usuarios(nome,data_nascimento,login,senha,nome_start_up,resumo)
	values ("Gustavo", 2000-10-19, "gustavo.generation@generation.com", "1234", "Rede Social", "abc");

update tb_usuarios set data_nascimento = '2000-10-19' where id = 1;

select * from tb_usuarios;


insert into tb_temas(tema,qtd_Postagens,tendencia_semana) values ("Empreendedorismo",1000,true);

select * from tb_temas;


-- Formato do datetime: 'YYYY-MM-DD hh:mm:ss'
insert into tb_postagens(data_postagem,midia,descricao,curtidas,compartilhamentos)
	values ('2021-05-24 12:11:45',"www.com","abc",15,5);

update tb_postagens set tema_id = 1 where id = 1;

select * from tb_postagens;
