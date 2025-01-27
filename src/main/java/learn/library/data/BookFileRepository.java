package learn.library.data;

import learn.library.data.model.Book;
import learn.library.data.model.BookCategory;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class BookFileRepository implements BookRepository{
    private final String filePath;
    private final List<Book> books = new ArrayList<>();

    public BookFileRepository(String filePath) {
        this.filePath = filePath;
        loadBooksFromCsv();
    }

    public boolean add(Book book) throws DataAccessException {
        books.add(book);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            File file = new File(filePath);
            if (file.length() == 0) {
                writer.write("Category,Shelf Number,Position,Year Published,Author,ISBN");
                writer.newLine();
            }

            writer.write(
                    book.getCategory() + "," +
                    book.getShelfNumber() + "," +
                    book.getPosition() + "," +
                    book.getYearPublished() + "," +
                    book.getAuthor() + "," +
                    book.getIsbn());
            writer.newLine();
            return true;
        } catch (IOException ex) {
            throw new DataAccessException("Error adding book to CSV file.", ex);
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
    public List<Book> findAll() {
        return books;
    }


}
