/*   Created by IntelliJ IDEA.
 *   Author: Govind Singh
 *   Date: 29-08-2020
 *   Time: 17:22
 *   File: FrontDesk.java
 */

package execution;


import definitions.Library;
import definitions.Student;

public class FrontDesk {
    public static void main(String[] args) {
        //Book book = new Book("Blood Meridian", " Cormac McCarthy", "1 86197 271-7");
        //Book book1 = new Book("Exquisite Corpse", "Poppy Z. Brite", "2 46287 731-4");
        //book.setBookName("The Girl Next Door");
        //book.setAuthorName("Jack Ketchum");
        //book.setBookISBNDigitNumber("99921-58-10-7");
        //System.out.println(book);
        // if (book.equals(book1)) {
        //    System.out.println("equal");
        //} else {
        //    System.out.println("Not equal");
        // }
        //Student student = new Student();
        //System.out.println(student);
        //student.setStudentFirstName("Govind");
        //student.setStudentMiddleName("");
        //student.setStudentLastName("Singh");
        //student.setStudentUniversityRollNumber(1915652464);
        //student.setNumberOfBooksIssuedByTheStudent(1);
        //student.setAllTheNamesOfTheBooksIssuedByTheStudent();
        //System.out.println(student.getAllTheNamesOfTheBooksIssuedByTheStudent());
        Student detailsOfTheStudentCurrentlyInteractingWithTheSystem;
        //System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
        //System.out.println("How may I help you today?");
        //System.out.println("1. Issue a new book for me.");
        //System.out.println("2. Return a previously issues book for me.");
        //System.out.println("3. Show me all my issues books.");
        //System.out.println("4. Exit.");
        Library library = new Library();
        System.out.println(library);


    }
}