package com.opencart.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.jdbc.Work;

public class DataImporter extends GenericDaoImpl {


    public DataImporter() {
    	super();
    }
    
    public static void main(String[] s) throws Exception {
    	DataImporter export = new DataImporter();
//    	export.exportTable(Paths.get("./category.csv"), "oc_category");
//    	export.exportTable(Paths.get("./product.csv"), "oc_product");
    	
    	System.exit(0);
    }
    
	public void importTable(Path inputDir, String tableName) throws Exception {
		Session session = em.unwrap(Session.class);
		session.doWork(new Work() {
			@Override
			public void execute(Connection connection) throws SQLException {				
				importData(connection, inputDir, tableName);
			}
		});
		
	}
	
	private void importData(Connection connection, Path inputDir, String tableName) {
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			File mapFile = new File(inputDir.toFile(), tableName + "_map.csv");
			
			Map<String, String> columns = DAOUtils.readProperties(mapFile);
			
			String query = "select * from " + tableName;
			
			String updateStr = "update " + tableName + " set ";
			
			stmt = connection.prepareStatement(updateStr);
			rs = stmt.executeQuery(query);
			
			ResultSetMetaData metadata = rs.getMetaData();
			int columnCount = metadata.getColumnCount();
			String[] columnTypes = new String[columnCount+1];
			
			StringBuilder row = new StringBuilder();
			
			for (int i = 1; i <= columnCount; i++) {
				row.append(metadata.getColumnName(i) + ", ");
				columnTypes[i] = metadata.getColumnTypeName(i);
				System.out.println(columnTypes[i]);
			}
	
			
			System.out.println();
			while (rs.next()) {
			    row = new StringBuilder();
			    for (int i = 1; i <= columnCount; i++) {
			    	Object val = rs.getObject(i);
			    	
			    	row.append(mapToString(columnTypes[i], val)).append(", ");          
			    }
			    System.out.println();

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				
			} catch (Exception ignored) {}
		}
	}
	
	private static String generateUpdateStr(Map<String, String> map, String tableName) {
		StringBuilder builder = new StringBuilder("update " + tableName );
		builder.append(tableName + " ");
		return builder.toString();
	}
	
	private static String mapToString(String dataType, Object value) {
		if (null == value) return null;
		if ("DATETIME".equals(dataType)) {
			java.sql.Timestamp t = (java.sql.Timestamp)value;
			return String.valueOf(t.getTime());
		}
		return String.valueOf(value);
	}
	
}
