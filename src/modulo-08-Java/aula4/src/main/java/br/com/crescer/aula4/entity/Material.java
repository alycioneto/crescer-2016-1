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
    import javax.persistence.SequenceGenerator;
    import javax.persistence.Table;

@Entity
@Table(name = "MATERIAL")
public class Material implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQMATERIAL")
    @SequenceGenerator(name = "SQMATERIAL", sequenceName = "SQMATERIAL")
    @Basic(optional = false)
    @Column(name = "IDMATERIAL")
    private Long idMaterial;
    
    @Basic(optional = false)
    @Column(name = "DESCRICAO")
    private String descricao;
    
    @Basic(optional = false)
    @Column(name = "PESOLIQUIDO")
    private long pesoLiquido;
    
    @Basic(optional = false)
    @Column(name = "PRECOCUSTO")
    private BigDecimal precoCusto;

    public Long getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Long idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public long getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(long pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public BigDecimal getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(BigDecimal precoCusto) {
        this.precoCusto = precoCusto;
    }
    
    
    
}
