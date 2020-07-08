package com.tilda.firebaseurunleruygulamasi;

import java.io.Serializable;

public class Urun implements Serializable {
    private String key;
    private String urunKodu;
    private String urunAdi;
    private double fiyat;

    public Urun() {
    }

    public Urun(String key, String urunKodu, String urunAdi, double fiyat) {
        this.key = key;
        this.urunKodu = urunKodu;
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUrunKodu() {
        return urunKodu;
    }

    public void setUrunKodu(String urunKodu) {
        this.urunKodu = urunKodu;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
}
