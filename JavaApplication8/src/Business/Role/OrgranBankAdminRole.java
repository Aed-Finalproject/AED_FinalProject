/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import javax.swing.JPanel;
import ui.DonorAdmin.DonorAdminJPanel;

/**
 *
 * @author kashr
 */
public class OrgranBankAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel container, EcoSystem business, String ID) {
        return new DonorAdminJPanel(container, business, ID);
    }
}