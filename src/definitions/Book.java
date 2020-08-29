/*   Created by IntelliJ IDEA.
 *   Author: Govind Singh
 *   Date: 29-08-2020
 *   Time: 14:41
 *   File: Book.java
 */

package definitions;

import java.util.Objects;

public class Book {
    // member variable
    private String bookName;
    private String authorName;
    private String bookISBNDigitNumber;
    // getter method

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBookISBNDigitNumber() {
        return bookISBNDigitNumber;
    }
    // setter method


    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setBookISBNDigitNumber(String bookISBNDigitNumber) {
        this.bookISBNDigitNumber = bookISBNDigitNumber;
    }

    //constructor method
    //1.non parameterized : It has no parameter
    public Book() {
        this.bookName = "House of Leaves";
        this.authorName = "Mark Z. Daniel";
        this.bookISBNDigitNumber = "1456EDS789456";
    }

    //2.parameterized : It would have some parameter
    public Book(String bookName, String authorName, String bookISBNDigitNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookISBNDigitNumber = bookISBNDigitNumber;
    }
    //to string method

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", bookISBNDigitNumber='" + bookISBNDigitNumber + '\'' +
                '}';
    }
    //  equals() and the hashCode() method

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(authorName, book.authorName) &&
                Objects.equals(bookISBNDigitNumber, book.bookISBNDigitNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, bookISBNDigitNumber);
    }
}