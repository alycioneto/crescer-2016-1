/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crescer.aula2;
import java.io.IOException;
import java.io.File;
/**
 *
 * @author alycio.neto
 */
public class Run {
    public static void main(String[] args) {
        final File file = new File("aula2.txt");
        try {
            file.createNewFile();            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
