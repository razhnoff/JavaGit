package org.bsuir;

public class Task17 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 1000000; i++) {
			int e = 10,
			k = i % 10,
			t = i / 10 % e,
			f = i / 100 % e,
			b = i / 1000 % e,
			c = i / 10000 % e,
			d = i / 100000 % e;
			if ((k + t + f) == (b + c + d)) {
				count++;
			}
		}
		System.out.println("—частливый билет!=" + count);
	}

}
