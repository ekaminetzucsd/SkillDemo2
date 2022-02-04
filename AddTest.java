import static org.junit.Assert.*;
import org.junit.*;

public class AddTest {
    @Test
    public void testAdd () {
	Add a = new Add();
	assertEquals(2, a.add(1,1));
    }
}
