package br.com.blacksheep;

import org.sqlite.JDBC;

public class SQLite extends DataBase {

	public SQLite(String driver, String user, String password, String server, String dataBase) {
		super(driver, user, password, server, dataBase);
	}

	@Override
	public String getConnectionString() {
		return String.format("%s%s/%s", JDBC.PREFIX, super.getServer(), super.getDataBase());
	}

}
