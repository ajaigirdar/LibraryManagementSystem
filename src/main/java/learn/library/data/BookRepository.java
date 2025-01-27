package learn.library.data;

import learn.library.data.model.Book;
import learn.library.data.model.BookCategory;

import java.util.List;

public interface BookRepository {

    List<Book> findAll();

    public boolean add(Book book) throws DataAccessException;

    boolean update(Book book);

    boolean delete(Book book);

    List<Book> findByCategory(BookCategory category);

    Book findByDetails(BookCategory category, int shelfNumber, int position);


}
