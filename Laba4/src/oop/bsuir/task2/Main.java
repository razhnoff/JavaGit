package oop.bsuir.task2;

import java.util.Random;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) {
		System.out.println("<--------------Task 2------------------------------->");
		TreeSet<Numb> listNumb = new TreeSet<Numb>();
		Random r = new Random();
		/*for (Numb list : listNumb) {
			listNumb.add(new Numb(r.nextInt(21)-10));
		}*/
		listNumb.add(new Numb(r.nextInt(21)-10));
		listNumb.add(new Numb(r.nextInt(21)-10));
		listNumb.add(new Numb(r.nextInt(21)-10));
		System.out.println(listNumb);
		System.out.println("--------------------------------");

	}

}
