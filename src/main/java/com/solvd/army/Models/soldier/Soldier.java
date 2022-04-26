package com.solvd.army.Models.soldier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.Threads.ConnectionPool;

public class Soldier implements Runnable {
	
	private String name;
	private double weight;
	private double height;
	private ConnectionPool connectionPool;
	private String threadName;
	private Logger logger = LogManager.getLogger(Soldier.class);
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public Soldier() {}
	
	public Soldier(String name, double weight, double height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

	public Soldier(String threadName, ConnectionPool pool) {
		this.threadName = threadName;
		this.connectionPool = pool;
	}

	@Override
	public String toString() {
		return "Soldier{" +
				"name='" + name + '\'' +
				", weight=" + weight +
				", height=" + height +
				'}';
	}

	@Override
	public void run() {
		String connection = null;
		try {
			connection = connectionPool.getConnection();
		} catch (InterruptedException e) {
			logger.error(e);
		}
		logger.info("Running " + threadName);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		connectionPool.releaseConnection(connection);
	}
}
