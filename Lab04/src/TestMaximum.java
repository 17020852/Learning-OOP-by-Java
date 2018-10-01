
import org.junit.Test;
import static org.junit.Assert.*;
public class TestMaximum {

    @Test
    public void TestMax01() {
        Lab04 test1 = new Lab04();
        assertEquals(2, test1.FindMax(1, 2));
    }
    @Test
    public void TestMax02() {
        Lab04 test2 = new Lab04();
        assertEquals(4, test2.FindMax(3,4));
    }
    @Test
    public void TestMax03() {
        Lab04 test3 = new Lab04();
        assertEquals(5, test3.FindMax(1, 5));
    }
    @Test
    public void TestMax04() {
        Lab04 test4 = new Lab04();
        assertEquals(6, test4.FindMax(6, 2));
    }
    @Test
    public void TestMax() {
        Lab04 test5 = new Lab04();
        assertEquals(7, test5.FindMax(4, 7));
    }

}
