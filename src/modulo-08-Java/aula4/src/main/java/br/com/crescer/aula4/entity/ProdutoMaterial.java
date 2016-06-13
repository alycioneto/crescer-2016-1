/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crescer.aula4.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Alycio
 */

@Entity
@Table(name = "PRODUTOMATERIAL")
public class ProdutoMaterial implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQPRODUTOMATERIAL")
    @SequenceGenerator(name = "SQPRODUTOMATERIAL", sequenceName = "SQPRODUTOMATERIAL")
    @Basic(optional = false)
    @Column(name = "IDPRODUTOMATERIAL")
    private long idProdutoMaterial;
    
    @ManyToOne
    @Basic(optional = false)
    @JoinColumn(name = "IDPRODUTO")
    private Produto produto;
    
    @ManyToOne
    @Basic(optional = false)
    @JoinColumn(name = "IDMATERIAL")
    private Material material;
    
    @Basic(optional = false)
    @Column(name= "QUANTIDADE")
    private BigDecimal quantidade;

    public long getIdProdutoMaterial() {
        return idProdutoMaterial;
    }

    public void setIdProdutoMaterial(long idProdutoMaterial) {
        this.idProdutoMaterial = idProdutoMaterial;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }
    
}
