package com.ug14.rumahsakit;

import java.util.Scanner;

public class Pelayanan {
    private int idPelayan;
    private String nama;

    public void mengaturJadwal(Pasien pasien, Dokter dokter, Jadwal jadwal){
        if(!pasien.isStatus()){
            jadwal.setPasien(pasien);
            jadwal.setDokter(dokter);
            jadwal.setStatusDaftar(true);
            System.out.println("Proses Pengaturan Jadwal Berhasil");
        }else {
            System.out.println("Pasien tidak sakit");
        }
    }

    public Pasien registrasi(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan nama anda : ");
        String namaPasien = inp.nextLine();

        Scanner usia = new Scanner(System.in);
        System.out.print("Masukkan usia anda : ");
        int usiaPasien= inp.nextInt();

        Scanner inp2 = new Scanner(System.in);

        System.out.print("Masukkan alamat anda : ");
        String alamatPasien= inp2.nextLine();

        Scanner inp3 = new Scanner(System.in);
        System.out.print("Masukkan penyakit anda : ");
        String penyakitPasien = inp3.nextLine();

        Pasien pengunjung = new Pasien (nama, usia, alamat, penyakit);
        System.out.println("Proses Registrasi Anda Berhasil!");
        return pengunjung;
    }


    public int getIdPelayan() {
        return idPelayan;
    }

    public void setIdPelayan(int idPelayan) {
        this.idPelayan = idPelayan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}