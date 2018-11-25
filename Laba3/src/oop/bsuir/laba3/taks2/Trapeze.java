package oop.bsuir.laba3.taks2;

import java.util.Scanner;

public class Trapeze implements Area {
	private double a;
	private double b;
	private double h;

	public Trapeze() {
		System.out.println("¬ведите верхнюю сторону трапеции");
		Scanner sc = new Scanner(System.in);
		this.a = sc.nextDouble();
		System.out.println("¬ведите нижнюю сторону трапеции");
		this.b = sc.nextDouble();
		System.out.println("¬ведите высоту трапеции");
		this.h = sc.nextDouble();
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

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	@Override
	public double area(Area area[]) {
		double square = (getA() + getB()) * getH() / 2;
		return square;

	}

}
