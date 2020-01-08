package DAO;

import java.util.Date;

public class Affaire {
	
	private String NumAffaire;
	private Date DateAffaire;
	private String Description;
	
	public Affaire() {
		
	}
	
	public Affaire(String NumAffaire, Date DateAffaire, String Description) {
		this.NumAffaire = NumAffaire;
		this.DateAffaire = DateAffaire;
		this.Description = Description;
	}

	public String getNumAffaire() {
		return NumAffaire;
	}

	public Affaire setNumAffaire(String numAffaire) {
		NumAffaire = numAffaire;
		return this;
	}

	public Date getDateAffaire() {
		return DateAffaire;
	}

	public Affaire setDateAffaire(Date dateAffaire) {
		DateAffaire = dateAffaire;
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
