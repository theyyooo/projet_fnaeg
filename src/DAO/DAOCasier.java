package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DAOCasier {
	
	Connection cnx;
	
	public DAOCasier(Connection cnx) {
		this.cnx = cnx;
	}
	
	public Casier find(String Matricule, String CodeI) throws SQLException {
		
		String SQL = "SELECT * FROM Casiers WHERE Matricule=? AND CodeI = ?";
		PreparedStatement preparedStatement = cnx.prepareStatement(SQL);
		preparedStatement.setString(1,Matricule);
		preparedStatement.setString(2,CodeI);
		ResultSet result = preparedStatement.executeQuery();
		result.next();
		
		Casier c = new Casier()
				.setMatricule(result.getString("Matricule"))
				.setCodeI(result.getString("CodeI"))
				.setDateI(result.getDate("DateI"))
				.setDescription(result.getString("Description"))
				.setPays(result.getString("Pays"))
				.setVille(result.getString("Ville"))
				.setNumAffaire(result.getString("NumAffaire"))
				
				;
				
		
		return c;

	}
	
	
	
	
	public void save(Casier i) throws SQLException {
		String SQL = "INSERT INTO Casiers (Matricule, CodeI, DateI, Description, Pays, Ville, NumAffaire)"
				+ "VALUES (?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement preparedStatement = cnx.prepareStatement(SQL);
		preparedStatement.setString(1,i.getMatricule());
		preparedStatement.setString(2,i.getCodeI());
		preparedStatement.setDate(3,(java.sql.Date) i.getDateI());
		preparedStatement.setString(4,i.getDescription());
		preparedStatement.setString(5,i.getPays());
		preparedStatement.setString(6,i.getVille());
		preparedStatement.setString(7,i.getNumAffaire());
		
		
		preparedStatement.executeQuery();
	}
	
	
	public void update(Casier i) throws SQLException {
		String SQL = "UPDATE Casiers "
				+ "SET Matricule=?, "
				+ "CodeI=?, "
				+ "DateI=? "
				+ "Description=? "
				+ "Pays=? "
				+ "Ville=? "
				+ "NumAffaire=? "
				+ "WHERE Matricule=?"
				+ "AND CodeI=?";
		PreparedStatement preparedStatement = cnx.prepareStatement(SQL);
		preparedStatement.setString(1,i.getMatricule());
		preparedStatement.setString(2,i.getCodeI());
		preparedStatement.setDate(3,(java.sql.Date) i.getDateI());
		preparedStatement.setString(4,i.getDescription());
		preparedStatement.setString(5,i.getPays());
		preparedStatement.setString(6,i.getVille());
		preparedStatement.setString(7,i.getNumAffaire());
		
		preparedStatement.executeQuery();
	}
	
	
	
	
	
	
	public void delete(Casier i) throws SQLException {
		
		String SQL = "DELETE FROM Casier WHERE Matricule=? AND CodeI = ?";
		PreparedStatement preparedStatement = cnx.prepareStatement(SQL);
		preparedStatement.setString(1,i.getMatricule());
		preparedStatement.setString(2,i.getCodeI());
		preparedStatement.executeQuery();
		
	}
	
	
	
	
	public List<Casier> findAll() throws SQLException{
		
		String SQL = "SELECT * FROM Casiers";
		PreparedStatement preparedStatement = cnx.prepareStatement(SQL);
		ResultSet result = preparedStatement.executeQuery();
		List<Casier> casiers = new ArrayList<>();
		
		while (result.next()) {
			Casier i = new Casier()
					.setMatricule(result.getString("Matricule"))
					.setCodeI(result.getString("CodeI"))
					.setDateI(result.getDate("DateI"))
					.setDescription(result.getString("Description"))
					.setPays(result.getString("Pays"))
					.setVille(result.getString("Ville"))
					.setNumAffaire(result.getString("NumAffaire"));
			
			casiers.add(i);
		}
		
		return casiers;
		
	}
	
	
	
	public int count() throws SQLException {
		int count = 0;
		String SQL = "SELECT COUNT(*) AS number FROM Casiers";
		PreparedStatement preparedStatement = cnx.prepareStatement(SQL);
		ResultSet result = preparedStatement.executeQuery();
		
		result.next();
		count = result.getInt("number");
		
		return count;
	}

}
