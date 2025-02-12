package com.tns.customerservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLConnection {
    public static void main(String[] args) {
        // Database URL, Username, and Password
        String url = "jdbc:postgresql://localhost:5432/mydatabase"; // Change 'mydatabase' to your DB name
        String user = "postgres"; // Your PostgreSQL username
        String password = "arun"; // Your PostgreSQL password

        try {
            // Load PostgreSQL JDBC Driver
            Class.forName("org.postgresql.Driver");

            // Establish Connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL database successfully!");

            // Close Connection
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
    }}
