create database projeto_integrador;
use projeto_integrador;
CREATE TABLE `usuario` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`nome` varchar(100) NOT NULL,
	`email` varchar(30) NOT NULL,
	`senha` varchar(12) NOT NULL,
	`telefone` int(12) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `postagem` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`titulo` varchar(50) NOT NULL,
	`descricao` TEXT NOT NULL,
	`regiao` varchar(50) NOT NULL,
	`data` DATE NOT NULL,
	`imagens` varchar(255) NOT NULL,
	`material` varchar(100) NOT NULL,
	`tipo_presenca` BOOLEAN NOT NULL,
	`tema_id` bigint NOT NULL,
	`usuario_id` bigint NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `tema` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`conteudo` varchar(200) NOT NULL,
	`data` DATETIME NOT NULL,
	PRIMARY KEY (`id`)
);

ALTER TABLE `postagem` ADD CONSTRAINT `postagem_fk0` FOREIGN KEY (`tema_id`) REFERENCES `tema`(`id`);

ALTER TABLE `postagem` ADD CONSTRAINT `postagem_fk1` FOREIGN KEY (`usuario_id`) REFERENCES `usuario`(`id`);

