
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class DataSource {

    private String hostname;
    private int port;
    private String database;
    private String username;
    private String password;

    private Connection connection;

    public DataSource() {
        try {
            hostname = "DESKTOP-DLLEMD5";
            port = 1433;
            database = "db_ProjetoTranspotadora";
            username = "SA";
            password = "FATECSBC";

            String url = "jdbc:jtds:sqlserver://" + hostname + ":" + port + "/" + database;

            DriverManager.registerDriver(new net.sourceforge.jtds.jdbc.Driver());
            connection = DriverManager.getConnection(url, username, password);

            System.out.println("Deu Certo!");
        } catch (SQLException ex) {
            System.err.println("ERRO na Conexão" + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("ERRO GERAL" + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return this.connection;
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (Exception ex) {
            System.err.println("Erro ao desconectar" + ex.getMessage());
        }
    }
}