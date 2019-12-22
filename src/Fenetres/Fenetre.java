package Fenetres;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class Fenetre extends JFrame {

	public JPanel panel1;
	public JPanel panel2;
	public JPanel panel3;
	private JPanel contentPane;
	private JTextField fieldIndividu;
	private JLabel lblRecherche;
	private JButton btnRechercher;
	private JLayeredPane layeredPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JButton btnCliquezIciPour;
	private JButton btnPrcdent;

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
		lblRecherche.setFont(new Font("Dialog", Font.ITALIC, 20));
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

		//PANNEL 3
		
		JPanel panel3 = new JPanel();
		layeredPane.add(panel3, "name_2760148733102");
		panel3.setLayout(null);
		
		JLabel lblNouveauProfil_1 = new JLabel("Nouveau profil:");
		lblNouveauProfil_1.setFont(new Font("Dialog", Font.ITALIC, 20));
		lblNouveauProfil_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNouveauProfil_1.setBounds(0, 50, 1000, 50);
		panel3.add(lblNouveauProfil_1);
		
		textField = new JTextField();
		textField.setBounds(425, 141, 150, 25);
		panel3.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Matricule:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(425, 114, 150, 15);
		panel3.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Suivant ->");
		btnNewButton.setName("suivant");
		btnNewButton.setBounds(430, 299, 140, 40);
		panel3.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(137, 141, 150, 25);
		panel3.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(137, 220, 150, 25);
		panel3.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(137, 299, 150, 25);
		panel3.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(713, 141, 150, 25);
		panel3.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(713, 220, 150, 25);
		panel3.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(713, 299, 150, 25);
		panel3.add(textField_6);
		
		JLabel lblNom = new JLabel("Nom: ");
		lblNom.setHorizontalAlignment(SwingConstants.CENTER);
		lblNom.setBounds(137, 114, 150, 15);
		panel3.add(lblNom);
		
		JLabel lblPrenom = new JLabel("Prenom: ");
		lblPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrenom.setBounds(137, 193, 150, 15);
		panel3.add(lblPrenom);
		
		JLabel lblDateDeNaissance = new JLabel("Date de Naissance: ");
		lblDateDeNaissance.setHorizontalAlignment(SwingConstants.CENTER);
		lblDateDeNaissance.setBounds(137, 272, 150, 15);
		panel3.add(lblDateDeNaissance);
		
		JLabel lblAdresse = new JLabel("Adresse: ");
		lblAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdresse.setBounds(713, 114, 150, 15);
		panel3.add(lblAdresse);
		
		JLabel lblVille = new JLabel("Ville: ");
		lblVille.setHorizontalAlignment(SwingConstants.CENTER);
		lblVille.setBounds(713, 193, 150, 15);
		panel3.add(lblVille);
		
		JLabel lblPays = new JLabel("Pays");
		lblPays.setHorizontalAlignment(SwingConstants.CENTER);
		lblPays.setBounds(713, 272, 150, 15);
		panel3.add(lblPays);
		
		this.panel3 = panel3;
		
		btnPrcdent = new JButton("<- Précédent");
		btnPrcdent.setName("precedent");
		btnPrcdent.setBounds(430, 351, 140, 40);
		panel3.add(btnPrcdent);

		
		//PANNEL 4
		
		JPanel panel4 = new JPanel();
		layeredPane.add(panel4, "name_2763311001564");
		panel4.setLayout(null);
		
		JLabel lblApplicationDeGestion = new JLabel("APPLICATION DE GESTION DE CASIERS JUDICIAIRE");
		lblApplicationDeGestion.setFont(new Font("Dialog", Font.ITALIC, 36));
		lblApplicationDeGestion.setHorizontalAlignment(SwingConstants.CENTER);
		lblApplicationDeGestion.setBounds(0, 0, 1000, 100);
		contentPane.add(lblApplicationDeGestion);
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
}
