
package Task2;

/**
 * Ép kiểu không hợp lệ
 */
public class ClassCasting {
    public static void testClassCastException() throws ClassCastException{
        Object i = Integer.valueOf(13);
        try {
            String s = (String) i;
        }catch (ClassCastException e){
            System.out.println("Ep kieu khong hop le");
        }
    }

    public static void main(String[] args) {
        testClassCastException();
    }
}
