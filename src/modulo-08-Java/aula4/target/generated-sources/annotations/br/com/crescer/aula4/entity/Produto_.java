package br.com.crescer.aula4.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-13T00:08:00")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, BigDecimal> precoVenda;
    public static volatile SingularAttribute<Produto, Character> situacao;
    public static volatile SingularAttribute<Produto, Long> idProduto;
    public static volatile SingularAttribute<Produto, BigDecimal> precoCusto;
    public static volatile SingularAttribute<Produto, String> nome;
    public static volatile SingularAttribute<Produto, DateTime> dataCadastro;

}