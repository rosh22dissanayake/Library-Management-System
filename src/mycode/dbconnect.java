/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycode;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PK
 */
public class dbconnect {
    
    public static Connection conn(){
    
     Connection ann = null;
     
     try{
     
         Class.forName("com.mysql.jdbc.Driver");
     ann = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
     }
      catch (Exception e){
         System.out.println(e);
      }
      return ann;
    }
    
}
