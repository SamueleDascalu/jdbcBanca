package org.generation.italy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.generation.italy.model.dao.MovimentoDao;
import org.generation.italy.model.entity.Movimento;

public class JdbcBancaMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String dbName = "banca";
		String jdbcUsername = "root";
		String jdbcPassword = "";
		String jdbcUrl = "jdbc:mariadb://localhost:3306/"+dbName;
		
		Connection jdbcConnection = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);
		
		System.out.println("Connessione al db "+dbName+" riuscita");
		
		MovimentoDao movimentoDao = new MovimentoDao(jdbcConnection);
		
		List<Movimento> movimenti = movimentoDao.loadMovimentiPrelieviTrovati("550");
		
		if(movimenti != null) {
			for(Movimento m:movimenti) {
				System.out.println(m.toString());
			}
		} else {
			System.out.println("Nessun movimento trovato");
		}
	}

}
