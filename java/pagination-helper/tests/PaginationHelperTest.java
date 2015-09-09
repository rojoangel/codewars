import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PaginationHelperTest {

    @Test
    public void testItemCount() throws Exception {
        PaginationHelper helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        assertEquals("items count", 6, helper.itemCount());
    }
}