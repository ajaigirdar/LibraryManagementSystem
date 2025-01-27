package learn.library;

import learn.library.data.BookFileRepository;
import learn.library.data.DataAccessException;
import learn.library.domain.BookService;
import learn.library.ui.Controller;
import learn.library.ui.View;


public class App {
    public static void main(String[] args) throws DataAccessException {
        BookFileRepository repository = new BookFileRepository("./data/books.csv");
        BookService service = new BookService(repository);
        View view = new View();
        Controller controller = new Controller(service, view);

        controller.run();

    /*
        -/library
            /data
                /model
                    - Book.java - pojo storing all info for a book
                    - Category.java - enum for storing types of books (Fantasy, Mystery, Si-Fi etc)
                - DataAccessException.java - custom exception thrown by repository
                - BookRepository.java - interface defining CRUD operations for a book
                - BookFileRepository - implement the methods from BookRepository interface, interacts filesystem to save/load from a text
            /domain
                - BookService.java - validate user input before saving
            /ui
                - View.java - handles all IO operations
                - Controller.java - runs the app - manages the loop/switch
            App.java
     */

    }




}

