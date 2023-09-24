package com.ugur.repository.entity;

public class Calisan {

    int id;
    String isim;
    String soyIsim;

    public Calisan() {
    }

    public Calisan(int id, String isim, String soyIsim) {
        this.id = id;
        this.isim = isim;
        this.soyIsim = soyIsim;
    }

    public Calisan(String isim, String soyIsim) {
        this.isim = isim;
        this.soyIsim = soyIsim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyIsim + '\'' +
                '}';
    }
}
