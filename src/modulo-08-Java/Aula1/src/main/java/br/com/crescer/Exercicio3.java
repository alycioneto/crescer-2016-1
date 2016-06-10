/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crescer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author alycio.neto
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        String simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime());
        System.out.println(simpleDateFormat);
        
        
        try (final Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o dia");
            int dia = scanner.nextInt();
            System.out.println("Digite o mes");
            int mes = scanner.nextInt();
            System.out.println("Digite o ano");
            int ano = scanner.nextInt();
             
        } catch (Exception e) {
            System.out.println("Digite um número");
        }
    }
}
