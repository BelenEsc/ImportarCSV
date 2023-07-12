package importarCsvASql;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeerCSV {
	String path;

	public LeerCSV(String path) {
		this.path = path;
	}

	public List<List<String>> seleccionaCSV() {
		List<List<String>> records = new ArrayList<List<String>>();
		FileReader leerCSV = null;
		String line;
		try {
			leerCSV = new FileReader(new File(path));
			BufferedReader buffer = new BufferedReader(leerCSV);
			while ((line = buffer.readLine()) != null) {
				String[] values = line.split(";");
				records.add(Arrays.asList(values));

			}
		} catch (Exception e) {
			System.out.println("no se pudo leer el archivo " + e.getMessage());
		}
		return records;
	}

}
