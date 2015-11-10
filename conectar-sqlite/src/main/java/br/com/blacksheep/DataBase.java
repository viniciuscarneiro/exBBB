package br.com.blacksheep;

public abstract class DataBase {

	private String driver;

	private String user;

	private String password;

	private String server;

	private String dataBase;

	public DataBase(String driver, String user, String password, String server, String dataBase) {
		super();
		this.driver = driver;
		this.user = user;
		this.password = password;
		this.server = server;
		this.dataBase = dataBase;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getDataBase() {
		return dataBase;
	}

	public void setDataBase(String dataBase) {
		this.dataBase = dataBase;
	}

	public abstract String getConnectionString();

}
