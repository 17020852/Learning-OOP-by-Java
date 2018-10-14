package Cau1;

public class CamSanh extends QuaCam{
    private double hamluongDuong;
    //Constructor
    public CamSanh(String ten, String xuatXu, double soLuong) {
        super(ten, xuatXu, soLuong);
        this.setNgayNhap("5/10/2018");
    }
    //Set va Get ham luong duong
    public void setHamluongDuong(double hamluongDuong) {
        this.hamluongDuong = hamluongDuong;
    }

    public double getHamluongDuong() {
        return hamluongDuong;
    }

    
}
