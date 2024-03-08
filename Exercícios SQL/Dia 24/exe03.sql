CREATE DATABASE db_school;

use db_school;

CREATE TABLE estudantes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    idade INT,
    serie VARCHAR(20),
    nota DECIMAL(4,2)
);

INSERT INTO estudantes (nome, idade, serie, nota) VALUES
('João', 15, '9º ano', 8.5),
('Maria', 14, '8º ano', 7.2),
('Pedro', 16, '9º ano', 6.8),
('Ana', 13, '7º ano', 9.0),
('Lucas', 15, '9º ano', 6.5),
('Julia', 14, '8º ano', 7.8),
('Fernanda', 16, '9º ano', 8.0),
('Mateus', 13, '7º ano', 6.0);

SELECT * FROM estudantes WHERE nota > 7.0;

SELECT * FROM estudantes WHERE nota < 7.0;

UPDATE estudantes SET nota = 9.5 WHERE id = 4;
