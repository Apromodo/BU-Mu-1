package com.example.lab9;

public class HavaDurumu {

    private String il;
    private String derece;
    private String durum;


    public HavaDurumu(String il, String durum, String derece) {
        this.il = il;
        this.durum = durum;
        this.derece = derece;
    }


    @Override
    public String toString() {
        return il+derece+"\n"+durum;
    }

    public String getIl() {
        return il;
    }

    public String getDurum() {
        return durum;
    }

    public String getDerece() {
        return derece;
    }
}
