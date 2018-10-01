import org.junit.Test;
import static org.junit.Assert.*;
public class TestBMI {
    @Test
    public void Test_case_01() {
        Lab04 test1 = new Lab04();
        assertEquals("Thieu can", test1.BMI(45, 1.6));
    }
    @Test
    public void Test_case_02() {
        Lab04 test2 = new Lab04();
        assertEquals("Binh thuong", test2.BMI(50,1.6));
    }
    @Test
    public void Test_case_03() {
        Lab04 test3 = new Lab04();
        assertEquals("Thua can", test3.BMI(60, 1.6));
    }
    @Test
    public void Test_case_04() {
        Lab04 test4 = new Lab04();
        assertEquals("Beo phi", test4.BMI(65, 1.6));
    }
    @Test
    public void Test_case_05() {
        Lab04 test5 = new Lab04();
        assertEquals("Binh thuong", test5.BMI(52, 1.6));
    }
}
