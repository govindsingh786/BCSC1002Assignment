/*   Created by IntelliJ IDEA.
 *   Author: Govind Singh
 *   Date: 29-08-2020
 *   Time: 14:41
 *   File: Book.java
 */

package definitions;

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
}