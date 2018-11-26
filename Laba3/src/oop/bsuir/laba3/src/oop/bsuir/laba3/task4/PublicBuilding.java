package oop.bsuir.laba3.task4;

public abstract class PublicBuilding {

	private int number;
	private String name;
	private int floor;
	private double square;

	public PublicBuilding(int number, String name, double square, int floor) {
		this.number = number;
		this.name = name;
		this.floor = floor;
		this.square = square;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSquare() {
		return square;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setSquare(double square) {
		this.square = square;
	}
	
	public abstract boolean IsPeopleHere();
	

}
