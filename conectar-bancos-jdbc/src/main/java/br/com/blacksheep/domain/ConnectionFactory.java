package br.com.blacksheep.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConnectionFactory {

	public static Connection createConnection(DataBase dataBase) throws ClassNotFoundException, SQLException {
		Class.forName(dataBase.getDriver());
		return DriverManager.getConnection(dataBase.getConnectionString(), dataBase.getUser(), dataBase.getPassword());
	}
}
