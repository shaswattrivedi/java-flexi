import java.util.*;

class Books {
    String title;
    String author;
    String isbn;

    Books(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

class Library {
    List<Books> BooksList = new ArrayList<>();

    void addBook(Books book) {
        BooksList.add(book);
    }
    
    Books searchByTitle(String title) {
        for(Books b : BooksList) {
            if(b.title.equalsIgnoreCase(title)) {
                return b;
            } else {
                return null;
            }
        }
        return null; 
    }
    
    void displayBooks() {
        for(Books b: BooksList) {
            b.display();
        }
    }
}

public class LibraryManager {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Books("JAVA BASICS", "John", "111"));
        lib.addBook(new Books("DSA CORE", "Delmore", "222"));

        Books found = lib.searchByTitle("JAVA BASICS");
        if(found != null) {
            found.display();
        }
        lib.displayBooks();
    }
}
