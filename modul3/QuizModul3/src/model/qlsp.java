package model;

public class qlsp {
    protected String namesp;
    protected int gia;
    protected int mucgiam;
    protected String tonkho;

    public qlsp(String namesp, int gia, int mucgiam, int tonkho){}

    public qlsp(String namesp, int gia, int mucgiam, String tonkho) {
        this.namesp = namesp;
        this.gia = gia;
        this.mucgiam = mucgiam;
        this.tonkho = tonkho;
    }

    public String getNamesp() {
        return namesp;
    }

    public void setNamesp(String namesp) {
        this.namesp = namesp;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getMucgiam() {
        return mucgiam;
    }

    public void setMucgiam(int mucgiam) {
        this.mucgiam = mucgiam;
    }

    public String getTonkho() {
        return tonkho;
    }

    public void setTonkho(String tonkho) {
        this.tonkho = tonkho;
    }
}
