-- criando bd
create database db_construindo_a_nossa_vida;

-- criando tables:
use db_construindo_a_nossa_vida;

create table tb_categoria(
id bigint auto_increment,
departamento varchar(60),
bazar boolean,
primary key(id)
);

create table tb_produto(
id bigint auto_increment,
nome varchar(70) not null,
preço decimal(10,2) not null,
disponibilidade boolean,
material varchar(70) not null,
categoria_id bigint not null,
primary key(id),
foreign key(categoria_id) references tb_categoria(id)
);


-- populando tabela categoria com 5 dados:
insert into tb_categoria(departamento, bazar) values("Cama, mesa e banho", true);
insert into tb_categoria(departamento, bazar) values ("Banheiro", false);
insert into tb_categoria(departamento, bazar) values ("Iluminação", true);
insert into tb_categoria(departamento, bazar) values("Jardim", true);
insert into tb_categoria(departamento, bazar) values ("Decoração", false);

-- populando tabela produtos com 8 dados:
insert into tb_produto(nome, preço, disponibilidade, material,categoria_id)
values("Acessório para parede de banheiro",92.90,true, "Alumínio",2);
insert into tb_produto(nome, preço, disponibilidade,material,categoria_id)
values("Jogo de lençol - casal", 110.10,true,"Algodão 100 fios", 1);
insert into tb_produto(nome, preço, disponibilidade, material, categoria_id)
values("Conjunto de Vasos para Parede Externa", 142.90,false,"Cerâmica",4);
insert into tb_produto(nome, preço, disponibilidade, material, categoria_id)
values("Espelhos decorativos", 120.00,true,"Estrutura de ferro",5);
insert into tb_produto(nome, preço, disponibilidade, material, categoria_id) values("Abajur", 35.90,true,"Porcelana",3);
insert into tb_produto(nome, preço, disponibilidade, material, categoria_id) values("Kit Lâmpadas",210.00,false,"Led",3);
insert into tb_produto(nome,preço, disponibilidade, material,categoria_id) values("Almofada",25.90,true, "Cetim",5);
insert into tb_produto(nome, preço, disponibilidade, material, categoria_id) values("Jogo Americano",13.90,false,"PVC",1);


-- utilizando select:
select*from tb_produto where preço>50;

select*from tb_produto where preço >3 and preço<60;

select*from tb_produto where nome like "%ci%";

-- usando o inner join 
select*from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

-- usando o inner join para trazer todos os produtos de uma categoria específica:

select tb_produto.nome, tb_produto.preço, tb_categoria.departamento from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;