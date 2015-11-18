package br.com.blacksheep.domain;

import br.com.blacksheep.enums.DatabaseTypeEnum;

public class MySql extends DataBase {

	public MySql(String user, String password, String server, String dataBase, DatabaseTypeEnum dataBaseEnum) {
		super(dataBaseEnum.getDriver(), user, password, server, dataBase);
	}

	private final String url = "jdbc:mysql://";

	public String getUrl() {
		return url;
	}

	@Override
	public String getConnectionString() {
		return String.format("%s%s/%s", url, super.getServer(), super.getDataBase());
	}
}
