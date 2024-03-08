CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    tipo VARCHAR(255)
);

CREATE TABLE tb_personagens (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    nivel INT,
    poder_ataque INT,
    poder_defesa INT,
    id_classe INT,
    FOREIGN KEY (id_classe) REFERENCES tb_classes(id)
);


INSERT INTO tb_classes (nome, tipo) VALUES
('Guerreiro', 'Melee'),
('Mago', 'Magia'),
('Arqueiro', 'Longa Distância'),
('Samurai', 'Corpo a Corpo'),
('Profeta', 'Magia Arcana');

INSERT INTO tb_personagens (nome, nivel, poder_ataque, poder_defesa, id_classe) VALUES
('Axlvox', 10, 2500, 1800, 4),
('Rani', 15, 1800, 2200, 2),
('Godrick', 12, 2100, 1500, 3),
('Renala', 8, 1900, 1700, 3),
('Radagon', 20, 3000, 2500, 5),
('Blaidd', 6, 1700, 1200, 1),
('Mohg', 18, 2800, 1900, 5),
('Malenia', 14, 2200, 1800, 2);

SELECT * FROM tb_personagens WHERE poder_ataque > 2000;

SELECT * FROM tb_personagens WHERE poder_defesa BETWEEN 1000 AND 2000;

SELECT * FROM tb_personagens WHERE nome LIKE '%C%';

SELECT p.*, c.nome AS classe_nome, c.tipo AS classe_tipo
FROM tb_personagens p
INNER JOIN tb_classes c ON p.id_classe = c.id;

SELECT p.*, c.nome AS classe_nome, c.tipo AS classe_tipo
FROM tb_personagens p
INNER JOIN tb_classes c ON p.id_classe = c.id
WHERE c.nome = 'Samurai';

