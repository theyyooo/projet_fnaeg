package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOIndividu {

	private Connection cnx;
	
	public DAOIndividu(Connection cnx) {
		this.cnx = cnx;
	}
	
	public Individu find(String Matricule) throws SQLException {
		
		String SQL = "SELECT * FROM Personnes WHERE Matricule=?";
		PreparedStatement preparedStatement = cnx.prepareStatement(SQL);
		preparedStatement.setString(1,Matricule);
		ResultSet result = preparedStatement.executeQuery();
		result.next();
		
		Individu c = new Individu()
				.setMatricule(result.getString("Matricule"))
				.setNom(result.getString("Nom"))
				.setPrenom(result.getString("Prenom"))
				.setAdresse(result.getString("Adresse"))
				.setVille(result.getString("Ville"))
				.setPays(result.getString("Pays"))
				;
				
		
		return c;

	}
	
	public Individu findWithName(String nom, String prenom) throws SQLException {
		
		String SQL = "SELECT * FROM Personnes WHERE Nom=? AND Prenom = ?";
		PreparedStatement preparedStatement = cnx.prepareStatement(SQL);
		preparedStatement.setString(1,nom);
		preparedStatement.setString(2,prenom);
		ResultSet result = preparedStatement.executeQuery();
		result.next();
		
		Individu c = new Individu()
				.setMatricule(result.getString("Matricule"))
				.setNom(result.getString("Nom"))
				.setPrenom(result.getString("Prenom"))
				.setAdresse(result.getString("Adresse"))
				.setVille(result.getString("Ville"))
				.setPays(result.getString("Pays"))
				;
				
		
		return c;

	}
	
	
	
	
	
	
	
	
	
	public void save(Individu i) throws SQLException {
		String SQL = "INSERT INTO Personnes (Matricule, Nom, Prenom, Adresse, Ville, Pays)"
				+ "VALUES (?, ?, ?, ?, ?, ?)";
		PreparedStatement preparedStatement = cnx.prepareStatement(SQL);
		preparedStatement.setString(1,i.getMatricule());
		preparedStatement.setString(2,i.getNom());
		preparedStatement.setString(3,i.getPrenom());
		preparedStatement.setString(4,i.getAdresse());
		preparedStatement.setString(5,i.getVille());
		preparedStatement.setString(6,i.getPays());
		
		preparedStatement.executeQuery();
	}
	
	
	
	
	
	
	public void update(Individu i) throws SQLException {
		String SQL = "UPDATE Personnes "
				+ "SET Nom=?, "
				+ "Prenom=?, "
				+ "Adresse=? "
				+ "Ville=? "
				+ "Pays=? "
				+ "WHERE Matricule=?";
		PreparedStatement preparedStatement = cnx.prepareStatement(SQL);
		preparedStatement.setString(1,i.getNom());
		preparedStatement.setString(2,i.getPrenom());
		preparedStatement.setString(3,i.getAdresse());
		preparedStatement.setString(4,i.getVille());
		preparedStatement.setString(5,i.getPays());
		
		preparedStatement.executeQuery();
	}
	
	
	
	
	
	public void delete(Individu i) throws SQLException {
		
		String SQL = "DELETE FROM Personnes WHERE Matricule=?";
		PreparedStatement preparedStatement = cnx.prepareStatement(SQL);
		preparedStatement.setString(1,i.getMatricule());
		preparedStatement.executeQuery();
		
	}
	
	
	
	
	
	
	
	
	public List<Individu> findAll() throws SQLException{
		
		String SQL = "SELECT * FROM Personnes";
		PreparedStatement preparedStatement = cnx.prepareStatement(SQL);
		ResultSet result = preparedStatement.executeQuery();
		List<Individu> individus = new ArrayList<>();
		
		while (result.next()) {
			Individu i = new Individu()
					.setMatricule(result.getString("Matricule"))
					.setNom(result.getString("Nom"))
					.setPrenom(result.getString("Prenom"))
					.setAdresse(result.getString("Adresse"))
					.setVille(result.getString("Ville"))
					.setPays(result.getString("Pays"));
			
			individus.add(i);
		}
		
		return individus;
		
	}
	
	
	
	
	
	public int count() throws SQLException {
		int count = 0;
		String SQL = "SELECT COUNT(*) AS number FROM Personnes";
		PreparedStatement preparedStatement = cnx.prepareStatement(SQL);
		ResultSet result = preparedStatement.executeQuery();
		
		result.next();
		count = result.getInt("number");
		
		return count;
	}
	
	
	
}
