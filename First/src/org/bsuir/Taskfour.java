package org.bsuir;
import java.util.Scanner; 
public class Taskfour {

	public static void main(String[] args) {
		int pass = 1256, n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите четырехзначное число");
		boolean metka = true;
		while (metka == true) {
			if (sc.hasNextInt()) {
				n = sc.nextInt();
				String s = n + "";
				if (s.length() == 4 && n == pass) {
					System.out.println("Ваш пароль= " + n);
					metka=false;
				}
				else {
					System.out.println("Введите еще раз");
					metka = true;
				}
			}
			else {
				System.out.println("Вы ввели не целое число");
				metka = false;
			}
		}
		sc.close();
	}
}
	
