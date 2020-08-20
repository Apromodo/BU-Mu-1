package com.example.bilp210_10;

public class Ulke {




    private String ad;
    private String baskent;
    private String kita;


    public Ulke(String ad,String baskent,String kita) {
        this.ad = ad;
        this.baskent = baskent;
        this.kita = kita;
    }

    @Override
    public String toString() {
        return "Ülke adı: "+ad+" Kıta: "+kita;
    }

    public String getAd() {
        return ad;
    }

    public String getBaskent() {
        return baskent;
    }
}
