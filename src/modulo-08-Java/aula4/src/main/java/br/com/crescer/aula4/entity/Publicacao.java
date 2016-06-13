/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crescer.aula4.entity;

import java.io.Serializable;
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
 * @author alycio.neto
 */
@Entity
@Table(name = "PUBLICACAO")
public class Publicacao implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PUBLICACAO")
    @SequenceGenerator(name = "SEQ_PUBLICACAO", sequenceName = "SEQ_PUBLICACAO")
    @Basic(optional = false)
    @Column(name = "ID_PUBLICACAO")
    private Long idPublicacao;
    
    @Temporal(TemporalType.DATE)
    @Basic(optional = false)
    @Column(name = "DAT_PUBLICACAO")
    private Date datPublicacao;
    
    @Basic(optional = false)
    @Column(name = "CON_PUBLICACAO")
    private String conteudo;
    
    @ManyToOne
    @Basic(optional = false)
    @JoinColumn(name = "ID_USUARIO")
    private Usuario usuario;

    public Long getIdPublicacao() {
        return idPublicacao;
    }

    public void setIdPublicacao(Long idPublicacao) {
        this.idPublicacao = idPublicacao;
    }

    public Date getDatPublicacao() {
        return datPublicacao;
    }

    public void setDatPublicacao(Date datPublicacao) {
        this.datPublicacao = datPublicacao;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
