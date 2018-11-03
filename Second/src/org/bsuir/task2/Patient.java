package org.bsuir.task2;

public class Patient {
	public int id;
	public String surName;
	public String name;
	public String middleName;
	public String address;
	public String phoneNum;
	public int medicina;
	public String diagnoz;
	
	public Patient(int id, String surName, String name, String middleName, String address, String phoneNum,
			int medicina, String diagnoz) {
		super();
		this.id = id;
		this.surName = surName;
		this.name = name;
		this.middleName = middleName;
		this.address = address;
		this.phoneNum = phoneNum;
		this.medicina = medicina;
		this.diagnoz = diagnoz;
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

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getMedicina() {
		return medicina;
	}

	public void setMedicina(int medicina) {
		this.medicina = medicina;
	}

	public String getDiagnoz() {
		return diagnoz;
	}

	public void setDiagnoz(String diagnoz) {
		this.diagnoz = diagnoz;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id +" , Фамилия: " + surName + " ,Имя: " + name + ",\n Отчество: " 
				+ middleName + " , адрес: " + address + " , телефон: " + phoneNum +
				" ,\n мед карта: " + medicina + " , диагноз: " + diagnoz + "]";
	}
	

	
	

}
