package org.enes.Okul.entity;

public class Ogrenci {
    int id;
    String ad;
    String soyad;
    String veliadi;
    int yas;
    String iletisim;

    public Ogrenci() {
    }

    public Ogrenci(String ad, String soyad, String veliadi, int yas, String iletisim) {
        this.ad = ad;
        this.soyad = soyad;
        this.veliadi = veliadi;
        this.yas = yas;
        this.iletisim = iletisim;
    }

    public Ogrenci(int id, String ad, String soyad, String veliadi, int yas, String iletisim) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.veliadi = veliadi;
        this.yas = yas;
        this.iletisim = iletisim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getVeliadi() {
        return veliadi;
    }

    public void setVeliadi(String veliadi) {
        this.veliadi = veliadi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getIletisim() {
        return iletisim;
    }

    public void setIletisim(String iletisim) {
        this.iletisim = iletisim;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", veliadi='" + veliadi + '\'' +
                ", yas=" + yas +
                ", iletisim='" + iletisim + '\'' +
                '}';
    }
}
