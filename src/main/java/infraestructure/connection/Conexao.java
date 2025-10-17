package infraestructure.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String USER = "root";
    private static final String PSWORD = "";
    private static final String URL = "jdbc:mysql://localhost:3306/Manutencao2?useSSL=false&serverTimezone=UTC";

    public static Connection conectar() throws SQLException{
        return DriverManager.getConnection(USER, PSWORD, URL);
    }

    public static void main(String[] args) {
        try{
            Conexao.conectar();
            System.out.println("Conexao");
        } catch (SQLException e) {
            System.out.println("Falha na conexao" + e.getMessage());;
        }
    }
}
