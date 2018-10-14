package Cau1;

public class QuaCam extends HoaQua{

    // Constructor
    public QuaCam(String ten, String xuatXu, double soLuong) {
        super(ten, xuatXu, soLuong);
        this.setGiaCam();
    }
    // Ham thiet lap gia cam theo loai Cam
    private void setGiaCam() {
        String loaiCam = this.getXuatXu();
        if (loaiCam.equalsIgnoreCase("Trung Quoc")) {
            this.setGia(30000.0);
        } 
        if (loaiCam.equalsIgnoreCase("Viet Nam")) {
            this.setGia(50000.0);
        }
    }
 
}
