package Examples;

public abstract class TwoDShape {
	private double width;
	private double height;
	private String name;

	// Конструктор по умолчанию
	public TwoDShape() {
		width = height = 0.0;
		name = "null";
	}

	// Конструктор с параметрами
	public TwoDShape(double w, double h, String n) {
		width = w;
		height = h;
		name = n;
	}

	// Формирование объекта с равными
	// значениями width и height
	public TwoDShape(double x, String n) {
		width = height = x;
		name = n;
	}

	// Формирование объекта на основе другого объекта
	public TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}

	// Методы для доступа к переменным width и height
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setWidth(double w) {
		width = w;
	}

	public void setHeight(double h) {
		height = h;
	}

	public String getName() {
		return name;
	}

	public void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}

	public double area() {
		System.out.println("area() must be overridden");
		return 0.0;
	}
}
