package intro;

public class HomeRadio implements Radio {
	private int channel;

	
	public void on() {
		System.out.println("Радио включено");
	}

	
	public void off() {
		System.out.println("Радио выключено");
	}

	
	public void nextChannel() {
		this.channel++;
	}

	
	public void previousChannel() {
		this.channel--;
	}

	
	public void showChannel() {
		System.out.println("Текущий канал " + channel);
	}
}
