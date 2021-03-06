package br.com.blacksheep;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import br.com.blacksheep.domain.ConnectionFactory;
import br.com.blacksheep.domain.DataBase;
import br.com.blacksheep.enums.DatabaseTypeEnum;

public class ConectarGenerico {

	public static void main(String[] args) {
		try {
			DataBase dataBase = DatabaseTypeEnum.MYSQL.getDatabase("root", "root", "localhost:3306", "atendi");

			Connection conn = ConnectionFactory.createConnection(dataBase);

			String query = "SELECT * FROM CATEGORIA_PRODUTO";
			Statement st = conn.createStatement();
			ResultSet executedQuery = st.executeQuery(query);
			while (executedQuery.next()) {
				System.out.println("Nome:" + executedQuery.getString("NOME_CATEGORIA"));
				System.out.println("IMG40:" + executedQuery.getBytes("IMG40"));
				System.out.println("IMG80:" + executedQuery.getBytes("IMG80"));
				System.out.println("IMG120:" + executedQuery.getBytes("IMG120"));
				System.out.println("IMG160" + executedQuery.getBytes("IMG160"));
				System.out.println("IMG240:" + executedQuery.getBytes("IMG240"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
