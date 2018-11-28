/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test public void testReverse() {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        ArrayList<String> reversedAnimals = Library.reverse(animals);
        // dog is the first item
        // cat is the second item
        // the size is 2
        assertTrue("reversed animals should have dog first", reversedAnimals.get(0) == animals.get(1));
    }
}
