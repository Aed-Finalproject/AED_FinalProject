/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ABHI
 */
public class jdbcConnection {
    public Connection connect() {
        Connection conn=null;
        try {
            String dbURL = "jdbc:mysql://infodatabase.cog3jk7pua93.us-east-2.rds.amazonaws.com/organBlood";
            String username = "admin";
            String password = "Abinhavrahul";
            
            conn = DriverManager.getConnection(dbURL, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(jdbcConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
        return conn;
        }
        
    }
    public void disConnnect(Connection conn)
        {
            if(conn!=null)
            {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(jdbcConnection.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    
    public String getRole(String userName,String password)
    {   String role=null;
        try {
        ResultSet rs = null;
        Connection conn = connect();
        String sql = "select role from personTable where userName=? and password=?";
        PreparedStatement statement = conn.prepareStatement(sql);
        
        
        statement = conn.prepareStatement(sql);
        statement.setString(1,userName);
        statement.setString(2,password);
        //System.out.print(jTextField3.getText());
        
        rs = statement.executeQuery();
        while(rs.next())
        {
             role=(rs.getString("role"));
            
        }
        } catch (SQLException ex) {
            Logger.getLogger(jdbcConnection.class.getName()).log(Level.SEVERE, null, ex);
        }  
    return role;
}
}
