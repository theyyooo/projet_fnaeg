package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JPanel;

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
			SearchController search = new SearchController(this.fenetre);
			break;
		case "newProfil":
			AffaireController affaire = new AffaireController(this.fenetre, cnx);
			break;

		default:
			break;
		}
		
	}
	
	

}
