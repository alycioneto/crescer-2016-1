/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crescer.crescer.web;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author alycio.neto
 */


@ManagedBean
@RequestScoped
public class Hello implements Serializable{

    private String helloWorld;
    
    //Quando instanciar
    @PostConstruct
    public void init(){
        helloWorld = "Hello World!";
        System.out.println("..................");
    }
    //Antes de destruir
    @PreDestroy
    public void out(){
        System.out.println("Saida");
    }

    public String getHelloWorld() {
        return helloWorld;
    }

    public void setHelloWorld(String helloWorld) {
        this.helloWorld = helloWorld;
    }
    
    public String processa(){
        return "hello";
    }
            
            

}