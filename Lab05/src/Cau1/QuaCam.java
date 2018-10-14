package Cau1;

public class QuaCam extends HoaQua{

    public QuaCam(String ten, String xuatXu, double soLuong) {
        super(ten, xuatXu, soLuong);
        this.setGiaCam();
    }
    
    private void setGiaCam() {
        String loaiCam = this.getXuatXu();
        if (loaiCam.equalsIgnoreCase("Trung Quoc")) {
            this.setGia(30000.0);
        } 
        if (loaiCam.equalsIgnoreCase("Viet Nam")) {
            this.setGia(50000.0);
        }
    }

    @Override
    public String toString() {
        return (this.getTen() + "\tXuat Xu: " + this.getXuatXu() + "\tGia: " +
                this.getGia() + "\tSo luong: " + this.getSoLuong() + "\tSo tien: " + this.tinhTien());
    }
    
    
    
    
}
