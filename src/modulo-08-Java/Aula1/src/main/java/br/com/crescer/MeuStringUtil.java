/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crescer;

/**
 *
 * @author Alycio
 */
public class MeuStringUtil {
    public boolean isNullOrWhiteSpace(String string){       
        return string == null || string.trim().equals("") ;
    }
    public int numeroDeVogais(String string){
        int quantidadeDeVogais = 0;
        for (int i = 0; i < string.length(); i++) {
            char letra = string.toLowerCase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i'||letra == 'o'|| letra == 'u') {
                quantidadeDeVogais++;
            }
        }
        return quantidadeDeVogais;
    }
    public String inverteString(String string){
        return new StringBuilder(string).reverse().toString();
    }
    public boolean ePalindromo(String string){
        return string.trim().equalsIgnoreCase(inverteString(string).trim());
    }
    
    public static void main(String[] args){
        
    }
}