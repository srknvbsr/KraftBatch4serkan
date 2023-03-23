package day07_Aritmetic_Operators_Ders_Tekrari;

import java.util.Scanner;

public class Aritmetic_Operators {
    public static void main(String[] args) {
        //byte a = 1;
        //byte b = 2;
        //int c= a+ b;
        //System.out.println("c = " + c);
        //**********************************************************************
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime Giriniz:");
        String a= scan.nextLine();
        System.out.println("Girilen harf " +a);

         */
        //***********************************************************************
        double PI = 3.14;
        int r = 2;
       /* System.out.println(Math.PI);
        System.out.println((int) Math.pow(2, 3));
        System.out.println(Math.sqrt(36));


        double alan= PI*r*r;
        double alan2= Math.PI*Math.pow(r,2);
        System.out.println("alan2 = " + (float)alan2);
        System.out.println("alan = " + alan);


        //*************************************************************************************************
        //Ali fizik dersinden 92,
        // kimya dersinden 55,
        // matematik dersinden 89 almıştır.
        //1.Ali’nin not ortalaması kaçtır?
        double fizik = 92;
        double kimya = 90;
        double matemati = 89;
        int ortalama = (int)(fizik+kimya+matemati)/3;
        System.out.println("Alininn_Not_Ortalması: " + ortalama) ;
        boolean isPas= ortalama >80;
        System.out.println(" Ali Dersten Geçti mi?"  +  isPas);

        */
        //*************************************************************************************************
        /*Toplantı salonunda 15 adet sıra ve her sırada 12 adet koltuk vardır.Toplantıya 113 katılmıştır.
        1. Toplantı salonun toplam kapasitesi nedir ?
        2. Kaç adet boş koltuk vardır ?
        3. Kaç adet sırada oturulmaktadır ?
        4. Kaç sıra tamamen boş kalmıştır.
        5. Oturulan sıralarda kaç adet boş koltuk vardır ?

         */
        //*****************************************************************************************************
        /*
        int katilimSayisi= 113;
        int sira = 15;
        int koltuk = 12;
        int toplamKapasite= sira*koltuk;
        int bosKoltuksayisi= toplamKapasite%katilimSayisi;
        int oturulanSiraSayisi= (katilimSayisi/koltuk) +1;
        int tamamenBosSiraSayisi= katilimSayisi%koltuk;
        System.out.println("katilimSayisi = " + katilimSayisi);
        System.out.println("sira = " + sira);
        System.out.println("koltuk = " + koltuk);
        System.out.println("toplamKapasite = " + toplamKapasite);
        System.out.println("bosKoltuksayisi = " + bosKoltuksayisi);
        System.out.println("oturulanSiraSayisi = " + oturulanSiraSayisi);
        System.out.println("tamamenBosSiraSayisi = " + tamamenBosSiraSayisi);

         */
        //***************************************************************************************************
        //31502 saniye kaç saat kaç dakika kaç saniyedir? (1 saat 60 dakika 1 dakika 60 sn)
        // 1 saat 3600 saniyedir.
        int toplamSaniye = 31502;
        int saat = toplamSaniye / 3600;
        //int dakika= (toplamSaniye-saat*3600)/60;
        int dakika = toplamSaniye % 3600 / 60;
        int saniye = toplamSaniye % 60;
        //System.out.println("saniye = " + saniye);
        // System.out.println("dakika = " + dakika);
        System.out.println("Toplam 31502 Saniye ="+saat+ "saat" +dakika + "dakika" +saniye+ "saniye" + "dir.");



    }
}
