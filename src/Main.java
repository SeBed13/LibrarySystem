import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Librarian> librarians = new ArrayList<>();
        ArrayList<Books> books = new ArrayList<>();



        Librarian librarian = new Librarian("Andrei");
        Librarian librarian1 = new Librarian("Florin");

        librarians.add(librarian);
        librarians.add(librarian1);

        LibrarySystem librarySystem = new LibrarySystem(librarians);

        System.out.println(librarySystem);

        LibrarySystem librarySystem1 = new LibrarySystem(librarians);

        System.out.println(librarySystem1);
    }
}