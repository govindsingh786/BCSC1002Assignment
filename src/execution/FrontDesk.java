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
        Book book = new Book("Blood Meridian", " Cormac McCarthy", "1 86197 271-7");
        //book.setBookName("The Girl Next Door");
        //book.setAuthorName("Jack Ketchum");
        //book.setBookISBNDigitNumber("99921-58-10-7");

        System.out.println(book);


    }
}