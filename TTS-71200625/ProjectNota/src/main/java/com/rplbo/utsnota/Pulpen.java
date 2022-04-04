package com.rplbo.utsnota;

public class Pulpen extends Barang{
    private String warna;

    public Pulpen(String kodeBarang, int harga, int berat, String deskripsi, String warna) {
        super(kodeBarang, harga, berat, deskripsi);
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void getInformasi(){
        super.getInformasi();
        System.out.println("Warna : "+getWarna());
    }
}
