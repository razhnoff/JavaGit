package oop.bsuir.laba3.task4;

public class CargoShip implements Ships {
	private int id;
	private String name;
	private double square;
	private double capacity;
	private int countOfGaz;

	public CargoShip(int id, String name, double square, double capacity, int countOfGaz) {
		this.id = id;
		this.name = name;
		this.square = square;
		this.capacity = capacity;
		this.countOfGaz = countOfGaz;
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

	public double getSquare() {
		return square;
	}

	public void setSquare(double square) {
		this.square = square;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public class Tanker extends CargoShip implements Ships {

		public Tanker() {
			super(id, name, square, capacity, countOfGaz);
		}

		public boolean isTanker() {
			if (super.getCountOfGaz() > 1) {
				return true;
			} else {
				return false;
			}
		}

		@Override
		public void onShip() {
			System.out.println("Плывем на танкере");

		}

	}

	public int getCountOfGaz() {
		return countOfGaz;
	}

	public void setCountOfGaz(int countOfGaz) {
		this.countOfGaz = countOfGaz;
	}

	@Override
	public void onShip() {
		System.out.println("Плывем на грузовом корабле");

	}

}
