package com.example.myapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLDatabaseConnection {
    public static void SQLDatabaseConnection() {

        try{
            String host = "home-automation.cvcd3rwhftui.us-east-2.rds.amazonaws.com";
            String userName = "teamumbrella";
            String password= "2az$pgK974";

            Connection con = DriverManager.getConnection(host, userName, password);
            Statement stmt = con.createStatement();

            /*test sql
            String SQL = "SELECT * FROM LOCATION";
            ResultSet rs = stmt.executeQuery(SQL);

            rs.next();
            int locationID = rs.getInt("locationID");
            String address = rs.getString("address");
            String city = rs.getString("city");
            String state = rs.getString("state");
            */
            System.out.println("Connected to database");

        }
        catch (SQLException err) {
            System.out.println("Error Connecting to Database" );
        }

    }
}
