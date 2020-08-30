/*   Created by IntelliJ IDEA.
 *   Author: Govind Singh
 *   Date: 29-08-2020
 *   Time: 17:03
 *   File: Library.java
 */

package definitions;

import java.util.Arrays;

public class Library {
    //member variable
    private Book[] allTheBooksThatAreCurrentlyAvailable;
    //getter method

    public Book[] getAllTheBooksThatAreCurrentlyAvailable() {
        return allTheBooksThatAreCurrentlyAvailable.clone();
    }
    //setter method

    public void setAllTheBooksThatAreCurrentlyAvailable(Book[] allTheBooksThatAreCurrentlyAvailable) {
        this.allTheBooksThatAreCurrentlyAvailable = allTheBooksThatAreCurrentlyAvailable;
    }

    //constructor method
    public Library() {
        this.allTheBooksThatAreCurrentlyAvailable = new Book[50];
    }
    //to string method

    @Override
    public String toString() {
        return Arrays.toString(allTheBooksThatAreCurrentlyAvailable);
    }
    //equals() and the hashCode() method

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(allTheBooksThatAreCurrentlyAvailable, library.allTheBooksThatAreCurrentlyAvailable);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(allTheBooksThatAreCurrentlyAvailable);
    }
}