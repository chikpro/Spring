package CarImpl;

import interfases.Car;
import interfases.Driver;
import interfases.Engine;

public class Vw implements Car {

	private Driver driver;
	private Engine engine;

	public Vw() {

	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void drive() {
	
		System.out.println("VW CAR");
		driver.seat();

		engine.start();
		engine.stop();

	}

}
