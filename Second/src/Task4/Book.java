package Task4;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Book {

	private String author;
	private String name;
	private int date;
	private int countPages;
	
	public Book() {
	}
	
	public Book(String author, String name, int date, int countPages) {
		this.author = author;
		this.name = name;
		this.date = date;
		this.countPages = countPages;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setAuthor(Book book1) {
		System.out.println("Введите автора книги ");
		Scanner sc = new Scanner(System.in);
		book1.author = sc.nextLine();
		System.out.println("Новый автор " + book1.getAuthor());
		sc.close();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setName(Book book1) {
		System.out.println("Введите новое имя книги");
		Scanner sc = new Scanner(System.in);
		book1.name = sc.nextLine();
		System.out.println("новове имя книги " + book1.getName());
		sc.close();
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}
	
	public void setDate(Book book1) {
		System.out.println("Введите новую дату");
		Scanner sc = new Scanner(System.in);
		book1.date = sc.nextInt();
		System.out.println("Новая дата " + book1.getDate());
		sc.close();
	}

	public int getCountPages() {
		return countPages;
	}

	public void setCountPages(int countPages) {
		this.countPages = countPages;
	}
	
	public void setCountPages(Book book1)  {
		System.out.println("Введите кол-во страниц");
		Scanner sc = new Scanner(System.in);
		book1.countPages = sc.nextInt();
		System.out.println("Новое число страниц" + book1.getCountPages());
		sc.close();
	}
	
	public void modifyAuthor(String author) {
		this.author = author;
	}
	
	public void modifyName(String name) {
		this.name = name;
	}
	
	public void modifyDate(int date) {
		this.date = date;
	}
	
	public void modifyCountPages(int countPages) {
		this.countPages = countPages;
	}
	
	public void allParamsByName(Book[] books ,String name) {
		for (Book book : books) {
			if (book.getName().equals(name)) {
				System.out.println(book);
			}
		}
	}
	
	@Override
	public String toString() {
		return "Books [author=" + author + ", name=" + name + ", date=" + date + ", countPages=" + countPages + "]";
	}
}
