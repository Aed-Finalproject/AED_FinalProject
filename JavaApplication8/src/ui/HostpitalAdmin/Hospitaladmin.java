/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HostpitalAdmin;

import Business.EcoSystem;
import java.awt.CardLayout;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JPanel;
import model.jdbcConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;
import ui.DonorAdmin.DonorCreateJPanel;

/**
 *
 * @author rahuludhayakumar
 */
public class Hospitaladmin extends javax.swing.JPanel {

    /**
     * Creates new form Hospitaladmin
     * 
     * 
     */
    
    EcoSystem system;
    String hospitalAdminID;
    JPanel container;
    public Hospitaladmin(JPanel _container, EcoSystem _business, String _hospitalAdminID) {
        initComponents();
               this.system = _business;
        this.hospitalAdminID = _hospitalAdminID;
        this.container = _container;
        loadDoctorTable();
        loadPatientTable();
    
    }

void initializeSystem(){
        system = EcoSystem.getInstance();
//        system.intializeRoles();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddDoc = new javax.swing.JButton();
        btnAddPatient = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        btnAddDoc.setText("Add Doctor");
        btnAddDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDocActionPerformed(evt);
            }
        });

        btnAddPatient.setText("Add Patient");
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
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
                "PrimaryKey", "DoctorName", "HospitaName", "InsurenceNumber", "phoneNumber"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Name", "Age", "Phone number", "Blood Group", "Insurance Number"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addGap(0, 177, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnAddDoc))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(btnAddPatient)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed
   PatientManagement patientmanagement = new PatientManagement(container, system, hospitalAdminID);
        container.add("patientmanagement", patientmanagement);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);     }//GEN-LAST:event_btnAddPatientActionPerformed


    private void txtDocUpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocUpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocUpassActionPerformed

    private void btnSubmitDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitDocActionPerformed

        String docName = txtDocName.getText();
        String docUname= txtDocUname.getText();
        String hospitalName= "hospital";
        String docUpass= txtDocUpass.getText();
        String docPhone= txtDocphone.getText();
        String doc = "doctor";
        
         String insNo = system.getConnection().createrole(docUname, docUpass, doc);
        System.out.print(insNo);
        jdbcConnection jdbconnection = new jdbcConnection();
        
        //jdbconnection.createDoctor(docUname, hospitalName, insNo, docPhone);  
    }//GEN-LAST:event_btnSubmitDocActionPerformed

    private void btnAddDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDocActionPerformed
               // DoctorManagement doctormanagement = new DoctorManagement(container, system, hospitalAdminID);
        //container.add("donorCreatePanel", doctormanagement);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container); 
    }//GEN-LAST:event_btnAddDocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDoc;
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    private void loadDoctorTable() {
        
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
    
    
     private void loadPatientTable() {
        
         jdbcConnection jdbconnection = new jdbcConnection();
         Connection conn =jdbconnection.connect();
         try {
ResultSet rs = null;

String sql = "select * from patientTable";
PreparedStatement statement = conn.prepareStatement(sql);
rs = statement.executeQuery();
jTable2.setModel(DbUtils.resultSetToTableModel(rs));
} catch (SQLException ex) {
System.out.print(ex);
}
         finally{
jdbconnection.disConnnect(conn);
         }
        
    }

    
}
