
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
    @Test
    public void TestMax03() {
        assertEquals(5, Lab04.FindMax(1, 5));
    }
    @Test
    public void TestMax04() {
        assertEquals(6, Lab04.FindMax(6, 2));
    }
    @Test
    public void TestMax() {
        assertEquals(7, Lab04.FindMax(4, 7));
    }

}
