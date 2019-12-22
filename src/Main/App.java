package Main;

import java.sql.Connection;
import java.sql.SQLException;

import Controllers.MainController;
import Fenetres.Fenetre;

public class App {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		
		try {
			Connection cnx = Singleton.getInstance().cnx;
			System.out.println("Connexion ok");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		Fenetre fenetre = new Fenetre();
		
		fenetre.setVisible(true);
		
		MainController c = new MainController(fenetre);

	}

}
