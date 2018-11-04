
package Task2;


public class ArrayIndexOfBound {
    public static void testArrayIndexofBound() throws ArrayIndexOutOfBoundsException {
        String[] texts = new String []{"one", "two", "there"};

        try {
            System.out.println(texts[4]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index of bound");
        }
    }

    public static void main(String[] args) {
        testArrayIndexofBound();
    }
}
