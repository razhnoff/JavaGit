package org.bsuir.task2;

public class HouseMain {

	public static void main(String[] args) {
		House[] houses = new House[3]; 
		House house1 = new House(1, 12, 384, 5, 5, "Masherova 1", "замок", 40);
		House house2 = new House(2, 45, 80, 1, 1, "Marksa 5", "небоскреб", 10);
		House house3 = new House(3, 300, 150, 25, 2, "Nezavisimosti 20", "панельный", 5);
		houses[0] = house1;
		houses[1] = house2;
		houses[2] = house3;
		System.out.println("----------Task a----------");
		System.out.println();
		for (House house : houses) {
			if (house.getRoomCount() == 2) {
				System.out.println(house.toString());
			}
		}
		System.out.println("--------Task b----------");
		System.out.println();
		for (House house : houses) {
			if (house.getRoomCount() == 5 && house.getFloor() > 1 && house.getFloor() < 25) {
				System.out.println(house.toString());
			}
		}
		System.out.println("----Task c-------");
		System.out.println();
		for (House house : houses) {
			if (house.getSquare() > 100) {
				System.out.println(house.toString());
			}
		}
	}

}
