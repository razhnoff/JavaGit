package org.bsuir;

import java.util.Random;

public class Task35 {

	public static void main(String[] args) {
		int n = 3, t = 3, count = 0;
		Random r = new Random();
		int arr[][] = new int[n][t];
		int arr2[] = new int[t];
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
				arr[i][k] = r.nextInt(20)-10;
				System.out.print(arr[i][k] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for (int k = 0; k < t; k++) {
			arr2[k] = 0;
			System.out.print(arr2[k] + "\t");
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < t; k++) {
				arr2[k] += arr[i][k];
				System.out.print(arr2[k] + "\t");
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < t; k++) {
				if (arr[i][k] > arr2[k]-arr[i][k]) {
					count++;
				}
			}
		}
		System.out.println(count);
		
		
		/*
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
				System.out.println(arr[i][k] + "\t");
			}
			System.out.println();
		}*/
	} 

}
