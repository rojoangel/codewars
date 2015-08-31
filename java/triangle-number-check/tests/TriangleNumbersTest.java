import static org.junit.Assert.*;
import org.junit.Test;


public class TriangleNumbersTest {

    @Test
    public void test0() {
        assertEquals(TriangleNumbers.isTriangleNumber(0), true);
    }

    @Test
    public void test1() {
        assertEquals(TriangleNumbers.isTriangleNumber(1), true);
    }

    @Test
    public void test2() {
        assertEquals(TriangleNumbers.isTriangleNumber(2), false);
    }

    @Test
    public void test3() {
        assertEquals(TriangleNumbers.isTriangleNumber(3), true);
    }

    @Test
    public void test4() {
        assertEquals(TriangleNumbers.isTriangleNumber(4), false);
    }

    @Test
    public void test5() {
        assertEquals(TriangleNumbers.isTriangleNumber(5), false);
    }

    @Test
    public void test6() {
        assertEquals(TriangleNumbers.isTriangleNumber(6), true);
    }

    @Test
    public void test125250() {
        assertEquals(TriangleNumbers.isTriangleNumber(125250), true);
    }

    @Test
    public void test3126250() {
        assertEquals(TriangleNumbers.isTriangleNumber(3126250), true);
    }

    @Test
    public void testNegativeNumber() {
        assertEquals(TriangleNumbers.isTriangleNumber(-6), false);
    }

    @Test
    public void testBigTriangles() {
        for (int i = 0; i < 40000; i++) {
            long num = i * (i + 1) / 2;
            assertTrue("test for " + num, TriangleNumbers.isTriangleNumber(num));
        }
    }
}