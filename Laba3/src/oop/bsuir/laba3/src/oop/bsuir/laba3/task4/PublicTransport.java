package oop.bsuir.laba3.task4;

public abstract class PublicTransport {
	private int id;
	private String model;
	private String color;
	private int number;
	private int countOfPeople;

	public PublicTransport(int id, String model, String color, int number, int countOfPeople) {
		this.id = id;
		this.model = model;
		this.color = color;
		this.number = number;
		this.countOfPeople = countOfPeople;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCountOfPeople() {
		return countOfPeople;
	}

	public void setCountOfPeople(int countOfPeople) {
		this.countOfPeople = countOfPeople;
	}

	public abstract void goPeople();
}
