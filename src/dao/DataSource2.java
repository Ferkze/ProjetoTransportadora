
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class DataSource2 {

    private String hostname;
    private int port;
    private String database;
    private String username;
    private String password;

    private Connection connection;

    public DataSource2() {
        try {
            hostname = "localhost";
            port = 1433;
            database = "db_ProjetoTranspotadora";
            username = "SA";
            password = "FATECSBC";

            String url = "jdbc:sqlserver://" + hostname + ":" + port + ";databaseName=" + database;

            DriverManager.registerDriver(new net.sourceforge.jtds.jdbc.Driver());
            connection = DriverManager.getConnection(url, username, password);

            System.out.println("Deu Certo!");
        } catch (SQLException ex) {
            System.err.println("Erro de conexão: " + ex.getSQLState());
            System.err.println("Erro de conexão: " + ex.toString());
        } catch (Exception ex) {
            System.err.println("Erro geral: " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return this.connection;
    }

    public void closeConnection() {
        try  {
            if (this.connection.isClosed()) {
                return;
            }
            this.connection.close();
        } catch (Exception ex) {
            System.err.println("Erro ao desconectar: " + ex.getMessage());
        }
    }
}