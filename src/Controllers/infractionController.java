package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.JButton;

import DAO.DAOIndividu;
import DAO.DAOInfraction;
import DAO.Individu;
import DAO.Infraction;
import Fenetres.Fenetre;

public class infractionController implements ActionListener {

	Fenetre fenetre;
	Connection cnx;
	Individu personne;
	
	public infractionController(Fenetre fenetre, Connection cnx, Individu personne) {
		this.fenetre = fenetre;
		this.cnx = cnx;
		this.personne = personne;
		
		fenetre.switchPannels(fenetre.panel4);
		
		fenetre.getButton().addActionListener(this);
		fenetre.getButton_1().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton) e.getSource();
		
		
		switch (btn.getName()) {
		case "suivant":
			
			String infraction = fenetre.comboBox.getSelectedItem().toString();
			DAOInfraction DAOinf = new DAOInfraction(cnx);
			try {
				Infraction ObjInfration = DAOinf.find(infraction);
				affaireController affaire = new affaireController(fenetre, cnx, personne, ObjInfration);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
				
					
			
			break;
		case "precedent":
			individuController c = new individuController(fenetre, cnx);
			break;

		default:
			break;
		}
	
	}
	
}
