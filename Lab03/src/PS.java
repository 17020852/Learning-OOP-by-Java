//bai 2 tao class phan so, va cac phuong thuc cong tru nhan chia rut gon tren phan so
import Lab03.Ex12;
public class PS {
    private int tu;
    private int mau;

    // set tu so
    public void setTu(int tu) {
        this.tu = tu;
    }
    //get tu so
    public int getTu() {
        return tu;
    }

    //set mau so

    public void setMau(int mau) {
        this.mau = mau;
    }

    //get mau so
    public int getMau() {
        return mau;
    }

    //get phan so
    public void getPS() {
        System.out.println(tu+"/"+mau);
    }

    //constructor mac dinh
    public PS() {
        tu = 0;
        mau = 1;
    }
    //Constructor truyen vao tu so va mau so
    public PS(int tu, int mau) {

        this.tu = tu;
        this.mau = mau;
    }
    //Ham rut gon PS
    // Tim uoc chung lon nht cua tu va mau
    // Sau do chia ca tu va mau cho UCLN
    //phuong thuc GCD duoc dinh nghia o class EX1(bai1)
    public PS rutgon() {
        Ex12 temp = new Ex12();
        int gcd = temp.GCD(this.tu, this.mau);
        this.tu = this.tu/gcd;
        this.mau = this.mau/gcd;
        return this;

    }
    //Ham cong phan so
    public PS add(PS x) {
        PS t = new PS();
        t.tu = this.tu*x.mau + this.mau*x.tu;
        t.mau = this.mau * x.mau;

        return t.rutgon();
    }
    //Ham nhan PS
    public PS nhan(PS x) {
        PS t = new PS();
        t.tu = this.tu * x.tu;
        t.mau = this.mau * x.mau;
        return t.rutgon();
    }
    public PS tru(PS x) {
        PS t = new PS();
        t.tu = this.tu*x.mau - this.mau*x.tu;
        t.mau = this.mau * x.mau;
        return t.rutgon();
    }
    public PS chia(PS x) {
        PS t = new PS();
        t.tu = this.tu * x.mau;
        t.mau = this.mau * x.tu;
        return t.rutgon();
    }
    // Ham kiem tra xem hai phan so co bang nhau khong
    // Ban dau rut gon hai phan so sau do so sanh hai tu va mau cua phan so sau khi rut gon
    public boolean equals(PS x) {
        x.rutgon();
        this.rutgon();
        return ((x.tu==this.tu) && (x.mau == this.mau));
    }

    public static void main(String[] args) {
        PS ps1 = new PS(3, 4);
        PS ps2 = new PS(3,5);

        System.out.println(ps1.equals(ps2));
        PS ps3 = new PS();
        ps3 = ps1.nhan(ps2);
        ps3.getPS();
        ps3 = ps1.add(ps2);
        ps3.getPS();
    }



}
