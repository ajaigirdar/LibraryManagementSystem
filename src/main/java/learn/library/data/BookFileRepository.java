package learn.library.data;

import learn.library.data.model.Book;
import learn.library.data.model.BookCategory;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class BookFileRepository implements BookRepository{
    private final String filePath;
    private static final String HEADER = "Category,Shelf Number,Position,Year Published,Author,ISBN";
    private final List<Book> books = new ArrayList<>();

    public BookFileRepository(String filePath) {
        this.filePath = filePath;
        ensureFileExists();
        loadBooksFromCsv();
    }

    private void ensureFileExists() {
        File file = new File(filePath);
        if (!file.exists()) {
            try(PrintWriter writer = new PrintWriter(file)) {
                writer.println(HEADER);
            } catch (IOException e ) {
                throw new RuntimeException("Could not create file: " + filePath, e);
            }
        }
    }

    public boolean add(Book book) {
        books.add(book);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(String.format("%s,%d,%d,%d,%s,%s%n",
                    book.getCategory(),
                    book.getShelfNumber(),
                    book.getPosition(),
                    book.getYearPublished(),
                    book.getAuthor(),
                    book.getIsbn()));
            return true;
        } catch (IOException ex) {
            books.remove(book);
            return false;
        }
    }

    private void loadBooksFromCsv() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean isHeader = true;

            while ((line = reader.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] bookData = line.split(",");

                if (bookData.length == 6) {
                    Book book = new Book(
                            BookCategory.valueOf(bookData[0].trim()),
                            Integer.parseInt(bookData[1].trim()),
                            Integer.parseInt(bookData[2].trim()),
                            Integer.parseInt(bookData[3].trim()),
                            bookData[4].trim(),
                            bookData[5].trim()
                    );
                    books.add(book);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Error loading books from file.", e);
        }
    }

    @Override
    public boolean update(Book book) {
        return false;
    }

    @Override
    public boolean delete(Book book) {
        return false;
    }

    @Override
    public List<Book> findByCategory(BookCategory category) {
        return null;
    }

    @Override
    public Book findByDetails(BookCategory category, int shelfNumber, int position) {
        return null;
    }

    @Override
    public List<Book> findAll() {
        return books;
    }

}
