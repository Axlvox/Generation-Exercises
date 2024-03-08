CREATE DATABASE db_cidade_das_carnes;

USE db_cidade_das_carnes;

CREATE TABLE tb_categorias (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    descricao VARCHAR(255)
);

CREATE TABLE tb_produtos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    valor DECIMAL(10, 2),
    descricao VARCHAR(255),
    categoria_id INT,
    FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id)
);

INSERT INTO tb_categorias (nome, descricao) VALUES
('Carnes', 'Produtos de origem animal'),
('Aves', 'Produtos de origem avícola'),
('Frutas', 'Frutas frescas e selecionadas'),
('Legumes', 'Legumes frescos e de qualidade'),
('Verduras', 'Verduras frescas e selecionadas');

INSERT INTO tb_produtos (nome, valor, descricao, categoria_id) VALUES
('File Mignon', 70.00, 'Corte nobre de carne bovina', 1),
('Peito de Frango', 25.00, 'Peito de frango desossado', 2),
('Maçã Fuji', 5.00, 'Maçã tipo Fuji', 3),
('Alface Crespa', 3.50, 'Alface crespa orgânica', 5),
('Picanha', 120.00, 'Corte nobre de carne bovina', 1),
('Coxa de Peru', 35.00, 'Coxa de peru desossada', 2),
('Banana Prata', 4.00, 'Banana tipo Prata', 3),
('Tomate', 2.50, 'Tomate vermelho e maduro', 4);

SELECT * FROM tb_produtos WHERE valor > 50.00;
SELECT * FROM tb_produtos WHERE valor BETWEEN 50.00 AND 150.00;
SELECT * FROM tb_produtos WHERE nome LIKE '%C%';

SELECT p.nome AS nome_produto, p.valor, p.descricao, c.nome AS categoria 
FROM tb_produtos p 
INNER JOIN tb_categorias c ON p.categoria_id = c.id;

SELECT p.nome AS nome_produto, p.valor, p.descricao, c.nome AS categoria 
FROM tb_produtos p 
INNER JOIN tb_categorias c ON p.categoria_id = c.id 
WHERE c.nome IN ('Aves', 'Frutas');
