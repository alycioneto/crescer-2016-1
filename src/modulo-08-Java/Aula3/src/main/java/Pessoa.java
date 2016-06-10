/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alycio.neto
 */
public class Pessoa{
    private long id;
    private String nome;
    public long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Pessoa(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    

    
    
    
    
}
