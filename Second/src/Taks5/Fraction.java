package Taks5;

public class Fraction {
	
	private int n;
	private int m;
	
	public Fraction() {
	}
	
	public Fraction(int m, int n) {
		this.n = n;
		this.m = m;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	
	public int addition(Fraction f,Fraction f1) {
		return (f.getM()*f1.getN() + f.getN()*f1.getM())/(f.getN()*f1.getN());
	}
	
	public double multiply(Fraction f, Fraction f1) {
		return (f.getM()*f1.getM())/(f.getN()*f1.getN());
	}
	
	public double deduction(Fraction f, Fraction f1) {
		return (f.getM()*f1.getN() - f.getN()*f1.getM())/(f.getN()*f1.getM());
	}
	
	public int division(Fraction f, Fraction f1) {
		return (f.getM()*f1.getN())/(f.getN()*f1.getM());
	}
	
	
	@Override
	public String toString() {
		return "Fraction [n=" + n + ", m=" + m + "]";
	}
	
	
}
