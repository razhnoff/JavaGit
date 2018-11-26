package First;

public class Main {

	public static void main(String[] args) {
		System.out.println("--------------Task Matrix--------------" + "\n");
		Matrix arr = new Matrix();
		// int mas[][]= new int[5][5];
		// arr.setMatrix(mas);
		arr.getMatrix();
		System.out.println("«начение матрицы по номеру €чейки = " + arr.getValue(2, 3));
		arr.comparison();
		arr.addition();
		arr.getEquals();
		System.out.println("--------------Task String------------" + "\n");
		Strings str = new Strings();
		str.getString();
		System.out.println(str.getValue(5));
		str.addition();
		str.comparison();
		str.finalize();
		System.out.println("--------------Task Vector----------------" + "\n");
		Vector vector = new Vector();
		vector.getVectors(vector);
		vector.setVectors();

	}

}
