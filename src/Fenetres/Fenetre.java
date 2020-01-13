package Fenetres;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.DAOInfraction;
import DAO.Infraction;

import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.SystemColor;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import  javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;  

public class Fenetre extends JFrame {

	public JPanel panel1;
	public JPanel panel2;
	public JPanel panel3;
	public JPanel panel4;
	public JPanel panel5;
	
	private JPanel contentPane;
	private JTextField fieldIndividu;
	private JLabel lblRecherche;
	private JButton btnRechercher;
	private JLayeredPane layeredPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JButton btnCliquezIciPour;
	private JButton btnPrcdent;
	private JButton btnNewButton;
	public JComboBox comboBox;
	private JButton button;
	private JButton button_1;
	private JTextField textField_3;
	private JTextField textField_7;
	private JButton button_3;
	private JButton button_2;
	private JLabel lblCasierDeLa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre frame = new Fenetre();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public void switchPannels(JPanel panel) {
	  layeredPane.removeAll();
	  layeredPane.add(panel);
	  layeredPane.repaint();
	  layeredPane.revalidate();
	}
	
	
	
	public Fenetre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 100, 1000, 420);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		//PANNEL 1
		
		JPanel panel1 = new JPanel();
		layeredPane.add(panel1, "name_2752809637392");
		panel1.setLayout(null);
		
		lblRecherche = new JLabel("Nom de l'individu recherché: ");
		lblRecherche.setFont(new Font("Dialog", Font.ITALIC, 30));
		lblRecherche.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecherche.setBounds(0, 50, 1000, 50);
		panel1.add(lblRecherche);
				
		fieldIndividu = new JTextField();
		fieldIndividu.setHorizontalAlignment(SwingConstants.CENTER);
		fieldIndividu.setBounds(400, 130, 200, 40);
		panel1.add(fieldIndividu);
		fieldIndividu.setColumns(10);
		
		btnRechercher = new JButton("Rechercher");
		btnRechercher.setBounds(425, 198, 150, 40);
		btnRechercher.setName("rechercher");
		panel1.add(btnRechercher);
		
		btnCliquezIciPour = new JButton("Cliquez ici pour un nouveau profil");
		btnCliquezIciPour.setName("newProfil");
		btnCliquezIciPour.setBackground(SystemColor.menu);
		btnCliquezIciPour.setForeground(Color.BLACK);
		btnCliquezIciPour.setBounds(100, 305, 800, 30);
		panel1.add(btnCliquezIciPour);
		
		this.panel1 = panel1;

		
		//PANNEL 2
		
		JPanel panel2 = new JPanel();
		layeredPane.add(panel2, "name_2756634721845");
		panel2.setLayout(null);
		
		this.panel2 = panel2;
		
		JLabel lblNouvelleAffaire = new JLabel("Nouvelle affaire:");
		lblNouvelleAffaire.setHorizontalAlignment(SwingConstants.CENTER);
		lblNouvelleAffaire.setFont(new Font("Dialog", Font.ITALIC, 30));
		lblNouvelleAffaire.setBounds(0, 12, 1000, 50);
		panel2.add(lblNouvelleAffaire);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(400, 133, 200, 40);
		panel2.add(textField_3);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setColumns(10);
		textField_7.setBounds(100, 267, 800, 140);
		panel2.add(textField_7);
		
		JLabel lblNumAffaire = new JLabel("Num Affaire:");
		lblNumAffaire.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumAffaire.setFont(new Font("Dialog", Font.ITALIC, 20));
		lblNumAffaire.setBounds(425, 95, 150, 15);
		panel2.add(lblNumAffaire);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescription.setFont(new Font("Dialog", Font.ITALIC, 20));
		lblDescription.setBounds(425, 218, 150, 15);
		panel2.add(lblDescription);
		
		button_2 = new JButton("Suivant ->");
		button_2.setName("suivant");
		button_2.setBounds(800, 174, 140, 40);
		panel2.add(button_2);
		
		button_3 = new JButton("<- Précédent");
		button_3.setName("precedent");
		button_3.setBounds(60, 174, 140, 40);
		panel2.add(button_3);

		//PANNEL 3
		
		JPanel panel3 = new JPanel();
		layeredPane.add(panel3, "name_2760148733102");
		panel3.setLayout(null);
		
		JLabel lblNouveauProfil_1 = new JLabel("Nouveau profil:");
		lblNouveauProfil_1.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblNouveauProfil_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNouveauProfil_1.setBounds(0, 22, 1000, 50);
		panel3.add(lblNouveauProfil_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(137, 299, 150, 25);
		panel3.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Matricule:");
		lblNewLabel.setFont(new Font("Dialog", Font.ITALIC, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(37, 272, 350, 15);
		panel3.add(lblNewLabel);
		
		btnNewButton = new JButton("Suivant ->");
		btnNewButton.setName("suivant");
		btnNewButton.setBounds(430, 299, 140, 40);
		panel3.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(137, 141, 150, 25);
		panel3.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(137, 220, 150, 25);
		panel3.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(713, 141, 150, 25);
		panel3.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		textField_5.setBounds(713, 220, 150, 25);
		panel3.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setColumns(10);
		textField_6.setBounds(713, 299, 150, 25);
		panel3.add(textField_6);
		
		JLabel lblNom = new JLabel("Nom: ");
		lblNom.setFont(new Font("Dialog", Font.ITALIC, 20));
		lblNom.setHorizontalAlignment(SwingConstants.CENTER);
		lblNom.setBounds(137, 114, 150, 15);
		panel3.add(lblNom);
		
		JLabel lblPrenom = new JLabel("Prenom: ");
		lblPrenom.setFont(new Font("Dialog", Font.ITALIC, 20));
		lblPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrenom.setBounds(137, 193, 150, 15);
		panel3.add(lblPrenom);
		
		JLabel lblAdresse = new JLabel("Adresse: ");
		lblAdresse.setFont(new Font("Dialog", Font.ITALIC, 20));
		lblAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdresse.setBounds(713, 114, 150, 15);
		panel3.add(lblAdresse);
		
		JLabel lblVille = new JLabel("Ville: ");
		lblVille.setFont(new Font("Dialog", Font.ITALIC, 20));
		lblVille.setHorizontalAlignment(SwingConstants.CENTER);
		lblVille.setBounds(713, 193, 150, 15);
		panel3.add(lblVille);
		
		JLabel lblPays = new JLabel("Pays");
		lblPays.setFont(new Font("Dialog", Font.ITALIC, 20));
		lblPays.setHorizontalAlignment(SwingConstants.CENTER);
		lblPays.setBounds(713, 272, 150, 15);
		panel3.add(lblPays);
		
		
		
		btnPrcdent = new JButton("<- Précédent");
		btnPrcdent.setName("precedent");
		btnPrcdent.setBounds(430, 351, 140, 40);
		panel3.add(btnPrcdent);
		
		

		
		this.panel3 = panel3;
		
		//PANNEL 4
		
		JPanel panel4 = new JPanel();
		layeredPane.add(panel4, "name_2763311001564");
		panel4.setLayout(null);
		
		JLabel lblApplicationDeGestion = new JLabel("APPLICATION DE GESTION DE CASIERS JUDICIAIRE");
		lblApplicationDeGestion.setFont(new Font("Dialog", Font.ITALIC, 36));
		lblApplicationDeGestion.setHorizontalAlignment(SwingConstants.CENTER);
		lblApplicationDeGestion.setBounds(0, 0, 1000, 100);
		contentPane.add(lblApplicationDeGestion);
		
		this.panel4 = panel4;
		
		JLabel lblInfraction = new JLabel("Nouvelle infraction: ");
		lblInfraction.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfraction.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblInfraction.setBounds(0, 12, 1000, 50);
		panel4.add(lblInfraction);
		
		String [] patternExamples = {
		         "Vol",
		         "Viol",
		         "Homicide volontaire",
		         "Homicide involontaire",
		         "Vol avec violence"
		};
		
		comboBox = new JComboBox(patternExamples);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Vol", "Viol", "Homicide volontaire", "Homicide involontaire", "Vol avec violence"}));
		comboBox.setFont(new Font("Dialog", Font.ITALIC, 20));
		comboBox.setBounds(375, 127, 250, 40);
		panel4.add(comboBox);
		
		button = new JButton("Suivant ->");
		button.setName("suivant");
		button.setBounds(600, 340, 140, 40);
		panel4.add(button);
		
		button_1 = new JButton("<- Précédent");
		button_1.setName("precedent");
		button_1.setBounds(260, 340, 140, 40);
		panel4.add(button_1);
		
		panel5 = new JPanel();
		panel5.setLayout(null);
		layeredPane.add(panel5, "name_2922462456269");
		
		lblCasierDeLa = new JLabel("Casier de la personne concerncée: ");
		lblCasierDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblCasierDeLa.setFont(new Font("Dialog", Font.ITALIC, 30));
		lblCasierDeLa.setBounds(0, 50, 1000, 50);
		panel5.add(lblCasierDeLa);
	}
	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}



	public JTextField getTextField_4() {
		return textField_4;
	}

	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}

	public JTextField getTextField_5() {
		return textField_5;
	}

	public void setTextField_5(JTextField textField_5) {
		this.textField_5 = textField_5;
	}

	public JTextField getTextField_6() {
		return textField_6;
	}

	public void setTextField_6(JTextField textField_6) {
		this.textField_6 = textField_6;
	}

	public JLabel getLblRecherche() {
		return lblRecherche;
	}
	public JTextField getFieldIndividu() {
		return fieldIndividu;
	}
	public JButton getBtnRechercher() {
		return btnRechercher;
	}
	
	public JLayeredPane getLayeredPane() {
		return layeredPane;
	}
	public JButton getBtnCliquezIciPour() {
		return btnCliquezIciPour;
	}
	public JButton getBtnPrcdent() {
		return btnPrcdent;
	}
	
	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}
	public JComboBox getComboBox() {
		return comboBox;
	}
	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	public JButton getButton() {
		return button;
	}
	public JButton getButton_1() {
		return button_1;
	}
	public JTextField getTextField_3() {
		return textField_3;
	}
	public JTextField getTextField_7() {
		return textField_7;
	}
	public JButton getButton_3() {
		return button_3;
	}
	public JButton getButton_2() {
		return button_2;
	}
	public JPanel getPanel5() {
		return panel5;
	}
}
