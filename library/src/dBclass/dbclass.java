/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dBclass;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author venug
 */
public class dbclass {

    private ResultSet rs;
    
    public ResultSet select_query(String query) 
    {   
        try
        {
        Statement stmt=DB.getCon().createStatement();  
        ResultSet rs=stmt.executeQuery(query); 
        DB.getCon().close();  
        }
        catch(SQLException e)
        {
             System.out.println(e);
        } 
       return rs;
        

    }
}
