package oop.bsuir.task3;

import java.util.Arrays;
import java.util.Scanner;

public class Circle {

	private int[] id;

	public Circle() {
		System.out.println("Сколько человек вы хотите?");
		Scanner sc = new Scanner(System.in);
		this.id = new int[sc.nextInt()];
		int i = 0;
		int n = 1;
		do {
			id[i] = n;
			n++;
			i++;
		} while (i < id.length);
		sc.close();
	}
	

	public int[] getId() {
		return id;
	}

	public void setId(int[] id) {
		this.id = id;
	}

	public void getMas() {
		for (int i = 0; i < id.length; i++) {
			System.out.print(id[i] + "\t");
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "id=" + Arrays.toString(id);
	}

}
