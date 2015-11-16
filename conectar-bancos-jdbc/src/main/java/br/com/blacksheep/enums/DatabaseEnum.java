package br.com.blacksheep.enums;

import br.com.blacksheep.domain.DataBase;
import br.com.blacksheep.domain.MySql;
import br.com.blacksheep.domain.SQLite;

public enum DatabaseEnum {

	MYSQL("com.mysql.jdbc.Driver") {
		@Override
		public DataBase getDatabase(String user, String password, String server, String dataBase) {
			return new MySql(user, password, server, dataBase, this);
		}
	},
	SQLITE("org.sqlite.JDBC") {
		@Override
		public DataBase getDatabase(String user, String password, String server, String dataBase) {
			return new SQLite(user, password, server, dataBase, this);
		}
	};

	private DatabaseEnum(String driver) {
		this.driver = driver;
	}

	public abstract DataBase getDatabase(String user, String password, String server, String dataBase);

	private String driver;

	public String getDriver() {
		return driver;
	}

}
