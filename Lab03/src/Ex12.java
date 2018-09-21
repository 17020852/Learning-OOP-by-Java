package Lab03;
import java.util.Scanner;

public class Ex12 {
    //Cau a viet ham tinh UCLN cua a va b
    public int GCD(int a, int b) {
        int i = (b == 0) ? a : GCD(b, a % b);
        return i;
    }
    // Cau b viet ham tra ve só fibonacci thu n
    public int fibonacci(int n) {
        if (n<=1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        int a,b,n;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        n = scan.nextInt();

        Ex12 x = new Ex12();

        System.out.println("Uoc chung lon nhat cua hai so " + a + "," + b + " la:" +x.GCD(a,b));
        System.out.println("So fibonacci thu " + n + " la:" +x.fibonacci(n));

    }
}
