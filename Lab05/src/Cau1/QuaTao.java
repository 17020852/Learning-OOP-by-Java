package Cau1;

public class QuaTao extends HoaQua{

    public QuaTao(String ten, String xuatXu, double soLuong) {
        super(ten, xuatXu, soLuong);
        this.setGiaTao();
    }

    private void setGiaTao() {
        if (this.getXuatXu().equalsIgnoreCase("Nhat Ban")) {
            this.setGia(70000.0);
        }
        if (this.getXuatXu().equalsIgnoreCase("My")) {
            this.setGia(80000.0);
        }
    } 
    @Override
   public String toString() {
        return (this.getTen() + "\tXuat Xu: " + this.getXuatXu() + "\tGia: " +
                this.getGia() + "\tSo luong: " + this.getSoLuong() + "\tSo tien: " + this.tinhTien());
    }
    
    
}
