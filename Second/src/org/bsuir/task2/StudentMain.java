package org.bsuir.task2;
import java.util.Scanner;
public class StudentMain {

	public static void main(String[] args) {
		Student[] students = new Student[4];
		Student stud1 = new Student("1", "Бровки 4", "Maxim", "Razhnov", "Igorevich", "+375447235440", "ФИК",
				"3", "663102", "1999");
		Student stud2 = new Student("2", "Глинки 9", "Sanya", "Machina", "Terminatorovich", "+880055535350", 
				"КСИС", "4", "753659", "1988");
		Student stud3 = new Student("3", "Шунаева 20/5", "Gadya", "Petrovich", "Hrenova", "+777555333",
				"ФРЭ", "1", "655201", "2000");
		Student stud4 = new Student("4", "Энгельса 2", "Вася", "Пупкин", "Ибрагимович", "+375297559944", "ФИК",
				"2", "663102", "1995");
		students[0] = stud1;
		students[1] = stud2;
		students[2] = stud3;
		students[3] = stud4;
		System.out.println("----Task a---");
		System.out.println("Введите нужный факультет студента заглавными буквами");
		Scanner sc = new Scanner(System.in);
		String facultyStud = sc.nextLine();
		for (Student student : students) {			
			if (student.getFaculty().equals(facultyStud)) {
				System.out.println(student.show());
			}
		}
		sc.close();
		System.out.println("----Task b-----");
		for (Student student : students) {
			if (student.getFaculty().equals("КСИС") && student.getCourse().equals("4")) {
				System.out.println(student.show());
			}
		}
		System.out.println("----Task c-----");
		for (Student student : students) {
			int i =Integer.parseInt(student.getDate());
			if (i > 1993) {
				System.out.println(student.show());
			}
		}
		System.out.println("----Task d--------");
		for (Student student : students) {
			if (student.getGroup().equals("663102")) {
				System.out.println(student.show());
			}
		}
	}
}