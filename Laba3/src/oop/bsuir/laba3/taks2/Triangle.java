package oop.bsuir.laba3.taks2;

import java.util.Scanner;

public class Triangle implements Area {
	private double a;
	private double b;

	public Triangle() {
		System.out.println("¬ведите первую сторону");
		Scanner sc = new Scanner(System.in);
		this.a = sc.nextDouble();
		System.out.println("¬ведите вторую сторону");
		this.b = sc.nextDouble();
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public double area(Area area[]) {
		double square = getA() * getB() / 2;
		return square;
	}

}
