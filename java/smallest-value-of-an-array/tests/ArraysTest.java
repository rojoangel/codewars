import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysTest {

    @Test
    public void testSmallestIndex123() {
        assertEquals("The smallest index", 0, Arrays.findSmallest(new int[]{1, 2, 3}, "index"));
    }

    @Test
    public void testSmallestValue7123227() {

        assertEquals("The smallest value", 2, Arrays.findSmallest(new int[]{7, 12, 3, 2, 27}, "value"));
    }

    @Test
    public void testSmallestIndex7123227() {
        assertEquals( "The smallest index" , 3 , Arrays.findSmallest( new int [] {7, 12, 3, 2, 27} , "index") );
    }
}