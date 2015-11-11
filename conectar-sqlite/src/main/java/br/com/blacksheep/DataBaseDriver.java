package br.com.blacksheep;

public enum DataBaseDriver {

	MYSQL("com.mysql.jdbc.Driver"),
	SQLITE("org.sqlite.JDBC");

	private DataBaseDriver(String driver) {
		this.driver = driver;
	}

	private String driver;

	public String getDriver() {
		return driver;
	}
}
