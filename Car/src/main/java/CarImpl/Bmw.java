package CarImpl;

import interfases.Car;
import interfases.Driver;
import interfases.Engine;

public class Bmw implements Car {

	private Driver driver;
	private Engine engine;

	public Bmw() {
		super();
	}

	public Bmw(Driver driver, Engine engine) {
		super();
		this.driver = driver;
		this.engine = engine;
	}

	public void drive() {
		System.out.println("BMW CAR");

		driver.seat();

		engine.start();
		engine.stop();

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

}
