/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DonorSystem;

import Business.Person;
import java.util.ArrayList;

/**
 *
 * @author kashr
 */
public class Donor extends Person{
    
    boolean isBloodDonor;
    boolean isOrganDonor;
    ArrayList<String> donatedOrgans;
    String bloodGroup;

    public Donor(boolean isBloodDonor, boolean isOrganDonor, ArrayList<String> donatedOrgans, String bloodGroup, String name, String password, String _ID) {
        super(name, password, _ID);
        this.isBloodDonor = isBloodDonor;
        this.isOrganDonor = isOrganDonor;
        this.donatedOrgans = donatedOrgans;
        this.bloodGroup = bloodGroup;
    }

    public boolean isIsBloodDonor() {
        return isBloodDonor;
    }

    public void setIsBloodDonor(boolean isBloodDonor) {
        this.isBloodDonor = isBloodDonor;
    }

    public boolean isIsOrganDonor() {
        return isOrganDonor;
    }

    public void setIsOrganDonor(boolean isOrganDonor) {
        this.isOrganDonor = isOrganDonor;
    }

    public ArrayList<String> getDonatedOrgans() {
        return donatedOrgans;
    }

    public void setDonatedOrgans(ArrayList<String> donatedOrgans) {
        this.donatedOrgans = donatedOrgans;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    
    
    
    
    
    
}
