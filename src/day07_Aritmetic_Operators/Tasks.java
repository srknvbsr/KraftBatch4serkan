package day07_Aritmetic_Operators;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        //************************************************************************
         Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dairenin yaricapini Giriniz:");
        double yaricap=scan.nextDouble();
        double Pi=3.14;
        double alan=Pi*yaricap*yaricap;
        double cevre = 2*Pi*yaricap;
        System.out.println("Dairenin alani = " + alan);
        System.out.println("Dairenin cevresi = " + cevre);


        //*************************************************************************
/*
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen Fahrenheit degeri Giriniz:");
        int fahrenheit= scan.nextInt();
        System.out.println("fahrenheit degeriniz = " + fahrenheit);
        double celcius= (fahrenheit-32)/1.8;
        System.out.println("Celcius Degeriniz =" +celcius);

         /*

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Toplantı salonu için sırasıyla sıra  sayısını giriniz:");
        int sira = scan.nextInt();
        System.out.println("sira = " + sira);
        System.out.println("Lütfen Toplantı salonu için koltuk  sayısını giriniz:");

        int koltuk= scan.nextInt();
        System.out.println("koltuk = " + koltuk);
        System.out.println("Lütfen Toplantı salonu için sırasıyla toplantuya katılan sayısını giriniz:");

        int toplantıyaKatılanSayi= scan.nextInt();
        System.out.println("toplantıyaKatılanSayi = " + toplantıyaKatılanSayi);
        int toplantiSalonuKapasitesi= sira*koltuk;
        System.out.println("toplantiSalonuKapasitesi = " + toplantiSalonuKapasitesi);
        int bosKoltukSayisi= toplantiSalonuKapasitesi - toplantıyaKatılanSayi;
        System.out.println("bosKoltukSayisi = " + bosKoltukSayisi);
        int oturulanSiraSayisi= toplantıyaKatılanSayi/koltuk;
        System.out.println("oturulanSiraSayisi = " + oturulanSiraSayisi);
        int tamamenBosKalanSira= (toplantiSalonuKapasitesi-toplantıyaKatılanSayi)/sira;
        System.out.println("tamamenBosKalanSira = " + tamamenBosKalanSira);
        int oturulanSıradakiBosKoltukSayisi=toplantıyaKatılanSayi%koltuk;
        System.out.println("oturulanSıradakiBosKoltukSayisi = " + oturulanSıradakiBosKoltukSayisi);


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Toplam bir saniye Degeri Giriniz:");
        int toplamSaniye = scan.nextInt();
        int saat = toplamSaniye/3600;
        int dakika = (toplamSaniye-saat*3600)/60;//ya da
        // int dakika=(toplamsaniye%3600)/60;
        int saniye=toplamSaniye/60;
        System.out.println("Girilen saniye Degeri: " +saat+ "saat" +dakika+ "dakika" +saniye+ "saniyedir.");

        */


    }


}
