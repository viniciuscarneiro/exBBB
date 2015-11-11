package br.com.blacksheep;

public class MySql extends DataBase {

	public MySql(String user, String password, String server, String dataBase) {
		super(DataBaseDriver.MYSQL.getDriver(), user, password, server, dataBase);
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
