
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Anupama Dikkumbura
 */
public class DBconnect {

    public static Connection getconnection(){
        Connection con=null;
        try{
         Class.forName("com.mysql.jdbc.Driver");
         con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rad", "root", "");
        return con;   
        }catch(Exception e){
            return null;
        }
        
    }

}
