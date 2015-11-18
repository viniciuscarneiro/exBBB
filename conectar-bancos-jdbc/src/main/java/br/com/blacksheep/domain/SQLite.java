package br.com.blacksheep.domain;

import org.sqlite.JDBC;

import br.com.blacksheep.enums.DatabaseTypeEnum;

public class SQLite extends DataBase {

	public SQLite(String user, String password, String server, String dataBase, DatabaseTypeEnum dataBaseEnum) {
		super(DatabaseTypeEnum.SQLITE.getDriver(), user, password, server, dataBase);
	}

	@Override
	public String getConnectionString() {
		return String.format("%s%s/%s", JDBC.PREFIX, super.getServer(), super.getDataBase());
	}

}
