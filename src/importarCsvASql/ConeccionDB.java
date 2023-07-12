package importarCsvASql;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConeccionDB {
	Connection conex;

	public ConeccionDB() {

	}

	public Connection dameConexion() {
		try {
			conex = DriverManager.getConnection("jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7623827", "sql7623827",
					"akYVms4umE");
		} catch (Exception e) {

			e.getMessage();
		}
		return conex;
	}
}
