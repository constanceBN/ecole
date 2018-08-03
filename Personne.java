
import java.util.*;

public class Personne {

    public String nom;
    public String prenom;
    public String mail;
    public boolean absent;
    public double jourDeConges;
    public boolean enConges;
    public double salaire;
    public int anneeExperience;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public boolean isAbsent() {
		return absent;
	}

	public void setAbsent(boolean absent) {
		this.absent = absent;
	}

	public double getJourDeConges() {
		return jourDeConges;
	}

	public void setJourDeConges(double jourDeConges) {
		this.jourDeConges = jourDeConges;
	}

	public boolean isEnConges() {
		return enConges;
	}

	public void setEnConges(boolean enConges) {
		this.enConges = enConges;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public int getAnneeExperience() {
		return anneeExperience;
	}

	public void setAnneeExperience(int anneeExperience) {
		this.anneeExperience = anneeExperience;
	}
	
    public void partirEnConges() {
        
    }

    public void congeDisponible() {
        
    }

}