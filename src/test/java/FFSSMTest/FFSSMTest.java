/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FFSSMTest;
import FFSSM.Club;
import FFSSM.Licence;
import FFSSM.Moniteur;
import FFSSM.Plongee;
import FFSSM.Plongeur;
import FFSSM.Site;
import java.util.Calendar;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author hbroucke
 */
public class FFSSMTest {
    Plongeur Hugo,Nico;
    Club NiceDolphins;
    Moniteur Bryan;
    Site Nice;
    Plongee plongee;
    Licence valide,nonvalide; 
    
    @Before
    public void setUp() {
        
        Hugo  = new Plongeur(1, "p1", "Broucke", "Hugo", "Mouans", "51",Calendar.getInstance());
        Nico = new Plongeur(2, "p2", "Vol", "Nico", "Toulouse", "16",Calendar.getInstance());
        NiceDolphins = new Club(Bryan,"NiceDolphins", "62");
        Bryan = new Moniteur( "m1", "Curt", "Bryan", "Bled2", "62",Calendar.getInstance(),15);
        Nice = new Site("Nice","un beau site");        
        Calendar date = Calendar.getInstance();
        date.set(2018,8,30); 
        plongee = new Plongee(Nice, Bryan,date,50,45);
        valide = new Licence(Hugo, "l1",date,1,NiceDolphins);
        Calendar dateNonVal = Calendar.getInstance();
        dateNonVal.set(2017,9, 12);
        nonvalide= new Licence(Hugo, "l1", dateNonVal,1,NiceDolphins);
        
    }
        
   
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    @Test
    public void testPlongeeConforme(){
        
        plongee.ajouteParticipant(Hugo);
        plongee.ajouteParticipant(Nico);
        
        Hugo.addLicence(valide);
        Nico.addLicence(valide);
                
        Hugo.addLicence(nonvalide);
        Nico.addLicence(valide);
        
        assertFalse(plongee.estConforme());
    }
}
