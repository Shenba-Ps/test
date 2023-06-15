package com.spaceBooking.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public Connection getConnection() {

		Connection connection = null;

		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
			connection = DriverManager
					.getConnection("jdbc:derby:C:/appl/IBM/New folder/.metadata/.plugins/org.eclipse.birt.report.data.oda.jdbc.dbprofile.sampledb/db/BirtSample;create=true;upgrade=true;","", "");
		} catch (ClassNotFoundException | SQLException | IllegalAccessException | InstantiationException 
				 e) {

			e.printStackTrace();
}
		return connection;
}
	
	}
