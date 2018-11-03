package org.bsuir;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		int n = 0, sum = 0, k = 3;
		System.out.println("Введите число!");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			System.out.println("Число введено верно!");
			String s = sc.nextInt() + "";
			n = s.length();
			if (n >= 1 && n <= 4) {
				System.out.println("Введено число длинной: " + n);
				if (n == 1) {
					for (int i = 1; i <= 9; i++) {
						if (i % k == 0) {
							sum += i;
						}
					}
				}
				else if (n==2) {
					for (int i = 10; i <= 99; i++) {
						if (i % k == 0) {
							sum += i;
						}
					}
				}
				else if (n==3) {
					for (int i = 100; i <= 999; i++) {
						if (i % k == 0) {
							sum += i;
						}
					}
				}
				else {
					for (int i = 1000; i <= 9999; i++) {
						if (i % k == 0) {
							sum +=i;
						}
					}
				}
			}
			else {
				System.out.println("ВЫ ввели число неверной длинны!");
			}
		}
		System.out.println("Сумма при длинне числа " + n + " = " + sum);
		sc.close();
	}

}
