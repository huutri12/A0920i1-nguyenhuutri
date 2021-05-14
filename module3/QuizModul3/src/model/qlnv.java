package model;

import java.sql.Date;

public class qlnv {
    protected String namenv;
    protected Date date_nv;
    protected  String diachi_nv;

    public qlnv(){}

    public String getNamenv() {
        return namenv;
    }

    public void setNamenv(String namenv) {
        this.namenv = namenv;
    }

    public Date getDate_nv() {
        return date_nv;
    }

    public void setDate_nv(Date date_nv) {
        this.date_nv = date_nv;
    }

    public String getDiachi_nv() {
        return diachi_nv;
    }

    public void setDiachi_nv(String diachi_nv) {
        this.diachi_nv = diachi_nv;
    }

    public qlnv(String namenv, Date date_nv, String diachi_nv) {
        this.namenv = namenv;
        this.date_nv = date_nv;
        this.diachi_nv = diachi_nv;
    }
}
