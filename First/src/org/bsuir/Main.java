package org.bsuir;

	public class Main {
		
		
		public static void main ( String[] args ){
			Integer objI;
			int i = 100;
			// пример ручной упаковки и распаковки
			objI = Integer.valueOf(i);
			System.out.println("1: " + objI.intValue());
			// пример автоматической упаковки/распаковки
			objI = 2000;
			i = objI;
			System.out.println("2: objI=" + objI + " i=" + i);
			// автоматическая упаковка/распаковка в методы
			double d;
			d = getDouble(2.345);
			System.out.println("3: d=" + d);
			// автоматическая упаковка/распаковка в выражении
			objI++;
			i = objI / 2 + 10;
			System.out.println("4: objI=" + objI + " i=" + i);
			// упаковка/распаковка булевского типа
			Boolean bool;
			bool = true;
			if (bool) {
			System.out.println("true");
			} else {
			System.out.println("false");
			}
			// упаковка/ распаковка символьного типа
			Character ch;
			ch = 'd';
			char c = ch;
			System.out.println(c);
		}
		
		public static double getDouble(Double d) {
			return d;
		}
}
