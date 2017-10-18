package exemplobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {

    public Connection getLink() {
        return link;
    }
    
    protected void finalize() throws Throwable{
        super.finalize();
        link.close();
    }
    private Connection link;

    public DataSource(String banco) {
        String url = "jdbc:mysql://localhost:3306/" + banco;
        String user = "root";
        String pass = "";
        try {
            link = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            System.err.println("Falha na conexao");
            System.err.println(e);
            System.exit(1);
        }
        System.out.println("Conexao efetuado com sucesso");

    }
}
