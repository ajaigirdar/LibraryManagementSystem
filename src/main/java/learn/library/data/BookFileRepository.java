package learn.library.data;

import learn.library.data.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookFileRepository implements BookRepository{
    // TODO: implement the methods from BookRepository interface, interacts filesystem to save/load from a text file


    private final List<Book> books = new ArrayList<>();

    @Override
    public List<Book> findAll() {
        return books;
    }
}
