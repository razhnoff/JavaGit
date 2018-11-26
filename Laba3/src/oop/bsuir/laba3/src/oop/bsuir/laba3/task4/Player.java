package oop.bsuir.laba3.task4;

public abstract class Player {
	private int id;
	private String model;
	private int w;
	private int h;
	private String color;

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

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract void inCases();

	public Player(int id, String model, int w, int h, String color) {
		super();
		this.id = id;
		this.model = model;
		this.w = w;
		this.h = h;
		this.color = color;
	}
		
	
}
