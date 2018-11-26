package oop.bsuir.laba3.task4;

public class Theatre extends PublicBuilding implements Building {

	private String style;
	private int year;

	public Theatre(int number, String name, double square, String style, int floor, int year) {
		super(number, name, square, floor);
		this.style = style;
		this.year = year;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public boolean IsPeopleHere() {
		return true;
	}

	@Override
	public void onBuild() {
		if (getYear() >= 2016) {
			System.out.println("Здание готово к эксплуатации");
		} else {
			System.out.println("Здание еще строится!");
		}

	}

}
