package Cau1;

public class QuaTao extends HoaQua{
    
    //Constructor
    public QuaTao(String ten, String xuatXu, double soLuong) {
        super(ten, xuatXu, soLuong);
        this.setGiaTao();
    }
    //Ham set gia theo xuat xu
    private void setGiaTao() {
        if (this.getXuatXu().equalsIgnoreCase("Nhat Ban")) {
            this.setGia(70000.0);
        }
        if (this.getXuatXu().equalsIgnoreCase("My")) {
            this.setGia(80000.0);
        }
    } 

    
}
