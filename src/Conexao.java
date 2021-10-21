
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas.goncalves
 */
public class Conexao {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.");
            Connection conexao = DriverManager.getConnection(string)
        }catch (ClassNotFoundException ex){
            System.out.printIn("Driver do Banco de dados não localizado.");
            
        }
        
    }
}
