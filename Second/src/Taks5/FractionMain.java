package Taks5;

public class FractionMain {

	public static void main(String[] args) {
		Fraction f = new Fraction(10, 5);
		Fraction f1 = new Fraction(20, 10);
		//System.out.println(f);
		System.out.println(new Fraction().addition(f, f1));
		System.out.println(new Fraction().deduction(f, f1));
	}

}
