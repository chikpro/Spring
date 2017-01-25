package run.SpringCar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import interfases.Car;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		System.out.println("---------------------------------------------");
		Car car = (Car) context.getBean("bmw");
		car.drive();

		System.out.println("---------------------------------------------");
		Car vw = (Car) context.getBean("vw");
		vw.drive();

		System.out.println("---------------------------------------------");
		
		
		
		
	}

}
