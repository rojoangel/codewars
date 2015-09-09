import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class PaginationHelperTest {

    @Test
    public void testItemCountNullCollection() throws Exception {
        PaginationHelper helper = new PaginationHelper(null, 4);
        assertEquals("items count", 0, helper.itemCount());
    }

    @Test
    public void testItemCountEmptyCollection() throws Exception {
        PaginationHelper helper = new PaginationHelper(Collections.emptyList(), 4);
        assertEquals("items count", 0, helper.itemCount());
    }

    @Test
    public void testItemCount() throws Exception {
        PaginationHelper helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        assertEquals("items count", 6, helper.itemCount());
    }
}