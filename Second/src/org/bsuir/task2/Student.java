package org.bsuir.task2;



public class Student {
	public String id;
	public String name;
	public String surName;
	public String middleName;
	public String address;
	public String telephone;
	public String faculty;
	public String course;
	public String group;
	public String date;
	
	public Student(String id, String address, String name, String surName, String middleName, String telephone, String faculty,
			String course, String group, String date) {
		this.id = id;
		this.address = address;
		this.name = name;
		this.surName = surName;
		this.middleName = middleName;
		this.telephone = telephone;
		this.faculty = faculty;
		this.course = course;
		this.group = group;
		this.date = date;
	}
	public void setId(String id) {
		/*System.out.println("Введите id студента");
		Scanner scId = new Scanner(System.in);
		if (scId.hasNextLine()) {
			id = scId.nextLine();
		}
		scId.close();*/
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setName(String name) {
		/*System.out.println("Введите имя студента");
		Scanner scName = new Scanner(System.in);
		if (scName.hasNextLine()) {
			name = scName.nextLine();
		}
		scName.close();*/
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSurName(String surName) {
		/*System.out.println("Введите фамилию студента");
		Scanner scSurName = new Scanner(System.in);
		if (scSurName.hasNextLine()) {
			surName = scSurName.nextLine();
		}
		scSurName.close();*/
		this.surName = surName;
	}
	public String getSurName() {
		return surName;
	}
	public void setMiddleName(String middleName) {
		/*System.out.println("Введите фамилию студента");
		Scanner scMiddleName = new Scanner(System.in);
		if (scMiddleName.hasNextLine()) {
			middleName = scMiddleName.nextLine();
		}
		scMiddleName.close();*/
		this.middleName = middleName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setAddress(String address) {
		/*System.out.println("Введите фамилию студента");
		Scanner scAddress = new Scanner(System.in);
		if (scAddress.hasNextLine()) {
			address = scAddress.nextLine();
		}
		scAddress.close(); */
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setTelephone(String telephone) {
		/*System.out.println("Введите фамилию студента");
		Scanner scTelephone = new Scanner(System.in);
		if (scTelephone.hasNextLine()) {
			telephone = scTelephone.nextLine();
		}
		scTelephone.close(); */
	}
	public String getTelephone() {
		return telephone;
	}
	public void setFaculty(String faculty) {
		/*System.out.println("Введите фамилию студента");
		Scanner scFaculty = new Scanner(System.in);
		if (scFaculty.hasNextLine()) {
			faculty = scFaculty.nextLine();
		}
		scFaculty.close(); */
		this.faculty = faculty;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setCourse(String course) {
		/*System.out.println("Введите фамилию студента");
		Scanner scCourse = new Scanner(System.in);
		if (scCourse.hasNextLine()) {
			course = scCourse.nextLine();
		}
		scCourse.close(); */
		this.course = course;
	}
	public String getCourse() {
		return course;
	}
	public void setGroup(String group) {
		/*System.out.println("Введите фамилию студента");
		Scanner scGroup = new Scanner(System.in);
		if (scGroup.hasNextLine()) {
			group = scGroup.nextLine();
		}
		scGroup.close(); */
		this.group = group;
	}
	public String getGroup() {
		return group;
	}
	public void setDate(String date) {
		/*System.out.println("Введите фамилию студента");
		Scanner scDate = new Scanner(System.in);
		if (scDate.hasNextLine()) {
			date = scDate.nextLine();
		}
		scDate.close();		*/
		this.date = date;
	}
	public String getDate() {
		return date;
	}
	public String show() {
		return "Студент {id=" + id + ", Фамилия: " + surName + ", Имя: " + name + ", Отчество: " + middleName
				+ ", Дата рождения:" + date + " ,\n Адрес:" + address + " , Телефон:" + telephone + ", Факультет:" + faculty + ", Курс:"
				+ course + ", Группа:" + group + " }";
	}
	
}
