package baithi.modem;

import com.sun.org.apache.bcel.internal.generic.FSUB;

public class SanPhamnhapkhau extends Sanpham {
    private double gianhapkhau;
    private String tinhthanhnhap;
    private double thuenhapkhau;

    public SanPhamnhapkhau(String idsp, String masp, String tensp, double giaban, int soluong, String nhasanxuat, double gianhapkhau, String tinhthanhnhap, double thuenhapkhau) {
        super(idsp, masp, tensp, giaban, soluong, nhasanxuat);
        this.gianhapkhau = gianhapkhau;
        this.tinhthanhnhap = tinhthanhnhap;
        this.thuenhapkhau = thuenhapkhau;
    }

    public double getGianhapkhau() {
        return gianhapkhau;
    }

    public void setGianhapkhau(double gianhapkhau) {
        this.gianhapkhau = gianhapkhau;
    }

    public String getTinhthanhnhap() {
        return tinhthanhnhap;
    }

    public void setTinhthanhnhap(String tinhthanhnhap) {
        this.tinhthanhnhap = tinhthanhnhap;
    }

    public double getThuenhapkhau() {
        return thuenhapkhau;
    }

    public void setThuenhapkhau(double thuenhapkhau) {
        this.thuenhapkhau = thuenhapkhau;
    }

    @Override
    public String toString() {
        return this.getIdsp() + "," + this.getMasp() + "," + this.getTensp() + "," + this.getGiaban()
                + "," + this.getSoluong() + ", " + this.getNhasanxuat();
    }


    @Override
    public String showInfor() {
        return "Idsp: " + super.getIdsp() + "\n"
                + "Ma sp: " + super.getMasp()+ "\n"
                + "Ten sp: " + super.getTensp()+"\n"
                + "Gia ban: " + super.getGiaban()+"\n"
                + "So luong: "+ super.getSoluong()+"\n"
                + "Nha san xuat: "+ super.getNhasanxuat()+"\n"
                + "Gia nhap khau: "+ this.getGianhapkhau()+"\n"
                + "Tinh thanh nhap: "+this.getTinhthanhnhap()+"\n"
                + "Thue nhap khau: " + this.getThuenhapkhau();
    }
}
