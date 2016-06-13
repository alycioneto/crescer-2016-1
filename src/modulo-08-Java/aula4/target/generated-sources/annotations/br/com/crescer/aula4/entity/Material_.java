package br.com.crescer.aula4.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-13T00:08:00")
@StaticMetamodel(Material.class)
public class Material_ { 

    public static volatile SingularAttribute<Material, BigDecimal> precoCusto;
    public static volatile SingularAttribute<Material, Long> idMaterial;
    public static volatile SingularAttribute<Material, String> descricao;
    public static volatile SingularAttribute<Material, Long> pesoLiquido;

}