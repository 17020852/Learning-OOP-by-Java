package Cau1;

public class CamCaoPhong extends QuaCam{
    public double hlVitaminC;
    public CamCaoPhong(String ten, String xuatXu, double soLuong) {
        super(ten, xuatXu, soLuong);
    }

    public void setHlVitaminC(double hlVitaminC) {
        this.hlVitaminC = hlVitaminC;
    }

    public double getHlVitaminC() {
        return hlVitaminC;
    }
    @Override
   public String toString() {
        return (this.getTen() + "\tXuat Xu: " + this.getXuatXu() + "\tGia: " +
                this.getGia() + "\tSo luong: " + this.getSoLuong() + "\tSo tien: " + this.tinhTien());
    }
    
}
