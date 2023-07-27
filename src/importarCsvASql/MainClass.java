package importarCsvASql;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConeccionDB conex = new ConeccionDB();
		Connection conexion = conex.dameConexion();
		
		
		
		Map<Integer, String> devuelveIndicesHeadersDB = conex.devuelveIndicesHeadersDB(conexion);
//		List <String> columnaX = conex.textoEnColumnas(conexion, "Locality");
//		for (String x : columnaX) {
//			System.out.println(x);
//			System.out.println();
//		}
		
				devuelveIndicesHeadersDB.forEach((key, value) -> {

			System.out.println("Llave de valor : " + value + ": \t" + key);
		});
//
//		devuelveIndicesHeadersDB.entrySet().iterator().next().getKey();

		String path = "C:\\Users\\andreabee90\\Downloads\\testPacho2.csv";
		LeerCSV leercsv = new LeerCSV(path);
		List<String> csvLeido = leercsv.seleccionaCSV();

		for (String x : csvLeido) {
			
			System.out.println("lineas dentro del csv leido " + x);
			System.out.println();
		}
		

		if (csvLeido != null) {
			System.out.println("el archivo se ha leido ");
		}

		List<String[]> csvEnColumnas = new ArrayList<>();
		csvEnColumnas = leercsv.csvEnColumnas(csvLeido);
		
		

		IndicesColumnas indicesColumnas = new IndicesColumnas();

		Map<Integer, String> lineasDelInputIndexadas = indicesColumnas.devuelveIndicesDeLineas(csvLeido);

//		for (Map.Entry<Integer, String > element : lineasDelInputIndexadas.entrySet()){
//			Integer x= element.getKey();
//			String x2= element.getValue();
//			System.out.println("key: " + x +" Value: "
//					+ "" + x2);
//			System.out.println("???????????????");
//		}

		Map<Integer, String> indicesHeaders = indicesColumnas.devuelveIndexHeaders(lineasDelInputIndexadas);

		for (Map.Entry<Integer, String> element : indicesHeaders.entrySet()) {
			Integer x = element.getKey();
			String x2 = element.getValue();
			System.out.println("key: " + x +" Value: "
					+ "" + x2);
			System.out.println("???????????????");
		}

		for (String valorMapa1 : devuelveIndicesHeadersDB.values()) {
			// Verifica si el valor del mapa1 existe en algún valor del mapa2
			if (indicesHeaders.containsValue(valorMapa1)) {
				// Si se encuentra, imprime el valor del mapa1
//				System.out.println("Valor encontrado en mapa1: " + valorMapa1);
			}
		}
		
		Integer voucherIndice= indicesColumnas.getIndicesOfVoucher(indicesHeaders);
		System.out.println("indice del voucher: " + voucherIndice);

		Integer colectorIndice = indicesColumnas.getIndicesOfCollector(indicesHeaders);
		System.out.println("indice del colector: " + colectorIndice);
		
		Integer labCodeIndice = indicesColumnas.getIndicesOfLabCode(indicesHeaders);
		System.out.println("indice del labcode: " + labCodeIndice);
		
		Integer epithetIndice = indicesColumnas.getIndicesOfEpithet(indicesHeaders);
		System.out.println("indice del epitheto: " + epithetIndice);
		
		Integer collNumberIndice = indicesColumnas.getIndicesOfCollectorNumber(indicesHeaders);
		System.out.println("indice del coll number: " + collNumberIndice);
		
		Integer BGTIndice = indicesColumnas.getIndicesOfBGT(indicesHeaders);
		System.out.println("indice del BGT: " + BGTIndice);
		
		Integer familyIndice = indicesColumnas.getIndicesOfFamily(indicesHeaders);
		System.out.println("indice del family: " + familyIndice);
		
		Integer genusIndice = indicesColumnas.getIndicesOfGenus(indicesHeaders);
		System.out.println("indice del genus: " + genusIndice);
		
		Integer subgenusIndice = indicesColumnas.getIndicesOfSubgenus(indicesHeaders);
		System.out.println("indice del subgenus: " + subgenusIndice);
		
		Integer countryIndice = indicesColumnas.getIndicesOfCountry(indicesHeaders);
		System.out.println("indice del country: " + countryIndice);
		
		Integer localityIndice = indicesColumnas.getIndicesOfLocality(indicesHeaders);
		System.out.println("indice del locality: " + localityIndice);
		
		Integer collDateIndice = indicesColumnas.getIndicesOfCollDate(indicesHeaders);
		System.out.println("indice del coll Date: " + collDateIndice);
		
		Integer latitudIndice = indicesColumnas.getIndicesOfLatitud(indicesHeaders);
		System.out.println("indice del latitud: " + latitudIndice);

		Integer longitudIndice = indicesColumnas.getIndicesOfLongitude(indicesHeaders);
		System.out.println("indice del longitud: " + longitudIndice);

		Integer altitudIndice = indicesColumnas.getIndicesOfAltitud(indicesHeaders);
		System.out.println("indice del altitud: " + altitudIndice );
		
		Integer tissueAvailableIndice = indicesColumnas.getIndicesOfTissueAvailable(indicesHeaders);
		System.out.println("indice del tissue available: " + tissueAvailableIndice );

		
		List<String> columnaVoucher = indicesColumnas.columnaVoucher(csvEnColumnas, voucherIndice);
		for (String elementoEnColumnaVoucher : columnaVoucher) {
			System.out.println(" elemento en la columna voucher: " + elementoEnColumnaVoucher);
		}
		
		List<String> columnaCollector = indicesColumnas.columnaCollector(csvEnColumnas, colectorIndice);
		for (String elementoEnColumnaCollector: columnaCollector) {
			System.out.println(" elemento en la columna colector: " + elementoEnColumnaCollector);
		}
	
		List<String> columnaLabcode = indicesColumnas.columnaLabCode(csvEnColumnas, labCodeIndice);
		for (String elementoEnColumna: columnaLabcode) {
			System.out.println(" elemento en la columna labcode: " + elementoEnColumna);
		}

		List<String> columnaEpithet = indicesColumnas.columnaEpithet(csvEnColumnas, epithetIndice);
		for (String elementoEnColumna: columnaEpithet) {
			System.out.println(" elemento en la columna epiteto: " + elementoEnColumna);
		}
		
		List<String> columnaCollNumber= indicesColumnas.columnaCollectorNumber(csvEnColumnas, collNumberIndice);
		for (String elementoEnColumna: columnaCollNumber) {
			System.out.println(" elemento en la columna coll number: " + elementoEnColumna);
		}
		
		List<String> columnaBGT= indicesColumnas.columnaBGT(csvEnColumnas, BGTIndice);
		for (String elementoEnColumna: columnaBGT) {
			System.out.println(" elemento en la columna BGT: " + elementoEnColumna);
		}
		
		
		List<String> columnaFamily= indicesColumnas.columnaFamily(csvEnColumnas, familyIndice);
		for (String elementoEnColumna: columnaFamily) {
			System.out.println(" elemento en la columna family: " + elementoEnColumna);
		}
		
		List<String> columnaGenus= indicesColumnas.columnaGenus(csvEnColumnas, genusIndice);
		for (String elementoEnColumna: columnaGenus) {
			System.out.println(" elemento en la columna genus: " + elementoEnColumna);
		}
	
		List<String> columnaSubgenus= indicesColumnas.columnaSubgenus(csvEnColumnas, subgenusIndice);
		for (String elementoEnColumna: columnaSubgenus) {
			System.out.println(" elemento en la columna subgenus: " + elementoEnColumna);
		}
		
		List<String> columnaCountry= indicesColumnas.columnaCountry(csvEnColumnas, countryIndice);
		for (String elementoEnColumna: columnaCountry) {
			System.out.println(" elemento en la columna country: " + elementoEnColumna);
		}
		
		List<String> columnaLocality= indicesColumnas.columnaLocality(csvEnColumnas, localityIndice);
		for (String elementoEnColumna: columnaLocality) {
			System.out.println(" elemento en la columna locality: " + elementoEnColumna);
		}
		
		List<String> columnaAltitud= indicesColumnas.columnaAltitud(csvEnColumnas, altitudIndice);
		for (String elementoEnColumna: columnaAltitud) {
			System.out.println(" elemento en la columna altitud: " + elementoEnColumna);
		}
		
		List<String> columnaCollDate= indicesColumnas.columnaCollDate(csvEnColumnas, collDateIndice);
		for (String elementoEnColumna: columnaCollDate) {
			System.out.println(" elemento en la columna colection date: " + elementoEnColumna);
		}
		
		List<String> columnaLatitud= indicesColumnas.columnaLatitud(csvEnColumnas, latitudIndice);
		for (String elementoEnColumna: columnaLatitud) {
			System.out.println(" elemento en la columna latitud: " + elementoEnColumna);
		}
		
		List<String> columnaLongitud= indicesColumnas.columnaLongitude(csvEnColumnas, longitudIndice);
		for (String elementoEnColumna: columnaLongitud) {
			System.out.println(" elemento en la columna longitud: " + elementoEnColumna);
		}
		
		List<String> columnaTissueAvailable= indicesColumnas.columnaTissueAvailable(csvEnColumnas, tissueAvailableIndice);
		for (String elementoEnColumna: columnaTissueAvailable) {
			System.out.println(" elemento en la columna tissue available: " + elementoEnColumna);
		}
		
		PreparedStat.insertInto(conexion, csvLeido, 
				"UnitID_Specimen", columnaVoucher,
				"CountryName", columnaCountry,
				"Collectors", columnaCollector,
				"CollectionDate", columnaCollDate,
				"CollectorsNo", columnaCollNumber,
				"Locality", columnaLocality,
				"Altitude", columnaAltitud,
				"Longitude", columnaLongitud,
				"Latitude", columnaLatitud, 
				"LabCode", columnaLabcode,
				"TissueID", columnaBGT,
				"TissueAvailable", columnaTissueAvailable);
		
		
		
		
		
//		LeerFasta leerFasta = new LeerFasta();
//		leerFasta.leerFastaFile();
	}
}
