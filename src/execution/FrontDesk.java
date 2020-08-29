/*   Created by IntelliJ IDEA.
 *   Author: Govind Singh
 *   Date: 29-08-2020
 *   Time: 17:22
 *   File: FrontDesk.java
 */

package execution;


import definitions.Book;

public class FrontDesk {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookName("The Girl Next Door");
        book.setAuthorName("Jack Ketchum");
        book.setBookISBNDigitNumber("99921-58-10-7");
        System.out.println("Book Name is : " + book.getBookName() + "," + "Author Name is : " + book.getAuthorName()
                + "," + "ISBN NO : " + book.getBookISBNDigitNumber());


    }
}