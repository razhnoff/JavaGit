package org.bsuir;
import static java.lang.Math.pow;

import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число");
		
		int n = 0;
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		}
		else {
			System.out.println("Вы ввели не целое число");
		}
		for (int i = 1; i<=4; i++) {
			double x = pow(n,i);
			System.out.println(n + " в степени" + " " + i + " = " + x);
		}
		sc.close();

	}

}
