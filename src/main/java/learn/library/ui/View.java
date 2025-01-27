package learn.library.ui;

import learn.library.data.model.Book;
import learn.library.data.model.BookCategory;

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

    public Book getBookDetails() {
        System.out.println("Enter book details:");
        System.out.println("========================================");

        System.out.println("Category: ");
        BookCategory category = BookCategory.valueOf(console.nextLine().toUpperCase());

        System.out.println("Shelf Number: ");
        int shelfNumber = Integer.parseInt(console.nextLine());

        System.out.println("Position: ");
        int position = Integer.parseInt(console.nextLine());

        System.out.println("Year Published: ");
        int yearPublished = Integer.parseInt(console.nextLine());

        System.out.println("Author: ");
        String author = console.nextLine();

        System.out.println("ISBN: ");
        String isbn = console.nextLine();

        return new Book(category,shelfNumber,position,yearPublished,author,isbn);
    }

    public void showMessage(String message){
        System.out.println(message);
    }

    public void printAllBooks(List<Book> books){

    }

    public void printBooksByCategory(List<Book> books){

    }
}
