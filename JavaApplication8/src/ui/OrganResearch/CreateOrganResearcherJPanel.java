/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.OrganResearch;

import Business.EcoSystem;
import javax.swing.JPanel;
import model.jdbcConnection;
import Business.OrganBankResearcher.OrganBankResearcherDirectory;
import java.awt.CardLayout;
import ui.BloodBank.BloodBankAdminJPanel;
import ui.OrganResearch.OrganBankAdminJPanel;
import Business.OrganBankResearcher.OrganBankResearcher;
import javax.swing.JOptionPane;

/**
 *
 * @author ABHI
 */
public class CreateOrganResearcherJPanel extends javax.swing.JPanel {
    EcoSystem system;
    String DonorAdminID;
    JPanel container;
    jdbcConnection jdbconnection = new jdbcConnection();
    /**
     * Creates new form CreateBloodResearcherJPanel
     */
    public CreateOrganResearcherJPanel(JPanel _container, EcoSystem _business, String _DonorID) {
        initComponents();
        this.system = _business;
        this.DonorAdminID = _DonorID;
        this.container = _container;
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
        NamejLabel = new javax.swing.JLabel();
        addNamejTextField = new javax.swing.JTextField();
        AgejLabel = new javax.swing.JLabel();
        addAgejTextField = new javax.swing.JTextField();
        AddressjLabel = new javax.swing.JLabel();
        AddressjTextField = new javax.swing.JTextField();
        phoneNumberjTextField = new javax.swing.JTextField();
        PhoneNumberjLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        PhoneNumberjLabel1 = new javax.swing.JLabel();
        addUserNamejTextField = new javax.swing.JTextField();
        addPasswordjTextField = new javax.swing.JTextField();
        PhoneNumberjLabel2 = new javax.swing.JLabel();
        AddressjLabel1 = new javax.swing.JLabel();
        zipCodejTextField = new javax.swing.JTextField();
        AddressjLabel2 = new javax.swing.JLabel();
        CityjTextField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ADD ORGAN RESEARCHER");

        NamejLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NamejLabel.setText("Name");

        AgejLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AgejLabel.setText("Age");

        AddressjLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddressjLabel.setText("Address");

        PhoneNumberjLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PhoneNumberjLabel.setText("Phone Number");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jButton1.setText("Add Researcher");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        PhoneNumberjLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PhoneNumberjLabel1.setText("User Name");

        PhoneNumberjLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PhoneNumberjLabel2.setText("Password");

        AddressjLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddressjLabel1.setText("ZipCode");

        AddressjLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddressjLabel2.setText("City");

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(AddressjLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(NamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(AgejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addAgejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(AddressjLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AddressjLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(zipCodejTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CityjTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PhoneNumberjLabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(PhoneNumberjLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(PhoneNumberjLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(48, 48, 48))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(109, 109, 109)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(phoneNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addUserNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPasswordjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(346, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamejLabel)
                    .addComponent(addNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgejLabel)
                    .addComponent(addAgejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressjLabel)
                    .addComponent(AddressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressjLabel1)
                    .addComponent(zipCodejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressjLabel2)
                    .addComponent(CityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumberjLabel)
                    .addComponent(phoneNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumberjLabel1)
                    .addComponent(addUserNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumberjLabel2)
                    .addComponent(addPasswordjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 OrganBankResearcher researcher = new OrganBankResearcher();
 researcher.setOrganBankId(DonorAdminID);
 researcher.setAddress(AddressjTextField.getText());
 researcher.setAge(addAgejTextField.getText());
 researcher.setName(addNamejTextField.getText());
 researcher.setPhoneNumber(phoneNumberjTextField.getText());
 researcher.setCity(CityjTextField.getText());
 researcher.setZipCode(zipCodejTextField.getText());
 if( addUserNamejTextField.getText().isEmpty() || addPasswordjTextField.getText().isEmpty() || researcher.getName().isEmpty() ||
            researcher.getAge().isEmpty() || researcher.getAddress().isEmpty() || researcher.getZipCode().isEmpty()|| researcher.getCity().isEmpty()||researcher.getPhoneNumber().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Kindly Enter all the required fields!");
        }   else if (!system.validateMobileNo(researcher.getPhoneNumber())) {
            JOptionPane.showMessageDialog(null, "Kindly enter a Valid Contact Number.");
            
        }  
        
 else
        {
    OrganBankResearcherDirectory organdir = new OrganBankResearcherDirectory();
    organdir.addOrganResearcher(researcher,addUserNamejTextField.getText(),addPasswordjTextField.getText());
    setempty();
    JOptionPane.showMessageDialog(null, "Researcher has been successfully added");
    
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    OrganBankAdminJPanel adminpanel = new OrganBankAdminJPanel(container, system, DonorAdminID);
        container.add("sysadminpanel", adminpanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressjLabel;
    private javax.swing.JLabel AddressjLabel1;
    private javax.swing.JLabel AddressjLabel2;
    private javax.swing.JTextField AddressjTextField;
    private javax.swing.JLabel AgejLabel;
    private javax.swing.JTextField CityjTextField;
    private javax.swing.JLabel NamejLabel;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField phoneNumberjTextField;
    private javax.swing.JTextField zipCodejTextField;
    // End of variables declaration//GEN-END:variables
public void setempty()
{       
        addNamejTextField.setText("");
        addAgejTextField.setText("");
        AddressjTextField.setText("");
        zipCodejTextField.setText("");
        CityjTextField.setText("");
        phoneNumberjTextField.setText("");
        addUserNamejTextField.setText("");
        addPasswordjTextField.setText("");
      
}
}
