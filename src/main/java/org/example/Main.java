package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:h2:mem:testdb";
        String username = "sa";
        String password = "";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            Statement statement = connection.createStatement();

            // Execute SQL statement to create the database
            String Sqlquery = "CREATE SCHEMA test";
            statement.executeUpdate(Sqlquery);
            System.out.println("Database 'test' created successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}