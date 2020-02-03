package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOAffaire {
	
	Connection cnx;
	
	public DAOAffaire(Connection cnx) {
		this.cnx = cnx;
	}
	
	
	
	public Affaire find(String NumAffaire) throws SQLException {
		
		String SQL = "SELECT * FROM Affaires WHERE NumAffaire=?";
		PreparedStatement preparedStatement = cnx.prepareStatement(SQL);
		preparedStatement.setString(1,NumAffaire);
		ResultSet result = preparedStatement.executeQuery();
		result.next();
		
		Affaire c = new Affaire()
				.setNumAffaire(result.getString("NumAffaire"))
				.setDescription(result.getString("Description"));
				
		
		return c;

	}
	
	
	
	
	
	public void save(Affaire i) throws SQLException {
		String SQL = "INSERT INTO Affaires (NumAffaire, Description)"
				+ "VALUES (?, ?)";
		PreparedStatement preparedStatement = cnx.prepareStatement(SQL);
		preparedStatement.setString(1,i.getNumAffaire());
		preparedStatement.setString(2,i.getDescription());

		
		preparedStatement.executeQuery();
	}
	
	
	
	
	
	public void update(Affaire i) throws SQLException {
		String SQL = "UPDATE Affaire "
				+ "SET NumAffaire=?, "
				+ "DateAffaire=?, "
				+ "Description=? ";
		
		PreparedStatement preparedStatement = cnx.prepareStatement(SQL);
		preparedStatement.setString(1,i.getNumAffaire());
		preparedStatement.setString(3,i.getDescription());
		
		
		preparedStatement.executeQuery();
	}
	
	
	
	public void delete(Affaire i) throws SQLException {
		
		String SQL = "DELETE FROM Affaires WHERE NumAffaire=?";
		PreparedStatement preparedStatement = cnx.prepareStatement(SQL);
		preparedStatement.setString(1,i.getNumAffaire());
		preparedStatement.executeQuery();
		
	}
	
	
	
	
	public List<Affaire> findAll() throws SQLException{
		
		String SQL = "SELECT * FROM Affaire";
		PreparedStatement preparedStatement = cnx.prepareStatement(SQL);
		ResultSet result = preparedStatement.executeQuery();
		List<Affaire> affaires = new ArrayList<>();
		
		while (result.next()) {
			Affaire i = new Affaire()
					.setNumAffaire(result.getString("NumAffaire"))
					.setDescription(result.getString("Description"));
			
			affaires.add(i);
		}
		
		return affaires;
		
	}
	
	
	public int count() throws SQLException {
		int count = 0;
		String SQL = "SELECT COUNT(*) AS number FROM Affaires";
		PreparedStatement preparedStatement = cnx.prepareStatement(SQL);
		ResultSet result = preparedStatement.executeQuery();
		
		result.next();
		count = result.getInt("number");
		
		return count;
	}

}
