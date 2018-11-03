package Task2;

public class CircleMain {

	public static void main(String[] args) {
		int radius = 8, xCoord = 5, yCoord = 5;
		Circle circle = new Circle(radius, xCoord, yCoord);
		System.out.println(circle.showAllParamsCircle());
		System.out.println("Площадь круга = " + circle.calcSquare(radius));
		System.out.println("Длина окружности С = " + circle.calcLength(radius));
		//circle.editRadius(circle, newRadius);
		System.out.println(circle.radius);
		circle.modifyCoord(10, 20);
	}

}
