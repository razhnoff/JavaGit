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
		System.out.println(arr.addition());
		arr.getEquals();
		System.out.println("--------------Task String------------" + "\n");
		Strings str = new Strings();
		str.getMas();
		System.out.println(str.getValue(5));
		System.out.println("--------------Task Vector----------------" + "\n");
		str.finalize(); // сан€ по€сни, его нужно вызывать или как, в методе написано что сборка мусора
						// выполн€етс€ автоматически

	}

}
