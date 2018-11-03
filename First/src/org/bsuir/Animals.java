package org.bsuir;

import java.util.Scanner;

public class Animals {
	public String name;
	public static int age;
	public static int weight;
	public static int height;
	final static int maxOld = 5;
	final static int maxWeight = 20;
	final static int maxHeight = 170;
	public Animals(Animals ob) {
		this.name = ob.name;
		this.age = ob.age;
		this.weight = ob.weight;
		this.height = ob.height;
	}
	public Animals (int age, int weight, int height, String name) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	public Animals() {
		
	}
	public void create() {
		System.out.println("Vvedite vozrast!");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			age = sc.nextInt();
		}
		System.out.println("Vvedite ves");
		sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			weight = sc.nextInt();
		}
		System.out.println("Vvedite rost!");
		sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			height = sc.nextInt();
		}
		System.out.println("Vvedite imya");
		sc = new Scanner(System.in);
		if (sc.hasNextLine()) {
			name = sc.next();
		}
	}
	
	public void show () {
		System.out.print(age );
	}
	public static void main(String[] args) {
		
	}

}
