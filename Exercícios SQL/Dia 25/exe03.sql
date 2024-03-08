CREATE DATABASE db_farmacia_bem_estar;

USE db_farmacia_bem_estar;

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
('Medicamentos', 'Produtos para tratamento de saúde'),
('Cosméticos', 'Produtos para cuidados estéticos'),
('Higiene', 'Produtos de higiene pessoal'),
('Bem-Estar', 'Produtos para o bem-estar geral'),
('Vitaminas', 'Suplementos vitamínicos');

INSERT INTO tb_produtos (nome, valor, descricao, categoria_id) VALUES
('Paracetamol', 10.00, 'Analgésico e antipirético', 1),
('Creme Hidratante', 30.00, 'Hidratante corporal', 2),
('Sabonete Líquido', 8.00, 'Sabonete líquido neutro', 3),
('Shampoo Anticaspa', 15.00, 'Shampoo para combate à caspa', 3),
('Vitamina C', 20.00, 'Suplemento de vitamina C', 5),
('Protetor Solar FPS 30', 45.00, 'Protetor solar FPS 30', 4),
('Dorflex', 12.00, 'Analgésico e relaxante muscular', 1),
('Batom', 25.00, 'Batom hidratante', 2);

SELECT * FROM tb_produtos WHERE valor > 50.00;
SELECT * FROM tb_produtos WHERE valor BETWEEN 5.00 AND 60.00;
SELECT * FROM tb_produtos WHERE nome LIKE '%C%';
SELECT p.nome AS nome_produto, p.valor, p.descricao, c.nome AS categoria 
FROM tb_produtos p 
INNER JOIN tb_categorias c ON p.categoria_id = c.id;
SELECT p.nome AS nome_produto, p.valor, p.descricao, c.nome AS categoria 
FROM tb_produtos p 
INNER JOIN tb_categorias c ON p.categoria_id = c.id 
WHERE c.nome = 'Cosméticos';
