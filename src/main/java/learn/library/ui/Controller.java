package learn.library.ui;

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



    public void run(){
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
                case 2 -> System.out.println("Add a Book - Not Implemented");
                case 3 -> System.out.println("Update a Book - Not Implemented");
                case 4 -> System.out.println("Remove a Book - Not Implemented");
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void runMenuLoop() throws DataFormatException {

    }

    private void displayAllBooks() throws DataFormatException{

    }

    private void displayBookByCategory() throws DataFormatException{

    }

    private void addBook() throws DataFormatException {

    }

    private void updateBook() throws DataFormatException {

    }

    private void deleteBook() throws DataFormatException{

    }


}
