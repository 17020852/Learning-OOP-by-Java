package Cau1;

public class CamSanh extends QuaCam{
    private double hamluongDuong;
    public CamSanh(String ten, String xuatXu, double soLuong) {
        super(ten, xuatXu, soLuong);
        this.setNgayNhap("5/10/2018");
    }

    public void setHamluongDuong(double hamluongDuong) {
        this.hamluongDuong = hamluongDuong;
    }

    public double getHamluongDuong() {
        return hamluongDuong;
    }
    @Override
   public String toString() {
        return (this.getTen() + "\tXuat Xu: " + this.getXuatXu() + "\tGia: " +
                this.getGia() + "\tSo luong: " + this.getSoLuong() + "\tSo tien: " + this.tinhTien());
    }
    
    
}
