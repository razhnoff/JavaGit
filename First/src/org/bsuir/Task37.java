package org.bsuir;

import java.util.Random;

public class Task37 {

	public static void main(String[] args) {
		int n = 4, m = 5;
		int arr[][] = new int[n][m];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
				arr[i][k] = r.nextInt(11)-5;
				System.out.print(arr[i][k] + "\t");
			}
			System.out.println();
		}
		int max = 0, min=0 , temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
			max = arr[i][0];
			min = arr[i][arr[i].length-1];
			if (max < arr[i][k]) {
				max = arr[i][k];
				temp = arr[i][0];
				arr[i][0] = max;
				arr[i][k] = temp;
			}
			else if (arr[i][k] < min) {
				min = arr[i][k];
				temp = arr[i][arr[i].length-1];
				arr[i][arr[i].length-1] = min;
				arr[i][k] = temp;
			}
			}
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
			System.out.print(arr[i][k] + "\t");	
			}
			System.out.println();
		}
	}

}
