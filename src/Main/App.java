package Main;

import java.sql.Connection;
import java.sql.SQLException;

import Controllers.MainController;
import DAO.DAOIndividu;
import Fenetres.Fenetre;

public class App {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		
	//PARTIE TRIGER ET DIVISION A METTRE DANS LE PROJET AINSI QUE L'ESPACE CONNEXION

		
		
		Fenetre fenetre = new Fenetre();
		
		fenetre.setVisible(true);
		
		try {
			Connection cnx = Singleton.getInstance().cnx;
			System.out.println("Connexion ok");
			MainController c = new MainController(fenetre, cnx);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
