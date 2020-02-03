package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JPanel;

import DAO.DAOIndividu;
import DAO.Individu;
import Fenetres.Fenetre;

public class MainController implements ActionListener {
	
	public Fenetre fenetre;
	Connection cnx;
	
	public MainController(Fenetre f, Connection cnx) {
		
		this.fenetre = f;	
		this.cnx = cnx;
		
		fenetre.switchPannels(fenetre.panel1);

		
		fenetre.getBtnRechercher().addActionListener(this);
		fenetre.getBtnCliquezIciPour().addActionListener(this);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton btn = (JButton) e.getSource();

		switch (btn.getName()) {
		case "rechercher":
			
			String nom = fenetre.getFieldIndividu().getText();
			String prenom = fenetre.getTextField_8().getText();
			DAOIndividu daoind = new DAOIndividu(cnx);
			
			try {
				Individu unePersonne = daoind.findWithName(nom, prenom);
			
				casierController casier = new casierController(fenetre, cnx, unePersonne);
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			break;
		case "newProfil":
			individuController affaire = new individuController(this.fenetre, cnx);
			break;

		default:
			break;
		}
		
	}
	
	

}
