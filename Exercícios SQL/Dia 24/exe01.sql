CREATE DATABASE db_rh;

use db_rh;

CREATE TABLE tb_funcionarios (
    id BIGINT AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    ativo BOOLEAN,
    cargo VARCHAR(50) NOT NULL,
    salario DECIMAL(10,2),
    PRIMARY KEY (id)
);

INSERT INTO tb_funcionarios (nome, ativo, cargo, salario) VALUES
('José Leandro', true, 'Desenvolvedor FullStack', 5000.00),
('Iris Medeiros', true, 'Gestora de Tráfego', 2100.00),
('Darisa Campos', false, 'Gerente de Projetos', 1900.00),
('Sarah Florencio', true, 'Aprendiz UX/UI', 1900.00),
('Marly Francisca', true, 'Analista de Dados', 4200.00);

SELECT * FROM tb_funcionarios WHERE salario > 2000;

SELECT * FROM tb_funcionarios WHERE salario < 2000;

UPDATE tb_funcionarios 
SET salario =7000.00 
WHERE id =1;
