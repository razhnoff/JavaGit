package org.bsuir;
import java.util.Random;
public class Task23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		int b[] = new int[5];
		int summ1 = 0, summ2 = 0;
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(6);
			b[i] = r.nextInt(6);
			System.out.print(a[i] + " ");
			summ1 += a[i];
			summ2 += b[i];
		}
		System.out.println();
		System.out.println(summ1);
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.println(summ2);
		if (summ1 / a.length == summ2 / b.length) {
			System.out.println("средние арифмет равны");
		}
		else if (summ1 / a.length > summ2 / b.length) {
			System.out.println("Среднее арифмет массива а больше");
		}
		else {
			System.out.println("Среднее арифмет массива b больше");
		}
	
		
		
		
	}

}
