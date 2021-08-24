use ecommerce;

create table tb_produtosModa (
 id bigint(5) AUTO_INCREMENT, 
    nome varchar(20) NOT NULL,
    ativo boolean,
    PRIMARY KEY (id)
);
INSERT INTO tb_produtosModa (nome, ativo) VALUES ("Nike", true);
INSERT INTO  tb_produtosModa (nome, ativo) VALUES ("H&M", true);
INSERT INTO  tb_produtosModa (nome, ativo) VALUES ("Zara", true);
INSERT INTO  tb_produtosModa (nome, ativo) VALUES ("Louis Vuitton", true);
INSERT INTO  tb_produtosModa (nome, ativo) VALUES ("Adidas", true);
INSERT INTO  tb_produtosModa (nome, ativo) VALUES ("Piet", true);
INSERT INTO  tb_produtosModa (nome, ativo) VALUES ("Pace", true);
INSERT INTO  tb_produtosModa (nome, ativo) VALUES ("Carolina Herrera", true);
INSERT INTO  tb_produtosModa (nome, ativo) VALUES ("Gucci", true);