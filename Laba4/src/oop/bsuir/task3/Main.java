package oop.bsuir.task3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println("<--------------Task 3-- ArrayList----------------------------->");
		System.out.println("Сколько человек вы хотите?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> circles = new ArrayList<Integer>(n);
		List<Integer> list1 = new ArrayList<Integer>(n);
		int i = 1;
		do {
			circles.add(i);
			i++;
		} while (i <= n);
		System.out.println("ArrayList " + circles);
		System.out.println("---------------LinkedList-----------------------");
		List<Integer> c1 = new LinkedList<Integer>();
		i = 1;
		for (Integer circle : circles) {
			c1.add(i);
			i++;
		}
		System.out.println("LinkedList " + c1);
		System.out.println("------------ Delete every 2 item --------------------------");
		while (circles.size() != 1) {
			circles.remove(1);
		}
		System.out.println("ArrayList after delete items" + circles);
		while (c1.size() != 1) {
			c1.remove(1);
		}
		System.out.println("LinkedList after delete items" + c1);
		System.out.println("---------------Second solution model -----------------------");
		for (int ind = 1; ind <= n; ind++) {
			list1.add(ind);
		}
		int ind = 0;
		int size = 0;
		while (list1.size() > 1) { 
			if (list1.size() % 2 != 0) { // Если длина списка Нечётная

				ind = 0;
				size = list1.size() / 2; // Количество элементов которые удалятся
				for (int j = 0; j < size; j++) {
					list1.remove(ind + 1);
					System.out.println(list1);
					ind++;
				}
				list1.remove(0);
				

			} else if (list1.size() % 2 == 0) { // Если длина списка чётная
				ind = 0;
				size = list1.size() / 2;

				for (int j = 0; j < size; j++) {
					list1.remove(ind + 1);
					System.out.println(list1);
					ind++;
				}
				
			}
		}
		System.out.println("Оставшееся число после удаления: " + list1.get(0));
		Circle c5 = new Circle();
		System.out.println(c5);
	}

}
