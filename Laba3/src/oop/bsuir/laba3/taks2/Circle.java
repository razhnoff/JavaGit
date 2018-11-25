package oop.bsuir.laba3.taks2;

import java.util.Scanner;

public class Circle implements Area {
	private double radius;

	public Circle() {
		System.out.println("Введите значение радиуса");
		Scanner sc = new Scanner(System.in);
		this.radius = sc.nextDouble();
		// System.out.println("Ваше значение: " + radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area(Area area[]) {
		double square = Math.PI * getRadius();
		return square;
	}

}
