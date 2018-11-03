package org.bsuir;

public class Task25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, b = 1, Fn = 0;
		int mas[] = new int [20];
		mas [0] = a;
		mas [1] = b;
		System.out.print(mas[0] + " " + mas[1] + " ");
		for (int i = 2; i < 20; i++) {
			Fn = a + b;
			mas[i] = Fn;
			a = b;
			b = Fn;
			System.out.print(mas[i] + " ");
		}
	}

}
