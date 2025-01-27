package learn.library.data.model;

public class Book {

    private BookCategory category;
    private int shelfNumber;
    private int position;
    private String author;
    private int yearPublished;
    private String isbn;

    public Book(BookCategory category, int shelfNumber, int position, String author, int yearPublished, String isbn) {
        this.category = category;
        this.shelfNumber = shelfNumber;
        this.position = position;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
    }

    public BookCategory getCategory() {
        return category;
    }

    public void setCategory(BookCategory category) {
        this.category = category;
    }

    public int getShelfNumber() {
        return shelfNumber;
    }

    public void setShelfNumber(int shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
