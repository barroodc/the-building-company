package com.solvd.thebuildingcompany.utils;

import com.solvd.thebuildingcompany.contractors.residential.ResidentialContractor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;


public class ConnectionPoolExample implements IConnectionPool {

    private static final Logger logger = Logger.getLogger(ConnectionPoolExample.class.getName());

    private String url;
    private String user;
    private String password;
    private ConcurrentHashMap<String, Connection> connectionPool;
    private ConcurrentHashMap<String, Connection> usedConnections;
    private static final int INITIAL_POOL_SIZE = 10;

    public ConnectionPoolExample(String url, String user, String password) {

    }

    public ConnectionPoolExample(ConcurrentHashMap<String, Connection> pool) {

    }

    public static ConnectionPoolExample create(String url, String user, String password) {
        ConcurrentHashMap<String, Connection> pool = new ConcurrentHashMap<>(INITIAL_POOL_SIZE);
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            pool.put("First created pool", (Connection) create(url, user, password));
        }
           return new ConnectionPoolExample(pool);

    }


    @Override
    public Connection getConnection() {
       Connection connection = connectionPool.remove("First created pool");
       usedConnections.put("Used connection", connection);
       return connection;
    }

    @Override
    public boolean releaseConnection(Connection connection) {
        connectionPool.put("Connection", connection);
        return usedConnections.remove("Used connection",connection);
    }

    private static Connection createConnection(String url, String user, String password) throws SQLException {

        return DriverManager.getConnection(url, user, password);
    }

    @Override
    public String getUrl() {
        return null;
    }

    @Override
    public String getUser() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }
}
