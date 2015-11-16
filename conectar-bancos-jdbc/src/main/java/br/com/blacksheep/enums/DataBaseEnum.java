package br.com.blacksheep.enums;

public enum DataBaseEnum {

	MYSQL("com.mysql.jdbc.Driver"),
	SQLITE("org.sqlite.JDBC");

	private DataBaseEnum(String driver) {
		this.driver = driver;
	}

	private String driver;

	public String getDriver() {
		return driver;
	}
}
