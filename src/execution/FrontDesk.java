/*   Created by IntelliJ IDEA.
 *   Author: Govind Singh
 *   Date: 29-08-2020
 *   Time: 17:22
 *   File: FrontDesk.java
 */

package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static final int NEW_BOOK = 1;
    public static final int RETURN_PREVIOUSLY_BOOK = 2;
    public static final int ALL_ISSUE_BOOKS = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {
        Book book = new Book();
        //Book book1 = new Book("Blood Meridian", " Cormac McCarthy", "1 86197 271-7");
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
        Student student = new Student();
        Library library = new Library();
        //System.out.println(student);
        //student.setStudentFirstName("Govind");
        //student.setStudentMiddleName("");
        //student.setStudentLastName("Singh");
        //student.setStudentUniversityRollNumber(1915652464);
        //student.setNumberOfBooksIssuedByTheStudent(1);
        //student.setAllTheNamesOfTheBooksIssuedByTheStudent();
        //System.out.println(student.getAllTheNamesOfTheBooksIssuedByTheStudent());
        Scanner scanner = new Scanner(System.in);
        int studentInput = 0;

        while (studentInput != EXIT) {


            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            studentInput = scanner.nextInt();
            switch (studentInput) {
                case NEW_BOOK -> System.out.println("Please Enter the Book Name.");
                case RETURN_PREVIOUSLY_BOOK -> System.out.println("Please Return a Previous Book.");
                case ALL_ISSUE_BOOKS -> System.out.println("Please show me all My issues Books.");
            }
        }
        System.out.println("EXIT");
    }
}