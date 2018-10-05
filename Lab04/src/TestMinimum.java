import org.junit.Test;
import static org.junit.Assert.*;
public class TestMinimum {
    //Xac nhan rang Min duoc tinh chinh xac
    @Test
    public void TestMin_01() {
        int[] arr01 = {100, 1, 12, 3, 4, 16};
        assertEquals(1, Lab04.minOfArray(arr01, 6));
    }
    @Test
    public void TestMin_02() {
        int[] arr02 = {-10, 11, 13, 14};
        assertEquals(-10, Lab04.minOfArray(arr02, 4));
    }
    @Test
    public void TestMin_03() {
        int[] arr03 = {1,2,3,4,5,6,7,-1};
        assertEquals(-1,Lab04.minOfArray(arr03, 8));
    }
    @Test
    public void TestMin_04() {
        int[] arr04 = {50, 20, 0, 25, 25, 46, 12};
        assertEquals(0, Lab04.minOfArray(arr04, 7));
    }
    @Test
    public void TestMin_05() {
        int[] arr05 = {-5,-4,-3,-2,-1,0,1,2,3,4,5};
        assertEquals(-5, Lab04.minOfArray(arr05, 11));
    }
}
