package br.com.crescer.aula4.entity;

import br.com.crescer.aula4.entity.Cidade;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-13T00:08:00")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Character> situacao;
    public static volatile SingularAttribute<Cliente, Cidade> cidade;
    public static volatile SingularAttribute<Cliente, Long> idCliente;
    public static volatile SingularAttribute<Cliente, String> endereco;
    public static volatile SingularAttribute<Cliente, String> bairro;
    public static volatile SingularAttribute<Cliente, String> nome;
    public static volatile SingularAttribute<Cliente, String> razaoSocial;
    public static volatile SingularAttribute<Cliente, Long> cep;

}