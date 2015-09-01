import static org.junit.Assert.*;
import org.junit.*;

public class RotatorTest {
    private Rotator rotator;

    @Before
    public void setUp() {
        this.rotator = new Rotator();
    }

    @After
    public void tearDown() {
        this.rotator = null;
    }

    @Test
    public void testRotateOne_ArrayOfFive() {
        assertArrayEquals(new Object[]{5, 1, 2, 3, 4},
                rotator.rotate(new Object[]{1, 2, 3, 4, 5}, 1));
    }

    @Test
    public void testRotateTwo_ArrayOfFive() {
        assertArrayEquals(new Object[]{4, 5, 1, 2, 3},
                rotator.rotate(new Object[]{1, 2, 3, 4, 5}, 2));
    }

    @Test
    public void testRotateThree_ArrayOfFive() {
        assertArrayEquals(new Object[]{3, 4, 5, 1, 2},
                rotator.rotate(new Object[]{1, 2, 3, 4, 5}, 3));
    }

    @Test
    public void testRotateFour_ArrayOfFive() {
        assertArrayEquals(new Object[]{2, 3, 4, 5, 1},
                rotator.rotate(new Object[]{1, 2, 3, 4, 5}, 4));
    }

    @Test
    public void testRotateFive_ArrayOfFive() {
        assertArrayEquals(new Object[]{1, 2, 3, 4, 5},
                rotator.rotate(new Object[]{1, 2, 3, 4, 5}, 5));
    }

    @Test
    public void testRotateSix_ArrayOfFive() {
        assertArrayEquals(new Object[]{5, 1, 2, 3, 4},
                rotator.rotate(new Object[]{1, 2, 3, 4, 5}, 6));
    }

    @Test
    public void testRotateNegOne_ArrayOfFive() {
        assertArrayEquals(new Object[]{2, 3, 4, 5, 1},
                rotator.rotate(new Object[]{1, 2, 3, 4, 5}, -1));
    }

    @Test
    public void testRotateNegTwo_ArrayOfFive() {
        assertArrayEquals(new Object[]{3, 4, 5, 1, 2},
                rotator.rotate(new Object[]{1, 2, 3, 4, 5}, -2));
    }

    @Test
    public void testRotateNegThree_ArrayOfFive() {
        assertArrayEquals(new Object[]{4, 5, 1, 2, 3},
                rotator.rotate(new Object[]{1, 2, 3, 4, 5}, -3));
    }

    @Test
    public void testRotateNegFour_ArrayOfFive() {
        assertArrayEquals(new Object[]{5, 1, 2, 3, 4},
                rotator.rotate(new Object[]{1, 2, 3, 4, 5}, -4));
    }

    @Test
    public void testRotateNegFive_ArrayOfFive() {
        assertArrayEquals(new Object[]{1, 2, 3, 4, 5},
                rotator.rotate(new Object[]{1, 2, 3, 4, 5}, -5));
    }

    @Test
    public void testRotateNegSix_ArrayOfFive() {
        assertArrayEquals(new Object[]{2, 3, 4, 5, 1},
                rotator.rotate(new Object[]{1, 2, 3, 4, 5}, -6));
    }

    @Test
    public void testRotateZero_ArrayOfFive() {
        assertArrayEquals(new Object[]{1, 2, 3, 4, 5},
                rotator.rotate(new Object[]{1, 2, 3, 4, 5}, 0));
    }

    @Test
    public void testRotateZero_ArrayOfZero() {
        assertArrayEquals(new Object[]{},
                rotator.rotate(new Object[]{}, 0));
    }

    @Test
    public void testRotateOne_ArrayOfZero() {
        assertArrayEquals(new Object[]{},
                rotator.rotate(new Object[]{}, 1));
    }

    @Test
    public void testRotateTwo_ArrayOfZero() {
        assertArrayEquals(new Object[]{},
                rotator.rotate(new Object[]{}, 2));
    }
}