/**
 * @(#) Moniteur.java
 */
package FFSSM;

import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Moniteur extends Personne {

    public int numeroDiplome;
    private LinkedList<Embauche> listeEmployeurs = new LinkedList();

    public Moniteur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, Calendar naissance, int numeroDiplome) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
        this.numeroDiplome = numeroDiplome;
    }

    public Club employeur() {
         // TODO: Implémenter cette méthode
      //  throw new UnsupportedOperationException("Pas encore implémenté");
            int cpt = -1;
        for (int x =0;x<listeEmployeurs.size();x++){
            if(!listeEmployeurs.get(x).estTerminee()){
                cpt = x;
            }
        }
        if(cpt<0){
            return null;
        }
        else{
            return listeEmployeurs.get(cpt).getEmployeur();
        }
    
    }
    
    public void nouvelleEmbauche(Club employeur, Calendar debutNouvelle) {   
         // TODO: Implémenter cette méthode
        //throw new UnsupportedOperationException("Pas encore implémenté");
                listeEmployeurs.add(new Embauche(debutNouvelle,this,employeur));
    
    }

    public List<Embauche> emplois() {
         // TODO: Implémenter cette méthode
        //throw new UnsupportedOperationException("Pas encore implémenté");
        return listeEmployeurs;
    }

}
