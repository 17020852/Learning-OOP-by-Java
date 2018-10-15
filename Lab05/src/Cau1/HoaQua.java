
package Cau1;

public class HoaQua {
    private String ten;
    private double gia;
    private String xuatXu;
    private String ngayNhap;
    private double soLuong;
    
// Constructor

    public HoaQua(String ten, String xuatXu, double soLuong) {
        this.ten = ten;
        this.gia = 0;
        this.xuatXu = xuatXu;
        this.ngayNhap = "7/10/2018";
        this.soLuong = soLuong;
    }

    public HoaQua() {
    }

//    Setter and Getter
    
    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }
   
    public void setGia(double giaBan1Can) {
        this.gia = giaBan1Can;
    }

    public double getGia() {
        return gia;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getSoLuong() {
        return soLuong;
    }
    
    //    Ham tinh gia Hoa qua
    public double tinhTien() {
        if (this.getGia() != 0 ) {
            return this.getGia() * this.soLuong;
        }
        else return -1;
    }
    // Ham tra ve string cac gia tri cua Qua do
    @Override
    public String toString() {
        return (this.getTen() + "\tXuat Xu: " + this.getXuatXu() + "\tGia: " +
                this.getGia() + "\tSo luong: " + this.getSoLuong() + "\tSo tien: " + this.tinhTien());
    }
    
    
}
