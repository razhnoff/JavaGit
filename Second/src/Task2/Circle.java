package Task2;

public class Circle extends CircleOneParam{
	
	public Circle(int radius, int xCoord, int yCoord) {
		super(radius);
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	
	
	/*
	public void editRadius(Circle circle, int newRadius) {
		circle.setRadius(newRadius);
		System.out.println("Изменения радиуса на " + radius);
	}*/
	
	public void modifyCoord(int offsetX, int offsetY) {
		xCoord += offsetX;
		yCoord += offsetY;
		System.out.println(xCoord + " " + yCoord);
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getxCoord() {
		return xCoord;
	}

	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	public int getyCoord() {
		return yCoord;
	}

	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}
	
	public double calcSquare(int radius) {
		return Math.PI * Math.pow(radius, 2); 
	}
	
	public double calcLength(int radius) {
		return 2 * Math.PI * radius;
	}

	public String showAllParamsCircle() {
		return "Circle [radius=" + radius + ", xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
	}
}
