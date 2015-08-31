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
    public void basicTests() {
        assertArrayEquals(new double []{0,1,1,2,3,5,8,13,21,34}, variabonacci.xbonacci(new double []{0,1},10));
        assertArrayEquals(new double []{1,1,2,3,5,8,13,21,34,55}, variabonacci.xbonacci(new double []{1,1},10));
        assertArrayEquals(new double []{0,0,0,0,1,1,2,4,8,16}, variabonacci.xbonacci(new double []{0,0,0,0,1},10));
        assertArrayEquals(new double []{1,0,0,0,0,0,1,2,3,6}, variabonacci.xbonacci(new double []{1,0,0,0,0,0,1},10));
    }

    private void assertArrayEquals(double []expecteds, double[] actuals) {
        for(int i = 0; i < actuals.length; i++)
            assertEquals(expecteds[i], actuals[i], 1e-10);
    }
}