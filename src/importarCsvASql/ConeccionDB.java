package importarCsvASql;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConeccionDB {
	String tableName = "cachecollection"; // Replace with the name of your table
	Connection conex;

	public ConeccionDB() {

	}

	public Connection dameConexion() {
		try {
			conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/dnabank", "root", "");

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		return conex;
	}

	public Map<Integer, String> devuelveIndexHeaders(Map<Integer, String> lineasIndexadas) {
		int columnas = lineasIndexadas.size();
		Map<Integer, String> indicesHeaders = new HashMap<>();
		for (int i = 0; i < columnas; i++) {
			String ke = lineasIndexadas.entrySet().iterator().next().getValue().split(";")[i];

			indicesHeaders.put(i, ke);
			System.out.println("Resultado de devuelveindexHeaders. key: " + i + " value: " + ke);
		}
		return indicesHeaders;
	}

	public Map<Integer, String> devuelveIndicesHeadersDB(Connection conex) {
		String nameHeaders = "COLUMN_NAME";

		Map<Integer, String> indicesHeadersDB = new HashMap<>();
		DatabaseMetaData metaData;
		try {
			metaData = conex.getMetaData();
			ResultSet columnsResultSet = metaData.getColumns(null, null, tableName, null);
			int key = 0;
			while (columnsResultSet.next()) {
				String columnName = columnsResultSet.getString(nameHeaders);
				indicesHeadersDB.put(key, columnName);
				key++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return indicesHeadersDB;
	}

	public List<String> textoEnColumnas(Connection conex, String nombreColumna) {
		String statementColumna1 = "SELECT " + nombreColumna + " FROM " + tableName;
		List<String> columnaX = new ArrayList<>();
		Statement miStatement;
		String linea;
		try {
			miStatement = conex.createStatement();
			ResultSet rs = miStatement.executeQuery(statementColumna1);
			while (rs.next()) {
				linea = rs.getString(1);
				columnaX.add(linea);
//			System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return columnaX;
	}

}
