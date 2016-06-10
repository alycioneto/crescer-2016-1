/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.br.crescer;

import java.util.Scanner;

/**
 *
 * @author alycio.neto
 */
public class Run {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite um valor");
          try (final Scanner scanner = new Scanner(System.in)) {
             double valor = scanner.nextDouble();
             Run.parOuImpar(valor);
        } catch (Exception e) {
            System.out.println("Digite um número");
        }
    }
     public static void parOuImpar(double valor){
        System.out.println(valor % 2 == 0 ? "Par" : "Impar");
    }
    
}
