package First;

import java.util.Random;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Matrix implements Aryphmetics {
	private int[][] arr;

	public Matrix() {
		System.out.println("Введите число строк");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		System.out.println("введите число столбцов");
		int cols = sc.nextInt();
		this.arr = new int[rows][cols];
		System.out.println("Zapisana matriza, strok =  " + rows + " columns = " + cols);
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				this.arr[i][j] = rand.nextInt(21) - 10;
			}
		}
	}

	public void setMatrix(int[][] arr) {
		this.arr = arr;
	}

	public void getMatrix() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(this.arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public int getValue(int rIndex, int cIndex) {
		return this.arr[rIndex][cIndex];
	}

	public void getEquals() {
		int counter = 0;
		System.out.println("Введите целое число для сравнения от -10 до 10");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == n) {
					counter++;
				}
			}
		}
		System.out.println("Количество совпадений с числом = " + counter);
	}

	@Override
	public int addition() {
		int m[][] = this.arr;
		int summ = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				summ += m[i][j];
			}
		}
		return summ;
	}

	@Override
	public void comparison() {
		System.out.println("Scaling some matrix");

	}

	protected void finalize() {
		Scanner sc = new Scanner(System.in);
		sc.close();
	}

}
