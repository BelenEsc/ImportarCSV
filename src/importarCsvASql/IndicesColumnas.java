package importarCsvASql;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndicesColumnas {

	public IndicesColumnas() {

	}

	public Map<Integer, String> devuelveIndicesDeLineas(List<String> leido) {
		int columnas = leido.size();
		System.out.println("tamanio de leido " + columnas);
		Map<Integer, String> indicesColumnas = new HashMap<>();
		for (int i = 0; i < columnas; i++) {
			String ke = leido.get(i);
			indicesColumnas.put(i, ke);
//			System.out.println("Salida del metodo devuelveIndices: Key : " + i + " value: " + ke);
		}
		return indicesColumnas;
	}

	public Map<Integer, String> devuelveIndexHeaders(Map<Integer, String> lineasIndexadas) {
		int columnas = lineasIndexadas.entrySet().iterator().next().getValue().split(";").length;
		Map<Integer, String> indicesHeaders = new HashMap<>();
		for (int i = 0; i < columnas; i++) {
			String ke = lineasIndexadas.entrySet().iterator().next().getValue().split(";")[i];

			indicesHeaders.put(i, ke);
//			System.out.println("Resultado de devuelveindexHeaders. key: " + i + " value: " + ke );
		}
		return indicesHeaders;
	}

	public Integer getIndicesOfVoucher(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "Voucher");
		return indice;
	}
	
	public List<String> columnaVoucher ( List<String[]> csvEnColumnas, Integer index){
		List <String> columnaVoucherx = new ArrayList<>();
		for (String [] columnaIndiceVoucher : csvEnColumnas) {
			columnaVoucherx.add(columnaIndiceVoucher[index]);
		}
		return columnaVoucherx;
	}

	public Integer getIndicesOfCollector(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "Collectors");
		return indice;
	}
	
	public List<String> columnaCollector ( List<String[]> csvEnColumnas, Integer index){
		List <String> columnaCollectorX= new ArrayList<>();
		for (String [] columnaIndiceCollector: csvEnColumnas) {
			columnaCollectorX.add(columnaIndiceCollector[index]);
		}
		return columnaCollectorX;
	}
	
	public Integer getIndicesOfLabCode(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "LabCode");
		return indice;
	}
	
	public List<String> columnaLabCode( List<String[]> csvEnColumnas, Integer index){
		List <String> columnaLabCodeX= new ArrayList<>();
		for (String [] columnaIndiceLabCode: csvEnColumnas) {
			columnaLabCodeX.add(columnaIndiceLabCode[index]);
		}
		return columnaLabCodeX;
	}
	
	public Integer getIndicesOfEpithet(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "Specific Epithet");
		return indice;
	}
	
	public List<String> columnaEpithet( List<String[]> csvEnColumnas, Integer index){
		List <String> columnaEpithetX= new ArrayList<>();
		for (String [] columnaIndiceEpithet: csvEnColumnas) {
			columnaEpithetX.add(columnaIndiceEpithet[index]);
		}
		return columnaEpithetX;
	}
	
	public Integer getIndicesOfCollectorNumber(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "Collector's No");
		return indice;
	}
	
	public List<String> columnaCollectorNumber( List<String[]> csvEnColumnas, Integer index){
		List <String> columnaCollectorNumberX= new ArrayList<>();
		for (String [] columnaIndiceCollectorNumber: csvEnColumnas) {
			columnaCollectorNumberX.add(columnaIndiceCollectorNumber[index]);
		}
		return columnaCollectorNumberX;
	}
	
	public Integer getIndicesOfBGT(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "Tissue ID");
		return indice;
	}
	
	public List<String> columnaBGT( List<String[]> csvEnColumnas, Integer index){
		List <String> columnaBGTx= new ArrayList<>();
		for (String [] columnaIndiceBGT: csvEnColumnas) {
			columnaBGTx.add(columnaIndiceBGT[index]);
		}
		return columnaBGTx;
	}
	
	public Integer getIndicesOfFamily(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "Family");
		return indice;
	}
	
	public List<String> columnaFamily( List<String[]> csvEnColumnas, Integer index){
		List <String> columnaFamilyX= new ArrayList<>();
		for (String [] columnaIndiceFamily: csvEnColumnas) {
			columnaFamilyX.add(columnaIndiceFamily[index]);
		}
		return columnaFamilyX;
	}
	
	public Integer getIndicesOfGenus(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "Genus");
		return indice;
	}
	
	public List<String> columnaGenus( List<String[]> csvEnColumnas, Integer index){
		List <String> columnaGenusX= new ArrayList<>();
		for (String [] columnaIndiceGenus: csvEnColumnas) {
			columnaGenusX.add(columnaIndiceGenus[index]);
		}
		return columnaGenusX;
	}
	
	public Integer getIndicesOfSubgenus(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "Subgenus");
		return indice;
	}
	
	public List<String> columnaSubgenus( List<String[]> csvEnColumnas, Integer index){
		List <String> columnaSubgenusX= new ArrayList<>();
		for (String [] columnaIndiceSubgenus: csvEnColumnas) {
			columnaSubgenusX.add(columnaIndiceSubgenus[index]);
		}
		return columnaSubgenusX;
	}
	
	public Integer getIndicesOfCountry(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "CountryName");
		return indice;
	}
	
	public List<String> columnaCountry( List<String[]> csvEnColumnas, Integer index){
		List <String> columnaCountryX= new ArrayList<>();
		for (String [] columnaIndiceCountry: csvEnColumnas) {
			columnaCountryX.add(columnaIndiceCountry[index]);
		}
		return columnaCountryX;
	}
	
	public Integer getIndicesOfLocality(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "Locality");
		return indice;
	}
	
	public List<String> columnaLocality( List<String[]> csvEnColumnas, Integer index){
		List <String> columnaLocalityX= new ArrayList<>();
		for (String [] columnaIndiceLocality: csvEnColumnas) {
			columnaLocalityX.add(columnaIndiceLocality[index]);
		}
		return columnaLocalityX;
	}
	
	public Integer getIndicesOfAltitud(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "Raw Data Altitude");
		return indice;
	}
	
	public List<String> columnaAltitud( List<String[]> csvEnColumnas, Integer index){
		List <String> columnaAltitudX= new ArrayList<>();
		for (String [] columnaIndiceAltitud: csvEnColumnas) {
			columnaAltitudX.add(columnaIndiceAltitud[index]);
		}
		return columnaAltitudX;
	}
	
	public Integer getIndicesOfCollDate(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "Collection Date from");
		return indice;
	}
	
	public List<String> columnaCollDate( List<String[]> csvEnColumnas, Integer index){
		List <String> columnaCollDateX= new ArrayList<>();
		for (String [] columnaIndiceCollDate: csvEnColumnas) {
			columnaCollDateX.add(columnaIndiceCollDate[index]);
		}
		return columnaCollDateX;
	}
	
	public Integer getIndicesOfLatitud(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "Latitude");
		return indice;
	}
	
	public List<String> columnaLatitud( List<String[]> csvEnColumnas, Integer index){
		List <String> columnaLatitudX= new ArrayList<>();
		for (String [] columnaIndiceLatitud: csvEnColumnas) {
			columnaLatitudX.add(columnaIndiceLatitud[index]);
		}
		return columnaLatitudX;
	}
	
	public Integer getIndicesOfLongitude(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "Longitude");
		return indice;
	}
	
	public List<String> columnaLongitude( List<String[]> csvEnColumnas, Integer index){
		List <String> columnaLongitudeX= new ArrayList<>();
		for (String [] columnaIndiceLongitud: csvEnColumnas) {
			columnaLongitudeX.add(columnaIndiceLongitud[index]);
		}
		return columnaLongitudeX;
	}
	
	public Integer getIndicesOfTissueAvailable(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "Tissue Availability");
		return indice;
	}
	
	public List<String> columnaTissueAvailable( List<String[]> csvEnColumnas, Integer index){
		List <String> columnaLTissueAvailableX= new ArrayList<>();
		for (String [] columnaIndiceTissueAvailable: csvEnColumnas) {
			columnaLTissueAvailableX.add(columnaIndiceTissueAvailable[index]);
		}
		return columnaLTissueAvailableX;
	}
	
	
//	public Integer getIndicesOfLabCode(Map<Integer, String> indicesColumnas) {
//		Integer indice = getIndexOf(indicesColumnas, "labCode");
//		return indice;
//	}
//	public Integer getIndicesOfLabCode(Map<Integer, String> indicesColumnas) {
//		Integer indice = getIndexOf(indicesColumnas, "labCode");
//		return indice;
//	}
	
	private Integer getIndexOf(Map<Integer, String> indicesColumnas, String celda) {
		Integer indice = 0;
		for (Map.Entry<Integer, String> entry : indicesColumnas.entrySet()) {
			Integer k = entry.getKey();
			String v = entry.getValue();

			if (v.equals(celda)) {
				indice = k;
			}
		}
		return indice;
	}
}
