CREATE TABLE `cliente` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `cpf` varchar(20) NOT NULL,
  `ativo` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO cliente (id, nome, email, telefone, cpf, ativo) 
	values (1, 'Gilmar Pereira', 'gilmargomes@aluno.ifsp.edu.br','00000000000', '08793364636', 1);
INSERT INTO cliente (id, nome, email, telefone, cpf, ativo) 
	values (2, 'Gislaine Rosales', 'gislainerosales@ifsp.edu.br', '00000000000', '09793364637', 1);