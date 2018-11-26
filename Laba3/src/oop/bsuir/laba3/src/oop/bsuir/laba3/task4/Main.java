package oop.bsuir.laba3.task4;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		System.out.println("=====================Task 1-------------------------------");
		int mark[] = new int[5];
		Random r = new Random();
		for (int i = 0; i < mark.length; i++) {
			mark[i] = r.nextInt(8) + 2;
			System.out.print(mark[i] + "\t");
		}
		System.out.println();
		Zaochnik student1 = new Zaochnik(5, "max", "petrov", "petrovich", "street", "+88005553535", mark);
		System.out.println("Средний бал = " + student1.getAvgMark());
		student1.getFullData();
		System.out.println("----------------------------------------------------------------");
		System.out.println("-------------Task 2-------------------");
		Engineer.Leader engineer = new Engineer(1, "max", "Razhnov", "DFBDJF", 8).new Leader();
		engineer.control();
		System.out.println("----------------------------------------------");
		System.out.println("--------------------Task 3--------------------------");
		Theatre theatre = new Theatre(1, "theatre", 180, "modern", 8, 2017);
		theatre.onBuild();
		System.out.println("Есть кто-нибудь в здании? " + theatre.IsPeopleHere());
		System.out.println("------------------------------------------------------");
		System.out.println("-----------------Task 4-------------------------------");
		Carrier carrier = new Carrier(1, "Avianosec", 2010, 4000, 200, 350);
		carrier.IsShip();
		carrier.whoAmI();
		System.out.println(carrier.getAllInfo());
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------Task 5-----------------------");
		CargoShip.Tanker tanker = new CargoShip(1, "Misha", 30000, 250000, 5000).new Tanker();
		System.out.println("Tanker?" + tanker.isTanker());
		tanker.onShip();
		System.out.println("--------------------------------------------------------");
		System.out.println("-----------------------Task 6------------------------------");
		VideoPlayer player = new VideoPlayer(1, "apple", 200, 200, "black", 5000, 1);
		player.inCases();
		player.onPlayer();
		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------------Task 7------------------------------");
		Tram tram = new Tram(1, "tram", "red", 1122, 50, true);
		tram.goPeople();
		System.out.println("Рога есть у трамвая? " + tram.isRoga());
	}

}
