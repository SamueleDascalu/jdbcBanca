package org.generation.italy.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.generation.italy.model.entity.Movimento;

public class MovimentoDao extends ADao {
	
	public MovimentoDao(Connection connection) {
		super(connection);
	}
	
	public List<Movimento> loadMovimentiPrelieviTrovati(String importoParametro) throws SQLException {
		List<Movimento> movimenti = new ArrayList<Movimento>();
		
		String getMovimenti = "SELECT id_movimento, data_ora_operazione, importo, tipo_operazione, iban"
							+ "  FROM movimento"
							+ " WHERE tipo_operazione = 'P'"
							+ "	  AND importo > 550";
		
		PreparedStatement preparedStatement = connection.prepareStatement(getMovimenti);
		//preparedStatement.setString(1, importoParametro);
		
		ResultSet rsSelect = preparedStatement.executeQuery();
		
		while(rsSelect.next()) {
			int idMovimento = rsSelect.getInt("id_movimento");
			if(rsSelect.wasNull()) {
				idMovimento=0;
			}
			
			LocalDate dataOraOperazione = rsSelect.getDate("data_ora_operazione").toLocalDate();
			if(rsSelect.wasNull()) {
				dataOraOperazione=null;
			}
			
			float importo = rsSelect.getFloat("importo");
			if(rsSelect.wasNull()) {
				importo=0;
			}
			
			String tipoOperazione = rsSelect.getString("tipo_operazione");
			if(rsSelect.wasNull()) {
				tipoOperazione="";
			}
			
			String iban = rsSelect.getString("iban");
			if(rsSelect.wasNull()) {
				iban="";
			}
			
			Movimento movimento = new Movimento(idMovimento, dataOraOperazione, importo, tipoOperazione, iban);
			
			movimenti.add(movimento);
		}
		
		return movimenti;
	}
	
}
