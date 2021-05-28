package baithi.modem;

public abstract class Sanpham {
    private String Idsp;
    private String Masp;
    private String Tensp;
    private double Giaban;
    private int Soluong;
    private String Nhasanxuat;

    public Sanpham(String idsp, String masp, String tensp, double giaban, int soluong, String nhasanxuat) {
        Idsp = idsp;
        Masp = masp;
        Tensp = tensp;
        Giaban = giaban;
        Soluong = soluong;
        Nhasanxuat = nhasanxuat;
    }

    public String getIdsp() {
        return Idsp;
    }

    public void setIdsp(String idsp) {
        Idsp = idsp;
    }

    public String getMasp() {
        return Masp;
    }

    public void setMasp(String masp) {
        Masp = masp;
    }

    public String getTensp() {
        return Tensp;
    }

    public void setTensp(String tensp) {
        Tensp = tensp;
    }

    public double getGiaban() {
        return Giaban;
    }

    public void setGiaban(double giaban) {
        Giaban = giaban;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int soluong) {
        Soluong = soluong;
    }

    public String getNhasanxuat() {
        return Nhasanxuat;
    }

    public void setNhasanxuat(String nhasanxuat) {
        Nhasanxuat = nhasanxuat;
    }

    public abstract String showInfor();
}
