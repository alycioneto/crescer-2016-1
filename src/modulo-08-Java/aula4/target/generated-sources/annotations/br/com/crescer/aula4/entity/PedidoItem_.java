package br.com.crescer.aula4.entity;

import br.com.crescer.aula4.entity.Pedido;
import br.com.crescer.aula4.entity.Produto;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-13T00:08:00")
@StaticMetamodel(PedidoItem.class)
public class PedidoItem_ { 

    public static volatile SingularAttribute<PedidoItem, BigDecimal> precoUnitario;
    public static volatile SingularAttribute<PedidoItem, Character> situacao;
    public static volatile SingularAttribute<PedidoItem, Produto> produto;
    public static volatile SingularAttribute<PedidoItem, Pedido> pedido;
    public static volatile SingularAttribute<PedidoItem, BigDecimal> quantidade;
    public static volatile SingularAttribute<PedidoItem, Long> idPedidoItem;

}