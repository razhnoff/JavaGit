package org.bsuir.task2;

public class AbiturientMain {

	public static void main(String[] args) {
		Abiturient[] abiturients = new Abiturient[3];
		Abiturient abiturient1 = new Abiturient(1, "Глиняны", "Сашка", "Терминаторович", "Пушкина 1", "23612255544", 8);
		Abiturient abiturient2 = new Abiturient(2, "Глиняны", "Саса", "Терминаторов", "Пушкина 3", "25512255544", 2); 
		Abiturient abiturient3 = new Abiturient(3, "Глиняно", "СаВилье", "Терминато", "Пушкина 8", "25512255666", 5);
		abiturients[0] = abiturient1;
		abiturients[1] = abiturient2;
		abiturients[2] = abiturient3;
		System.out.println("--------Task a---------");
		System.out.println();
		for (Abiturient abiturient : abiturients) {
			if (abiturient.getMark() < 5) {
				System.out.println(abiturient);
			}
		}
		System.out.println("--------Task b--------");
		System.out.println();
		for (Abiturient abiturient : abiturients) {
			if (abiturient.getMark() > 5) {
				System.out.println(abiturient);
			}
		}
		System.out.println("------Task c-------");
		System.out.println();
		for (Abiturient abiturient : abiturients) {
			if (abiturient.getMark() > 4) {
				System.out.println(abiturient);
			}
		}
	}
}
