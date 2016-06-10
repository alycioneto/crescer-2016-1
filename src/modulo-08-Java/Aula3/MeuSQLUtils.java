/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crescer.aula3;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

/**
 *
 * @author Alycio
 */
public class MeuSQLUtils {
    private static final Logger LOGGER = Logger.getLogger(MeuSQLUtils.class.getName());
    
    public static void executaSql(String caminhoArquivo) throws IOException{
        if(caminhoArquivo.endsWith(".sql")){
            File file = new File(caminhoArquivo);
            file.createNewFile();
            String sql = getSql(caminhoArquivo);
            try (final Connection conexao = ConnectionUtils.getConnection()) {
                try (final Statement statement = conexao.createStatement()) {
                    statement.executeUpdate(sql);
                } catch (final SQLException ex) {
                    LOGGER.severe(ex.getMessage());
                }
            } catch (final SQLException ex) {
                LOGGER.severe(ex.getMessage());
            }
        }
    }
    getSql(String caminhoArquivo) throws IOException{
        BufferedReader bufferedReader = ArquivoUtils.getLeitor(caminhoArquivo);
        String sql = "";
        while(true){
                String readLine = bufferedReader.readLine();
                if(readLine != null && !readLine.isEmpty())
                    sql += readLine;
                else
                    break;
        }
        return sql;
    }
}
