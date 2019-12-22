package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import Fenetres.Fenetre;

public class MainController implements ActionListener {
	
	public Fenetre fenetre;
	
	public MainController(Fenetre f) {
		
		this.fenetre = f;	
		
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
			System.out.println("hello1");

			break;
		case "newProfil":
			AffaireController affaire = new AffaireController(this.fenetre);
			break;

		default:
			break;
		}
		
	}
	
	

}
