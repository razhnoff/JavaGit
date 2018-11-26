package oop.bsuir.laba3.task4;

public class Tram extends PublicTransport implements Transports {
	private boolean roga;

	public Tram(int id, String model, String color, int number, int countOfPeople, boolean roga) {
		super(id, model, color, number, countOfPeople);
		this.roga = roga;
	}

	public boolean isRoga() {
		return roga;
	}

	public void setRoga(boolean roga) {
		this.roga = roga;
	}

	@Override
	public void onBiletic() {
		System.out.println("Покупаем билетик");

	}

	@Override
	public void offBiletic() {
		System.out.println("Пробиваем билетик");

	}

	@Override
	public void goPeople() {
		System.out.println("Возим пассажиров");

	}

}
