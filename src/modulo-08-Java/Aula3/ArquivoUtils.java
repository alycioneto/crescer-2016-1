/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crescer.aula3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/**
 *
 * @author Alycio
 */
public class ArquivoUtils {
    public static BufferedReader getLeitor(String caminhoArquivo) throws FileNotFoundException{
            final Reader reader = new FileReader(caminhoArquivo);
            return new BufferedReader(reader);
    }
}
