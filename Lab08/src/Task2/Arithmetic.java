
package Task2;

/**
 *  Cac loi ve so hoc
 */
public class Arithmetic {
    public static void testArithmeticException(int a, int b) throws ArithmeticException {

        try{
            int rusult = a / b;
        }catch (ArithmeticException e){
            System.out.println("Loi chia cho 0");
        }
    }

    public static void main(String[] args) {
        testArithmeticException(10, 0);
    }
}
