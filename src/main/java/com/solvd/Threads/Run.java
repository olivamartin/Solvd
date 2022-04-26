package com.solvd.Threads;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.army.Models.soldier.Soldier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;


public class Run {
    private final static Logger LOGGER = LogManager.getLogger(Run.class);

    public static void main(String[] args) {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        ExecutorService service = Executors.newFixedThreadPool(10);

        Stream.iterate(0, i -> i + 1)
                .limit(10)
                .forEach(n -> service.execute( new Soldier("Thread " + n, connectionPool)));

        service.shutdown();

        try {
            service.awaitTermination(2000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
    }
}
