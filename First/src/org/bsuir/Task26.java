package org.bsuir;
import java.util.Random;

public class Task26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mas[] = new int[12];
		int max = 0, ind = 0;;
		Random r = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = r.nextInt(30)-15; 
			System.out.print(mas[i] + " ");
			if (mas[i] > max) {
				max = mas[i];
				ind = i;
			}
		}
		System.out.println();
		System.out.println(max);
		System.out.println(ind);
	}

}
