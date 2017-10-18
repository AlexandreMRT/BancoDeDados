/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplobd;

import java.sql.SQLException;

/**
 *
 * @author lab730
 */
public class TesteBD {

    public static void main(String[] args) throws SQLException {
        Conta conta = new Conta();

        conta.setLogin("joao");
        conta.setSenha("4354");
        new ContaDAO().inserir(conta);

    }
}
