package importarCsvASql;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndicesColumnas {

	public IndicesColumnas() {

	}

	public Map<Integer, String> devuelveIndicesDeLineas(List<String> leido) {
		int columnas = leido.size();
		Map<Integer, String> indicesColumnas = new HashMap<>();
		for (int i = 0; i < columnas; i++) {
			String ke = leido.get(i);
			indicesColumnas.put(i, ke);
			System.out.println("Salida del metodo devuelveIndices: Key : " + i + " value: " + ke);
		}
		return indicesColumnas;
	}

	public Map<Integer, String> devuelveIndexHeaders(Map<Integer, String> lineasIndexadas) {
		int columnas = lineasIndexadas.size();
		Map<Integer, String> indicesHeaders = new HashMap<>();
		for (int i = 0; i < columnas; i++) {
			String ke = lineasIndexadas.entrySet().iterator().next().getValue().split(",")[i];

			indicesHeaders.put(i, ke);
			System.out.println("Resultado de devuelveindexHeaders. key: " + i + " value: " + ke );
		}
		return indicesHeaders;
	}

	public Integer getIndicesOfVoucher(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "voucher");
		return indice;
	}

	public Integer getIndicesOfCollector(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "Collector");
		return indice;
	}
	public Integer getIndicesOfLabCode(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "labCode");
		return indice;
	}
	public Integer getIndicesOfEpithet(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "SpeciesName");
		return indice;
	}
	public Integer getIndicesOfCollectorNumber(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "CollectionNumber");
		return indice;
	}
	public Integer getIndicesOfBGT(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "B_GT");
		return indice;
	}
	public Integer getIndicesOfFamily(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "Family");
		return indice;
	}
	public Integer getIndicesOfGenus(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "Genus");
		return indice;
	}
	public Integer getIndicesOfSubgenus(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "Subgenus");
		return indice;
	}
	public Integer getIndicesOfCountry(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "Country");
		return indice;
	}
	public Integer getIndicesOfLocality(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "Locality");
		return indice;
	}
	public Integer getIndicesOfCollDate(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "CollDate");
		return indice;
	}
	public Integer getIndicesOfLatitud(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "Latitud");
		return indice;
	}
	public Integer getIndicesOfLongitude(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "Longitude");
		return indice;
	}
	public Integer getIndicesOfTissueAvailable(Map<Integer, String> indicesColumnas) {
		Integer indice = getIndexOf(indicesColumnas, "TissueAvailable");
		return indice;
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

			if (v.contains(celda)) {
				indice = k;
			}
		}
		return indice;
	}
}
