package org.bsuir.task2;

public class CarMain {

	public static void main(String[] args) {
		Car[] cars = new Car[4];
		Car car1 = new Car(1, "bmw", "m735", 2015, "black", 70000, 01226655);
		Car car2 = new Car(2, "lada", "priora", 2004, "red", 5000, 52125484);
		Car car3 = new Car(3, "mercedes", "e200", 2010, "gray", 60000, 84446622);
		Car car4 = new Car(4, "toyota", "camry", 2006, "white", 30000, 54236589);
		cars[0] = car1;		
		cars[1] = car2;
		cars[2] = car3;
		cars[3] = car4;
		System.out.println("----Task a--------");
		for (Car car : cars) {
			if (car.getName().equals("lada")) {
				System.out.println(car.show());
			}
		}
		System.out.println("-----Task b--------");
		for (Car car : cars) {
			if (2018 - car.getDate() > 5 && car.getModel().equals("e200")) {
				System.out.println(car.show());
			}
		}
		System.out.println("-----Task c-------");
		for (Car car : cars) {
			if (car.getDate() == 2010 && car.getPrice() > 55000) {
				System.out.println(car.show());
			}
		}
	}
}
