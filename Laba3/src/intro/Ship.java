package intro;

public class Ship {
	private int id;

	// abstract, final, private, protected - допустимы
	public static class LifeBoat {
		public static void down() {
			System.out.println("шлюпки на воду!");
		}

		public void swim() {
			System.out.println("отплытие шлюпки");
		}
	}
}
