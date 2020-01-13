package Controllers;

import java.sql.Connection;

import Fenetres.Fenetre;

public class casierController {

	Fenetre fenetre;
	Connection cnx;
	String Matricule;
	String CodeI;
	String NumAffaire;
	
	public casierController(Fenetre fenetre, Connection cnx, String Matricule, String CodeI, String NumAffaire ) {
		this.fenetre = fenetre;
		this.cnx = cnx;
		this.Matricule = Matricule;
		this.CodeI = CodeI;
		this.NumAffaire = NumAffaire;
		
		fenetre.switchPannels(fenetre.panel5);
		
//		fenetre.getButton_2().addActionListener(this);
//		fenetre.getButton_3().addActionListener(this);
			
	}
	
}
