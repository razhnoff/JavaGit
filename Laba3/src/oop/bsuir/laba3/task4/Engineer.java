package oop.bsuir.laba3.task4;

public class Engineer implements Employee{
	private int id;
	private String name;
	private String surName;
	private String middleName;
	private double experience;
	
	
	public Engineer(int id, String name, String surName, String middleName, double experience) {
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.middleName = middleName;
		this.experience = experience;
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

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public class Leader extends Engineer{
		
		public Leader(int id, String name, String surName, String middleName, double experience) {
			super(id, name, surName, middleName, experience);
		}

		public void control() {
			if (super.experience >= 5) {
				System.out.println("Вы управляете инженерами");
			}
			System.out.println("Вы обычный работник");
		}
		
		public void giveSalary() {
			System.out.println("Выдаем зарплату");
		}
	}
	
	public void getSalary() {
		
	}
}
