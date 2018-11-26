package oop.bsuir.laba3.task4;

import java.util.Arrays;

public class Zaochnik extends Student implements Abiturient {

	private int id;
	private String name;
	private String surName;
	private String middleName;
	private String address;
	private String phone;
	private int[] mark;

	public Zaochnik(int id, String name, String surName, String middleName, String address, String phone, int[] mark) {
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.middleName = middleName;
		this.address = address;
		this.phone = phone;
		this.mark = mark;
	}

	@Override
	public void getFullData() {
		System.out.println(
				"Zaochnik [id= " + id + ", name= " + name + ", surName= " + surName + ", middleName= " + middleName
						+ ", address= " + address + ", phone= " + phone + ", mark= " + Arrays.toString(mark) + "]");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int[] getMark() {
		return mark;
	}

	public void setMark(int[] mark) {
		this.mark = mark;
	}

	@Override
	public double getAvgMark() {
		double avg = 0;
		for (int i = 0; i < mark.length; i++) {
			avg += mark[i];
		}
		avg = avg / (mark.length - 1);
		return avg;
	}

}
