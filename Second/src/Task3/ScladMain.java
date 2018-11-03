package Task3;

public class ScladMain{

	public static void main(String[] args) {
		int priceForOne = 500, count = 120, newPriceForOne = 800, newCount = 150;
		Sclad sclad = new Sclad(count, priceForOne);
		System.out.println(sclad.showAllParams());
		System.out.println("Общая цена: " + sclad.calcAllPrice());
		sclad.modifyParams(newCount, newPriceForOne);
		System.out.println(sclad.getCount());
		System.out.println(sclad.getPriceForOne());
		System.out.println("Общая цена(измененная уже): " + sclad.calcAllPrice());
		Sclad.calcAll(sclad,new Sclad(140,50),new Sclad(160,105));
		Sclad carrot = new Sclad(100,100);
		Sclad beer = new Sclad(50,500);
		//System.out.println(carrot.getCount() + ", " + carrot.getPriceForOne());
		//System.out.println(beer.getCount() + ", " + beer.getPriceForOne());
		Sclad.equalPrices(carrot, beer);
		//System.out.println(carrot.calcAllPrice());
	}
}
