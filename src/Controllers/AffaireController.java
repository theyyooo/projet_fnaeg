package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Fenetres.Fenetre;

public class AffaireController implements ActionListener {

	private Fenetre fenetre;
	
	public AffaireController(Fenetre fenetre){
		this.fenetre = fenetre;
		fenetre.switchPannels(fenetre.panel3);
		
		fenetre.getBtnPrcdent().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton) e.getSource();

		switch (btn.getName()) {
		case "suivant":
			
			break;
		case "precedent":
			MainController c = new MainController(fenetre);
			break;

		default:
			break;
		}
	}
	
}
