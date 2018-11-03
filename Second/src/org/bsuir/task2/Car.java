package org.bsuir.task2;

public class Car {
	public int id;
	public String name;
	public String model;
	public int date;
	public String color;
	public int price;
	public int registr;
	
	public Car(int id, String name, String model, int date, String color, int price,
			int registr) {
		this.id = id;
		this.name = name;
		this.model = model;
		this.date = date;
		this.color = color;
		this.price = price;
		this.registr = registr;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getDate() {
		return date;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setRegistr(int registr) {
		this.registr = registr;
	}
	public int getRegistr() {
		return registr;
	}
	public String show() {
		return "Car: {id= " + id + " , name: " + name + " , model: " + model + " , date: " + date
				+ "\n , color: " + color + " , price: " + price +"$" + " , registr: " + registr +"}";
	}
}
