package com.rplbo.utsnota;

public abstract class Barang {
    private String deskripsi;
    private String kodeBarang;
    private int harga;
    private int berat;

    public Barang(String kodeBarang, int harga, int berat, String deskripsi) {
        this.deskripsi = deskripsi;
        this.kodeBarang = kodeBarang;
        this.harga = harga;
        this.berat = berat;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public void getInformasi(){
        System.out.println("Kode : "+getKodeBarang());
        System.out.println("Harga : "+getHarga());
        System.out.println("Berat : "+getBerat());
        System.out.println("Deskripsi : "+getDeskripsi());
    }
}
