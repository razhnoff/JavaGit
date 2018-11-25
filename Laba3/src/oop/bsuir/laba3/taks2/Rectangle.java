package oop.bsuir.laba3.taks2;

import java.util.Scanner;

public class Rectangle implements Area {
	private int a;
	private int b;

	public Rectangle() {
		System.out.println("¬ведите длину одной стороны");
		Scanner sc = new Scanner(System.in);
		this.a = sc.nextInt();
		System.out.println("¬ведите длину второй стороны");
		this.b = sc.nextInt();
	}

	public void getLengths() {
		System.out.println("ƒлина певрой стороны: " + a);
		System.out.println("ƒлина второй стороны: " + b);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public double area(Area area[]) {
		double square = getA() * getB();
		return square;
	}
}
