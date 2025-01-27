package learn.library.ui;

import learn.library.data.model.Book;

import java.util.List;
import java.util.Scanner;

public class View {

    // TODO: handles all IO operations
    private Scanner console = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("Welcome to the Library Management System");
        System.out.println("========================================");
        System.out.println("Main Menu");
        System.out.println("=========");
        System.out.println("0. Exit");
        System.out.println("1. Find Books by Category");
        System.out.println("2. Add a Book");
        System.out.println("3. Update a Book");
        System.out.println("4. Remove a Book");
    }

    public int readOption() {
        System.out.print("Select [0-4]: ");
        return Integer.parseInt(console.nextLine());
    }

    public void printAllBooks(List<Book> books){

    }

    public void printBooksByCategory(List<Book> books){

    }
}
