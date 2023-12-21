package org.generation.italy.model.dao;

import java.sql.Connection;

public abstract class ADao {
	Connection connection = null;
	
	public ADao(Connection connetion) {
		this.connection=connetion;
	}
}
