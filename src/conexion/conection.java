/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class conection {
    
    
   
    public static Connection conexion;
    
    
    
    public conection() {
    
    try {
    
    Class.forName("com.mysql.jdbc.Driver");
      
   conexion = DriverManager.getConnection ("jdbc:mysql://localhost/mydb","root","lizarraga") ;
   
    
    }
    
    catch (SQLException e){
        System.out.println(e);
    } 
    
    catch(Exception e){
        System.out.println(e);
    }
    
    
}
    
    
 public Connection getConnection(){
        return conexion;
    }   
    
    
}

    
    
    

