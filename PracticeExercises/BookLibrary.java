

class Book {
	String Title;
	String Author;
	String Genre;
	Boolean isAvailable;

	Book(String title, String author, String genre) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.isAvailable = true;
	}

	void borrow() {
		if (isAvailable) {
			isAvailable = false;
			System.out.println(title + " has been borrowed");
		} else {
			System.out.println(title + " is not available");
		}
	}

	void returnBook() {
		isAvailable = true;
		System.out.println(title + " has been returned.");
	}

	void displayInfo() {
		System.out.println("Title" + title);
		System.out.println("Author" + author);
		System.out.println("Genre" + genre);
		System.out.println("Available:" + (isAvailable ? "Yes" : "No"));
		System.out.println("---------------------")
	}
}

class Library {
	Book[] books = new Book[100];
	int numberOfBooks = 0;

	void addBook(Book book) {
		if (numberOfBooks < books.length) {
			books[numberOfBooks] = book;
			numberOfBooks++;
			System.out.println(book.title + " added to the library.");
		} else {
			System.out.println("Library is full. Cannot add more books.");
		}
	}

	void borrowBook(String title) {
		for (int i = 0; i < numberOfBooks; i++) {
			if (books[i].title.equalsIgnoreCase(title)) {
				books[i].borrow();
				return;
			}
		}
		System.out.println(title + " not found in the library.");
	}

	void returnBook(String title) {
		for (int i = 0; i < numberOfBooks; i++) {
			if (books[i].title.equalsIgnoreCase(title)) {
				books[i].returnBook();
				return;
			}
		}
		System.out.println(title + " not found in the library.");
	}

	void displayAvailableBooks() {
		System.out.println("\nAvailable Books: ");
		for (int i = 0; i < numberOfBooks; i++) {
			if (books[i].isAvailable) {
				books[i].displayInfo();
			}
		}
	}
			
}



public class BookLibrary {
	
	public static void main(String[] args) {
		Library myLibrary = new Library();

		Book book1 = new Book("Atomic Habits", "James Clear", "Personal Development");
		Book book2 = new Book("The Hobbit", "J.R. Tolkien", "Fantasy");
		Book book3 = new Book("The Hobbit", "J.R. Tolkien", "Fantasy");
		Book book4 = new Book("The Hobbit", "J.R. Tolkien", "Fantasy");
		Book book5 = new Book("The Hobbit", "J.R. Tolkien", "Fantasy");
		Book book6 = new Book("The Hobbit", "J.R. Tolkien", "Fantasy");
		Book book7 = new Book("The Hobbit", "J.R. Tolkien", "Fantasy");
		Book book8 = new Book("The Hobbit", "J.R. Tolkien", "Fantasy");
		Book book9 = new Book("The Hobbit", "J.R. Tolkien", "Fantasy");
		Book book10 = new Book("The Hobbit", "J.R. Tolkien", "Fantasy");
		


	}
}