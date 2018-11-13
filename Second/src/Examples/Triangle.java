package Examples;

	public class Triangle extends TwoDShape {
		private String style;
		// Конструктор по умолчанию
		public Triangle() {
		super();
		style = "null";
		}
		// Конструктор класса Triangle
		public Triangle(String s, double w, double h) {
		super(w, h, "triangle");
		style = s;
		}
		// формирование равнобедренных треугольников
		public Triangle(double x) {
		super(x, "triangle"); // Вызов конструктора суперкласса
		style = "isosceles";
		}
		// формирование объекта на основе другого объекта
		public Triangle(Triangle ob) {
		super(ob); // Передача объекта конструктору TwoDShape
		style = ob.style;
		}
		// Переопределение метода area() для класса Triangle
		public double area() {
		return getWidth() * getHeight() / 2;
		}
		void showStyle() {
		System.out.println("Triangle is " + style);
		}
	}
	

