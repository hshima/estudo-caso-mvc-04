package org.example.models;

import java.sql.*;
import java.util.Properties;

public class ConnectionFactory {
  public static Connection getConnection() {
    try {
      Class.forName("org.postgresql.Driver");
      String url = "jdbc:postgresql://lallah.db.elephantsql.com:5432/zseicynp";
      Properties props = new Properties();
      props.setProperty("user","zseicynp");
      props.setProperty("password","T13g5N1TARHCf-7ZzEI1SzsAgIKGF9xQ");
      Connection conn = DriverManager.getConnection(url, props);
      return conn;
    } catch(Exception e) {
      System.out.println(e);
    }
    return null;
  }
}