package Examples;

	public class Rectangle extends TwoDShape {
		// Конструктор по умолчанию
		public Rectangle() {
		super();
		}
		// Конструктор класса Rectangle
		public Rectangle(double w, double h) {
		super(w, h, "rectangle"); // Вызов конструктора суперкласса
		}
		// Формирование квадрата
		public Rectangle(double x) {
		super(x, "rectangle"); // Вызов конструктора суперкласса
		}
		// Формирование объекта на основе другого объекта
		public Rectangle(Rectangle ob) {
		super(ob); // Передача объекта конструктору TwoDShape
		}
		public boolean isSquare() {
		if (getWidth() == getHeight()) {
		return true;
		}
		return false;
		}
		// Переопределение метода area() для класса Rectangle
		public double area() {
		return getWidth() * getHeight();
		}
	}