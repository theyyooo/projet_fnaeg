package Controllers;

import Fenetres.Fenetre;

public class SearchController {
	
	private Fenetre fenetre;
	
	public SearchController(Fenetre fenetre) {
		this.fenetre = fenetre;
		
		fenetre.switchPannels(fenetre.panel2);
	}

}
