package Controllers;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.Affaire;
import DAO.Casier;
import DAO.DAOCasier;
import DAO.Individu;
import DAO.Infraction;
import Fenetres.Fenetre;
import ModelTable.CasierModelTable;

public class casierController {

	Fenetre fenetre;
	Connection cnx;
	Individu personne;
	Infraction infraction;
	Affaire affaire;
	
	public casierController(Fenetre fenetre, Connection cnx, Individu personne, Infraction infraction, Affaire affaire ) {
		this.fenetre = fenetre;
		this.cnx = cnx;
		this.personne = personne;
		this.infraction = infraction;
		this.affaire = affaire;
		
		fenetre.switchPannels(fenetre.panel5);
		
		fenetre.setLabel(personne.getNom(), personne.getPrenom());
		
		System.out.println(personne.getVille());
	
		
//		fenetre.getButton_2().addActionListener(this);
//		fenetre.getButton_3().addActionListener(this);
			
	}
	
	public casierController(Fenetre fenetre, Connection cnx, Individu personne){
		this.fenetre = fenetre;
		this.cnx = cnx;
		this.personne = personne;
		
			fenetre.switchPannels(fenetre.panel5);		
			fenetre.setLabel(personne.getNom(), personne.getPrenom());
			
			DAOCasier daoca = new DAOCasier(cnx);
			
			List<Casier> casiers;
			try {
				casiers = daoca.findCasiersFromMatricule(personne.getMatricule());
				
				CasierModelTable tableModel = new CasierModelTable(casiers);
				fenetre.table.setModel(tableModel);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	
}
