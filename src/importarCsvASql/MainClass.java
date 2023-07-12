package importarCsvASql;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConeccionDB conex = new ConeccionDB();
		Connection conexion = conex.dameConexion();

		IndicesColumnas indicesColumnas = new IndicesColumnas();
		List<List<String>> leido = indicesColumnas.csvLeido();
		Map<Integer, String> indicesColumnasIndexed = indicesColumnas.devuelveIndices(leido);
		indicesColumnas.getIndices(indicesColumnasIndexed);
	}
}
