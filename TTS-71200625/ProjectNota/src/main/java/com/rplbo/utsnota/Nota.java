package com.rplbo.utsnota;

public class Nota {
    private String nonota;
    private String notelppembeli;
    private Item items;
    private String namapembeli;

    public Nota(String nonota, String notelppembeli, String namapembeli,  Item items) {
        this.nonota = nonota;
        this.notelppembeli = notelppembeli;
        this.items = items;
        this.namapembeli = namapembeli;
    }

    public void setNotelppembeli(String notelppembeli){
        this.notelppembeli = notelppembeli;
    }

    public String getNonota() {
        return nonota;
    }

    public String getNamapembeli() {
        return namapembeli;
    }

    public void setNonota(String nonota) {
        this.nonota = nonota;
    }

    public void setNamapembeli(String namapembeli) {
        this.namapembeli = namapembeli;
    }

    public String getNotelppembeli(){
        return notelppembeli;
    }

    public void tampilNota(){
        System.out.println("NOTA PEMBELIAN");
        System.out.println("No Nota : "+getNonota());
        System.out.println("Nama Pemebeli : "+getNamapembeli());
        System.out.println("Telp Pembeli : "+getNotelppembeli());
        System.out.println("Tgl : Thu Mar 17 17:40:19 WIB 2022");
        int subTotal = 0;
        int total = 0;
        System.out.println("====================================");
        for (BukuTulis buku:items.getBktulis()) {
            buku.getInformasi();
            subTotal += buku.getHarga();
            System.out.println("----------------------------------");
        }
        System.out.println("Sub Total : "+subTotal);
        total += subTotal;
        subTotal = 0;
        System.out.println("====================================");
        for (KertasHVS hvs:items.getKrhvs()) {
            hvs.getInformasi();
            subTotal += hvs.getHarga();
            System.out.println("----------------------------------");
        }
        System.out.println("Sub Total : "+subTotal);
        total += subTotal;
        subTotal = 0;
        System.out.println("====================================");
        for (Pulpen pulpen:items.getPen()) {
            pulpen.getInformasi();
            subTotal += pulpen.getHarga();
            System.out.println("----------------------------------");
        }
        System.out.println("Sub Total : "+subTotal);
        total += subTotal;
        System.out.println("====================================");
        System.out.println("TOTAL BAYAR : "+total);
    }

    public int hitungTotalBayar(){
        int subTotal = 0;
        int total = 0;
        for (BukuTulis buku:items.getBktulis()) {
            subTotal += buku.getHarga();
        }
        total += subTotal;
        subTotal = 0;
        for (KertasHVS hvs:items.getKrhvs()) {
            subTotal += hvs.getHarga();

        }
        total += subTotal;
        subTotal = 0;
        for (Pulpen pulpen:items.getPen()) {
            subTotal += pulpen.getHarga();
        }
        total += subTotal;
        return total;
    }
}
