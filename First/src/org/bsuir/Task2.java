package org.bsuir;
import static java.lang.Math.*;
public class Task2 {

	public static void main(String[] args) {
		System.out.println("Task 2.1"); 
		int i = 5546; 
		String s = i + ""; 
		int a, b, c, d;
		a = s.charAt(0);
		b=s.charAt(1);
		c=s.charAt(2);
		d=s.charAt(3); 
		if ((a+b) == (c+d)) { 
		System.out.println(true); 
		} 
		else { 
		System.out.println(false); 
		} 
		
		System.out.println("--------------");
		System.out.println("Task 2.2");
		i = 554;
		a = s.charAt(0); 
		b = s.charAt(1); 
		c = s.charAt(2);
		if ((a+b+c)%2 == 0) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		System.out.println("--------------");
		System.out.println("Task 2.3");
		int n = 10;
		if (n>=10 && n<100 && n%2 == 0) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		System.out.println("--------------");
		System.out.println("Task 2.4");
		double q = 3, w = 4, e=6;
		if (pow(q,2)+pow(w,2) == pow(e,2)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		System.out.println("--------------");
		System.out.println("Task 2.5");
		i = 4567;
		s = i + ""; 
		a = s.charAt(0);
		b = s.charAt(1);
		c = s.charAt(2);
		d = s.charAt(3);
		if (a==b || a==c || a==d || b==c || b==d || c==d) {
			System.out.println("False");
			System.out.println(a + " " + b );
		}
		else {
			System.out.println("True");
		}
		
		System.out.println("--------------");
		System.out.println("Task 2.6");
		i = 4554;
		s = i + "";
		String f ="";
		for (int k = s.length() - 1; k>=0; k--) {
			f = f + s.charAt(k);
		}
		System.out.println(f);
		if (s.equals(f)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

	}

}
