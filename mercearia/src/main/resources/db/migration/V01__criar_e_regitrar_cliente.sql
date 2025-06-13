CREATE TABLE `Cliente` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(150) NOT NULL,
  `active` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO Cliente (id, name, email, password, active) 
	values (1, 'Fernando Duarte', 'fernandoduarte@ifsp.edu.br','$2a$10$Ot4XGuyPP7r82nN3WXA0bOL1Qk9gShKDlVuPoyp89HoFnHcwO4Tji', 1);
INSERT INTO Cliente (id, name, email, password,active) 
	values (2, 'Gislaine Rosales', 'gislainerosales@ifsp.edu.br','$2a$10$Ot4XGuyPP7r82nN3WXA0bOL1Qk9gShKDlVuPoyp89HoFnHcwO4Tji',1);