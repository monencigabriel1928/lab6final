package lab6p2;

//Creati o clasa Book cu attributele title, author, ISBN.
// Creati o clasa Library care are ca atribut o lista de Books si metode de adaugare si stergere carti din lista.
// In clasa main creati cateva instante de books, dupa care le adaugati si stergeti din library.

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    // toString method for better representation
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        // Create instances of Book
        Book book1 = new Book("Ionica cel voinic si prunele de aur", "Mihai Creanga", "978-0-316-76948-0");
        Book book2 = new Book("Alba ca Cenusereasa", "Ion Caragiale", "978-0-06-112008-4");
        Book book3 = new Book("Moara fara noroc", "Marin Slavici", "978-0-452-28423-4");

        // Create an instance of Library
        Library library = new Library();

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display books in the library
        library.displayBooks();

        // Remove a book from the library
        library.removeBook(book2);

        // Display books in the library after removal
        library.displayBooks();
    }
}
