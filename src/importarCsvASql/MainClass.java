package importarCsvASql;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConeccionDB conex = new ConeccionDB();
		Connection conexion = conex.dameConexion();
		
		String path = "C:\\Users\\andreabee90\\Downloads\\specimens_download.csv";
		LeerCSV leercsv = new LeerCSV(path);
		List<String> leido = leercsv.seleccionaCSV();
		
		
//		for (String x : leido) {
//			
//			System.out.println("lineas dentro del csv leido " + x);
//			System.out.println();
//		}
//		
//
//		if (leido != null) {
//			System.out.println("el archivo se ha leido ");
//		}
		
		
		IndicesColumnas indicesColumnas = new IndicesColumnas();
		Map<Integer, String> lineasDelInputIndexadas = indicesColumnas.devuelveIndicesDeLineas(leido);
		
		
//		for (Map.Entry<Integer, String > element : lineasDelInputIndexadas.entrySet()){
//			Integer x= element.getKey();
//			String x2= element.getValue();
//			System.out.println("key: " + x +" Value: "
//					+ "" + x2);
//			System.out.println("???????????????");
//		}

		Map<Integer, String> indicesHeaders= indicesColumnas.devuelveIndexHeaders(lineasDelInputIndexadas);
		
		for (Map.Entry<Integer, String > element : indicesHeaders.entrySet()){
			Integer x= element.getKey();
			String x2= element.getValue();
			System.out.println("key: " + x +" Value: "
					+ "" + x2);
			System.out.println("???????????????");
		}
		
		
		Integer labCodeIndice = indicesColumnas.getIndicesOfLabCode(indicesHeaders);
		System.out.println("indice del labcode: " + labCodeIndice);
//
//		LeerFasta leerFasta = new LeerFasta();
//		leerFasta.leerFastaFile();
	}
}
