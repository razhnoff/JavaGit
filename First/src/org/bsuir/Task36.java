package org.bsuir;

import java.util.Random;

public class Task36 {

	public static void main(String[] args) {
		int n = 4, t = 4, str = 2, max = 0, temp = 0;
		int a[][] = new int[n][t];
		int b[][] = new int[2][t];
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < t; k++) {
				a[i][k] = r.nextInt(21)-10;
				System.out.print(a[i][k] + "\t");
				if (i==k && a[i][k] >= max) {
					max = a[i][k];
					temp = i;
				}
			}
			System.out.println();
		}
		System.out.println(max);
		System.out.println(temp);
		for (int i = 0; i < b.length-1; i++) {
			for (int k = 0; k < t; k++) {
				b[i][k] = a[temp][k];
				System.out.print(b[i][k] + "\t");
			}
			System.out.println();
		}
		for (int i = 1; i < b.length; i++) {
			for (int k = 0; k < t; k++) {
				b[i][k] = a[str][k];
				System.out.print(b[i][k] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < t; k++) {
				if (i == temp) {
					a[temp][k] = a[str][k];
				}
				else if (i == str) {
					a[str][k] = b[0][k];
				}
				System.out.print(a[i][k] + "\t");
			}
			System.out.println();
		}
	}

}
