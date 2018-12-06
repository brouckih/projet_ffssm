/**
 * @(#) Plongee.java
 */
package FFSSM;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Plongee {

    public Site lieu;

    public Moniteur chefDePalanquee;

    public Calendar date;

    public int profondeur;

    public int duree;
    
    public HashSet<Plongeur> listePlongeurs = new HashSet<>();

    public Plongee(Site lieu, Moniteur chefDePalanquee, Calendar date, int profondeur, int duree) {
        this.lieu = lieu;
        this.chefDePalanquee = chefDePalanquee;
        this.date = date;
        this.profondeur = profondeur;
        this.duree = duree;
    }

    public void ajouteParticipant(Plongeur participant) {
         // TODO: Implémenter cette méthode
       // throw new UnsupportedOperationException("Pas encore implémenté");
       listePlongeurs.add(participant);
    }

    public Calendar getDate() {
        return date;
    }

    public boolean estConforme() {
         // TODO: Implémenter cette méthode
       // throw new UnsupportedOperationException("Pas encore implémenté");
               int x = 0;
        for(Plongeur p : listePlongeurs){
            if(p.isValid(date)==true){
                x++;
            }
        }
        if(this.chefDePalanquee!=null&&x==listePlongeurs.size()){
            return true;
        }
        else{
            return false;
        }
    }


}
