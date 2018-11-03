package org.bsuir;

public class Task12 {

	public static void main(String[] args) {
		int a1 = -166;
		for (int i = 1; a1 <= 99 ; i++) {
			a1 = 2 * a1 + 200;
			if (a1 >= -99 && a1 <= 99) {
				System.out.println(a1);
			}
		}
	
	}

}
