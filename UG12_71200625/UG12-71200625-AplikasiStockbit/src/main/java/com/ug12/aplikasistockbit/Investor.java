package com.ug12.aplikasistockbit;

import java.util.Map;
import java.util.HashMap;

public class Investor {
    public String username;
    public String password;
    public String nama;
    public HashMap<Saham,Integer> portfolio;
    public Investor(String nama, String username, String password ) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.portfolio = new HashMap<Saham, Integer>();
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getNama() {
        return nama;
    }
    public HashMap<Saham, Integer> getPortfolio() {
        return portfolio;
    }
}