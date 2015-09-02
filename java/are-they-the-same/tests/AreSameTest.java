import static org.junit.Assert.*;
import org.junit.Test;


public class AreSameTest {

    @Test
    public void test1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(AreSame.comp(a, b), true);
    }

    @Test
    public void test2() {
        int[] a = new int[]{122, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(AreSame.comp(a, b), false);
    }

    @Test
    public void testNull() {
        assertEquals(AreSame.comp(null, null), false);
    }

    @Test
    public void testEmpty() {
        int[] a = new int[]{};
        int[] b = new int[]{};
        assertEquals(AreSame.comp(a, b), true);
    }

    @Test
    public void testBLonger() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361, 2073600};
        assertEquals(AreSame.comp(a, b), false);
    }

    @Test
    public void testALonger() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11, 14400};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(AreSame.comp(a, b), false);
    }

    @Test
    public void testNegativeNumbers() {
        int[] a = new int[]{121, -144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(AreSame.comp(a, b), true);
    }
}