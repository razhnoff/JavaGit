package oop.bsuir.task1;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) {
		System.out.println("<--------------Task 1------------------------------->");
		Student stud[] = new Student[5];
		stud[0] = new Student(1, "max");
		stud[1] = new Student(5, "vlad");
		stud[2] = new Student(2, "sasha");
		stud[3] = new Student(4, "sanya");
		stud[4] = new Student(3, "max");
		Student.getAll(stud);
		System.out.println("--------------------------------");
		LinkedList<Student> students = new LinkedList<Student>();
		/*for (int i = 0; i < stud.length; i++) {
			students.add(stud[i]);
		}*/

		for (Student student : stud) {
			students.add(student);
			System.out.println(student);
		}

		System.out.println("Наш список студентов: " + "\n" + students);
		Student.printStudents(students, 2);
		System.out.println("--------------------------------");
		List<Student> set1 = new LinkedList<Student>();
		List<Student> set2 = new LinkedList<Student>();

		Student stud1[] = new Student[5];
		stud1[0] = new Student(1, "max");
		stud1[1] = new Student(5, "goga");
		stud1[2] = new Student(4, "werwerwer");
		stud1[3] = new Student(3, "cvcv");
		stud1[4] = new Student(2, "nikita");
		for (int i = 0; i < stud1.length; i++) {
			set2.add(stud1[i]);
		}
		for (int i = 0; i < stud.length; i++) {
			set1.add(stud[i]);
		}
		System.out.println(set1);
		Student.union(set1, set2);

		System.out.println("--------------------------------");
		Student.intersect(set1, set2);
		System.out.println("----------- TreeSet ---------------------");
		Set<Student> treeStudent = new TreeSet<>(students);
		System.out.println(treeStudent);
		
		System.out.println("--------------------------------");
	}

}
