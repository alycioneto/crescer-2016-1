 -- 1
select LEFT(nome, CHARINDEX(' ', nome)) from Associado;
--2
select nome, DATEDIFF(YEAR, datanascimento, GETDATE()) as Idade from Associado;
--3
select nomeEmpregado, DATEDIFF(MONTH, dataadmissao, CONVERT(date, '31/12/2000',103)) as mesestrabalhados
	from empregado
	where dataadmissao between CONVERT(date, '01/05/1980',103) and CONVERT(date ,'20/01/1982',103)
--4
select top 1 Cargo,	COUNT(1) as Total From Empregado group by Cargo	order by Total desc
--6
select nome, DATEADD(year, 50, datanascimento) as [Completa 50 anos], DATENAME(dw,DataNascimento) from Associado;
--7
select UF, COUNT(1) as Estado from Cidade group by UF order by Estado desc;
--8
-- sql not distinct
--http://stackoverflow.com/questions/13146304/how-to-select-every-row-where-column-value-is-not-distinct
select distinct nome, uf from cidade group by nome, uf having count(1) > 1;
--9
select top 1 (idassociado + 1) from associado group by idassociado order by idassociado desc;
--10 
begin transaction
go 
delete cidadeaux
insert into CidadeAux select min(IDCidade), nome, uf from Cidade group by Nome,UF
rollback
--11 -- 
begin transaction
go
update cidade set nome = '*' + nome where IDCidade not in (select max(IDCidade) from Cidade group by Nome,UF) ;
rollback
--12
select IDAssociado, nome, 
	Case when sexo = 'F' then 'Feminino'
		 when sexo = 'M' then 'Masculino'
		 else 'sei lá'
	End Genero
from associado;

--13
select NomeEmpregado, salario, 
		Case when salario < 1164 then '0%'
			when salario between  1164 and 2326 then '15%'
			else '27,5'
		end impostoRenda
from empregado;
--14
begin transaction
go
delete from cidade where IDCidade not in( select min(IDCidade) from cidade group by Nome,UF)
rollback
--15
--http://www.w3schools.com/sql/sql_unique.asp
alter table cidade add constraint UK_Nome_UF UNIQUE (Nome,UF)


