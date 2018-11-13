package Task6;

public class VectorMain {
	private static final Vector vector1 = new Vector(1, -3);
	private static final Vector vector2 = new Vector(-3, 2);

	public static void main(String[] args) {
		System.out.println(vector1.toString() + " +  " + vector2.toString() + " =  "
				+ VectorMethods.addition(vector1, vector2).toString());
		System.out.println(vector1.toString() + " -  " + vector2.toString() + " =  "
				+ VectorMethods.subtract(vector1, vector2).toString());
		System.out.println(vector1.toString() + " *  " + vector2.toString() + " =  "
				+ VectorMethods.multiplication(vector1, vector2).toString());
		System.out.println("Скалярное произвежение (" + vector1.toString() + ") и ( " + vector2.toString() + ") = "
				+ VectorMethods.dotProduct(vector1, vector2));
		System.out.println("длина вектора ( " + vector1.toString() + ") = " + VectorMethods.length(vector1));
		System.out.println("угол между векторами (" + vector1.toString() + ") и ( " + vector2.toString() + ") =  "
				+ VectorMethods.angle(vector1, vector2));
	}

}
