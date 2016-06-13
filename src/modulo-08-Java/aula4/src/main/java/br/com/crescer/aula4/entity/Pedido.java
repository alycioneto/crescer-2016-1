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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author Alycio
 */
@Entity
@Table(name = "PEDIDO")
public class Pedido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQPEDIDO")
    @SequenceGenerator(name = "SQPEDIDO", sequenceName = "SQPEDIDO")
    @Basic(optional = false)
    @Column(name = "IDPEDIDO")
    private long idPedido;
    
    @ManyToOne
    @Basic(optional = false)
    @JoinColumn(name = "IDCLIENTE")
    private Cliente cliente;
    
    @Temporal(TemporalType.DATE)
    @Basic(optional = false)
    @Column(name = "DATAPEDIDO")
    private Date dataPedido;
    
    @Temporal(TemporalType.DATE)
    @Basic(optional = false)
    @Column(name = "DATAENTREGA")
    private Date dataEntrega;
    
    @Basic(optional = false)
    @Column(name = "VALORPEDIDO")
    private BigDecimal valorPedido;
    
    @Basic(optional = false)
    @Column(name="SITUACAO")
    private char situacao;

    public long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(long idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public BigDecimal getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(BigDecimal valorPedido) {
        this.valorPedido = valorPedido;
    }

    public char getSituacao() {
        return situacao;
    }

    public void setSituacao(char situacao) {
        this.situacao = situacao;
    }
    
    
}
