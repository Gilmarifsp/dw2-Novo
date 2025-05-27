CREATE TABLE `cliente` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `cpf` varchar(20) NOT NULL,
   `ativo` tinyint(1) NOT NULL,
  `logradouro` varchar(50),
  `numero` varchar(10),
  `complemento` varchar(10),
  `bairro` varchar(50),
  `cidade` varchar(50),
  `estado` varchar(20),
  `cep` varchar(20),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO cliente (id, nome, email, telefone, cpf, ativo, logradouro, numero, complemento, bairro, cidade, estado, cep) 
	values (1, 'Gilmar Pereira', 'gilmargomes@aluno.ifsp.edu.br','00000000000', '08793364636', 1, 'centro', '22', 'casa', 'Rio Preto', 'Santo Antonio do Pinhal', 'SP', '12450000' );
INSERT INTO cliente (id, nome, email, telefone, cpf, ativo,logradouro, numero, complemento, bairro, cidade, estado, cep) 
	values (2, 'Gislaine Rosales', 'gislainerosales@ifsp.edu.br', '00000000000', '09793364637', 1, 'centro', '33', 'casa','Rio Preto', 'Santo Antonio do Pinhal','SP', '12450000' );