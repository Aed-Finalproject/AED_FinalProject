/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodBankResearcher;
import Business.BloodBankResearcher.BloodBankResearcher;
import java.util.ArrayList;

/**
 *
 * @author ABHI
 */
public class BloodBankResearcherDirectory {
    private ArrayList<BloodBankResearcher> BloodBankResearcherDirectory;

    public ArrayList<BloodBankResearcher> getBloodBankResearcherDirectory() {
        return BloodBankResearcherDirectory;
    }

    public void setBloodBankResearcherDirectory(ArrayList<BloodBankResearcher> BloodBankResearcherDirectory) {
        this.BloodBankResearcherDirectory = BloodBankResearcherDirectory;
    }
    public void addBoodBankResearcher(BloodBankResearcher bloodbankresearcher) {
//    {  UUID uuid = UUID.randomUUID();
//        resturantVal.setId(uuid.toString());
        BloodBankResearcherDirectory.add(bloodbankresearcher);
    }
}
