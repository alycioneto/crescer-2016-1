--1
Select e.NomeEmpregado, d.NomeDepartamento from Empregado e inner join Departamento d on e.IDDepartamento = d.IDDepartamento;
--2
select a.nome, c.Nome from Associado a left join Cidade c on a.IDCidade = c.IDCidade
--3
select c.UF, COUNT(1) from Cidade c where UF not in (select c.UF from Associado a inner join Cidade c on a.IDCidade = c.IDCidade) group by UF;
--4
select a.Nome, c.nome ,
	Case when c.UF in ('RS', 'SC' , 'PR') then '***'
	else null
	End [Estado_Sul]
from Associado a inner join Cidade c on a.IDCidade = c.IDCidade;
--5
--http://stackoverflow.com/questions/14995000/sql-inner-join-more-than-two-tables

Select e.NomeEmpregado, d.NomeDepartamento, g.NomeEmpregado as NomeGerente
from Empregado e inner join Departamento d on e.IDDepartamento = d.IDDepartamento
inner join Empregado g on e.IDGerente = g.IDEmpregado

--6
SELECT * INTO CopiaEmpregado FROM empregado;
begin transaction go
update CopiaEmpregado set Salario = Salario * 1.145 where IDDepartamento in( select IDDepartamento from Departamento where Localizacao = 'Sao Paulo'); 
rollback

--7

select  SUM(Salario * 0.145) as Aumento_Salarial from Empregado where IDDepartamento in( select IDDepartamento from Departamento where Localizacao = 'Sao Paulo');
