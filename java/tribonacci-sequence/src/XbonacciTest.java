import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertEquals;

public class XbonacciTest {
    private Xbonacci variabonacci;

    @Before
    public void setUp() throws Exception {
        variabonacci = new Xbonacci();
    }

    @After
    public void tearDown() throws Exception {
        variabonacci = null;
    }

    @Test
    public void test111() {
        assertArrayEquals(new double []{1,1,1,3,5,9,17,31,57,105}, variabonacci.tribonacci(new double []{1,1,1},10));
    }

    @Test
    public void test001() {
        assertArrayEquals(new double []{0,0,1,1,2,4,7,13,24,44}, variabonacci.tribonacci(new double []{0,0,1},10));
    }

    @Test
    public void test011() {
        assertArrayEquals(new double []{0,1,1,2,4,7,13,24,44,81}, variabonacci.tribonacci(new double []{0,1,1},10));
    }

    @Test
    public void testSize0() {
        assertArrayEquals(new double []{}, variabonacci.tribonacci(new double []{0,1,1},0));
    }

    @Test
    public void testSize1() {
        assertArrayEquals(new double []{0}, variabonacci.tribonacci(new double []{0,1,1},1));
    }

    @Test
    public void testSize2() {
        assertArrayEquals(new double []{0,1}, variabonacci.tribonacci(new double []{0,1,1},2));
    }

    @Test
    public void testSize3() {
        assertArrayEquals(new double []{0,1,1}, variabonacci.tribonacci(new double []{0,1,1},3));
    }

    @Test
    public void testNonIntegers() {
        assertArrayEquals(new double []{0,0.5,1,1.5}, variabonacci.tribonacci(new double []{0,0.5,1},4));
    }

    private void assertArrayEquals(double []expecteds, double[] actuals) {
        for(int i = 0; i < actuals.length; i++)
            assertEquals(expecteds[i], actuals[i], 1e-10);
    }
}
