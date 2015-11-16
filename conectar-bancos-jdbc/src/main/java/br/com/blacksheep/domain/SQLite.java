package br.com.blacksheep.domain;

import org.sqlite.JDBC;

import br.com.blacksheep.enums.DatabaseEnum;

public class SQLite extends DataBase {

	public SQLite(String user, String password, String server, String dataBase, DatabaseEnum dataBaseEnum) {
		super(DatabaseEnum.SQLITE.getDriver(), user, password, server, dataBase);
	}

	@Override
	public String getConnectionString() {
		return String.format("%s%s/%s", JDBC.PREFIX, super.getServer(), super.getDataBase());
	}

}
