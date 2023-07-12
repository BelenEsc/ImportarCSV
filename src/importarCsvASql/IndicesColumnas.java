package importarCsvASql;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndicesColumnas {

	public IndicesColumnas() {


	}

	public List<List<String>> csvLeido() {
		String path = "C:\\Users\\belen\\Documents\\productos.csv";
		LeerCSV leerCSVx = new LeerCSV(path);
		List<List<String>> leido = leerCSVx.seleccionaCSV();
		return leido;
	}

	public void getIndices(Map<Integer, String> indicesColumnas) {
		for (Map.Entry<Integer, String> entry : indicesColumnas.entrySet()) {
			Integer k = entry.getKey();
			String v = entry.getValue();
			System.out.println("Key: " + k + ", Value: " + v);
		}
	}

	public Map<Integer, String> devuelveIndices(List<List<String>> leido) {
		int columnas = leido.get(0).size();
		Map<Integer, String> indicesColumnas = new HashMap<>();
		for (int i = 0; i < columnas; i++) {
			String ke = leido.get(0).get(i);
			indicesColumnas.put(i, ke);
		}
		return indicesColumnas;
	}

}
