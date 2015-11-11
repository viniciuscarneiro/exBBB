package br.com.blacksheep;

import org.sqlite.JDBC;

public class SQLite extends DataBase {

	public final static DataBaseDriver DRIVER = DataBaseDriver.SQLITE;

	public SQLite(String user, String password, String server, String dataBase) {
		super(SQLite.DRIVER.getDriver(), user, password, server, dataBase);
	}

	@Override
	public String getConnectionString() {
		return String.format("%s%s/%s", JDBC.PREFIX, super.getServer(), super.getDataBase());
	}

}
