/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
/**
 *
 * @author alycio.neto
 */
public class ConnectionUtils {
       private static final String URL = "jdbc:oracle:thin:@LOCALHOST:1521:xe";
       private static final String USER = "CRESCER16";
       private static final String PASS = "CRESCER16";
    public static Connection getConnection() throws SQLException{
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (final SQLException e) {
            Logger.getAnonymousLogger().severe(e.getMessage());
            throw e;
        }
    }
}
