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

	public List<String> seleccionaCSV() {
		List<String> records = new ArrayList<String>();
		FileReader leerCSV = null;
		String line;
		try {
			leerCSV = new FileReader(new File(path));
			BufferedReader buffer = new BufferedReader(leerCSV);
			while ((line = buffer.readLine()) != null) {
				String values = line;
				records.add(values);

//				System.out.println(values);
//				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("no se pudo leer el archivo csv" + e.getMessage());
		}
		return records;
	}

}
