/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] availableBooks;

    public Library() {
        this.availableBooks = new Book[5];
        this.availableBooks[0] = new Book("Mitali", "Java -A beginner's guide", "Herbert Schildt", "1234567890123");
        this.availableBooks[1] = new Book("Megha", "The Lord of the Rings", "J.R.R.Tolkien", "2345678901234");
        this.availableBooks[2] = new Book("Aanya", "The Catcher in the Rye", "J.D.Salinger", "3456789012345");
        this.availableBooks[3] = new Book("Siddhi", "1984", "George", "4567890123456");
        this.availableBooks[4] = new Book("Aara", "Animal Farm", "Boris", "567890123456");

    }

    public Library(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    /**
     * This method will help student for checkout a issued a book.
     *
     * @param bookName The bookName of the video that the client wants to issue.
     */
    public void doCheckout(String bookName) {
        System.out.println("Thank you for issuing \"" + bookName + "\".");
    }

    /**
     * This method will return a issued book to the library.
     *
     * @param bookName The bookName of the video that the client wants to return.
     */
    public void doReturn(String bookName) {
        System.out.println(
                "Thank you for returning \"" + bookName + "\"."
        );
    }

    /**
     * This method prints all the books in the library (store array).
     */
    public void listInventory() {
        for (Book book : availableBooks) {
            System.out.println(book);
        }
    }

    public Book[] getAvailableBooks() {
        return availableBooks;
    }

    public void setAvailableBooks(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    @Override
    public String toString() {
        return "Library{" +
                "availableBooks=" + Arrays.toString(availableBooks) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(availableBooks, library.availableBooks);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(availableBooks);
    }
}
