package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JButton;

import DAO.Affaire;
import DAO.DAOAffaire;
import DAO.DAOInfraction;
import DAO.Individu;
import DAO.Infraction;
import Fenetres.Fenetre;

public class affaireController implements ActionListener {

	Fenetre fenetre;
	Connection cnx;
	Individu personne;
	Infraction infraction;
	
	public affaireController(Fenetre fenetre, Connection cnx, Individu personne, Infraction infraction ) {
		this.fenetre = fenetre;
		this.cnx = cnx;
		this.personne = personne;
		this.infraction = infraction;
		
		fenetre.switchPannels(fenetre.panel2);
		
		fenetre.getButton_2().addActionListener(this);
		fenetre.getButton_3().addActionListener(this);
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton btn = (JButton) e.getSource();
		
		
		switch (btn.getName()) {
		case "suivant":
			
			String NumAffaire = fenetre.getTextField_3().getText();
			String DescAffaire = fenetre.getTextField_7().getText();
			Affaire affaire = new Affaire(NumAffaire, DescAffaire);
			DAOAffaire daoaff = new DAOAffaire(cnx);
			try {
				daoaff.save(affaire);
				//Affaire affaire = daoaff.find(NumAffaire);
				casierController casier = new casierController(fenetre, cnx, personne, infraction, affaire);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		
			
			break;
		case "precedent":
			infractionController c = new infractionController(fenetre, cnx, personne);
			break;

		default:
			break;
		}
		
	}
}
