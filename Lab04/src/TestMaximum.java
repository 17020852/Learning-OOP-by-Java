
import org.junit.Test;
import static org.junit.Assert.*;
public class TestMaximum {

    @Test
    public void TestMax01() {
        assertEquals(2, Lab04.FindMax(1, 2));
    }
    @Test
    public void TestMax02() {
        assertEquals(4, Lab04.FindMax(3,4));
    }

}
