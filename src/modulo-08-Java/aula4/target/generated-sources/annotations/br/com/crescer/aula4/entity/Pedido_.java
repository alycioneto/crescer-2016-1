package br.com.crescer.aula4.entity;

import br.com.crescer.aula4.entity.Cliente;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-13T00:08:00")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Cliente> cliente;
    public static volatile SingularAttribute<Pedido, Character> situacao;
    public static volatile SingularAttribute<Pedido, DateTime> dataEntrega;
    public static volatile SingularAttribute<Pedido, DateTime> dataPedido;
    public static volatile SingularAttribute<Pedido, Long> idPedido;
    public static volatile SingularAttribute<Pedido, BigDecimal> valorPedido;

}