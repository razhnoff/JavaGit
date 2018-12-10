package oop.bsuir.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
	

	public static void main(String[] args) {
		System.out.println("------------- Task 4 ---------------------------");
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(new Random().nextInt(100)-100);
		}
		System.out.println(list);
		for (int a = 1; a < list.size(); ++a)
			for (int b = list.size() - 1; b >= a; --b) {
				if (list.get(b - 1) > list.get(b)) {
					list.set(b - 1, list.get(b - 1) + list.get(b));
					list.set(b, list.get(b - 1) - list.get(b));
					list.set(b - 1, list.get(b - 1) - list.get(b));
				}
			}
		System.out.println(list);
		System.out.println("----------------------------------------");
	}

}
