/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String studentName;
    private String firstName;
    private String middleName;
    private String lastName;
    private long universityRollno;
    private int numberOfBooksIssued;
    private Book[] namesOfBooks;

    public Student() {
        this.studentName = "";
        this.universityRollno = 0;
        this.numberOfBooksIssued = 0;
    }

    public Student(String firstName, String middleName, String lastName, String studentName, long universityRollno, int numberOfbooksIssued) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.studentName = studentName;
        this.universityRollno = universityRollno;
        this.numberOfBooksIssued = numberOfbooksIssued;
        this.namesOfBooks = new Book[10];
        for (int i = 0; i < namesOfBooks.length; i++) {
            namesOfBooks[i] = new Book("Studentname", "bookname", "authorname", "isbnnumber" + (i + 1));
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getUniversityRollno() {
        return universityRollno;
    }

    public void setUniversityRollno(long universityRollno) {
        this.universityRollno = universityRollno;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public Book[] getNamesOfBooks() {
        return namesOfBooks;
    }

    public void setNamesOfBooks(Book[] namesOfBooks) {
        this.namesOfBooks = namesOfBooks;
    }

    /**
     * This method prints all the books (store array).
     */
    public void listInventory() {
        for (Book book : namesOfBooks) {
            System.out.println(namesOfBooks);
        }
    }

    @Override
    public String toString() {
        return String.format(
                "Student Name: %s, University Rollno: %ld, Books Issued: %d, ",
                getStudentName(), getUniversityRollno(), getNumberOfBooksIssued());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return universityRollno == student.universityRollno &&
                numberOfBooksIssued == student.numberOfBooksIssued &&
                Objects.equals(studentName, student.studentName) &&
                Arrays.equals(namesOfBooks, student.namesOfBooks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(studentName, universityRollno, numberOfBooksIssued);
        result = 31 * result + Arrays.hashCode(namesOfBooks);
        return result;
    }
}
