/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int LIST_BOOK_INVENTORY = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        Library myLibrary = new Library();
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit: ");
            System.out.println("Enter you choice (1..4): ");
            userInput = scanner.nextInt();
            String bookName;
            switch (userInput) {
                case ISSUE_BOOK:
                    System.out.println("Enter the name of the book that you want to issue");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    myLibrary.doCheckout(bookName);
                    break;
                case RETURN_BOOK:
                    System.out.println("Enter the name of the book you want to return");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    myLibrary.doReturn(bookName);
                    break;
                case LIST_BOOK_INVENTORY:
                    System.out.println("All books that are present in library");
                    myLibrary.listInventory();
                    break;
                default:
            }
        } while (userInput != EXIT);

    }
}