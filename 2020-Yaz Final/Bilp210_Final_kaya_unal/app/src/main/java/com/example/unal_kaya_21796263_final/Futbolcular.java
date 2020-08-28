package com.example.unal_kaya_21796263_final;

public class Futbolcular {

    private int id;
    private String ad;
    private String mevki;
    private int numara;


    public Futbolcular(int id, String ad, String mevki, int numara) {
        this.id = id;
        this.ad = ad;
        this.mevki = mevki;
        this.numara = numara;
    }


    @Override
    public String toString() {
        return ad+" Mevki: "+mevki+" No: "+id;
    }

    public int getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public String getMevki() {
        return mevki;
    }

    public int getNumara() {
        return numara;
    }
}
