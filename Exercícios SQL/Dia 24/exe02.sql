CREATE DATABASE db_shop;

use db_shop;

CREATE TABLE tb_produtos (
	id BIGINT AUTO_INCREMENT,
    produto VARCHAR(70) NOT NULL,
    disponivel BOOLEAN,
    valor DECIMAL(10,2),
    categoria VARCHAR (50) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO tb_produtos (produto, disponivel, valor, categoria) VALUES
('Smartphone', true, 2000.00, 'Eletrônicos'),
('Camiseta', true, 20.00, 'Moda'),
('Arroz', false, 5.00, 'Alimentos'),
('Armário', true, 1000.00, 'Casa'),
('Batom', false, 20.00, 'Beleza'),
('Bola de Futebol', true, 80.00, 'Esportes'),
('Fone de Ouvido', true, 100.00, 'Eletrônicos'),
('Calça Jeans', false, 120.00, 'Moda');

SELECT * FROM tb_produtos WHERE valor > 500;

SELECT * FROM tb_produtos WHERE valor < 500;

UPDATE tb_produtos
SET valor =2100.00 
WHERE id =1;
