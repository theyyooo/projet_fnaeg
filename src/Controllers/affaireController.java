package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;

import Fenetres.Fenetre;

public class affaireController implements ActionListener {

	Fenetre fenetre;
	Connection cnx;
	String Matricule;
	String CodeI;
	
	public affaireController(Fenetre fenetre, Connection cnx, String Matricule, String CodeI ) {
		this.fenetre = fenetre;
		this.cnx = cnx;
		this.Matricule = Matricule;
		this.CodeI = CodeI;
		
		fenetre.switchPannels(fenetre.panel2);
		
		fenetre.getButton_2().addActionListener(this);
		fenetre.getButton_3().addActionListener(this);
		
		System.out.println(Matricule);
		System.out.println(CodeI);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton btn = (JButton) e.getSource();
		
		
		switch (btn.getName()) {
		case "suivant":
			
			
			
		
			
			break;
		case "precedent":
			infractionController c = new infractionController(fenetre, cnx, Matricule);
			break;

		default:
			break;
		}
		
	}
}
