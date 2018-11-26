package oop.bsuir.laba3.Task3;

import java.util.Random;

public class Vector implements Normalize {

	private int[] vector;

	public Vector() {
		int n = 10;
		this.vector = new int[n];
		Random r = new Random();
		for (int i = 0; i < vector.length; i++) {
			vector[i] = r.nextInt(21) - 10;
		}
	}

	public int[] getVector() {
		return vector;
	}

	public void setVector(int[] vector) {
		this.vector = vector;
	}

	public void getVectorMas() {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + "\t");
		}
		System.out.println();
	}

	@Override
	public double norm() {
		double summ = 0;
		for (int i = 0; i < vector.length; i++) {
			summ += Math.abs(vector[i]);
		}
		summ = Math.sqrt(summ);
		return summ;
	}

}
