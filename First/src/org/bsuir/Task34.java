package org.bsuir;

import java.util.Random;

public class Task34 {

	public static void main(String[] args) {
		Random r = new Random();
		int n = 4, count = 0, sum = 0;
		int a[][] = new int[n][n];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = r.nextInt(10)-5;
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j <=a[i].length; j++) {
				if (j-i==0 && a[i-1][j]>0) {
					count++;
					sum += a[i-1][j];
				}
			}
		}
		System.out.println(count);
		System.out.println(sum);
	}

}
