/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.destakcar.dal;

import java.sql.*;


/**
 *
 * @author lucas.goncalves
 */
public class ModuloConexao {
    // Conexão com o banco de dados
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // Chamando o driver de conexão
        String driver = "com.mysql.cj.jdbc.Driver";
        // Armazenando informções referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfo";
        String user = "root";
        String password = "2004";
        // Estabelece a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            System.out.println(conexao);
            return conexao;
        } catch (ClassNotFoundException | SQLException e){
            System.out.println(conexao);
            return null;
        }
    }
}
