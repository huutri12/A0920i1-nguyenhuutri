package model;

import java.sql.Date;

public class qldh {
    protected String thanhtoan;
    protected String dathang;
    protected String nv_donhang;
    protected Date ngaydathang;
    protected Date ngaygiaohang;
    protected String diachigiaohang;

    public qldh(){}

    public String getThanhtoan() {
        return thanhtoan;
    }

    public void setThanhtoan(String thanhtoan) {
        this.thanhtoan = thanhtoan;
    }

    public String getDathang() {
        return dathang;
    }

    public void setDathang(String dathang) {
        this.dathang = dathang;
    }

    public String getNv_donhang() {
        return nv_donhang;
    }

    public void setNv_donhang(String nv_donhang) {
        this.nv_donhang = nv_donhang;
    }

    public Date getNgaydathang() {
        return ngaydathang;
    }

    public void setNgaydathang(Date ngaydathang) {
        this.ngaydathang = ngaydathang;
    }

    public Date getNgaygiaohang() {
        return ngaygiaohang;
    }

    public void setNgaygiaohang(Date ngaygiaohang) {
        this.ngaygiaohang = ngaygiaohang;
    }

    public String getDiachigiaohang() {
        return diachigiaohang;
    }

    public void setDiachigiaohang(String diachigiaohang) {
        this.diachigiaohang = diachigiaohang;
    }

    public qldh(String thanhtoan, String dathang, String nv_donhang, Date ngaydathang, Date ngaygiaohang, String diachigiaohang) {
        this.thanhtoan = thanhtoan;
        this.dathang = dathang;
        this.nv_donhang = nv_donhang;
        this.ngaydathang = ngaydathang;
        this.ngaygiaohang = ngaygiaohang;
        this.diachigiaohang = diachigiaohang;
    }
}
