import org.junit.Test;
import static org.junit.Assert.*;
public class TestBMI {
    @Test
    public void Test_case_01() {
        assertEquals("Thieu can", Lab04.BMI(45, 1.6));
    }
    @Test
    public void Test_case_02() {
        assertEquals("Binh thuong", Lab04.BMI(50,1.6));
    }
    @Test
    public void Test_case_03() {
        assertEquals("Thua can", Lab04.BMI(60, 1.6));
    }
    @Test
    public void Test_case_04() {
        assertEquals("Beo phi", Lab04.BMI(65, 1.6));
    }
    @Test
    public void Test_case_05() {
        assertEquals("Binh thuong", Lab04.BMI(52, 1.6));
    }
}
