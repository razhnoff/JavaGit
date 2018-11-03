package org.bsuir;
import java.util.Random;
public class Task27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10];
		int b[] = new int[10];
		double c[] = new double[10];
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			a[i] = r.nextInt(9)+1;
			b[i] = r.nextInt(9)+1;
			c[i] = (double)(a[i]/b[i]);
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");			
		}
		
	}

}
