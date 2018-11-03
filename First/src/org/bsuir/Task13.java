package org.bsuir;
import java.util.Scanner; 
public class Task13 {

	public static void main(String[] args) {
		System.out.println("Введите число");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int num = sc.nextInt();
			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					if (num % i ==0) {
						System.out.print(i + " ");
					}
				}
			}
			else {
				System.out.println("Вы ввели не натуральное число");
			}
		}
		sc.close();
	}

}
