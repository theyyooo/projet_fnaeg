package DAO;

import java.util.Date;

public class Affaire {
	
	private String NumAffaire;
	private String Description;
	
	public Affaire() {
		
	}
	
	public Affaire(String NumAffaire, String Description) {
		this.NumAffaire = NumAffaire;
		this.Description = Description;
	}

	public String getNumAffaire() {
		return NumAffaire;
	}

	public Affaire setNumAffaire(String numAffaire) {
		NumAffaire = numAffaire;
		return this;
	}


	public String getDescription() {
		return Description;
	}

	public Affaire setDescription(String description) {
		Description = description;
		return this;
	}
	
	

}
