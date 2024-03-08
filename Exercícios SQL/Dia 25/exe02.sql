CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categorias (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    descricao VARCHAR(255)
);

CREATE TABLE tb_pizzas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    valor DECIMAL(10, 2),
    tamanho VARCHAR(20),
    categoria_id INT,
    FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id)
);

INSERT INTO tb_categorias (nome, descricao) VALUES
('Salgada', 'Pizzas com ingredientes salgados'),
('Doce', 'Pizzas com ingredientes doces'),
('Vegetariana', 'Pizzas sem carne'),
('Especial', 'Pizzas especiais da casa'),
('Calzone', 'Pizzas dobradas e recheadas');

INSERT INTO tb_pizzas (nome, valor, tamanho, categoria_id) VALUES
('Margherita', 40.00, 'Grande', 1),
('Quatro Queijos', 50.00, 'Grande', 1),
('Chocolate com Morango', 60.00, 'Grande', 2),
('Calabresa', 45.00, 'Grande', 1),
('Portuguesa', 55.00, 'Grande', 1),
('Mussarela', 35.00, 'Grande', 1),
('Frango com Catupiry', 48.00, 'Grande', 1),
('Banana com Canela', 45.00, 'Grande', 2);

SELECT * FROM tb_pizzas WHERE valor > 45.00;

SELECT * FROM tb_pizzas WHERE valor BETWEEN 50.00 AND 100.00;

SELECT * FROM tb_pizzas WHERE nome LIKE '%M%';

SELECT p.nome AS nome_pizza, p.valor, p.tamanho, c.nome AS categoria 
FROM tb_pizzas p 
INNER JOIN tb_categorias c ON p.categoria_id = c.id;

SELECT p.nome AS nome_pizza, p.valor, p.tamanho, c.nome AS categoria 
FROM tb_pizzas p 
INNER JOIN tb_categorias c ON p.categoria_id = c.id 
WHERE c.nome = 'Doce';
