package importarCsvASql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class PreparedStat {

	public static void insertInto(Connection coneccion, List<String> csvLeido, 
			String UnitID_Specimen, List<String> columnaVoucher, 
			String CountryName, List<String> columnaCountry, 
			String Collectors, List<String> columnaCollector, 
			String CollectionDate, List<String> columnaCollDate, 
			String CollectorsNo, List<String> columnaCollNumber, 
			String Locality, List<String> columnaLocality, 
			String Altitude, List<String> columnaAltitud, 
			String Longitude, List<String> columnaLongitud, 
			String Latitude, List<String> columnaLatitud, 
			String LabCode, List<String> columnaLabcode, 
			String TissueID, List<String> columnaBGT,  
			String TissueAvailable, List<String> columnaTissueAvailable) {

		String firstPart = "INSERT INTO cachecollection ";
		String preparedStatFull = firstPart + "(" + 
		
				UnitID_Specimen + "," + 
				CountryName + "," + 
				Collectors + "," + 
				CollectionDate + "," + 
				CollectorsNo + "," + 
				Locality + "," + 
				Altitude + "," + 
				Longitude + "," + 
				Latitude + "," + 
				LabCode + "," + 
				TissueID + "," + 
				TissueAvailable + ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?);";

		try {
	
			PreparedStatement miStatement = coneccion.prepareStatement(preparedStatFull);
			for (int i = 1; i < csvLeido.size(); i++) {
				miStatement.setString(1, columnaVoucher.get(i));
				miStatement.setString(2, columnaCountry.get(i));
				miStatement.setString(3, columnaCollector.get(i));
				miStatement.setString(4, columnaCollDate.get(i));
				miStatement.setString(5, columnaCollNumber.get(i));
				miStatement.setString(6, columnaLocality.get(i));
				miStatement.setString(7, columnaAltitud.get(i));
				miStatement.setString(8, columnaLongitud.get(i));
				miStatement.setString(9, columnaLatitud.get(i));
				miStatement.setString(10, columnaLabcode.get(i));
				miStatement.setString(11, columnaBGT.get(i));
				miStatement.setString(12, columnaTissueAvailable.get(i));
								
				miStatement.executeUpdate();
				
				System.out.println("SI!!!!!!!!!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("NO!!! :((((( ");
		}

	}
}
