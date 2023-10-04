package com.timbuchalka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        String dbPath = System.getenv("DB_PATH");

        if (dbPath == null) {
            throw new IllegalArgumentException("DB_PATH environment variable is not set.");
        }

        String dbName = "testjava.db";
        String connectionString = "jdbc:sqlite:" + dbPath + "\\TestDB\\" + dbName;

//        try (Connection conn = DriverManager.getConnection(connectionString);
//             Statement statement = conn.createStatement();) {
//            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");
        try {
            Connection conn = DriverManager.getConnection(connectionString);
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");

            statement.close();
            conn.close();

//            Connection conn = DriverManager.getConnection("jdbc:sqlite:\\TestDB\\testjava.db")
//            Class.forName("org.sql.JDBC");
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}

