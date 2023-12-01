import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection GeraConexao() {
        Connection conexao = null;

        try {
            String url = "jdbc:mysql://localhost/projetomysql";
            String usuario = "root";
            String senha = "root";
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada com sucesso.");
        } catch (SQLException e) {
            // Instead of printing, you might want to log the exception for better debugging
            e.printStackTrace();
            throw new RuntimeException("Erro ao tentar conectar: " + e.getMessage(), e);
        }

        return conexao;
    }
}
