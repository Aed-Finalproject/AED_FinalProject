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
import java.util.UUID;
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
    
    public String[] getRole(String userName,String password)
    {   String role=null;
        String[] arr = new String[2];
        try {
        ResultSet rs = null;
        Connection conn = connect();
        String sql = "select role,insuranceNumber from personTable where userName=? and password=?";
        PreparedStatement statement = conn.prepareStatement(sql);
        
        
        statement = conn.prepareStatement(sql);
        statement.setString(1,userName);
        statement.setString(2,password);
        //System.out.print(jTextField3.getText());
        
        rs = statement.executeQuery();
        while(rs.next())
        {   arr[0] = rs.getString("insuranceNumber");
             arr[1] = rs.getString("role");
            
        }
        disConnnect(conn);
        } catch (SQLException ex) {
            Logger.getLogger(jdbcConnection.class.getName()).log(Level.SEVERE, null, ex);
        }  
    return arr;
}
    public String createrole(String userName, String password, String role)
    {   Connection conn = connect();
        String insuranceNumber =null;
        UUID uuid = UUID.randomUUID();
        insuranceNumber = uuid.toString(); 
        String sql = "INSERT INTO personTable(userName,password,role,insuranceNumber) VALUES(?,?,?,?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,userName);
            pstmt.setString(2,password);
            pstmt.setString(3,role);
            pstmt.setString(4,insuranceNumber);
          
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(jdbcConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        disConnnect(conn);
        return insuranceNumber;
                
    }
    public String createdonor(String insuranceNumber,String donorName,String bloodGroup,int age,String bloodDonation,int phoneNumber, String organDonation)
    {       Connection conn = connect();
            String message = null;
            String sql = "INSERT INTO donorTable(donorName,age,bloodGroup,phoneNumber,bloodDonation,organDonation,insuranceNumber) VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,donorName);
            pstmt.setInt(2,age);
            pstmt.setString(3,bloodGroup);
            pstmt.setInt(4,phoneNumber);
            pstmt.setString(5, bloodDonation);
            pstmt.setString(6, organDonation);
            pstmt.setString(7, insuranceNumber);
            pstmt.executeUpdate();
            message = "New donor has been created successfully";
            
        } catch (SQLException ex) {
            Logger.getLogger(jdbcConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        disConnnect(conn);
        return message;
    }
        public String createDoctor(String doctorName,String hospitalName,String insurenceNumber,String phoneNumber)
    {       Connection conn = connect();
            String message = null;
            String sql = "insert into doctorTable (doctorName,hospitalName,insuranceNumber,phoneNumber) values(?,?,?,?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,doctorName);
            pstmt.setString(2,hospitalName);
            pstmt.setString(3, insurenceNumber);
            pstmt.setString(4, phoneNumber);
    
            pstmt.executeUpdate();
            message = "New doctor has been created successfully";
            
        } catch (SQLException ex) {
            Logger.getLogger(jdbcConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        disConnnect(conn);
        return message;
    }
}
