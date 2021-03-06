/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.HostpitalAdmin;

import Business.EcoSystem;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JPanel;
import model.jdbcConnection;
import model.jdbcConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author kashr
 */
public class DoctorManagement extends javax.swing.JPanel {

    /**
     * Creates new form HospitalAdminJPanel
     */
         EcoSystem system;
    String hospitalAdminID;
    JPanel container;
    public DoctorManagement(JPanel _container, EcoSystem _business, String _hospitalAdminID) {
        initComponents();
                        this.system = _business;
        this.hospitalAdminID = _hospitalAdminID;
        this.container = _container;
        populatehospitalcombo();
        loadDoctor();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDocName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDocUname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDocUpass = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDocPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        updname = new javax.swing.JTextField();
        updphone = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        jButton3.setText("View");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hosptial.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Doctor Management");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DOCTOR NAME");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USER NAME");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PASSWORD");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PHONENUMBER");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("HOSPITAL NAME");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Name", "Hospital", "InsuranceNo", "PhoneNo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        updphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updphoneActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("DOCTOR NAME");

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PHONENUMBER");

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("HOSPITAL NAME");

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jButton6.setText("view");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(146, 146, 146))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(27, 27, 27)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(33, 33, 33)
                                .addComponent(txtDocPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(56, 56, 56)
                                .addComponent(txtDocUpass, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(55, 55, 55)
                                .addComponent(txtDocUname, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(38, 38, 38)
                                .addComponent(txtDocName, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(81, 81, 81)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(126, 126, 126)
                                        .addComponent(jButton4))
                                    .addComponent(jButton5)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(updphone, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(27, 27, 27)
                                    .addComponent(updname, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtDocName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(txtDocUname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(txtDocUpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtDocPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton4)
                                    .addComponent(jButton5)
                                    .addComponent(jButton6))
                                .addGap(5, 5, 5)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(updname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(updphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(12, 12, 12)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jButton2)
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String docName = txtDocName.getText();
        String docUname= txtDocUname.getText();
        String hospitalName= jComboBox1.getSelectedItem().toString();
        String docUpass= txtDocUpass.getText();
        String docPhone= txtDocPhone.getText();
        String doc = "doctor";
        
          if( docName.isEmpty() || docUname.isEmpty() || hospitalName.isEmpty() ||
            docUpass.isEmpty() || docPhone.isEmpty() || doc.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kindly Enter all the required fields!");
        }   else if (!system.validateMobileNo(docPhone)) {
            JOptionPane.showMessageDialog(null, "Kindly enter a Valid Contact Number.");
        }      else{
         String insNo = system.getConnection().createrole(docUname, docUpass, doc);
        System.out.print(insNo);
        jdbcConnection jdbconnection = new jdbcConnection();
        
        jdbconnection.createDoctor(docUname, hospitalName, insNo, docPhone);
        loadDoctor();
        JOptionPane.showMessageDialog(container, "New Doctor is added Sucessfully!!!");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 Hospitaladmin hospitaladmin = new Hospitaladmin(container, system, hospitalAdminID);
        container.add("donorCreatePanel", hospitaladmin);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int row_val = jTable1.getSelectedRow();
//        jLabel15.setText(model.getValueAt(row_val, 0).toString());
        updname.setText(model.getValueAt(row_val, 1).toString());
        updphone.setText(model.getValueAt(row_val, 4).toString());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void updphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updphoneActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                  jdbcConnection jdbconnection = new jdbcConnection();
    Connection conn = jdbconnection.connect(); 
    try {
    
     DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
     int row_val = jTable1.getSelectedRow();
     
    String viewStatement = "UPDATE doctorTable SET doctorName=?, hospitalName=?, phoneNumber=? WHERE id=?";
    PreparedStatement pstmt;
    pstmt = conn.prepareStatement(viewStatement);
    pstmt.setString(1,updname.getText());
    pstmt.setString(2, jComboBox2.getSelectedItem().toString());
    pstmt.setString(3, updphone.getText());
    pstmt.setString(4,model.getValueAt(row_val, 0).toString());
    pstmt.executeUpdate();


    updname.setText("");
    updphone.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(DoctorManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    finally
    {
    jdbconnection.disConnnect(conn);
    }
     JOptionPane.showMessageDialog(container, "Selected Doctor Data is sucessfully Updated");
     loadDoctor();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  jdbcConnection jdbconnection = new jdbcConnection();
    Connection conn = jdbconnection.connect();
    String message= null;
String sql = "Delete  from doctorTable where id=?;";
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            int row_val = jTable1.getSelectedRow();  
                                  if(row_val<0){
                JOptionPane.showMessageDialog(this, "Please select a row");
                return;
            }
            pstmt.setString(1,model.getValueAt(row_val, 0).toString());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(container, "The Doctor has been deleted successfully,Please remeber deleting here will also delete you request");
           loadDoctor();
        } catch (SQLException ex) {
            Logger.getLogger(jdbcConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(container, "An error has occured while deleting!");
        }
        finally
        {
        jdbconnection.disConnnect(conn);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int row_val = jTable1.getSelectedRow();
                              if(row_val<0){
                JOptionPane.showMessageDialog(this, "Please select a row");
                return;
            }
//        jLabel15.setText(model.getValueAt(row_val, 0).toString());
        updname.setText(model.getValueAt(row_val, 1).toString());
        updphone.setText(model.getValueAt(row_val, 4).toString());   
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDocName;
    private javax.swing.JTextField txtDocPhone;
    private javax.swing.JTextField txtDocUname;
    private javax.swing.JTextField txtDocUpass;
    private javax.swing.JTextField updname;
    private javax.swing.JTextField updphone;
    // End of variables declaration//GEN-END:variables

    public void populatehospitalcombo() {
        
        jdbcConnection jdbconnection = new jdbcConnection();
         Connection conn =jdbconnection.connect();
         try{
            String sql = "Select distinct hospitalName from hospitalTable";

            PreparedStatement statement = conn.prepareStatement(sql);
        
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                     String hospital = resultSet.getString(1);
                     jComboBox1.addItem(hospital);
                     jComboBox2.addItem(hospital);
                     
                     
                 }
            } catch (SQLException ex) {
System.out.print(ex);
}
         finally{
jdbconnection.disConnnect(conn);
         }
    }
        private void loadDoctor() {
       
                 jdbcConnection jdbconnection = new jdbcConnection();
         Connection conn =jdbconnection.connect();
         try {
ResultSet rs = null;

String sql = "select * from doctorTable";
PreparedStatement statement = conn.prepareStatement(sql);
rs = statement.executeQuery();
jTable1.setModel(DbUtils.resultSetToTableModel(rs));
} catch (SQLException ex) {
System.out.print(ex);
}
         finally{
jdbconnection.disConnnect(conn);
         }
        
    }
}
