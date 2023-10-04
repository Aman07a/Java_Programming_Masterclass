package com.timbuchalka;

import java.sql.*;

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
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts " +
                    "(name TEXT, phone INTEGER, email TEXT)");

//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES('Joe', 45632, 'joe@anywhere.com')");

//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES('Jane', 4829484, 'jane@somewhere.com')");

//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES('Fido', 9038, 'dog@email.com')");

            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();
            while (results.next()) {
                System.out.println(results.getString("name") + " " +
                        results.getInt("phone") + " " +
                        results.getString("email"));
            }

            results.close();

            statement.close();
            conn.close();

//            Connection conn = DriverManager.getConnection("jdbc:sqlite:\\TestDB\\testjava.db")
//            Class.forName("org.sql.JDBC");
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}

