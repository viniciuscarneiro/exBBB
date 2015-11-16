package br.com.blacksheep;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.blacksheep.domain.ConnectionFactory;
import br.com.blacksheep.domain.DataBase;
import br.com.blacksheep.enums.DatabaseEnum;

public class ConectarSQLite {

	public static void main(String[] args) {
		try {
			DataBase dataBase = DatabaseEnum.SQLITE.getDatabase(null, null, "/home/vinicius-brito/Desktop/", "AtendiServidorFotoPadrao.sqlite");

			Connection conn = ConnectionFactory.createConnection(dataBase);

			ResultSet executeQuery = conn.createStatement().executeQuery("select * from CATEGORIAPRODUTO");
			while (executeQuery.next()) {
				System.out.println("Nome:" + executeQuery.getString("nomeCategoria"));
				System.out.println("IMG40:" + executeQuery.getBytes("IMG40"));
				System.out.println("IMG80:" + executeQuery.getBytes("IMG80"));
				System.out.println("IMG120:" + executeQuery.getBytes("IMG120"));
				System.out.println("IMG160" + executeQuery.getBytes("IMG160"));
				System.out.println("IMG240:" + executeQuery.getBytes("IMG240"));
			}
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
