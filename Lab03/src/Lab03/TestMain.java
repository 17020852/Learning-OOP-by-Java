package Lab03;

public class TestMain {
    public static void CongHaiSo(int a, int b) {
        int c=0;
        c = a+ b;
        System.out.println(c);

    }
    public static void main(String[] args) {
        TestMain testMain = new TestMain();
                testMain.CongHaiSo(10,20);
    }
}
