package org.bsuir;

import java.util.Random;

public class Task28 {

	public static void main(String[] args) {
		int a[] = new int[11];
		int count = 0, cnt = 0, ind = 0;
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(3) - 1;
			System.out.print(a[i] + " ");
			if (a[i] == 0) {
				cnt++;
			} else if (a[i] == 1) {
				count++;
			} else {
				ind++;
			}
		}
		System.out.println();
		System.out.println(cnt + " " + count + " " + ind);
		if (cnt > count) {
			if (cnt == count || count == ind || ind == cnt) {
				System.out.println("Ничего");
			} else {
				System.out.println("Нулей больше");
			}
		} else if (count > ind) {
			if (cnt == count || count == ind || ind == cnt) {
				System.out.println("Ничего");
			} else {
				System.out.println("Единиц больше");
			}
		} else {
			if (cnt == count || count == ind || ind == cnt) {
				System.out.println("Ничего");
			} else {
				System.out.println("-1 больше");
			}
		}
	}
}
