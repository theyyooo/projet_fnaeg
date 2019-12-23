package Controllers;

import Fenetres.Fenetre;

public class IndividuController {

	Fenetre fenetre;
	
	public IndividuController(Fenetre fenetre) {
		this.fenetre = fenetre;
		
		fenetre.switchPannels(fenetre.panel4);
	}
	
}
