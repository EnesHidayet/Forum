package org.enes.Okul;

import org.enes.Okul.entity.Ders;
import org.enes.Okul.entity.Ogrenci;
import org.enes.Okul.repository.DersRepository;
import org.enes.Okul.repository.OgrenciRepository;

import java.util.Scanner;

public class Runner_Odev {
    public static void main(String[] args) throws Exception {

        /**
         * OkulDB
         * --Öğrenciler olacak - tblogrenci(id,ad,soyad,yas,veliadi,iletisimtel)
         *
         * Java tarafından
         * *******************************
         * ******* OKUL OTOMASYONU *******
         * 1- Öğrenci Ekle
         * 2- Öğrenci Listele
         * 3- Öğrenci Düzenle
         * 0- ÇIKIŞ
         * --------------------------------
         * Öğrenci ekleme ekranı
         * ad:
         * soyad:
         * yas:
         * veliad:
         * iletisim:
         * DB ye kaydet
         */

        uygulama();

    }

    public static int okulOtomasyonuMenu(){
        System.out.println("*********************************************");
        System.out.println("************** OKUL OTOMASYONU **************");
        System.out.println("1- Öğrenci Ekle");
        System.out.println("2- Öğrenci Listele");
        System.out.println("3- Öğrenci Güncelle");
        System.out.println("4- Ders Ekle");
        System.out.println("5- Ders Listele");
        System.out.println("0- ÇIKIŞ");

        int secim=new Scanner(System.in).nextInt();
        return secim;
    }

    public static void uygulama() throws Exception {
        int secim;
       do {
            secim=okulOtomasyonuMenu();
           System.out.println("Lütfen işleminizi seçiniz.");
            switch (secim){
                case 1:
                    ogrenciEkle();
                    break;
                case 2:
                    ogrenciListele();
                    break;
                case 3:
                    ogrenciGuncelle();
                    break;
                case 4:
                    dersEkle();
                    break;
                case 5:
                    dersListele();
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor.");
                    break;
                default:
                    System.out.println("Geçersiz seçim yaptınız.");break;
            }
        } while(secim!=0);

    }

    public static void ogrenciEkle(){
        System.out.println("Öğrencinin adı...");
        String ad=new Scanner(System.in).nextLine();
        System.out.println("Öğrencinin soyadı...");
        String soyad=new Scanner(System.in).nextLine();
        System.out.println("Öğrencinin velisinin adı...");
        String veliadi=new Scanner(System.in).nextLine();
        System.out.println("Öğrencinin yaşı...");
        int yas=new Scanner(System.in).nextInt();
        System.out.println("Öğrenci iletişim numarası...");
        String iletisim=new Scanner(System.in).nextLine();

        new OgrenciRepository().save(new Ogrenci(ad,soyad,veliadi,yas,iletisim));
    }

    public static void ogrenciGuncelle(){
        new OgrenciRepository().update(null);
    }

    public static void ogrenciListele(){
        new OgrenciRepository().findAll().forEach(System.out::println);
    }

    private static void dersEkle() {
        System.out.print("Ders adı.....: ");
        String ad = new Scanner(System.in).nextLine();
        Ders ders = new Ders(ad);
        new DersRepository().save(ders);
    }

    private static void dersListele() {
        new DersRepository().findAll().forEach(System.out::println);
    }


}
