package org.bsuir;

import java.util.Random;

public class Task40 {

	public static void main(String[] args) {
		Random r = new Random();
		int a[][] = new int[6][6]; 
		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < a[i].length; k++) {
				a[i][k] = r.nextInt(60)-30;
				System.out.print(a[i][k] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < a[i].length; k++) {
				if (a[i][k] < 0) {
					a[i][k] = 0;
				}
				else {
					a[i][k] = 1;
				}
				System.out.print(a[i][k] + "\t");
			}
			System.out.println();
		}
	}

}
