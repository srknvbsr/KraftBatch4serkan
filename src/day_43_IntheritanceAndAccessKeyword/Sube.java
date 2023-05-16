package day_43_IntheritanceAndAccessKeyword;

import java.util.Scanner;

public class Sube extends Banka {
    String subeAdi;
    int subeKodu;
    private int musteriAdet;

    public Sube() {
    }

    public Sube(String subeAdi) {
        this.subeAdi = subeAdi;
    }

    public Sube(String subeAdi, int musteriAdet) {
        this.subeAdi = subeAdi;
        this.musteriAdet = musteriAdet;

    }

    public int getMusteriAdet() {
        return musteriAdet;
    }

    public void setMusteriAdet(int musteriAdet) {
        this.musteriAdet = musteriAdet;
    }
}

