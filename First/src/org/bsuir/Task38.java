package org.bsuir;

import java.util.Random;

public class Task38 {

	public static void main(String[] args) {
		Random r = new Random();
		int n = 4, sum = 0, magic;
		int arr[][] = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = r.nextInt(10)-5;
				System.out.print(arr[i][j] + "\t");
				sum += arr[i][j];
			}
			System.out.println();
		}
		//сумма диагоналей квадрата = сумма элем/на размерность
		// если получ от деления число = константе
		magic = (n*(n*n+1))/2;
		if(magic == (sum/n)) {
			System.out.println("Magic matrix");
		}
		else {
			System.out.println("not magic");
		}
	}

}
