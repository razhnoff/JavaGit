package Task4;

public class BookMain {

	public static void main(String[] args) {
		Book[] books = new Book[3];
		Book book1 = new Book("Tolstoy", "Manya", 1888, 356);
		Book book2 = new Book("Grisha", "Moisha", 1900, 311);
		Book book3 = new Book("Pushkin", "Goisha", 1912, 188);
		books[0] = book1;
		books[1] = book2;
		books[2] = book3;
		/*for (int i = 0; i < books.length; i++ ) {
			System.out.println(books[i].showAllParams());
		}*/
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i]);
		}
		System.out.println(book1.getName());
		book1.modifyName("max");
		book1.allParamsByName(books, "max");
		book3.setName(book1);
		System.out.println(book1);
	}

}
