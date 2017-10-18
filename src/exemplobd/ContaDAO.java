package exemplobd;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContaDAO {

    private DataSource bd;

    public ContaDAO() {
        bd = new DataSource("meubanco");
    }

    public void inserir(Conta obj) throws SQLException {
        String sql = "INSERT INTO conta (login, senha) VALUES (?,?)";

        PreparedStatement stm = bd.getLink().prepareStatement(sql);
        stm.setString(1, obj.getLogin());
        stm.setString(2, obj.getSenha());
        stm.executeUpdate();
    }

}
