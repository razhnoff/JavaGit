package oop.bsuir.laba3.Task3;

import java.util.Random;

public class Matrix implements Normalize{
	private int[][] matrix;

	public Matrix() {
		int m = 2, n = 2;
		Random r = new Random();
		this.matrix = new int[m][n];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = r.nextInt(21) - 10;
			}
		}
	}

	public void getMatrix() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	@Override
	public double norm() {
		double maxOfMatrix = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (Math.abs(matrix[i][j]) >= maxOfMatrix) {
					maxOfMatrix = Math.abs(matrix[i][j]);
				}
			}
		}
		return maxOfMatrix;
	}
}
