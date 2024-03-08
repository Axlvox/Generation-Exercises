CREATE DATABASE db_curso_da_minha_vida;

USE db_curso_da_minha_vida;

CREATE TABLE tb_categorias (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    descricao VARCHAR(255)
);

CREATE TABLE tb_cursos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    valor DECIMAL(10, 2),
    descricao VARCHAR(255),
    categoria_id INT,
    FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id)
);

INSERT INTO tb_categorias (nome, descricao) VALUES
('Programação', 'Cursos de programação e desenvolvimento de software'),
('Design', 'Cursos de design gráfico e web'),
('Negócios', 'Cursos de empreendedorismo e administração'),
('Marketing', 'Cursos de marketing digital'),
('Idiomas', 'Cursos de línguas estrangeiras');

INSERT INTO tb_cursos (nome, valor, descricao, categoria_id) VALUES
('Curso de Python', 700.00, 'Aprenda Python do básico ao avançado', 1),
('Curso de Web Design', 800.00, 'Aprenda design para web', 2),
('Curso de Empreendedorismo', 600.00, 'Desenvolva habilidades empreendedoras', 3),
('Curso de Marketing Digital', 900.00, 'Estratégias de marketing online', 4),
('Curso de Inglês', 1000.00, 'Aprenda inglês de forma eficaz', 5),
('Curso de Java', 750.00, 'Fundamentos e avançado em Java', 1),
('Curso de Illustrator', 600.00, 'Aprenda a usar o Adobe Illustrator', 2),
('Curso de Finanças Pessoais', 550.00, 'Gerencie suas finanças de forma eficiente', 3);

SELECT * FROM tb_cursos WHERE valor > 500.00;
SELECT * FROM tb_cursos WHERE valor BETWEEN 600.00 AND 1000.00;
SELECT * FROM tb_cursos WHERE nome LIKE '%J%';

SELECT c.nome AS nome_curso, c.valor, c.descricao, cat.nome AS categoria 
FROM tb_cursos c 
INNER JOIN tb_categorias cat ON c.categoria_id = cat.id;

SELECT c.nome AS nome_curso, c.valor, c.descricao, cat.nome AS categoria 
FROM tb_cursos c 
INNER JOIN tb_categorias cat ON c.categoria_id = cat.id 
WHERE cat.nome = 'Java';
