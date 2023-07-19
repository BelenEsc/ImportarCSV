package importarCsvASql;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.FileVisitResult;

public class LeerFasta {

	String pathFasta = "C:\\Users\\andreabee90\\Downloads\\fasta.nex ";

	public FileReader leerFastaFile() {
		FileReader leerFasta = null;
		try {
			
			leerFasta = new FileReader(new File(pathFasta));
			BufferedReader bufferFasta = new BufferedReader(leerFasta);
			String line = null;
			while ((line = bufferFasta.readLine()) != null) {
				String linea = line;
//				System.out.println(linea);		
				
			}
		} catch (Exception e) {

		}
		return leerFasta;
	}

}
