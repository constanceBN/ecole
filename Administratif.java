
import java.util.*;

public class Administratif extends Personne {

    public String poste;
    
    public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

    public void augmenterSalaireProf(Professeur nomProf, double augmentation) {
        nomProf.salaire = nomProf.getSalaire() + (augmentation * nomProf.getAnneeExperience());
        System.out.println(getPrenom() + " accorde une augmentation à " + nomProf.getPrenom() + " d'un montant de " + augmentation + " € multiplié par ses " + nomProf.getAnneeExperience() + " années d'expériences.");
        System.out.println("Le salaire de " + nomProf.getPrenom() + " est maintenant de " + nomProf.getSalaire() + " €.");
    }

}