--1)
DECLARE
  vIDCliente CLIENTE.IDCLIENTE%type;
  vNomeCliente CLIENTE.NOME%type;
  vCidade CIDADE.NOME%type;
  vPrimeiroPedido PEDIDO.DATAPEDIDO%type;
  vUltimoPedido PEDIDO.DATAPEDIDO%type;
  vValorPedido PEDIDO.VALORPEDIDO%type;
  VQuantidadePedido PEDIDO.IDPEDIDO%type;
  vMediaPedido PEDIDO.VALORPEDIDO%type;
BEGIN
  select cli.Nome , cid.Nome, min(ped.DataPedido), max(ped.DataPedido),
  sum(ped.ValorPedido), count(ped.IDPEDIDO), avg(ped.VALORPEDIDO)
  into vNomeCliente, vCidade, vPrimeiroPedido, vUltimoPedido, vValorPedido, VQuantidadePedido, vMediaPedido
  from Cliente cli
  join Cidade cid on cid.IDCIDADE=cli.IDCIDADE
  join Pedido ped on ped.IDCLIENTE=cli.IDCLIENTE 
  where cli.IDCLiente= &vIDCliente group by cli.Nome, cid.Nome;
  
  DBMS_OUTPUT.PUT_LINE('Nome: ' || vNomeCliente || ' Cidade: ' || vCidade || ' Primeiro Pedido: ' || vPrimeiroPedido ||
                        ' Ultimo Pedido: ' || vUltimoPedido || ' Valor Total Pedidos: ' || vValorPedido || ' Quantidade de Pedidos: ' || VQuantidadePedido
                        || ' Media Pedido: ' || vMediaPedido
                      );

END;

