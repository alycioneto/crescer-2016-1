-- contador
 select COUNT (IDCidade) from Cidade;
 
 --retorna maior e menor
 select	MIN(Salario) menor_salario,
 		MAX(Salario) maior_salario
 		from Empregado;
 
 --busca na tabela e retorna os dados eliminando as duplicatas
 select distinct Cargo
 from Empregado
 
 --conta quantos na tabela tem o mesmo cargo nesse caso (pode-se usar mais de um atributo da tabela ao mesmo tempo)
 select Cargo,
 		COUNT(1) as Total
 		from Empregado
 		Group By Cargo;
 
 --sempre que existe a possibilidade de uma coluna ser null, usamos essa forma para evitar retorno de dados nulos
 select NomeEmpregado,
 		Salario,
 		ISNULL(Comissao, 0) as Comissao,
 		(Salario + ISNULL(Comissao, 0)) as Total_sal_Comissao
 		From Empregado;
 
 --puxar todos os detalhes de uma lista
 select * from INFORMATION_SCHEMA.COLUMNS
 where table_name = 'Empregado' and IS_NULLABLE = 'yes' -- retorna apenas os itens da tabela com preenchimento obrigatorio
 
 --troca de informações conforme indicado, trocando nesse exemplo onde tiver A por B
 select Nome,
 	REPLACE (Nome, 'A', 'B') Nome_Cidade
 	From Cidade;
 
 select * from Associado;
 --questao 1
 --retorna o primeiro nome antes de chegar ao char espaço
 select LEFT (Nome, CHARINDEX(' ', Nome))
 	from Associado;
 
 --questao 2
 --retorna a idade, fazendo a diferença da data de nascimento com a data atual
 select Nome, DATEDIFF(YEAR, DataNascimento, getDate()) as Idade
 	from Associado;
 
 select * from Empregado;
 
 --qustao 3
 select NomeEmpregado, DATEDIFF(MONTH, DataAdmissao, CONVERT(date, '31/12/2000', 103)) MesesTrabalhados
 		from Empregado
 		where DataAdmissao between CONVERT(date, '01/05/1980', 103) and CONVERT(date, '20/01/1982', 103)
 
 --questao 4
 select TOP 1 Cargo,
 	COUNT(1) as Total
 	from Empregado
 	Group By Cargo
 order by Total desc 