/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crescer.aula4.entity;

/**
 *
 * @author alycio.neto
 */
import java.io.Serializable;
    import javax.persistence.Basic;
    import javax.persistence.Column;
    import javax.persistence.Entity;
    import javax.persistence.GeneratedValue;
    import javax.persistence.GenerationType;
    import javax.persistence.Id;
    import javax.persistence.SequenceGenerator;
    import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USUARIO")
    @SequenceGenerator(name = "SEQ_USUARIO", sequenceName = "SEQ_USUARIO")
    @Basic(optional = false)
    @Column(name = "ID_USUARIO")
    private Long idUsuario;

    @Basic(optional = false)
    @Column(name = "NM_USUARIO")
    private String nmUsuario;

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNmUsuario() {
        return nmUsuario;
    }

    public void setNmUsuario(String nmUsuario) {
        this.nmUsuario = nmUsuario;
    }
        

}
