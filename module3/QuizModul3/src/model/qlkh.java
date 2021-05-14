package model;

import java.sql.Date;

public class qlkh {
    protected String name_kh;
    protected Date date_kh;
    protected int sdt;
    protected String diachi_kh;
    protected String email;

    public qlkh(){}

    public String getName_kh() {
        return name_kh;
    }

    public void setName_kh(String name_kh) {
        this.name_kh = name_kh;
    }

    public Date getDate_kh() {
        return date_kh;
    }

    public void setDate_kh(Date date_kh) {
        this.date_kh = date_kh;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getDiachi_kh() {
        return diachi_kh;
    }

    public void setDiachi_kh(String diachi_kh) {
        this.diachi_kh = diachi_kh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public qlkh(String name_kh, Date date_kh, int sdt, String diachi_kh, String email) {
        this.name_kh = name_kh;
        this.date_kh = date_kh;
        this.sdt = sdt;
        this.diachi_kh = diachi_kh;
        this.email = email;
    }
}
