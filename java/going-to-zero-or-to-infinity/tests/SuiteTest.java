import static org.junit.Assert.*;
import java.util.Random;

import org.junit.Test;


public class SuiteTest {

    private static final double DELTA = 1e-10;

    @Test
    public void test1() {
        assertEquals(1.275, Suite.going(5), DELTA);
    }
    @Test
    public void test2() {
        assertEquals(1.2125, Suite.going(6), DELTA);
    }
    @Test
    public void test3() {
        assertEquals(1.173214, Suite.going(7), DELTA);
    }

}
