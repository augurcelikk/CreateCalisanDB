package com.ugur.repository.entity;

public class Calisan {

    int id;
    String isim;
    String soyisim;

    public Calisan() {
    }

    public Calisan(int id, String isim, String soyisim) {
        this.id = id;
        this.isim = isim;
        this.soyisim = soyisim;
    }

    public Calisan(String isim, String soyisim) {
        this.isim = isim;
        this.soyisim = soyisim;
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

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                '}';
    }
}
