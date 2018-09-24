package Bai3;

public class Computer {
    private String ten;
    private String loaimay;
    private String cannang;
    private String ram;
    private String rom;

    /*
        Constructor
     */
    public Computer() {

    }
    public Computer(String ten, String loaimay, String cannang, String rom, String ram){
        this.ten = ten;
        this.cannang = cannang;
        this.loaimay = loaimay;
        this.ram = ram;
        this.rom = rom;
    }
    /*
        getter and Setter
     */

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public String getCannang() {
        return cannang;
    }

    public void setCannang(String cannang) {
        this.cannang = cannang;
    }

    public String getLoaimay() {
        return loaimay;
    }

    public void setLoaimay(String loaimay) {
        this.loaimay = loaimay;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRam() {
        return ram;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    public String getRom() {
        return rom;
    }
}
