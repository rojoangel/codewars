import static org.junit.Assert.*;
import org.junit.Test;

public class KeypadTest {
    @Test
    public void simpleTest() {
        assertEquals(9, Keypad.presses("LOL"));
        assertEquals(13, Keypad.presses("HOW R U"));
    }

    @Test
    public void caseInsensitiveTest() {
        assertEquals(9, Keypad.presses("lol"));
        assertEquals(13, Keypad.presses("how r u"));
    }

}