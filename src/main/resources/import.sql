INSERT INTO tb_pessoa (nome, nascimento) values ('Tiago', '1986-01-28');
INSERT INTO tb_pessoa (nome) values 'Pedro';
INSERT INTO tb_pessoa (nome) values 'João';

INSERT INTO tb_endereco (descricao) values 'Rua A';
INSERT INTO tb_endereco (descricao) values 'Rua B';
INSERT INTO tb_endereco (descricao) values 'Rua C';

INSERT INTO tb_pessoa_endereco (pessoas_id, enderecos_id) values (1,1);
INSERT INTO tb_pessoa_endereco (pessoas_id, enderecos_id) values (1,2);
INSERT INTO tb_pessoa_endereco (pessoas_id, enderecos_id) values (1,3);

INSERT INTO tb_user (pessoa_id, login, passwd) values (1, 'tiago1' , 'senha1');
INSERT INTO tb_user (pessoa_id, login, passwd) values (1, 'tiago2' , 'senha2');
INSERT INTO tb_user (pessoa_id, login, passwd) values (1, 'tiago3' , 'senha3');