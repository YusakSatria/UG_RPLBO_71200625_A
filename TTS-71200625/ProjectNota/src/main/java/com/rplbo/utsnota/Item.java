package com.rplbo.utsnota;

public class Item {
    private KertasHVS[] krhvs;
    private BukuTulis[] bktulis;
    private Pulpen[] pen;

    public Item(KertasHVS[] krhvs) {
        this.krhvs = krhvs;
    }

    public Item(BukuTulis[] bktulis) {
        this.bktulis = bktulis;
    }

    public Item(Pulpen[] pen) {
        this.pen = pen;
    }

    public Item(KertasHVS[] krhvs, BukuTulis[] bktulis, Pulpen[] pen) {
        this.krhvs = krhvs;
        this.bktulis = bktulis;
        this.pen = pen;
    }

    public Item(KertasHVS[] krhvs, BukuTulis[] bktulis) {
        this.krhvs = krhvs;
        this.bktulis = bktulis;
    }

    public Item(KertasHVS[] krhvs, Pulpen[] pen) {
        this.krhvs = krhvs;
        this.pen = pen;
    }

    public Item(BukuTulis[] bktulis, Pulpen[] pen) {
        this.bktulis = bktulis;
        this.pen = pen;
    }

    public int getJumlahBukuTulis(){
        return 1;
    }

    public int getJumlahPen(){
        return 1;
    }

    public KertasHVS[] getKrhvs() {
        return krhvs;
    }

    public BukuTulis[] getBktulis() {
        return bktulis;
    }

    public Pulpen[] getPen() {
        return pen;
    }


}
