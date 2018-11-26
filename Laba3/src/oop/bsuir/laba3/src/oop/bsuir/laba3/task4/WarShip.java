package oop.bsuir.laba3.task4;

public abstract class WarShip {
	private int id;
	private String name;
	private int year;
	private int countOfPeople;
	private int countOfWeapon;
	private final boolean SHIP = true;

	public boolean isSHIP() {
		return SHIP;
	}

	public WarShip(int id, String name, int year, int countOfPeople, int countOfWeapon) {
		this.id = id;
		this.name = name;
		this.year = year;
		this.countOfPeople = countOfPeople;
		this.countOfWeapon = countOfWeapon;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getCountOfPeople() {
		return countOfPeople;
	}

	public void setCountOfPeople(int countOfPeople) {
		this.countOfPeople = countOfPeople;
	}

	public int getCountOfWeapon() {
		return countOfWeapon;
	}

	public void setCountOfWeapon(int countOfWeapon) {
		this.countOfWeapon = countOfWeapon;
	}
	
	public abstract void whoAmI();
}
