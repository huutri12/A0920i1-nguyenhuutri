package baithi.modem;

public class Sanphamxuatkhau extends Sanpham {
    private double Gianhapkhau;
    private String Quocgianhapsp;

    public Sanphamxuatkhau(String idsp, String masp, String tensp, double giaban, int soluong, String nhasanxuat, double gianhapkhau, String quocgianhapsp) {
        super(idsp, masp, tensp, giaban, soluong, nhasanxuat);
        Gianhapkhau = gianhapkhau;
        Quocgianhapsp = quocgianhapsp;
    }

    public double getGianhapkhau() {
        return Gianhapkhau;
    }

    public void setGianhapkhau(double gianhapkhau) {
        Gianhapkhau = gianhapkhau;
    }

    public String getQuocgianhapsp() {
        return Quocgianhapsp;
    }

    public void setQuocgianhapsp(String quocgianhapsp) {
        Quocgianhapsp = quocgianhapsp;
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
                + "Tinh thanh nhap: "+this.getGianhapkhau()+"\n"
                + "Thue nhap khau: " + this.getQuocgianhapsp();
    }
}
