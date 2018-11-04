
package Task2;

/**
 * Ngoaị lệ được ném ra khi ta truy cập vào một đối tượng
 * hoặc gọi một phương thức chưa khởi tạo(null)
 */
public class NullPointer {
     public static void testNullPointException() throws NullPointerException{
        String text = null;
        try{
            System.out.println(text.toString());
        }catch (NullPointerException e){
            //3 cach in ra loi
            System.out.println("Null point exception ");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        testNullPointException();
        System.out.println("-----------------------------------------");
    }
}
