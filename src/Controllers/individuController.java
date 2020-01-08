package Controllers;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;

import DAO.Casier;
import DAO.DAOCasier;
import DAO.DAOIndividu;
import DAO.DAOInfraction;
import DAO.Individu;
import DAO.Infraction;
import Fenetres.Fenetre;

public class individuController implements ActionListener {

	private Fenetre fenetre;
	Connection cnx;
	
	public individuController(Fenetre fenetre, Connection cnx){
		this.fenetre = fenetre;
		this.cnx = cnx;
		fenetre.switchPannels(fenetre.panel3);
		
		fenetre.getBtnNewButton().addActionListener(this);
		fenetre.getBtnPrcdent().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton) e.getSource();

		switch (btn.getName()) {
		case "suivant":
			
			String Matricule = fenetre.getTextField().getText();
			String Nom = fenetre.getTextField_1().getText();
			String Prenom = fenetre.getTextField_2().getText();
			String Adresse = fenetre.getTextField_4().getText();
			String Ville = fenetre.getTextField_5().getText();
			String Pays = fenetre.getTextField_6().getText();
			
			
			
			Individu personne = new Individu(Matricule, Nom, Prenom, Adresse, Ville, Pays);
			
	
			DAOIndividu daoin = new DAOIndividu(cnx);
			
			try {
				daoin.save(personne);
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
			
			infractionController i = new infractionController(fenetre, cnx, personne.getMatricule());
					
			
			break;
		case "precedent":
			MainController c = new MainController(fenetre, cnx);
			break;

		default:
			break;
		}
	}
	
}
