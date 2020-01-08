package DAO;

import java.util.Date;

public class Casier {
	
	private String Matricule;
	private String CodeI;
	private Date DateI;
	private String Description;
	private String Pays;
	private String Ville;
	private String NumAffaire;
	
	public Casier() {
		
	}
	
	public Casier(String Matricule, String CodeI, Date DateI, String Description, String Pays, String Ville, String NumAffaire) {
		this.Matricule = Matricule;
		this.CodeI = CodeI;
		this.DateI = DateI;
		this.Description = Description;
		this.Pays = Pays;
		this.Ville = Ville;
		this.NumAffaire = NumAffaire;
		
	}
	
	public Casier(String Matricule) {
		this.Matricule = Matricule;
		
	}

	public String getMatricule() {
		return Matricule;
	}

	public Casier setMatricule(String matricule) {
		Matricule = matricule;
		return this;
	}

	public String getCodeI() {
		return CodeI;
	}

	public Casier setCodeI(String codeI) {
		CodeI = codeI;
		return this;
	}

	public Date getDateI() {
		return DateI;
	}

	public Casier setDateI(Date dateI) {
		DateI = dateI;
		return this;
	}

	public String getDescription() {
		return Description;
	}

	public Casier setDescription(String description) {
		Description = description;
		return this;
	}

	public String getPays() {
		return Pays;
	}

	public Casier setPays(String pays) {
		Pays = pays;
		return this;
	}

	public String getVille() {
		return Ville;
	}

	public Casier setVille(String ville) {
		Ville = ville;
		return this;
	}

	public String getNumAffaire() {
		return NumAffaire;
	}

	public Casier setNumAffaire(String numAffaire) {
		NumAffaire = numAffaire;
		return this;
	}
	
	

}
