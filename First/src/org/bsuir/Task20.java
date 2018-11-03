package org.bsuir;
import static java.lang.Math.*;
public class Task20 {

	public static void main(String[] args) {
		int i = ((int)(random() * 900 + 100));
		System.out.println(i);
		int c = i % 10,
		b = i / 10 % 10,
		a = i / 100,
		max = 0;
		System.out.println(a + " " + b + " " + c);
		if (a >= b || a >= c) {
			max = a;
		}
		else if (c >= b || c >= a) {
			max = c;
		}
		else { 
			max = b;
		}
		System.out.println("В числе " + i + " наибольшая цифра " + max);
	}

}
