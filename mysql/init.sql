-- Criação do banco de dados
CREATE DATABASE IF NOT EXISTS bdzap;

-- Uso do banco de dados
USE bdzap;

-- Criação da tabela 'zap'
CREATE TABLE IF NOT EXISTS zap (
    usuario_id INT AUTO_INCREMENT PRIMARY KEY,
    usuario_nome VARCHAR(150) NOT NULL,
    usuario_mensagem VARCHAR(100) NOT NULL,
);

-- Inserção dos dados na tabela 'obradearte'
INSERT IGNORE INTO zap (usuario_nome, usuario_mensagem)
VALUES
('Tales', 'kkkkkkkkkkkkkkkkk'),
('Gabriel', 'WOW',),
('Lucas', 'feauhaefuoahefouaefhuoaef'),
('Rafael', 'HAHAHAHAHAHA',),
('João', 'rsrsrsrsrs');