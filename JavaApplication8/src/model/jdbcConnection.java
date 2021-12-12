/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import Business.DonorSystem.Donor;
import Business.DonorSystem.DonorDirectory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
        System.out.println(userName);
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
    public String createdonor(String insuranceNumber,String donorName,String bloodGroup,int age, int bloodDonation,String phoneNumber, int organDonation, String address, String city)
    {       Connection conn = connect();
            String message = null;
            String sql = "INSERT INTO donorTable(donorName,age,bloodGroup,phoneNumber,bloodDonation,organDonation,insuranceNumber,address,city) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,donorName);
            pstmt.setInt(2,age);
            pstmt.setString(3,bloodGroup);
            pstmt.setString(4,phoneNumber);
            pstmt.setInt(5, bloodDonation);            
            pstmt.setInt(6, organDonation);
            pstmt.setString(7, insuranceNumber);
            pstmt.setString(8, address);
            pstmt.setString(9, city);
            pstmt.executeUpdate();
            message = "New donor has been created successfully";
            
        } catch (SQLException ex) {
            Logger.getLogger(jdbcConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        disConnnect(conn);
        return message;
    }
    

    // Returns a list of all donors
    public DonorDirectory getDonorList(){
        DonorDirectory donorDir = new DonorDirectory();
        ArrayList<Donor> directory = new ArrayList();        
        
        try {
            ResultSet rs = null;
            Connection conn = connect();
            String sql = "select * from donorTable";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement = conn.prepareStatement(sql);
            rs = statement.executeQuery();
            while(rs.next())
            {   
                ArrayList<String> aList = new ArrayList();
                aList.add("kek");
                String name = rs.getString("donorName");
                String ID   = rs.getString("insuranceNumber");
                String contact= rs.getString("phoneNumber");
                Donor donor = new Donor(true, true, aList, "O+", name, "", ID,contact);                
                directory.add(donor);                
            }
            disConnnect(conn);
        } catch (SQLException ex) {
            Logger.getLogger(jdbcConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        donorDir.setDirectory(directory);
        return donorDir;
        // (boolean isBloodDonor, boolean isOrganDonor, ArrayList<String> donatedOrgans, String bloodGroup, String name, String password, String _ID)
    }
    
    public Donor getDonor(String donorID){
        Donor donor = null;
        try {
            ResultSet rs = null;
            Connection conn = connect();
            String sql = "select * from donorTable where insuranceNumber=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement = conn.prepareStatement(sql);
            statement.setString(1,donorID);
            rs = statement.executeQuery();
            while(rs.next())
            {   
                ArrayList<String> aList = new ArrayList();
                aList.add("kek");
                String name = rs.getString("donorName");
                String ID   = rs.getString("insuranceNumber");
                String contact= rs.getString("phoneNumber");
                donor = new Donor(true, true, aList, "O+", name, "", ID, contact);                                
            }
            disConnnect(conn);
        } catch (SQLException ex) {
            Logger.getLogger(jdbcConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return donor;
    }
    
    public void updateDonor(Donor donor){
        int bloodDonation = donor.isIsBloodDonor() ? 1 : 0;
        String sql = "update donorTable set bloodDonation=? where insuranceNumber=?";
        Connection conn = connect();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);            
            pstmt.setInt(1, bloodDonation);
            pstmt.setString(2, donor.getUniqueID());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(jdbcConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        disConnnect(conn);
        System.out.print("\n Donor updated! \n");
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
    

