package learn.library.domain;

import learn.library.data.BookRepository;
import learn.library.data.DataAccessException;
import learn.library.data.model.Book;
import learn.library.data.model.BookCategory;

import java.util.List;
import java.util.zip.DataFormatException;

public class BookService {
    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public boolean add(Book book) throws DataAccessException{
        if (book.getShelfNumber() <= 0 || book.getShelfNumber() > 250) {
            return false;
        }
        if (book.getPosition() <= 0 || book.getPosition() > 250) {
            return false;
        }
        if (book.getYearPublished() > 2024) {
            return false;
        }
        if (book.getIsbn() == null || book.getIsbn().isEmpty()) {
            return false;
        }

        return repository.add(book);
    }

    public boolean update(Book book) throws DataAccessException{
        return false;
    }

    public boolean delete(Book book) throws DataAccessException{
        return false;
    }

    public List<Book> findAll() throws DataFormatException{
        return repository.findAll();
    }

    List<Book> findByCategory(BookCategory category) throws DataAccessException{
        return null;
    }

    public Book findByDetails(BookCategory category, int shelfNumber, int position) throws DataAccessException {
        return null;
    }





//    private BookResult validate(Book book){
//        return null;
//    }
}
