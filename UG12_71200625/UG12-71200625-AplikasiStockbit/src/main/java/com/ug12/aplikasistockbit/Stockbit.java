package com.ug12.aplikasistockbit;

import java.util.ArrayList;

public class Stockbit {
    public Investor investor;
    public ArrayList<Investor> arrInvestor;

    public Stockbit() {
        arrInvestor = new ArrayList<>();
    }
    public void register(Investor investor) {
        arrInvestor.add(investor);
        System.out.println("Registrasi akun atas nama "+investor.getNama()+" sukses");
    }
    public void login(String username, String password) {
        boolean status = false;
        for (Investor i : arrInvestor) {
            if ( i.getPassword().equals(password) && i.getUsername().equals(username)) {
                this.investor = i;
                status = true;
            }
        }
        if (status==false) {
            System.out.println("Username/password anda salah");
        } else {
            System.out.println("login berhasil");
        }
    }
}