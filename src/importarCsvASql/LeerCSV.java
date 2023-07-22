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

	public List<String[]> csvEnColumnas(List<String> csvLeido) {
		List<String[]> csvEnColumnas = new ArrayList<>();
		int length = csvLeido.get(0).split(";").length;
		System.out.println("nepe"  + length);
		String[] lineaEnArray = new String [length];
		for (int i = 0; i < csvLeido.size() ; i++) {
			lineaEnArray = csvLeido.get(i).split(";");
			csvEnColumnas.add(lineaEnArray);

//			String[] header = csvEnColumnas.get(0);
//			System.err.println(header [0]);

//			for (String[] x : csvEnColumnas) {

//					System.out.println("resultado del metodo csvEnColumnas: " + x[0] + " " + x[1] + " " + x[2]);
//				System.out.println("espacio");
		}
//		for (int i = 0 ; i < lineaEnArray.length ; i++)
//			System.out.println(csvEnColumnas.get(1)[i]);

//		}
		return csvEnColumnas;
	}
}
