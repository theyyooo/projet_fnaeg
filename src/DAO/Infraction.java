package DAO;

public class Infraction {

	private String CodeI;
	private String Libelle;
	private int Niveau;
	
	
	public Infraction() {
		
	}
	
	public Infraction(String CodeI, String Libelle, int Niveau) {
		this.CodeI = CodeI;
		this.Libelle = Libelle;
		this.Niveau = Niveau;
	}

	public String getCodeI() {
		return CodeI;
	}

	public Infraction setCodeI(String codeI) {
		CodeI = codeI;
		return this;
	}

	public String getLibelle() {
		return Libelle;
	}

	public Infraction setLibelle(String libelle) {
		Libelle = libelle;
		return this;
	}

	public int getNiveau() {
		return Niveau;
	}

	public Infraction setNiveau(int niveau) {
		Niveau = niveau;
		return this;
	}
	
	
}
