/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crescer.aula2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author alycio.neto
 */
public class Chat {
    private String usuario;
    private String path;

    public Chat(String usuario, String path) {
        this.usuario = usuario;
        this.path = path;
    }
    
    public static BufferedReader getReader(String arquivo) throws FileNotFoundException, IOException{
        File file = new File(arquivo);
        file.createNewFile();
        return new BufferedReader(new FileReader(file));
    }
    public static BufferedWriter getWriter(String fila) throws IOException{
        return new BufferedWriter(new FileWriter(fila,true));
    }
    
    public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
             System.out.println("Digite o Caminho Do arquivo");
             String path = scanner.next();
             System.out.println("Digite o Nick Name");
             String usuario = scanner.next();
             Chat chat = new Chat(usuario,path);

        new Thread(new Runnable() {
            @Override
            public void run() {
            BufferedReader bufferReader = null;
            try {
            bufferReader = Chat.getReader(chat.path);
            while(true){
                String readLine = bufferReader.readLine();
                if(readLine != null && !readLine.isEmpty())
                    System.out.println(readLine);
                Thread.sleep(1000l);
            }
            
            }catch(Exception e){
                e.printStackTrace();
            }
            finally {
                try {
                    if(bufferReader != null) {
                        bufferReader.close();
                    }
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            }
        }, "Chat").start();
        while (true) {            
            System.out.println("Digite aqui: ");
            String nextLine = scanner.nextLine();
            if(":q!".equals(nextLine)){
                break;
            }
            BufferedWriter bufferedWriter = null;
            try {
                bufferedWriter = getWriter(chat.path);
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                String data = format.format(new Date());
                bufferedWriter.write(data+ " - " + chat.usuario + " :" +  nextLine);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            } catch (Exception e) {
            }finally{
                try {
                    if (bufferedWriter != null) {
                        bufferedWriter.close();
                    }
                } catch (Exception e) {
                }
            }
        }
        System.exit(0);
    }
}
