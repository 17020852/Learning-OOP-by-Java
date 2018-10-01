import org.junit.Test;
import static org.junit.Assert.*;
public class TestMinimum {
    @Test
    public void TestMin_01() {
        Lab04 test1 = new Lab04();
        int[] arr01 = {100, 1, 12, 3, 4, 16};
        assertEquals(1, test1.FindMin(arr01, 6));
    }
    @Test
    public void TestMin_02() {
        Lab04 test2 = new Lab04();
        int[] arr02 = {-10, 11, 13, 14};
        assertEquals(-10, test2.FindMin(arr02, 4));
    }
    @Test
    public void TestMin_03() {
        Lab04 test3 = new Lab04();
        int[] arr03 = {1,2,3,4,5,6,7,-1};
        assertEquals(-1,test3.FindMin(arr03, 8));
    }
    @Test
    public void TestMin_04() {
        Lab04 test4 = new Lab04();
        int[] arr04 = {50, 20, 0, 25, 25, 46, 12};
        assertEquals(0, test4.FindMin(arr04, 7));
    }
    @Test
    public void TestMin_05() {
        Lab04 test5 = new Lab04();
        int[] arr05 = {-5,-4,-3,-2,-1,0,1,2,3,4,5};
        assertEquals(-5, test5.FindMin(arr05, 11));
    }
}
