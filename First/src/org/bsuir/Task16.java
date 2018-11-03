package org.bsuir;
import java.util.Scanner;
public class Task16 {

	public static void main(String[] args) {
		System.out.println("Введите натур число!");
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		if (sc.hasNextInt()) {
			int num = sc.nextInt();
			if (num > 0) {
				while (num != 0) {
					sum = sum + num % 10;
					num = num / 10;
				}
			System.out.println(sum);
			}
			else {
				System.out.println("Вы ввели не натуральное число");
			}
		}
		else {
			System.out.println("Вы ввели не целое число!");
		}
		sc.close();
	}

}
