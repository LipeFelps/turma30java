use db_escola;

create table tb_alunos (
    id bigint(5) AUTO_INCREMENT, 
    nome varchar(20) NOT NULL,
    nota decimal(10,1),
    PRIMARY KEY (id) 
    );
    
INSERT INTO tb_alunos (nome,nota) VALUES ("Airon","10.0");
INSERT INTO tb_alunos (nome,nota) VALUES ("Adão","8.0");
INSERT INTO tb_alunos (nome,nota) VALUES ("Barbara","7.0");
INSERT INTO tb_alunos (nome,nota) VALUES ("Cleison","10.0");
INSERT INTO tb_alunos (nome,nota) VALUES ("Felipe","6.0");
INSERT INTO tb_alunos (nome,nota) VALUES ("Gustavo","8.0");
INSERT INTO tb_alunos (nome,nota) VALUES ("Heitor","2.0");
INSERT INTO tb_alunos (nome,nota) VALUES ("Rafael","5.0");






