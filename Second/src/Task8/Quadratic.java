package Task8;

public class Quadratic {
	private int a;
	private int b;
	private int c;

	public Quadratic() {
	}

	public Quadratic(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public void areaDefinitions(Quadratic exp) {
		int D = exp.getB() * exp.getB() - 4 * exp.getA() * exp.getC();
		if (D > 0) {
			double x1 = (((-1) * exp.getB() + Math.sqrt(D)) / (2 * exp.getA()));
			double x2 = ((-1) * exp.getB() - Math.sqrt(D)) / (2 * exp.getA());
			System.out.print("Корни x1 = " + x1);
			System.out.println();
			System.out.println("Второй корень x2 = " + x2);
		} else if (D == 0) {
			double x1 = (-exp.getB()) / (2 * exp.getA());
			System.out.println("Корень при D=0: " + x1);
		} else {
			System.out.println("Нет решений");
		}
	}

	public void findExtremyms(Quadratic exp) {
		int x1 = -1, x2 = -2;
		int extr1 = exp.getA()*x1*x1 + exp.getB() * x1 + exp.getC();
		int extr2 = exp.getA()*x2*x2 + exp.getB() * x2 + exp.getC();
		System.out.println("extr1 = " + extr1);
		System.out.println("extr2 = " + extr2);
	}
	public void findIntervals(Quadratic exp) {
		int x1 = -1, x2 = -2;
		int f = exp.getA()*(x1+1)*(x1+1) + exp.getB() * (x1+1) + exp.getC();
		int f1 = exp.getA()*(x1-1)*(x1-1) + exp.getB() * (x1-1) + exp.getC();
		int f3 = exp.getA()*(x2-1)*(x2-1) + exp.getB() * (x2-1) + exp.getC();
		if (f > 0) {
			System.out.println("Период возрастания от " + x1 + " до бесконечности");
		}
		else  {
			System.out.println("Период убывания от " + x1 + " до бесконечности");
		}
		if (f1 > 0) {
			System.out.println("Период возрастания от " + x2 + " до " + x1);
		}
		else  {
			System.out.println("Период убывания от " + x2 + " до " + x2);
		}
		if (f3 > 0) {
			System.out.println("Период возрастания от бесконечности " + " до " + x2);
		}
		else  {
			System.out.println("Период убывания от бесконечности " + " до " + x2);
		}
	}
}
