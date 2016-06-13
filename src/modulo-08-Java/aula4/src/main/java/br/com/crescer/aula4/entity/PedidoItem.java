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
@Table(name = "PEDIDOITEM")
public class PedidoItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQPEDIDOITEM")
    @SequenceGenerator(name = "SQPEDIDOITEM", sequenceName = "SQPEDIDOITEM")
    @Basic(optional = false)
    @Column(name = "IDPEDIDOITEM")
    private long idPedidoItem;
    
    @ManyToOne
    @Basic(optional = false)
    @JoinColumn(name = "IDPEDIDO")
    private Pedido pedido;
    
    @ManyToOne
    @Basic(optional = false)
    @JoinColumn(name = "IDPRODUTO")
    private Produto produto;
    
    @Basic(optional = false)
    @Column(name ="QUANTIDADE")
    private BigDecimal quantidade;
    
    @Basic(optional = false)
    @Column(name = "PRECOUNITARIO")
    private BigDecimal precoUnitario;
    
    @Basic(optional = false)
    @Column(name = "SITUACAO")
    private char situacao;

    public long getIdPedidoItem() {
        return idPedidoItem;
    }

    public void setIdPedidoItem(long idPedidoItem) {
        this.idPedidoItem = idPedidoItem;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public char getSituacao() {
        return situacao;
    }

    public void setSituacao(char situacao) {
        this.situacao = situacao;
    }
        
}

