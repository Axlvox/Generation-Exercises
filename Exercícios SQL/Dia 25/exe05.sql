CREATE DATABASE db_construindo_vidas;

USE db_construindo_vidas;

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
('Ferramentas', 'Diversos tipos de ferramentas para construção'),
('Hidráulica', 'Produtos para sistemas hidráulicos'),
('Elétrica', 'Produtos para sistemas elétricos'),
('Tintas', 'Tintas e acessórios para pintura'),
('Materiais de Construção', 'Outros materiais para construção');

INSERT INTO tb_produtos (nome, valor, descricao, categoria_id) VALUES
('Furadeira', 150.00, 'Furadeira elétrica de impacto', 1),
('Torneira', 70.00, 'Torneira de cozinha de parede', 2),
('Fio Elétrico', 100.00, 'Fio elétrico de 2.5mm', 3),
('Tinta Acrílica', 120.00, 'Tinta acrílica branca 3.6L', 4),
('Martelo', 25.00, 'Martelo de carpinteiro', 1),
('Chave de Fenda', 10.00, 'Chave de fenda de aço', 1),
('Canos PVC', 80.00, 'Jogo de canos PVC de 3m', 2),
('Disjuntor', 50.00, 'Disjuntor unipolar de 10A', 3);

SELECT * FROM tb_produtos WHERE valor > 100.00;
SELECT * FROM tb_produtos WHERE valor BETWEEN 70.00 AND 150.00;
SELECT * FROM tb_produtos WHERE nome LIKE '%C%';

SELECT p.nome AS nome_produto, p.valor, p.descricao, c.nome AS categoria 
FROM tb_produtos p 
INNER JOIN tb_categorias c ON p.categoria_id = c.id;

SELECT p.nome AS nome_produto, p.valor, p.descricao, c.nome AS categoria 
FROM tb_produtos p 
INNER JOIN tb_categorias c ON p.categoria_id = c.id 
WHERE c.nome = 'Hidráulica';
