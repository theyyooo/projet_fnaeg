package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOInfraction {

	
private Connection cnx;
	
	public DAOInfraction(Connection cnx) {
		this.cnx = cnx;
	}
	
	public Infraction find(String Libelle) throws SQLException {
		
		String SQL = "SELECT * FROM Infractions WHERE Libelle=?";
		PreparedStatement preparedStatement = cnx.prepareStatement(SQL);
		preparedStatement.setString(1,Libelle);
		ResultSet result = preparedStatement.executeQuery();
		result.next();
		
		Infraction c = new Infraction()
				.setCodeI(result.getString("CodeI"))
				.setLibelle(result.getString("Libelle"))
				.setNiveau(result.getInt("Niveau"));
				
		
		return c;

	}
	
	
	
	
	
	public void save(Infraction i) throws SQLException {
		String SQL = "INSERT INTO Infractions (CodeI, Libelle, Niveau)"
				+ "VALUES (?, ?, ?)";
		PreparedStatement preparedStatement = cnx.prepareStatement(SQL);
		preparedStatement.setString(1,i.getCodeI());
		preparedStatement.setString(2,i.getLibelle());
		preparedStatement.setInt(3,i.getNiveau());

		
		preparedStatement.executeQuery();
	}
	
	
	public void update(Infraction i) throws SQLException {
		String SQL = "UPDATE Infractions "
				+ "SET CodeI=?, "
				+ "Libelle=?, "
				+ "Niveau=? ";
		
		PreparedStatement preparedStatement = cnx.prepareStatement(SQL);
		preparedStatement.setString(1,i.getCodeI());
		preparedStatement.setString(2,i.getLibelle());
		preparedStatement.setInt(3,i.getNiveau());
		
		
		preparedStatement.executeQuery();
	}
	
	public void delete(Infraction i) throws SQLException {
		
		String SQL = "DELETE FROM Infraction WHERE CodeI=?";
		PreparedStatement preparedStatement = cnx.prepareStatement(SQL);
		preparedStatement.setString(1,i.getCodeI());
		preparedStatement.executeQuery();
		
	}
	
	
	public List<Infraction> findAll() throws SQLException{
		
		String SQL = "SELECT * FROM Infractions";
		PreparedStatement preparedStatement = cnx.prepareStatement(SQL);
		ResultSet result = preparedStatement.executeQuery();
		List<Infraction> infractions = new ArrayList<>();
		
		while (result.next()) {
			Infraction i = new Infraction()
					.setCodeI(result.getString("CodeI"))
					.setLibelle(result.getString("Libelle"))
					.setNiveau(result.getInt("Niveau"));
			
			infractions.add(i);
		}
		
		return infractions;
		
	}
	
	
	
	public int count() throws SQLException {
		int count = 0;
		String SQL = "SELECT COUNT(*) AS number FROM Infractions";
		PreparedStatement preparedStatement = cnx.prepareStatement(SQL);
		ResultSet result = preparedStatement.executeQuery();
		
		result.next();
		count = result.getInt("number");
		
		return count;
	}
	
}
