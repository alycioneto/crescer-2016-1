package br.com.crescer.aula4.entity;

import br.com.crescer.aula4.entity.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-13T00:08:00")
@StaticMetamodel(Publicacao.class)
public class Publicacao_ { 

    public static volatile SingularAttribute<Publicacao, String> conteudo;
    public static volatile SingularAttribute<Publicacao, Long> idPublicacao;
    public static volatile SingularAttribute<Publicacao, DateTime> datPublicacao;
    public static volatile SingularAttribute<Publicacao, Usuario> usuario;

}