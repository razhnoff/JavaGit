package Task8;

public class QuadraticMain {

	public static void main(String[] args) {
		int a = 2, b = 6, c = 4;
		Quadratic exp = new Quadratic(a,b,c);
		exp.areaDefinitions(exp);
		exp.findExtremyms(exp);
		exp.findIntervals(exp);
	}

}
