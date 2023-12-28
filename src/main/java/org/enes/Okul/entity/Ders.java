package org.enes.Okul.entity;

public class Ders {
    int id;
    String ad;

    public Ders() {
    }

    public Ders(String ad) {

    }

    public Ders(int id, String ad) {
        this.id = id;
        this.ad = ad;
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

    @Override
    public String toString() {
        return "Ders{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                '}';
    }
}
