package day_21_Class_And_Object;

public class Daire {
    int r;      //---------------------------->>  //field
    double pi = 3.14;

    public void alanHesapla() {       //Aktivite
        System.out.println(pi * r * r);
    }

    public double cevreHesapla() {  //Aktivite
        return 2 * pi * r;
    }
}
