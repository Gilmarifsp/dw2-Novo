CREATE TABLE `forma_pagamento` (
  `codigo` bigint(20) PRIMARY KEY AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL

) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO forma_pagamento (codigo, nome) 
	values (1, 'cartao');
INSERT INTO forma_pagamento (codigo, nome, )
	values (2, 'pix');