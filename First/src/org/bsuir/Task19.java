package org.bsuir;
import static java.lang.Math.*;

public class Task19 {

	public static void main(String[] args) {
		int i = ((int)(random() * 150) + 5);
		System.out.println(i);
		if (i > 25 && i < 100) {
			System.out.println("Число " + i + " содержится в интервале(25;100)");
		}
		else {
			System.out.println("Число " + i + " не содержится в интервале (25,100)");
		}
	}

}
