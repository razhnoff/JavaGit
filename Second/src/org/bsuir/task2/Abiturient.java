package org.bsuir.task2;

public class Abiturient {
	private int id;
	private String surName;
	private String name;
	private String middleName;
	private String address;
	private String phone;
	private int mark;
	
	public Abiturient(int id, String surName, String name, String middleName, String address, String phone, int mark) {
		super();
		this.id = id;
		this.surName = surName;
		this.name = name;
		this.middleName = middleName;
		this.address = address;
		this.phone = phone;
		this.mark = mark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Abiturient [id=" + id + ", surName=" + surName + ", name=" + name + ",\n middleName=" + middleName
				+ ", address=" + address + ", phone=" + phone + ", mark=" + mark + "]";
	}
	
	
	

}
