package org.bsuir;
import java.util.Random;
public class Task21 {

	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(28800);
		System.out.println(n);
		int hour = n / 3600;
		System.out.println(hour);
		switch (hour) {
		case 0:
			System.out.println("Осталось менее часа!");
			break;
		case 1:
			System.out.println("Остался час");
			break;
		case 2:
			System.out.println("Осталось 2 часа");
			break;
		case 6:
			System.out.println("Осталось 6 часов");
			break;
		case 7:
			System.out.println("ОСталость 7 часов");
			break;
		default:
			System.out.println("Осталось " + hour + " часов");
		}
	}

}
