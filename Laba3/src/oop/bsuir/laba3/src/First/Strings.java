package First;

import java.util.Scanner;

public class Strings implements Aryphmetics {
	private String[] str;

	public Strings() {
		System.out.println("Введите размерность массива строк");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // отдельная переменная чтоб в консоли вводилось один раз, два раза упоминалось
								// sc.nextInt()
		this.str = new String[n];
		System.out.println("Массив строк = " + n);
		System.out.println("Введите массив  символов");
		// System.out.println(str.length);
		for (int i = 0; i < str.length; i++) {
			this.str[i] = sc.next();
		}
		System.out.println("Строка записана!");
		String str = String.join("", this.str);
		System.out.println("Склееная строка: " + str);
	}

	protected void finalize() {
		Scanner sc = new Scanner(System.in);
		sc.close();
	}

	public void getString() {
		System.out.println("Введенная строка");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + "\t");
		}
		System.out.println();
	}

	public String getValue(int num) {
		System.out.println("Введите строку, состоящую из минимум " + num + "символов");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Ваша строка: " + str);
		return "Значение из строки по номеру: " + str.charAt(num);
	}

	@Override
	public void addition() {
		System.out.print("Old String");
		System.out.print("New String");
	}

	@Override
	public void comparison() {
		System.out.println();
		System.out.println("Введите начальную строку");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Первая строка: " + str);
		System.out.println("Введите вторую строку");
		String str2 = sc.nextLine();
		System.out.println("Вторая строка: " + str2);
		if (str.equals(str2)) {
			System.out.println("Строки совпадают");
		}
		else {
			System.out.println("Не совпадают");
		}
	}

}
