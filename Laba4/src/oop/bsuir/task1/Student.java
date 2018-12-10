package oop.bsuir.task1;

import java.util.LinkedList;
import java.util.List;

public class Student implements Comparable<Student> {
	private String name;
	private int course;

	public Student(int course, String name) {
		this.course = course;
		this.name = name;

	}

	public Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	// мето
	public static void getAll(Student stud[]) {
		for (Student students : stud) {
			System.out.println(students);
		}
	}

	@Override
	public String toString() {
		return "(name=" + name + ", course=" + course + ")" + "\n";
	}

	// метод вывода списка студентов и тд
	private static void getDataAll(LinkedList<Student> students) { // дл€ коллекций
		for (Student student : students) {
			System.out.print(student);
		}
	}

	// метод поиска студента по номеру курса
	public static void printStudents(LinkedList<Student> students, int course) {
		System.out.println("»мена студентов с заданным курсом = " + course + ":");
		for (Student student : students) {
			if (course == student.getCourse()) {
				System.out.print(student);
				// getDataAll(student);
			}
		}
	}

	// метод пересечени€ множеств
	public static void intersect(List<Student> set1, List<Student> set2) {
		System.out.println("ѕересечение двух множеств: ");
		LinkedList<Student> Intersect = new LinkedList<Student>();
		for (Student student : set1) {
			for (Student student1 : set2) {
				if (student.getName().equals(student1.getName()) && (student.getCourse() == student1.getCourse())) {
					Intersect.add(student);
					System.out.println("True");
				}
			}
		}
		getDataAll(Intersect);
	}

	// метод добавлени€ множеств
	public static void union(List<Student> set1, List<Student> set2) {
		System.out.println("ƒобавление множества:");
		LinkedList<Student> Union = new LinkedList<Student>();
		Union.addAll(set1);
		Union.addAll(set2);
		// System.out.println(Union);
		getDataAll(Union);
	}

	@Override
	public int compareTo(Student o) {
		return course - o.getCourse();
	}

}
