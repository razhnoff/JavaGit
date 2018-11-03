package org.bsuir;

public class Task15 {

	public static void main(String[] args) {
		int a = 1,b=1,Fn=0;
		System.out.print(a + " " + b + " ");
		for(int i = 1; i <= 9; i++){
	         Fn = a + b;
	         a = b;
	         b = Fn;
	         System.out.print(Fn + " ");
	     }
	}

}
