package Cau1;

public class CamCaoPhong extends QuaCam{
    public double hlVitaminC;
    //Constructor
    public CamCaoPhong(String ten, String xuatXu, double soLuong) {
        super(ten, xuatXu, soLuong);
    }
    //Ham Set va get ham luong vitamin C
    public void setHlVitaminC(double hlVitaminC) {
        this.hlVitaminC = hlVitaminC;
    }

    public double getHlVitaminC() {
        return hlVitaminC;
    }

}
