package FFSSM;

import java.util.Calendar;
import java.util.HashSet;

public class Plongeur extends Personne{
	public int niveau;
        public HashSet<Licence> listeLicences = new HashSet<>();
        public GroupeSanguin grpS;
        
        public Plongeur(int niveau, String numeroINSEE, String nom, String prenom, String adresse, String telephone, Calendar naissance) {
            super(numeroINSEE, nom, prenom,adresse,telephone, naissance );
            this.niveau = niveau;
        }
        
        public void addLicence(Licence l){
        listeLicences.add(l);
        }
        
        public GroupeSanguin getGroupeSanguin(){
        return grpS;
        }
        
        public void setGroupeSanguin(GroupeSanguin grpS){
            this.grpS = grpS;
        }
        
        public int getNiveau() {
            return niveau;
        }
        
        public void setNiveau(int niveau){
            this.niveau = niveau;
        }
        
        public HashSet<Licence> getLicence(){
            return this.listeLicences;
        }
        
        public boolean isValid(Calendar cal){
            boolean validité = false;
            for(Licence l: listeLicences){
                if(l.estValide(cal)){
                    validité = true;
                }
            }
            return validité;
        }
}
