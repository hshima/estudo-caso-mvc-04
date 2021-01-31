package org.example.models;

import java.sql.*;
import java.util.Properties;

public class ConnectionFactory {
	
	private static String url = "jdbc:postgresql://motty.db.elephantsql.com:5432/ofoyyjgs";
	private static String user = "ofoyyjgs";
	private static String password = "rlHl-zvnSGOA8tqb54QI98yhr7cw4cdt";

  public static Connection getConnection() {
    try {
      Class.forName("org.postgresql.Driver");
      //String url = "jdbc:postgresql://lallah.db.elephantsql.com:5432/zseicynp";
      Properties props = new Properties();
      //props.setProperty("user","zseicynp");
			props.setProperty("user", user);
      //props.setProperty("password","T13g5N1TARHCf-7ZzEI1SzsAgIKGF9xQ");
			props.setProperty("password", password);
      Connection conn = DriverManager.getConnection(url, props);
      return conn;
    } catch(Exception e) {
      System.out.println(e);
    }
    return null;
  }
}