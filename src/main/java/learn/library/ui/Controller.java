package learn.library.ui;

import learn.library.data.DataAccessException;
import learn.library.data.model.Book;
import learn.library.domain.BookService;

import java.util.zip.DataFormatException;

public class Controller {

    // TODO: runs the app - manages the loop/switch
    private final BookService service;
    private final View view;

    public Controller(BookService service, View view) {
        this.service = service;
        this.view = view;
    }



    public void run() throws DataAccessException {
        boolean running = true;

        while (running) {
            view.displayMenu();
            int option = view.readOption();

            switch (option) {
                case 0 -> {
                    System.out.println("Goodbye!");
                    running = false;
                }
                case 1 -> System.out.println("Find Books by Category - Not Implemented");
                case 2 -> addBook();
                case 3 -> System.out.println("Update a Book - Not Implemented");
                case 4 -> System.out.println("Remove a Book - Not Implemented");
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void displayAllBooks() throws DataAccessException{

    }

    private void displayBookByCategory() throws DataAccessException{

    }

    private void addBook() throws DataAccessException {
        Book book = view.getBookDetails();

        boolean success = service.add(book);

        if (success) {
            view.showMessage("Book added successfully.");
        } else {
            view.showMessage("Failed to add book. Please check the details and try again.");
        }
    }

    private void updateBook() throws DataAccessException {

    }

    private void deleteBook() throws DataAccessException{

    }


}
