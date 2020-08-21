package com.example.bilp210_11;

public class Kisi {

    private String ad;
    private String soyad;
    private int yas;

    public Kisi(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "kişinin adı: "+ad+", soyadı: "+soyad+", yaşı: "+yas;
    }
}
