package com.opencart.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.Session;
import org.hibernate.jdbc.Work;

public class DataExporter extends GenericDaoImpl {


    public DataExporter() {
    	super();
    }
    
    public static void main(String[] s) throws Exception {
    	DataExporter export = new DataExporter();
    	export.exportTable(Paths.get("./"), "oc_category");
    	export.exportTable(Paths.get("./"), "oc_product");
    	
    	System.exit(0);
    }
    
	public void exportTable(Path output, String tableName) throws Exception {
		Session session = em.unwrap(Session.class);
		session.doWork(new Work() {
			@Override
			public void execute(Connection connection) throws SQLException {				
				export(connection, output, tableName);
			}
		});
		
	}
	
	private void export(Connection connection, Path output, String tableName) {
		Statement stmt = null;
		ResultSet rs = null;
		BufferedWriter writer = null;
		BufferedWriter mappingwriter = null;
		
		try {
			File file = new File(output.toFile(), tableName + ".csv");
			
			File mappingFile = new File(output.toFile(), tableName + "_mapping.csv");
			
			writer = new BufferedWriter(new FileWriter(file));
			
			mappingwriter = new BufferedWriter(new FileWriter(mappingFile));
			
			String query = "select * from " + tableName;
			
			stmt = connection.createStatement();
			
			rs = stmt.executeQuery(query);
			
			ResultSetMetaData metadata = rs.getMetaData();
			int columnCount = metadata.getColumnCount();
			String[] columnTypes = new String[columnCount+1];
			
			StringBuilder row = new StringBuilder();
			
			for (int i = 1; i <= columnCount; i++) {
				row.append(metadata.getColumnName(i) + ", ");
				columnTypes[i] = metadata.getColumnTypeName(i);
//				System.out.println(columnTypes[i]);
				
				mappingwriter.write(metadata.getColumnName(i) + "=" + metadata.getColumnTypeName(i));
				mappingwriter.newLine();
			}
			writer.write(row.toString());
			writer.newLine();
			
			System.out.println();
			while (rs.next()) {
			    row = new StringBuilder();
			    for (int i = 1; i <= columnCount; i++) {
			    	Object val = rs.getObject(i);
			    	
			    	row.append(mapToString(columnTypes[i], val)).append(", ");          
			    }
			    System.out.println();
			    writer.write(row.toString());
			    writer.newLine();

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (null != writer) writer.flush(); writer.close();
				if (null != mappingwriter) mappingwriter.flush(); mappingwriter.close();
			} catch (Exception ignored) {}
		}
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
