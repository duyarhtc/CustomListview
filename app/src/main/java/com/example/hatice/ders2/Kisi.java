package com.example.hatice.ders2;

/**
 * Created by hatice on 11.06.2017.
 */

public class Kisi {
    String isim;
    Boolean kadınmı;

    public Kisi(String isim,Boolean kadınmı){
        super();
        this.isim=isim;
        this.kadınmı=kadınmı;



    }
    public boolean isKadinMi() {
        return kadınmı;
    }

    public Kisi(String isim) {
        this.isim = isim;
    }

    public Kisi(Boolean kadınmı) {
        this.kadınmı = kadınmı;
    }

    public String getIsim() {
        return isim;
    }

    public Boolean getKadınmı() {
        return kadınmı;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setKadınmı(Boolean kadınmı) {
        this.kadınmı = kadınmı;
    }
}
