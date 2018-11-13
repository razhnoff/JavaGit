package Examples;

public class DynShapes{

	public static void main(String[] args) {
		TwoDShape shapes[] = new TwoDShape[5];
		shapes[0] = new Triangle("right", 8.0, 12.0);
		shapes[1] = new Rectangle(10);
		shapes[2] = new Rectangle(10, 4);
		shapes[3] = new Triangle(7.0);
		//shapes[4] = new TwoDShape(10, 20, "generic");
		for (int i = 0; i < shapes.length; i++) {
		System.out.println("object is " + shapes[i].getName());
		// Требуемый вариант area() определяется
		// для каждой геометрической фигуры
		System.out.println("Area is " + shapes[i].area());
		System.out.println();
		}
	}
}
