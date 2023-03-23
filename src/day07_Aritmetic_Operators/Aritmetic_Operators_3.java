package day07_Aritmetic_Operators;

public class Aritmetic_Operators_3 {
    public static void main(String[] args) {
        //4500 dk kaç saattir?
       // int dk = 4500;
        //int saat = 4500/60;
        //System.out.println(saat);
        //4321 dk kaç saat dk ve saniye cinsine cevrildiğinde saniyeyi ekrana yazınız.
       // System.out.println(4321%60);
        //31502 saniye kaç saat kaç dakika kaç saniyedir? (1 saat 60 dakika 1 dakika 60 sn)
        int toplamSaniye= 31502;
        //60*60=1 saat
        int saat = toplamSaniye/3600;
        System.out.println(saat);
        //int dk = (toplamSaniye-saat*3600)/60;
        //System.out.println(dk);
        int dakika = toplamSaniye%3600/60;
        System.out.println(dakika);
        int saniye = toplamSaniye%60;
        System.out.println(saniye);




    }
}
