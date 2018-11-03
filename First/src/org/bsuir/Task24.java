package org.bsuir;
import java.util.Random;
public class Task24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[4];
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(90)+10;
			System.out.print(a[i] + " ");
		}
		if (a[0] <= a[1] && a[1] <= a[2] && a[2] <= a[3]) {
			System.out.println("Возрастающая последовательность");
		}
		else {
			System.out.println("Нет");
		}
		
	}

}
