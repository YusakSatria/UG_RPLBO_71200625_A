package com.rplbo;

public class Pria {
    private String nama;
    private int usia;
    private String status;
    private double jumlahCinta;
    private Perempuan jodoh;
    private Perempuan temanKencan;

    public Pria(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public void PDKT(Perempuan calon){
        if(this.temanKencan == null){
            temanKencan = calon;
        }
    }

    public void MengajakKencan(Perempuan perempuan){
        if(perempuan != temanKencan){
            System.out.println("JANGAN SELINGKUH MAS HEI TOLONG");
            System.out.println("KAU JANGAN TIDAK SETIA, JANGAN KAU AJAK CEWEK LAIN JALAN!!");
        }
        this.jumlahCinta += 1.0;
    }

    public void MenembakKekasih(){
        if(getTemanKencan()== null){
            System.out.println("SIAPA YANG KAU TEMBAK :') || JANGAN NGAYAL DEH "+ getNama());
        }
        else {
            this.jodoh = temanKencan;
            System.out.println("SELAMAT KAMU DITERIMA :D | SELAMAT MENJALANI HIDUP BARU "+getNama());
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getJumlahCinta() {
        return jumlahCinta;
    }

    public void setJumlahCinta(double jumlahCinta) {
        this.jumlahCinta = jumlahCinta;
    }

    public Perempuan getJodoh() {
        return jodoh;
    }

    public void setJodoh(Perempuan jodoh) {
        this.jodoh = jodoh;
    }

    public Perempuan getTemanKencan() {
        return temanKencan;
    }

    public void setTemanKencan(Perempuan temanKencan) {
        this.temanKencan = temanKencan;
    }
}
