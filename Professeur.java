
import java.util.*;

public class Professeur extends Personne {

    public String matiere;
    public String status;
    
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
    public void afficherProfilProf() {
    	System.out.println("Le professeur " + getPrenom() + " enseigne l'" + getMatiere() + " et à " + getAnneeExperience() + " années d'expériences.");
    }
    
}