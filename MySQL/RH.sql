use db_generation_game_online;

CREATE TABLE tb_personagem(
    id bigint(5) AUTO_INCREMENT,
    nome varchar(20) NOT NULL,
     ativo boolean,
    PRIMARY KEY (id)
);

INSERT INTO tb_personagem (nome, ativo) VALUES ("Principe Elfo", true);
INSERT INTO tb_personagem (nome, ativo) VALUES ("Alexa", true);
INSERT INTO tb_personagem (nome, ativo) VALUES ("Zara", true);
INSERT INTO tb_personagem (nome, ativo) VALUES ("Louis Vuitton", true);
INSERT INTO tb_personagem (nome, ativo) VALUES ("Jp", true);

create table tb_classes (
    id bigint(5) AUTO_INCREMENT,
    classes varchar(20) NOT NULL,
     ativo boolean,
    PRIMARY KEY (id)
);
  INSERT INTO tb_classes (nome, ativo) VALUES ("Elfo", true);
INSERT INTO tb_classes (nome, ativo) VALUES ("Espadachim", true);
INSERT INTO tb_classes (nome, ativo) VALUES ("Mago", true);
INSERT INTO tb_classes (nome, ativo) VALUES ("Monge", true);
INSERT INTO tb_classes (nome, ativo) VALUES ("Feiticeiro", true);
  