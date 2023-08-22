package com.company;

class Musteri {
    private String ad;
    private String soyad;
    private double maas;
    private double bakiye;
    private String tcKimlik;

    public Musteri(String ad, String soyad, double maas, double bakiye, String tcKimlik) {
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
        this.bakiye = bakiye;
        this.tcKimlik = tcKimlik;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public double getMaas() {
        return maas;
    }

    public double getBakiye() {
        return bakiye;
    }

    public String getTcKimlik() {
        return tcKimlik;
    }


    public String toString1() {
        return "Ad: " + ad + " " + soyad + ", Maaş: " + maas + ", Bakiye: " + bakiye + ", TC Kimlik: " + tcKimlik;
    }
}
