package DAO;

import java.util.Date;

public class Individu {
	
	private String Matricule;
	private String Nom;
	private String Prenom;
	private Date Anniversaire;
	private String Adresse;
	private String Ville;
	private String Pays;
	
	


	public Individu() {
		
	}
	
	public Individu(String Matricule, String Nom, String Prenom, Date Anniversaire, String Adresse, String Ville, String Pays) {
		this.Matricule = Matricule;
		this.Nom = Nom;
		this.Prenom = Prenom;
		this.Anniversaire = Anniversaire;
		this.Adresse = Adresse;
		this.Ville = Ville;
		this.Pays = Pays;
		
	}

	public String getMatricule() {
		return Matricule;
	}

	public Individu setMatricule(String matricule) {
		Matricule = matricule;
		return this;
	}

	public String getNom() {
		return Nom;
	}

	public Individu setNom(String nom) {
		Nom = nom;
		return this;
	}

	public String getPrenom() {
		return Prenom;
	}

	public Individu setPrenom(String prenom) {
		Prenom = prenom;
		return this;
	}

	public Date getAnniversaire() {
		return Anniversaire;
	}

	public Individu setAnniversaire(Date anniversaire) {
		Anniversaire = anniversaire;
		return this;
	}

	public String getAdresse() {
		return Adresse;
	}

	public Individu setAdresse(String adresse) {
		Adresse = adresse;
		return this;
	}
	
	public String getVille() {
		return Ville;
	}

	public Individu setVille(String ville) {
		Ville = ville;
		return this;
	}

	public String getPays() {
		return Pays;
	}

	public Individu setPays(String pays) {
		Pays = pays;
		return this;
	}
	

}
