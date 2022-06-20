package com.uas.prakrplbo;

public abstract class Monster implements MonsterInterface {
    public String nama;

    public Monster(String nama) {
        this.nama = nama;
    }

    public abstract String bersuara();

    @Override
    public String bergerak() {
        return null;
    }

    public void getInfo() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Suara : " + this.bersuara());
        System.out.println("Gerak : " + this.nama + " " + this.bergerak());
    }

    public String getNama() {
        return nama;
    }
}
