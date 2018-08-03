
import java.util.*;

public class Application {

    public static void main(String[] args) {
    	
    	// Créer une instance de classes.
        Professeur prof1 = new Professeur();
        
        // Initialiser les différentes valeurs.
        prof1.setPrenom("Vanessa");
        prof1.setMatiere("Allemand");
        prof1.setAnneeExperience(5);
        prof1.setJourDeConges(20);
        prof1.setEnConges(false);
        prof1.setSalaire(2000);
       
        // Appeler la méthode "afficherProfilProf".
        prof1.afficherProfilProf(); 
        
        
        // Créer une instance de classes.
        Administratif admin1 = new Administratif();
        
        // Initialiser les différentes valeurs.
        admin1.setPrenom("Aurélia");
        admin1.setPoste("ressources humaines");
        
        // Appeler la méthode "augmenterSalaire".
        admin1.augmenterSalaireProf(prof1, 100);
    }

}