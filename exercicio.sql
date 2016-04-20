---1
select nomeempregado from empregado order by dataadmissao asc;
---2
select nomeempregado, (salario*12) as SalarioAnual from empregado where cargo in ('Atendente') or (salario*12) < 18.500;
---3
select idcidade from cidade where nome in ('Uberlândia');
---4
select IDCidade, nome from cidade where UF in ('RS')
