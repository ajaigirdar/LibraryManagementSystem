package learn.library.domain;

import learn.library.data.BookRepository;
import learn.library.data.DataAccessException;
import learn.library.data.model.Book;
import learn.library.data.model.BookCategory;

import java.util.List;
import java.util.zip.DataFormatException;

public class BookService {

    // TODO: validate user input before saving
    // validate(Book)
    //
    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public List<Book> findAll() throws DataFormatException{
        return repository.findAll();
    }

    public Book findByCategory(BookCategory category) throws DataAccessException{
        return null;
    }

//    public BookResult add(Book book) throws DataAccessException{
//        return null;
//    }
//
//    private BookResult validate(Book book){
//        return null;
//    }
}
