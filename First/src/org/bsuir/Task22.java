package org.bsuir;
import java.util.Random;
public class Task22 {

	public static void main(String[] args) {
		int n[] = new int[8];
		Random r = new Random();
		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextInt(9)+1;
			System.out.print(n[i] + " ");
			if(i % 2==1) {
				n[i]=0;
			}
		}
		System.out.println();
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
	}

}
