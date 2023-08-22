package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Musteri> musteriListesi = new ArrayList<>();

        // Müşteri nesnelerini oluşturup listeye ekleme
        musteriListesi.add(new Musteri("Ahmet", "Yılmaz", 50000, 1000000, "12345678901"));
        musteriListesi.add(new Musteri("Akın", "Aydın", 60000, 2000000, "23456789012"));
        musteriListesi.add(new Musteri("Ayşe", "Demir", 45000, 1500000, "34567890123"));
        musteriListesi.add(new Musteri("Fatma", "Aydın", 55000, 1200000, "45678901234"));

        // Müşteri bilgilerini ekrana yazdırma
        System.out.println("Tüm Müşteriler:");
        for (Musteri musteri : musteriListesi) {
            System.out.println(musteri);
        }

        // Maaşları sıralayıp ekrana yazdırma
        Collections.sort(musteriListesi, Comparator.comparingDouble(Musteri::getMaas));
        System.out.println("\nMaaş Sıralaması:");
        for (Musteri musteri : musteriListesi) {
            System.out.println(musteri.getAd() + " " + musteri.getSoyad() + ": " + musteri.getMaas());
        }

        // İsimle müşteri arama ve ekrana yazdırma
        String arananIsim = "Akın";
        String arananSoyIsim = "Aydın";
        Musteri arananMusteri = null;
        for (Musteri musteri : musteriListesi) {
            if (musteri.getAd().equalsIgnoreCase(arananIsim)) {
                arananMusteri = musteri;
                break;
            }
        }

        if (arananMusteri != null) {
            System.out.println("\nAranan Müşteri: " + arananMusteri);
        } else {
            System.out.println("\nAranan isimde bir müşteri bulunamadı.");
        }
    }
}

