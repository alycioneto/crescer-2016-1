 -- 1
select LEFT(nome, CHARINDEX(' ', nome)) from Associado;
--2
select nome, DATEDIFF(YEAR, datanascimento, GETDATE()) as Idade from Associado;
--3
select nomeEmpregado, DATEDIFF(MONTH, dataadmissao, CONVERT(date, '31/12/2000',103)) as mesestrabalhados
	from empregado
	where dataadmissao between CONVERT(date, '01/05/1980',103) and CONVERT(date ,'20/01/1982',103)
--4
select top 1 Cargo,
	COUNT(1) as Total
	From Empregado
	group by Cargo
	order by Total desc