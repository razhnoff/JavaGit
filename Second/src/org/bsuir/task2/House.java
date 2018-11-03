package org.bsuir.task2;

public class House {
	private int id;
	private int number;
	private int square;
	private int floor;
	private int roomCount;
	private String street;
	private String type;
	private int duration;
	
	public House(int id, int number, int square, int floor, int roomCount, String street, String type, int duration) {
		super();
		this.id = id;
		this.number = number;
		this.square = square;
		this.floor = floor;
		this.roomCount = roomCount;
		this.street = street;
		this.type = type;
		this.duration = duration;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getSquare() {
		return square;
	}
	public void setSquare(int square) {
		this.square = square;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getRoomCount() {
		return roomCount;
	}
	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "House [id=" + id + ", number=" + number + ", square=" + square +"ì2" + ",\n floor=" + floor + ", roomCount="
				+ roomCount + ", street=" + street + ", type=" + type + ",\n duration=" + duration + "]";
	}

	
}
