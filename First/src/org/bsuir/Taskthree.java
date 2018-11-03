package org.bsuir;
public class Taskthree {

	public static void main(String[] args) {
		double x=3.2, y=3.1;
		double avg = (x + y)/2, bigAvg = 2*x*y;
		if (x < y) {
			x = avg;
			System.out.println("Menshee chislo= " + avg);
		}
		else {
			x = bigAvg;
			System.out.println("Bolsheee chislo= " + bigAvg);
		}
	}

}
