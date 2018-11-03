package Task3;

public class Sclad extends ScladBasic {
	
	public Sclad(int count, int priceForOne) {
		this.count = count;
		this.priceForOne = priceForOne;
	}
	
	public int getCount() {
		return count;
	}

	public void modifyParams(int newCount, int newPriceForOne) {
		 count = newCount;
		 priceForOne = newPriceForOne;
	}
	
	public void setCount(int count) {
		this.count = count;
	}

	public int getPriceForOne() {
		return priceForOne;
	}

	public void setPriceForOne(int priceForOne) {
		this.priceForOne = priceForOne;
	}
	
	public int calcAllPrice() {
		return count * priceForOne;
	}
	
	public static void equalPrices(Sclad ... n) {
			if (n[0].calcAllPrice() > n[1].calcAllPrice()) {
				System.out.println("Стоимость товара " + "Морковь " + "больше");	
				System.out.println(n[0].calcAllPrice());
			}
			else {
				System.out.println("Стоимость товара " + "Пиво " + "больше");
				System.out.println(n[1].calcAllPrice());
			}
	}
	public static void calcAll(Sclad ... n) {
		int k = 0;
		for(int i = 0; i < n.length; i++) {
			k+=n[i].getCount();
			System.out.print(k + "\t");
		}
		System.out.println("Количество товаров "+k);
	}
	
	public String showAllParams() {
		return "ScladBasic [count=" + count + ", priceForOne=" + priceForOne + "]";
	}
	
}
