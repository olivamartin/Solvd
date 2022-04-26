package com.solvd.Threads;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class ConnectionPool {

    private static final Logger LOGGER = LogManager.getLogger(ConnectionPool.class);
    private static final int MAX_CONNECTIONS = 5;
    private final AtomicInteger activeConnections = new AtomicInteger(0);
    private final LinkedBlockingQueue<String> connections;
    private static ConnectionPool INSTANCE = null;

    public ConnectionPool() {
         this.connections = new LinkedBlockingQueue<>(MAX_CONNECTIONS);
    }

    public static ConnectionPool getInstance() {
        if (INSTANCE == null){
            synchronized (ConnectionPool.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ConnectionPool();
                }
            }
        }
        return INSTANCE;
    }

    public void init(){
        try {
            connections.put(" Connection " + getActiveConnections());
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }

    }
    public AtomicInteger getActiveConnections() {
        return activeConnections;
    }

    public String getConnection() throws InterruptedException {
        if (connections.size() == 0 && activeConnections.get() < MAX_CONNECTIONS) {
            synchronized (ConnectionPool.class) {
                if (connections.size() == 0 && activeConnections.get() < MAX_CONNECTIONS) {
                    INSTANCE.init();
                    getActiveConnections().incrementAndGet();
                }
            }
        }
        return connections.take();
    }

    public void releaseConnection(String connection) {
        if (connection != null) {
            try {
                connections.put(connection);
            } catch (InterruptedException e) {
                LOGGER.error(e);
            }
        }
    }

    public void closeAllConnections() {
        while (activeConnections.get() > 0) {
            String connection;
            try {
                connection = connections.take();
            } catch (InterruptedException e) {
                LOGGER.error(e);
            }
            activeConnections.decrementAndGet();
        }
    }

}
