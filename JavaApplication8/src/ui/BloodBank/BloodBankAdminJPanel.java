/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.BloodBank;

import Business.EcoSystem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.jdbcConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;
import ui.Sysadmin.HospitalManagementJPanel;
import Business.BloodBankResearcher.BloodBankResearcherDirectory;
import ui.BloodBank.CreateBloodResearcherJPanel;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import Business.BloodBankResearcher.BloodBankResearcher;
import javax.swing.JOptionPane;




/**
 *
 * @author ABHI
 */
public class BloodBankAdminJPanel extends javax.swing.JPanel {
    
    String DonorAdminID;
    JPanel container;
     EcoSystem business;
    /**
     * Creates new form BloodBankAdminJPanel
     */
    public BloodBankAdminJPanel(JPanel _container,EcoSystem _business ,String _DonorID) {
        initComponents();
       this.business = _business;
        this.DonorAdminID = _DonorID;
        this.container = _container;
       // JOptionPane.showMessageDialog(container, DonorAdminID);
        jdbcConnection jdbcconnect = new jdbcConnection();
        Connection conn =jdbcconnect.connect();
        initalizeBloodBank(DonorAdminID);
        BloodBankResearcherDirectory directory = new BloodBankResearcherDirectory();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         
        TableModel table = directory.getBloodBankResearcherDirectory(DonorAdminID);
        jTable1.setModel(table);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        IdjLabel = new javax.swing.JLabel();
        AgejLabel = new javax.swing.JLabel();
        addAgejTextField = new javax.swing.JTextField();
        AddressjLabel = new javax.swing.JLabel();
        AddressjTextField = new javax.swing.JTextField();
        phoneNumberjTextField = new javax.swing.JTextField();
        PhoneNumberjLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PhoneNumberjLabel1 = new javax.swing.JLabel();
        addUserNamejTextField = new javax.swing.JTextField();
        addPasswordjTextField = new javax.swing.JTextField();
        PhoneNumberjLabel2 = new javax.swing.JLabel();
        AddressjLabel1 = new javax.swing.JLabel();
        zipCodejTextField = new javax.swing.JTextField();
        AddressjLabel2 = new javax.swing.JLabel();
        CityjTextField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        NamejLabel1 = new javax.swing.JLabel();
        addNamejTextField = new javax.swing.JTextField();
        NamejLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("BLOOD BANK  ADMIN PAGE");

        jButton1.setText("Add Researcher");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Age", "Address", "ZipCode", "City", "Phone Number", "Blood Bank ID", "Work Assigned", "personId"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(8).setResizable(false);
            jTable1.getColumnModel().getColumn(9).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Update Researcher Information");

        IdjLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IdjLabel.setText("Id");

        AgejLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AgejLabel.setText("Age");

        AddressjLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddressjLabel.setText("Address");

        AddressjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressjTextFieldActionPerformed(evt);
            }
        });

        PhoneNumberjLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PhoneNumberjLabel.setText("Phone Number");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        PhoneNumberjLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PhoneNumberjLabel1.setText("User Name");

        addUserNamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserNamejTextFieldActionPerformed(evt);
            }
        });

        addPasswordjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPasswordjTextFieldActionPerformed(evt);
            }
        });

        PhoneNumberjLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PhoneNumberjLabel2.setText("Password");

        AddressjLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddressjLabel1.setText("ZipCode");

        zipCodejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipCodejTextFieldActionPerformed(evt);
            }
        });

        AddressjLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddressjLabel2.setText("City");

        CityjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityjTextFieldActionPerformed(evt);
            }
        });

        jButton2.setText("Update ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        NamejLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NamejLabel1.setText("Name");

        NamejLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NamejLabel2.setText("Researcher Id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(NamejLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(NamejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(60, 60, 60)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AddressjLabel)
                                            .addComponent(AddressjLabel2)
                                            .addComponent(AgejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(AddressjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26))))
                            .addComponent(PhoneNumberjLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PhoneNumberjLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PhoneNumberjLabel1))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addUserNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addAgejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zipCodejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPasswordjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jButton2)))
                .addContainerGap(325, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamejLabel2)
                    .addComponent(IdjLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamejLabel1)
                    .addComponent(addNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgejLabel)
                    .addComponent(addAgejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressjLabel)
                    .addComponent(AddressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressjLabel1)
                    .addComponent(zipCodejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressjLabel2)
                    .addComponent(CityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumberjLabel)
                    .addComponent(phoneNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PhoneNumberjLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(addUserNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumberjLabel2)
                    .addComponent(addPasswordjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(150, 150, 150)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jButton1)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedRowIndex= jTable1.getSelectedRow();
        
       if(selectedRowIndex<0){            
            return;
       }
       DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
       IdjLabel.setText(model.getValueAt(selectedRowIndex,0).toString());
        addNamejTextField.setText(model.getValueAt(selectedRowIndex,1).toString());
        addAgejTextField.setText(model.getValueAt(selectedRowIndex,2).toString());
        AddressjTextField.setText(model.getValueAt(selectedRowIndex,3).toString());
        zipCodejTextField.setText(model.getValueAt(selectedRowIndex,4).toString());
        CityjTextField.setText(model.getValueAt(selectedRowIndex,5).toString());
        phoneNumberjTextField.setText(model.getValueAt(selectedRowIndex,6).toString());
        BloodBankResearcherDirectory dir = new BloodBankResearcherDirectory();
        String[] arr = dir.getCredentials(model.getValueAt(selectedRowIndex,9).toString());
        addUserNamejTextField.setText(arr[0]);
        addPasswordjTextField.setText(arr[1]);
//       String insuranceNumber= (String) model.getValueAt(selectedRowIndex, 1);
       
//       Donor donor = system.getDonor(insuranceNumber);
//       
//       txtdonorName.setText(donor.getName());
//       txtdonorEmail.setText(donor.getEmail());
//       txtdonorAddress.setText(donor.getAddress());
//       txtdonorCity.setText(donor.getCity());
//       txtdonorBloodGrp.setText(donor.getBloodGroup());
//       txtdonorContact.setText(donor.getPhoneNumber());

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    CreateBloodResearcherJPanel BloodResearcherPanel = new CreateBloodResearcherJPanel(container, business, DonorAdminID);
        container.add("donorCreatePanel", BloodResearcherPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      BloodBankResearcher researcher = new BloodBankResearcher();
        BloodBankResearcherDirectory directory = new BloodBankResearcherDirectory();
//        addNamejTextField.setText(model.getValueAt(selectedRowIndex,1).toString());
//        addAgejTextField.setText(model.getValueAt(selectedRowIndex,2).toString());
//        AddressjTextField.setText(model.getValueAt(selectedRowIndex,3).toString());
//        zipCodejTextField.setText(model.getValueAt(selectedRowIndex,4).toString());
//        CityjTextField.setText(model.getValueAt(selectedRowIndex,5).toString());
//        phoneNumberjTextField.setText(model.getValueAt(selectedRowIndex,6).toString());
        int selectedRowIndex= jTable1.getSelectedRow();
        researcher.setName(addNamejTextField.getText());
        researcher.setAge(addAgejTextField.getText());
        researcher.setAddress(AddressjTextField.getText());
        researcher.setZipCode(zipCodejTextField.getText());
        researcher.setCity(CityjTextField.getText());
        researcher.setPhoneNumber(phoneNumberjTextField.getText());
        researcher.setId(IdjLabel.getText());
        researcher.setForeignKey(jTable1.getValueAt(selectedRowIndex,9).toString());
        JOptionPane.showMessageDialog(container, jTable1.getValueAt(selectedRowIndex,9).toString());
        //researcher.setForeignKey();
       directory.updateBloodResearcher(researcher, addUserNamejTextField.getText(),addPasswordjTextField.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void zipCodejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipCodejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipCodejTextFieldActionPerformed

    private void addPasswordjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPasswordjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addPasswordjTextFieldActionPerformed

    private void AddressjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressjTextFieldActionPerformed

    private void CityjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityjTextFieldActionPerformed

    private void addUserNamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserNamejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addUserNamejTextFieldActionPerformed
public void initalizeBloodBank(String insuranceNumber)
{ jdbcConnection jdbconnection = new jdbcConnection();
 Connection conn = jdbconnection.connect();
        try {
            ResultSet rs = null;
            
            String sql = "SELECT * FROM bloodBankTable where foreignKey=?";
            
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1,insuranceNumber);
            
            //System.out.print(jTextField3.getText());

            rs = statement.executeQuery();
            while(rs.next())
            { jLabel1.setText("Welcome to "+ rs.getString("Name")+ " Admin");
            
                    }
//            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
           
        } catch (SQLException ex) {
            Logger.getLogger(HospitalManagementJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
         jdbconnection.disConnnect(conn);
        }
        
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressjLabel;
    private javax.swing.JLabel AddressjLabel1;
    private javax.swing.JLabel AddressjLabel2;
    private javax.swing.JTextField AddressjTextField;
    private javax.swing.JLabel AgejLabel;
    private javax.swing.JTextField CityjTextField;
    private javax.swing.JLabel IdjLabel;
    private javax.swing.JLabel NamejLabel1;
    private javax.swing.JLabel NamejLabel2;
    private javax.swing.JLabel PhoneNumberjLabel;
    private javax.swing.JLabel PhoneNumberjLabel1;
    private javax.swing.JLabel PhoneNumberjLabel2;
    private javax.swing.JTextField addAgejTextField;
    private javax.swing.JTextField addNamejTextField;
    private javax.swing.JTextField addPasswordjTextField;
    private javax.swing.JTextField addUserNamejTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField phoneNumberjTextField;
    private javax.swing.JTextField zipCodejTextField;
    // End of variables declaration//GEN-END:variables
}