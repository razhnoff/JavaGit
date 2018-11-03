package org.bsuir;
import java.util.Random;
import java.util.Scanner;
public class Task31 {

	public static void main(String[] args) {
		boolean flag = true;
		int n = 0, i = 0, count = 0;
		Random r = new Random();
		while (flag) {
			System.out.println("Vvedite chislo natur i >3");
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextInt()) { /*Проверка на ввод целого*/
				n = sc.nextInt();
				/*int a[] = new int[n];*/
				if (n > 3) { /*Число большее 3*/
					System.out.println("Good");
					flag = false;
					/*
					for (i = 0; i < a.length; i++) {
						a[i] = r.nextInt(n);
						System.out.print(a[i] + " ");
						if (a[i] % 2 == 0) {
							count++;
						}
						int b[] = new int[count];
						for (int j = 0; a[i] % 2 == 0; j++) {
							b[j] = a[i];
							System.out.print(b[j] + " ");
						}*/
					}
				else {
					System.out.println("Vvedite natur >3");
				}
			}
			else {
				System.out.println("Ne celoe chislo");
			}
			sc.close();
		}
		int a[] = new int[n];
		for (i = 0; i < a.length; i++) {
			a[i] = r.nextInt(n);
			System.out.print(a[i] + " ");
			if (a[i] % 2 == 0 && a[i] != 0) {
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
		System.out.println();
		if (count > 0) {
			int b[] = new int[count];
			int j = 0;
			for (i = 0; i < a.length; i++) {
					if (a[i]%2 == 0 && a[i] != 0){
					b[j] = a[i];
					j++;
					
				}
			}
			for (j = 0; j < b.length; j++) {
				System.out.print(b[j] + " ");
			}
		}
		
		
		/*
		int b[] = new int[count];
		for (i = 0; i < a.length; i++) {
			for (int j = 0; a[i] % 2 == 0; j++) {
				
				b[j] = a[i];
				System.out.println(b[j] + " ");
			}
		}
		/*
		sc.close();
		
		Random r = new Random();
		int a[] = new int[n];
		int b[] = new int[0];
		int i;
		for (i = 0; i < a.length; i++) {
			a[i] = r.nextInt(n+1);
			System.out.print(a[i] + " ");
		}
		for (i = 0; i < a.length-1; i++) {
			int k = a[i];
			if (k % 2 == 0) {
				for (int j = 0; k % 2 == 0; j++) {
					b[j] = a[i];
					System.out.println(b[j] + " ");
				}
			}
			else {
				System.out.println("Net chetnblh elementov");
			}
		}*/
	}

}
