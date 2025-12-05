package com.example.srms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private final String dbUrl;
    private final String dbUser;
    private final String dbPassword;

    public DatabaseManager(String dbUrl, String dbUser, String dbPassword) {
        this.dbUrl = dbUrl;
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;
        loadDriverIfNeeded();
    }

    private void loadDriverIfNeeded() {
        try {
            if (dbUrl != null && dbUrl.startsWith("jdbc:sqlite")) {
                Class.forName("org.sqlite.JDBC");
            } else if (dbUrl != null && dbUrl.startsWith("jdbc:mysql")) {
                Class.forName("com.mysql.cj.jdbc.Driver");
            }
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC driver not found: " + e.getMessage());
        }
    }

    public Connection getConnection() throws SQLException {
        if (dbUrl != null && dbUrl.startsWith("jdbc:sqlite")) {
            return DriverManager.getConnection(dbUrl);
        }
        return DriverManager.getConnection(dbUrl, dbUser, dbPassword);
    }
}
