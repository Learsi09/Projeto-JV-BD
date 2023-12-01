import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class CadastarCriancaDAO {
    private Connection connection;

    public CadastarCriancaDAO() {
        this.connection = new Conexao().GeraConexao();
    }

    public void adiciona(Crianca c) {
        String sql = "INSERT INTO Crianca(idCriancas, Idade, Altura, Nome, Nacionalidade) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, c.getIdCrianca());
            stmt.setInt(2, c.getIdade());
            stmt.setDouble(3, c.getAltura()); // Adjusted data type
            stmt.setString(4, c.getNome());
            stmt.setString(5, c.getNacionalidade());
            stmt.execute();
            stmt.close();
            System.out.println("Criança cadastrada com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // Close the connection in a finally block
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}