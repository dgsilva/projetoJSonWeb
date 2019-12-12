create database BDDOISNT;

use BDDOISNT;

create table aluno(
id int primary key auto_increment,
nome varchar(50)not null,
disciplina varchar(50) not null,
nota1 double not null,
nota2 double not null,
situacao varchar(20)
);

insert into aluno values(null,'bruno','java',2,4,'reprovado');
insert into aluno values(null,'dimenor','Banco de dados',9,8,'aprovado');
insert into aluno values(null,'lu','Python',2,4,'reprovado');

select * from aluno;



