import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class CadastarCriancaDAO {
    private Connection connection;
    public CadastarCriancaDAO() {
        this.connection = new Conexao().GeraConexao();
    }
    public void adiciona (CadastrarCrianca c) {
        String sql = "INSERT INTO crianças(id_Crianças, Idade, Altura, Nome, Nacionalidade) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, c.getIdCrianca());
            stmt.setString(2, c.getNome());
            stmt.setInt(3, c.getIdade());
            stmt.setDouble(4, c.getAltura());
            stmt.setString(5, c.getNacionalidade());
            stmt.execute();
            stmt.close();
            System.out.println("Criança cadastrada com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}