/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crescer.aula4.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Alycio
 */

@Entity
@Table(name="PRODUTO")
public class Produto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQPRODUTO")
    @SequenceGenerator(name = "SQPRODUTO", sequenceName = "SQPRODUTO")
    @Column(name = "IDPRODUTO")
    @Basic(optional= false)
    private long idProduto;
    
    @Basic(optional = true)
    @Column(name = "NOME")
    private String nome;
    
    @Temporal(TemporalType.DATE)
    @Basic(optional = false)
    @Column(name = "DATACADASTRO")
    private Date dataCadastro;
    
    @Basic(optional = false)
    @Column(name= "PRECOCUSTO")
    private BigDecimal precoCusto;
    
    @Basic(optional = true)
    @Column(name= "PRECOVENDA")
    private BigDecimal precoVenda;
    
    @Basic(optional = false)
    @Column(name = "SITUACAO")
    private char situacao;

    public long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public BigDecimal getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(BigDecimal precoCusto) {
        this.precoCusto = precoCusto;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    public char getSituacao() {
        return situacao;
    }

    public void setSituacao(char situacao) {
        this.situacao = situacao;
    }
    
}
