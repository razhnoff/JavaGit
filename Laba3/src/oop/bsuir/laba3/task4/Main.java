package oop.bsuir.laba3.task4;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		System.out.println("=====================Task 1-------------------------------");
		int mark[] = new int[5];
		Random r = new Random();
		for (int i = 0; i < mark.length; i++) {
			mark[i] = r.nextInt(8) + 2;
			System.out.print(mark[i] + "\t");
		}
		System.out.println();
		Zaochnik student1 = new Zaochnik(5, "max", "petrov", "petrovich", "street", "+88005553535", mark);
		System.out.println("Средний бал = " + student1.getAvgMark());
		student1.getFullData();
		System.out.println("----------------------------------------------------------------");
		
	}

}
