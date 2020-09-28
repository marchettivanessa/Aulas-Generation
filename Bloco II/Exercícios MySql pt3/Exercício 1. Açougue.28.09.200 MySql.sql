
create database db_cidade_das_carnes;
-- CRIANDO TABELAS:
use db_cidade_das_carnes;
create table tb_categoria(
id bigint auto_increment,
categoria_carne varchar(60) not null,
qualidade varchar(10),
retirada varchar(40) not null,

primary key(id)
);

create table tb_produto(
id bigint auto_increment,
nome varchar(55) not null,
preço_kg decimal not null,
validade date not null,
disponibilidade boolean,
categoria_id bigint not null,

primary key(id),
foreign key(categoria_id) references tb_categoria(id)
);

-- PREENCHENCO AS TABELAS:
insert into tb_categoria (categoria_carne, qualidade, retirada) values("bovina","Tipo A","Delivery e retirada na loja");
insert into tb_categoria(categoria_carne, qualidade, retirada) values ("suína", "Tipo B", "Delivery");
insert into tb_categoria(categoria_carne, qualidade, retirada) values ("Frango", "Tipo A", "Retirada na loja");
insert into tb_categoria(categoria_carne, qualidade, retirada) values ("Linguiça", "Tipo A", "Retirada na loja");
insert into tb_categoria (categoria_carne, qualidade, retirada) values ("Cordeiro", "Tipo A", "Delivery");
insert into tb_categoria (categoria_carne,qualidade,retirada) values("Outros","N/A", "Delivery e retirada na loja");

insert into tb_produto(nome, preço_kg,validade,disponibilidade, categoria_id) values ("Costela", 59.90,"2020-10-22",true,2);
insert into tb_produto(nome, preço_kg,validade,disponibilidade,categoria_id) values ("Alcatra", 29.98,"2020-09-30", true, 1);
insert into tb_produto(nome, preço_kg, validade, disponibilidade, categoria_id) values ("Picanha", 48.29,"2020-11-02",true, 1);
insert into tb_produto(nome,preço_kg,validade,disponibilidade,categoria_id) values ("Asinha e coxa", 14.99,"2020-10-12", false, 3);
insert into tb_produto(nome, preço_kg,validade,disponibilidade,categoria_id) values("Queijo coalho", 54.90, "2020-10-20",true,6);
insert into tb_produto(nome,preço_kg,validade,disponibilidade, categoria_id) values ("Sobrecoxa", 12.90,"2020-10-15", true,3);
insert into tb_produto(nome, preço_kg,validade,disponibilidade,categoria_id) values ("Músculo", 22.90,"2020-09-29", true,1);
insert into tb_produto(nome,preço_kg,validade,disponibilidade,categoria_id) values("Pão de alho", 4.99,"2020-10-01",false,6);

select * from tb_produto where preço_kg> 50;

select*from tb_produto where preço_kg >3 and preço_kg<60;

select*from tb_produto where nome like "%co%";

-- usando o inner join:
select*from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

-- select que traga todos os Produtos de uma categoria específica:
select tb_produto.nome, tb_produto.preço_kg, tb_categoria.categoria_carne from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;