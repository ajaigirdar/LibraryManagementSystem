package learn.library.data;

import learn.library.data.model.Book;

import java.util.List;

public interface BookRepository {
    // TODO: interface defining CRUD operations for a book
//    Book add(Book book) throws DataAccessException;
//
//    boolean deleteById(int encounterId) throws DataAccessException;
//
//    boolean update(Encounter encounter) throws DataAccessException;
//
//    Encounter findByType(EncounterType type) throws DataAccessException;

    List<Book> findAll();


}
