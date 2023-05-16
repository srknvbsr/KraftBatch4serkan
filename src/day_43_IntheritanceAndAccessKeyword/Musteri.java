package day_43_IntheritanceAndAccessKeyword;

public class Musteri extends Sube {
    String musteriAdSoyad;
    int hesapNo;
    double bakiye;
    boolean ispersonel;

    public String getMusteriAdSoyad() {
        return musteriAdSoyad;
    }

    public void setMusteriAdSoyad(String musteriAdSoyad) {
        this.musteriAdSoyad = musteriAdSoyad;
    }


    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    public void paraYatir(double miktar) {
        bakiye += miktar;
        System.out.println("Yeni bakiye: " + bakiye);
    }

    public void paraCek(double miktar) {
        if (miktar > bakiye) {
            System.out.println("Bakiye yetersiz!");
        } else {
            bakiye -= miktar;
            System.out.println("Yeni bakiye: " + bakiye);

        }
    }
}
