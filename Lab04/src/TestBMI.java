import org.junit.Test;
import static org.junit.Assert.*;
public class TestBMI {
    //Xac nhan rang thong bao ve can nang tinh theo chi so BMI chinh xac
    @Test
    public void Test_case_01() {
        assertEquals("Thieu can", Lab04.calculateBMI(45, 1.6));
    }
    @Test
    public void Test_case_02() {
        assertEquals("Binh thuong", Lab04.calculateBMI(50,1.6));
    }
    @Test
    public void Test_case_03() {
        assertEquals("Thua can", Lab04.calculateBMI(60, 1.6));
    }
    @Test
    public void Test_case_04() {
        assertEquals("Beo phi", Lab04.calculateBMI(65, 1.6));
    }
    @Test
    public void Test_case_05() {
        assertEquals("Binh thuong", Lab04.calculateBMI(52, 1.6));
    }
}
