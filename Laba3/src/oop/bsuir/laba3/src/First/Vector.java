package First;

import java.util.Arrays;
import java.util.Scanner;

public class Vector implements Aryphmetics {
	private int[] vectorMas;
	private int vector1;
	private int vector2;

	public Vector() {
		System.out.println("Введите количество векторов");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		System.out.println("В массиве будет " + count + " векторов");
		this.vectorMas = new int[count];
		System.out.println("Введите длину векторов в массив");
		for (int i = 0; i < vectorMas.length; i++) {
			vectorMas[i] = sc.nextInt();
		}

	}

	public void setVectors() {
		System.out.println();
		System.out.println("Введите первую точку");
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Первая точка A (" + x1 + ", " + y1 + ")");
		System.out.println("Введите вторую точку");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		System.out.println("Вторая точка B (" + x2 + ", " + y2 + ")");
		int vector1_length = (int) Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		this.vector1 = vector1_length;
		System.out.println("Введите первую точку второго вектора");
		int x11 = sc.nextInt();
		int y11 = sc.nextInt();
		System.out.println("Первая точка A (" + x11 + ", " + y11 + ")");
		System.out.println("Введите вторую точку");
		int x22 = sc.nextInt();
		int y22 = sc.nextInt();
		System.out.println("Вторая точка B (" + x22 + ", " + y22 + ")");
		int vector2_length = (int) Math.sqrt((x11 - x22) * (x11 - x22) + (y11 - y22) * (y11 - y22));
		this.vector2 = vector2_length;
	}

	public int getVector1() {
		return vector1;
	}

	public int getVector2() {
		return vector2;
	}

	public void getLength(Vector vector1, Vector vector2) {
		if (vector1.getVector1() == vector2.getVector2()) {
			System.out.println("Длины векторов совпадают");
		} else {
			System.out.println("Вектора не равны");
		}
	}

	public void getVectors(Vector vector) {
		System.out.println("Ваш массив векторов:");
		for (int i = 0; i < vectorMas.length; i++) {
			System.out.print(vectorMas[i] + "\t");
		}
	}

	@Override
	public void addition() {
		// TODO Auto-generated method stub

	}

	@Override
	public void comparison() {
		// TODO Auto-generated method stub

	}

}
