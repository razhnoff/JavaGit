package org.bsuir;
import java.util.Random;
public class Task30 {

	public static void main(String[] args) {
		int a[] = new int[12];
		int pls = 0, mns = 0, i;
		boolean metka = true;
		Random r = new Random();
		for (i = 0; i < a.length; i++) {
			if (pls <6 || mns <6) {
				a[i] = r.nextInt(21)-10;
				while (metka) {
					if (a[i] == 0) {
						a[i] = r.nextInt(21)-10;
					}
					else {
						metka = false;
					}
				}
			}
			if (pls == 6) {
				a[i] = (r.nextInt(1)-10);
				metka = true;
				while (metka) {
					if (a[i] == 0) {
						a[i] = r.nextInt(-1)-10;
					}
					else {
						metka = false;
					}
				}
			}
			if (mns == 6) {
				a[i] = Math.abs(r.nextInt(21)-10);
				metka = true;
				while (metka) {
					if (a[i] == 0) {
						a[i] = (r.nextInt(21)-10);
					}
					else {
						metka = false;
					}
				}
			}
			if (pls <6 || mns <6) {
				if (a[i] < 0) {
					mns++;
				}
				else if (a[i] >= 0) {
					pls++;
				}
			}
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print(pls + " " + mns);
		
	}

}
