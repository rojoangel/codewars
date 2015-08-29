import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {

    @Test
    public void testReverse() throws Exception {

        Reverse rev = new Reverse();
        assertEquals("dlrow olleh", rev.reverse("hello world"));

    }
}