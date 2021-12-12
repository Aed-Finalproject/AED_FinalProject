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
    String bloodGroup, email, address, city, phoneNumber;
    int age;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public Donor(boolean isBloodDonor, boolean isOrganDonor, ArrayList<String> donatedOrgans, String bloodGroup, String name, String password, String _ID, String phoneNumber) {
        super(name, password, _ID);
        this.isBloodDonor = isBloodDonor;
        this.isOrganDonor = isOrganDonor;
        this.donatedOrgans = donatedOrgans;
        this.bloodGroup = bloodGroup;       
        this.phoneNumber= phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }   
}
