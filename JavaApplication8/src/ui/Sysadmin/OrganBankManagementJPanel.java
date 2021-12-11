/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Sysadmin;

import Business.EcoSystem;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.jdbcConnection;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ABHI
 */
public class OrganBankManagementJPanel extends javax.swing.JPanel {
    String DonorAdminID;
    JPanel container;
    EcoSystem business;
    /**
     * Creates new form OrganBankManagementJPanel
     */
    public OrganBankManagementJPanel(JPanel _container, EcoSystem _business, String _DonorID) {
        initComponents();
        this.business = _business;
        this.DonorAdminID = _DonorID;
        this.container = _container;
        jdbcConnection jdbconnection = new jdbcConnection();
        setOrganJtable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        addNamejTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        addCityjTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        addAddressjTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addzipCodejTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addphoneNumberjTextField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        updateNamejTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        updateCityjTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        updateAddressjTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        updateZipCodejTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        updatePhoneNumberjTextField = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        updatejLabel = new javax.swing.JLabel();

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Name");

        addNamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNamejTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("City");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Address");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Zip Code");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Phone Number");

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Add Organ Bank Directory");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "City", "Address", "Zip Code", "Phone Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Update Organ Bank Information");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Name");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Name");

        updateNamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateNamejTextFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("City");

        updateCityjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCityjTextFieldActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Address");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Zip Code");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Phone Number");

        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        updatejLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(627, 627, 627)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(addphoneNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addzipCodejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(35, 35, 35)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(addAddressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(addCityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(addNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(615, 615, 615)
                        .addComponent(jButton3)
                        .addGap(27, 27, 27)
                        .addComponent(jButton4)))
                .addGap(358, 360, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(updatejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(631, 631, 631))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(554, 554, 554)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(14, 14, 14)))
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(updatePhoneNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(updateZipCodejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(updateCityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(updateAddressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(updateNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(45, 45, 45)))
                    .addContainerGap(554, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(addNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(addCityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(addAddressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(addzipCodejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(addphoneNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(74, 74, 74)
                        .addComponent(updatejLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))))
                .addContainerGap(648, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(367, 367, 367)
                    .addComponent(jLabel13)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel15)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addComponent(jLabel14))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(updateNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(updateCityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addComponent(updateAddressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addComponent(updateZipCodejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(34, 34, 34)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(updatePhoneNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jButton5)
                    .addContainerGap(341, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SysAdminPanel sysadminpanel = new SysAdminPanel(container, business, DonorAdminID);
        container.add("sysadminpanel", sysadminpanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       addOrganBank();
       

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void addNamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNamejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addNamejTextFieldActionPerformed

    private void updateNamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateNamejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateNamejTextFieldActionPerformed

    private void updateCityjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCityjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateCityjTextFieldActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        updateOrganBank();
        setOrganJtable();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        int row_val = jTable3.getSelectedRow();
        //        jLabel15.setText(model.getValueAt(row_val, 0).toString());
        updatejLabel.setText(model.getValueAt(row_val, 0).toString());
        updateNamejTextField.setText(model.getValueAt(row_val, 1).toString());
        updateCityjTextField.setText(model.getValueAt(row_val, 2).toString());
        updateAddressjTextField.setText(model.getValueAt(row_val, 3).toString());
        updateZipCodejTextField.setText(model.getValueAt(row_val, 4).toString());
        updatePhoneNumberjTextField.setText(model.getValueAt(row_val, 5).toString());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    deleteOrganBank();
    setOrganJtable();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addAddressjTextField;
    private javax.swing.JTextField addCityjTextField;
    private javax.swing.JTextField addNamejTextField;
    private javax.swing.JTextField addphoneNumberjTextField;
    private javax.swing.JTextField addzipCodejTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField updateAddressjTextField;
    private javax.swing.JTextField updateCityjTextField;
    private javax.swing.JTextField updateNamejTextField;
    private javax.swing.JTextField updatePhoneNumberjTextField;
    private javax.swing.JTextField updateZipCodejTextField;
    private javax.swing.JLabel updatejLabel;
    // End of variables declaration//GEN-END:variables
public void addOrganBank()
{   jdbcConnection jdbconnection = new jdbcConnection();
    Connection conn = jdbconnection.connect();
    String message= null;
String sql = "INSERT INTO organBankTable(Name,city,address,zipCode,phoneNumber) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,addNamejTextField.getText());
            pstmt.setString(2,addCityjTextField.getText());
            pstmt.setString(3,addAddressjTextField.getText());
            pstmt.setInt(4,Integer.parseInt(addzipCodejTextField.getText()));
            pstmt.setString(5,addphoneNumberjTextField.getText());
          
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(container, "The Organ Bank has been successfully added");
            setOrganJtable();
            addNamejTextField.setText("");
            addCityjTextField.setText("");
            addAddressjTextField.setText("");
            addzipCodejTextField.setText("");
            addphoneNumberjTextField.setText("");
//            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
//             Object[] row = new Object[5];
//             row[0] = addNamejTextField.getText();
//             row[1] = addCityjTextField.getText();
//             row[2] = addAddressjTextField.getText();
//             row[3] = addzipCodejTextField.getText();
//             row[4] = addphoneNumberjTextField.getText();
//             model.addRow(row);
        } catch (SQLException ex) {
            Logger.getLogger(jdbcConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(container, "An error has occured while adding an Organ Bank");
        }
        jdbconnection.disConnnect(conn);

}
public void setOrganJtable()
{ jdbcConnection jdbconnection = new jdbcConnection();
 Connection conn = jdbconnection.connect();
        try {
            ResultSet rs = null;
            
            String sql = "SELECT * FROM organBankTable";
            PreparedStatement statement = conn.prepareStatement(sql);
            
            
            
            //System.out.print(jTextField3.getText());

            rs = statement.executeQuery();
            jTable3.setModel(DbUtils.resultSetToTableModel(rs));
           
        } catch (SQLException ex) {
            Logger.getLogger(HospitalManagementJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
         jdbconnection.disConnnect(conn);
        }
        
}
public void updateOrganBank()
{   jdbcConnection jdbconnection = new jdbcConnection();
    Connection conn = jdbconnection.connect(); 
    try {
    
    
    String viewStatement = "UPDATE organBankTable SET Name=?,city=?,address=?,zipCode=?,phoneNumber=? WHERE id=?";
    PreparedStatement pstmt;
    pstmt = conn.prepareStatement(viewStatement);
    pstmt.setString(1,updateNamejTextField.getText());
    pstmt.setString(2, updateCityjTextField.getText());
    pstmt.setString(3,updateAddressjTextField.getText());
    pstmt.setString(4, updateZipCodejTextField.getText());
    pstmt.setString(5,updatePhoneNumberjTextField.getText());
    pstmt.setString(6,updatejLabel.getText());
//    pstmt.setString(6,jLabel15.getText());
     pstmt.executeUpdate();
//    DefaultTableModel updatemodel = (DefaultTableModel) jTable1.getModel();
//  for(int i=0;i<updatemodel.getRowCount();i++)
//        
//  {    System.out.println(jTable1.getValueAt(i,0));
        setOrganJtable();
        
//      if(jLabel15.getText()==jTable1.getValueAt(i,0))
//      
//      {
//        jTable1.setValueAt(jTextField6.getText(),2, i);
//        jTable1.setValueAt(jTextField7.getText(),3,i);
//        jTable1.setValueAt(jTextField8.getText(),4, i);
//        jTable1.setValueAt(jTextField9.getText(),5, i);
//        jTable1.setValueAt(jTextField10.getText(),6, i);
//  }
  updateNamejTextField.setText("");
  updateCityjTextField.setText("");
  updateAddressjTextField.setText("");
  updateZipCodejTextField.setText("");
  updatePhoneNumberjTextField.setText("");
  updatejLabel.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(HospitalManagementJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    finally
    {
    jdbconnection.disConnnect(conn);
    }
}
public void deleteOrganBank()
{   jdbcConnection jdbconnection = new jdbcConnection();
    Connection conn = jdbconnection.connect();
    String message= null;
String sql = "DELETE FROM organBankTable where id =?";
        try {
            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            int row_val = jTable3.getSelectedRow();
            
            pstmt.setString(1,model.getValueAt(row_val, 0).toString());
           
          
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(container, "The Organ Bank has been deleted successfully");
            setOrganJtable();
        } catch (SQLException ex) {
            Logger.getLogger(jdbcConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(container, "An error has occured while adding an Organ Bank");
        }
        finally
        {
        jdbconnection.disConnnect(conn);
        }

}

}
