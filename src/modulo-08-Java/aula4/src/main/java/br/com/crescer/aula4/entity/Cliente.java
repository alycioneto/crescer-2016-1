/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crescer.aula4.entity;

import java.io.Serializable;
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
 * @author alycio.neto
 */
@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQCLIENTE")
    @SequenceGenerator(name = "SQCLIENTE", sequenceName = "SQCLIENTE")
    @Basic(optional = false)
    @Column(name = "IDCLIENTE")
    private Long idCliente;
    
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    
    @Basic(optional = false)
    @Column(name = "RAZAOSOCIAL")
    private String razaoSocial;
    
    @Basic(optional = true)
    @Column(name = "ENDERECO")
    private String endereco;
    
    @Basic(optional = true)
    @Column(name = "BAIRRO")
    private String bairro;
    
    @Basic(optional = false)
    @Column(name = "CEP")
    private long cep;
    
    @Basic(optional = false)
    @Column(name = "SITUACAO")
    private char situacao;
    
    @ManyToOne
    @Basic(optional = true)
    @JoinColumn(name = "IDCIDADE")
    private Cidade cidade;

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

    public char getSituacao() {
        return situacao;
    }

    public void setSituacao(char situacao) {
        this.situacao = situacao;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
}
