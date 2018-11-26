package oop.bsuir.laba3.task4;

public class VideoPlayer extends Player implements Technica {

	private double lifeCycle;
	private int countOfCase;

	public VideoPlayer(int id, String model, int w, int h, String color, double lifeCycle, int countOfCase) {
		super(id, model, w, h, color);
		this.lifeCycle = lifeCycle;
		this.countOfCase = countOfCase;
	}

	@Override
	public void onPlayer() {
		System.out.println("Включаем плеер!");

	}

	@Override
	public void offPlayer() {
		System.out.println("Выключаем плеер!");

	}

	@Override
	public void pausePlayer() {
		System.out.println("Остановили плеер");

	}

	@Override
	public void inCases() {
		System.out.println("Можем проссматривать кассеты");

	}

}
