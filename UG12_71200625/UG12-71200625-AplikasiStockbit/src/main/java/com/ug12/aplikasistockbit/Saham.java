package com.ug12.aplikasistockbit;

public class Saham {
    public String kode;
    public long harga;

    public String getKode() {
        return kode;
    }
    public long getHarga() {
        return harga;
    }
    public Saham(String kode, long harga) {
        this.kode = kode;
        this.harga = harga;
    }
}