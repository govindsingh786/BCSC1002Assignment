/*   Created by IntelliJ IDEA.
 *   Author: Govind Singh
 *   Date: 29-08-2020
 *   Time: 15:03
 *   File: Student.java
 */

package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    // member variable
    private String studentFirstName;
    private String studentMiddleName;
    private String studentLastName;
    private long studentUniversityRollNumber;
    private int numberOfBooksIssuedByTheStudent;
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

    //constructor method
    //1.non parameterized : It has no parameter
    public Student() {
        this.studentFirstName = "Govind";
        this.studentMiddleName = "";
        this.studentLastName = "Singh";
        this.studentUniversityRollNumber = 191500307;
        this.numberOfBooksIssuedByTheStudent = 2;
        this.allTheNamesOfTheBooksIssuedByTheStudent = new Book[2];
        for (int i = 0; i < allTheNamesOfTheBooksIssuedByTheStudent.length; i++) {
            allTheNamesOfTheBooksIssuedByTheStudent[i] = new Book();
        }
    }

    public long getStudentUniversityRollNumber() {
        return studentUniversityRollNumber;
    }

    public void setStudentUniversityRollNumber(long studentUniversityRollNumber) {
        this.studentUniversityRollNumber = studentUniversityRollNumber;
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

    public int getNumberOfBooksIssuedByTheStudent() {
        return numberOfBooksIssuedByTheStudent;
    }

    public void setNumberOfBooksIssuedByTheStudent(int numberOfBooksIssuedByTheStudent) {
        this.numberOfBooksIssuedByTheStudent = numberOfBooksIssuedByTheStudent;
    }

    public void setAllTheNamesOfTheBooksIssuedByTheStudent(Book[] allTheNamesOfTheBooksIssuedByTheStudent) {
        this.allTheNamesOfTheBooksIssuedByTheStudent = allTheNamesOfTheBooksIssuedByTheStudent;
    }

    public Book[] getAllTheNamesOfTheBooksIssuedByTheStudent() {
        return allTheNamesOfTheBooksIssuedByTheStudent.clone();
    }
    //to String method

    @Override
    public String toString() {
        return "Student{" +
                "studentFirstName='" + studentFirstName + '\'' +
                ", studentMiddleName='" + studentMiddleName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", studentUniversityRollNumber=" + studentUniversityRollNumber +
                ", numberOfBooksIssuedByTheStudent=" + numberOfBooksIssuedByTheStudent +
                ", allTheNamesOfTheBooksIssuedByTheStudent=" + Arrays.toString(allTheNamesOfTheBooksIssuedByTheStudent) +
                '}';
    }
    // equals() and the hashCode() method

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentUniversityRollNumber == student.studentUniversityRollNumber &&
                numberOfBooksIssuedByTheStudent == student.numberOfBooksIssuedByTheStudent &&
                Objects.equals(studentFirstName, student.studentFirstName) &&
                Objects.equals(studentMiddleName, student.studentMiddleName) &&
                Objects.equals(studentLastName, student.studentLastName) &&
                Arrays.equals(allTheNamesOfTheBooksIssuedByTheStudent, student.allTheNamesOfTheBooksIssuedByTheStudent);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(studentFirstName, studentMiddleName, studentLastName, studentUniversityRollNumber, numberOfBooksIssuedByTheStudent);
        result = 31 * result + Arrays.hashCode(allTheNamesOfTheBooksIssuedByTheStudent);
        return result;
    }
}