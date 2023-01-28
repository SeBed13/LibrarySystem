import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {

    private ArrayList<Librarian> librarians;
    private ArrayList<Books> books;

    private ArrayList<Costumer> costumers;
    private int booksNo;
    private int librarianNo;
    private int booksBorrowed;

    public LibrarySystem(ArrayList<Librarian> librarians) {
        this.librarians = librarians;

    }

    public LibrarySystem(Librarian librarian) {
        this.librarians.add(librarian);
    }

    @Override
    public String toString() {
        return "LibrarySystem{" +
                "librarians=" + librarians +
                '}';
    }

    public ArrayList getLibrarian() {
        return librarians;
    }

    public void setLibrarian(ArrayList<Librarian> librarians) {
        this.librarians = librarians;
    }

    public ArrayList getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Books> books) {
        this.books = books;
    }

    public ArrayList getCostumer() {
        return costumers;
    }

    public void setCostumer(ArrayList<Costumer> costumers) {
        this.costumers = costumers;
    }

    public int getBooksNo() {
        return booksNo;
    }

    public void setBooksNo(int booksNo) {
        this.booksNo = booksNo;
    }

    public int getLibrarianNo() {
        return librarianNo;
    }

    public void setLibrarianNo(int librarianNo) {
        this.librarianNo = librarianNo;
    }

    public int getBooksBorrowed() {
        return booksBorrowed;
    }

    public void setBooksBorrowed(int booksBorrowed) {
        this.booksBorrowed = booksBorrowed;
    }
}
