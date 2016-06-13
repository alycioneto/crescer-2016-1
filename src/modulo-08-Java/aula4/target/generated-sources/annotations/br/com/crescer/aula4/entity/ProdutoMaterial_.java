package br.com.crescer.aula4.entity;

import br.com.crescer.aula4.entity.Material;
import br.com.crescer.aula4.entity.Produto;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-13T00:08:00")
@StaticMetamodel(ProdutoMaterial.class)
public class ProdutoMaterial_ { 

    public static volatile SingularAttribute<ProdutoMaterial, Long> idProdutoMaterial;
    public static volatile SingularAttribute<ProdutoMaterial, Produto> produto;
    public static volatile SingularAttribute<ProdutoMaterial, Material> material;
    public static volatile SingularAttribute<ProdutoMaterial, BigDecimal> quantidade;

}