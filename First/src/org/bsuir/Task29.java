package org.bsuir;
import java.util.Scanner;
import java.util.Random;
import static java.lang.Math.*;
public class Task29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		boolean metka = true;
		int sum1 = 0, sum2 = 0;
		while (metka) {
			System.out.println("¬ведите  целое четное положительное число");
			if (sc.hasNextInt()) {
				int n = sc.nextInt();
				if (n % 2 == 0 && n > 0) {
					int a[] = new int[n];
					Random r = new Random();
					for (int i = 0; i < a.length; i++) {
						a[i] = r.nextInt(11)-5;
						System.out.print(a[i] + " ");
						metka = false;
					}
					for (int i = 0; i <= a.length/2-1; i++) {
						sum1 += abs(a[i]);
					}
					for (int i = a.length / 2; i < a.length; i++) {
						sum2 += abs(a[i]);
					}
					System.out.println();
					if (sum1 == sum2) {
						System.out.println("Summa modylei ravna");
					}
					else if (sum1 > sum2) {
						System.out.println("Summa levoi chasti bolshe");
					}
					else {
						System.out.println("Summa pravoi chasti bolshe");
					}
					System.out.println(sum1);
					System.out.println(sum2);
				}
				else {
					System.out.println("ne chetnoe  ili otricatelnoe chislo");
				}
			}
			else {
				System.out.println("vbl vveli neceloe chislo");
				sc.close();
			}
		}
		
	}

}
