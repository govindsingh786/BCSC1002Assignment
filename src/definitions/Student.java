/*   Created by IntelliJ IDEA.
 *   Author: Govind Singh
 *   Date: 29-08-2020
 *   Time: 15:03
 *   File: Student.java
 */

package definitions;

public class Student {
    // member variable
    private String studentFirstName;
    private String studentMiddleName;
    private String studentLastName;
    private String studentUniversityRollNumber;
    private String numberOfBooksIssuedByTheStudent;
    private Book[] allTheNamesOfTheBooksIssuedByTheStudent;
    //getter method

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public String getStudentMiddleName() {
        return studentMiddleName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public String getStudentUniversityRollNumber() {
        return studentUniversityRollNumber;
    }

    public String getNumberOfBooksIssuedByTheStudent() {
        return numberOfBooksIssuedByTheStudent;
    }

    public Book[] getAllTheNamesOfTheBooksIssuedByTheStudent() {
        return allTheNamesOfTheBooksIssuedByTheStudent;
    }
    //setter method

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public void setStudentMiddleName(String studentMiddleName) {
        this.studentMiddleName = studentMiddleName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public void setStudentUniversityRollNumber(String studentUniversityRollNumber) {
        this.studentUniversityRollNumber = studentUniversityRollNumber;
    }

    public void setNumberOfBooksIssuedByTheStudent(String numberOfBooksIssuedByTheStudent) {
        this.numberOfBooksIssuedByTheStudent = numberOfBooksIssuedByTheStudent;
    }

    public void setAllTheNamesOfTheBooksIssuedByTheStudent(Book[] allTheNamesOfTheBooksIssuedByTheStudent) {
        this.allTheNamesOfTheBooksIssuedByTheStudent = allTheNamesOfTheBooksIssuedByTheStudent;
    }
}