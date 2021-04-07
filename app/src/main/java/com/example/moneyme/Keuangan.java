package com.example.moneyme;

public class Keuangan {

    private String sumber;
    private String nominal;
    private String tanggal;

    public Keuangan(String sumber, String nominal, String tanggal) {
        this.sumber = sumber;
        this.nominal = nominal;
        this.tanggal = tanggal;
    }

    public String getSumber() {
        return sumber;
    }

    public void setSumber(String sumber) {
        this.sumber = sumber;
    }

    public String getNominal() {
        return nominal;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}
