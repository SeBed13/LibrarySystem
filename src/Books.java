public class Books {

    private int year;
    private String kindOfBook;
    private String title;
    private String author;
    private boolean isInStock;

    public Books(int year, String kindOfBook, String title, String author, boolean isInStock) {
        this.year = year;
        this.kindOfBook = kindOfBook;
        this.title = title;
        this.author = author;
        this.isInStock = isInStock;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getKindOfBook() {
        return kindOfBook;
    }

    public void setKindOfBook(String kindOfBook) {
        this.kindOfBook = kindOfBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }
}
