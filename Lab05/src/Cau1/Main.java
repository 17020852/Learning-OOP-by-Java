package Cau1;

public class Main {
    public static void main(String[] args) {
        QuaCam quaCam = new QuaCam("Cam", "Viet Nam", 20.5 );
        QuaTao quaTao = new QuaTao("Tao", "My", 10.0);
        CamSanh camSanh = new CamSanh("Cam Sanh", "Viet tNam", 2.0);
        CamCaoPhong camCaoPhong = new CamCaoPhong("Cam Cao Phong", "Viet Nam", 5.0);
        System.out.println(quaCam.toString());
        System.out.println(quaTao.toString());
        System.out.println(camSanh.toString());
        System.out.println(camCaoPhong.toString());
        
    }
 
}
