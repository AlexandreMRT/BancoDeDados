/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplobd;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ExemploBD {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/meubanco";
        String user = "root";
        String pass = "";
        try {
            DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            System.err.println("Falha na conexao");
            System.err.println(e);
            System.exit(1);
         }
        System.out.println("Conexao efetuado com sucesso");

    }

}
