package day07_Aritmetic_Operators;

import com.sun.source.tree.IfTree;

public class Examples {
    public static void main(String[] args) {
        //***********************ÖRNEK1************************************* 
        int alininDogumyili = 1990;
        int suankiTarih = 2023;
        //int alininSuankiYasi = suankiTarih - alininDogumyili;
        //System.out.println(alininSuankiYasi);
        //***********************ÖRNEK2************************************* 
        int alininSuankiYasi = 33;
        int ahmetinSuanki = alininSuankiYasi + 5;
        //System.out.println("ahmetinSuanki = " + ahmetinSuanki);
        //***********************ÖRNEK3*************************************
        int daireninYaricapı = 2;
        double PI = 3.14;//kodunbuz içeriisnde heryerde değişmeyincenden emin olduğunuz zaman büyük yazarsın.
        //System.out.print(Math.PI);
        /*System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.max(2,5));
        System.out.println(Math.max(2,5));

         */
        /*
        int daireninAlanı = (int) PI * daireninYaricapı * daireninYaricapı;

        double alan2 = Math.PI * Math.pow(daireninYaricapı, 2);
        System.out.println("alan2 = " + alan2);
        double dairenincevresi = 2*PI*daireninYaricapı;
        System.out.println("daireninAlanı = " + daireninAlanı);
         System.out.println("dairenincevresi = " + dairenincevresi);



        //int fahrenheit = 300;
        // double celsius = (fahrenheit - 32) / 1.8;
        // System.out.println("celsius = " + celsius);
        //int celsius = 32;
        //double fahrenheit = celsius * 1.8 + 32;
        //System.out.println("fahrenheit = " + fahrenheit);
        //***********************************************
        //Ali fizik dersinden 92,
        // kimya dersinden 55,
        // matematik dersinden 89 almıştır.
        //1.Ali’nin not ortalaması kaçtır?
            double ali_Fizik_Not = 92;
            double ali_Kimya_Not = 55;
            double ali_Matematik_Not = 89;
            double sonuc= (ali_Fizik_Not+ali_Kimya_Not+ali_Matematik_Not)/3;
        System.out.println("notların ortalaması = " + sonuc);

         */
       /* Örnek: Toplantı salonunda 15 adet sıra ve her sırada 12 adet koltuk vardır. Toplantıya 113 katılmıştır.
        1.Toplantı salonun toplam kapasitesi nedir?
        2.Kaç adet boş koltuk vardır ?
        3.Kaç adet sırada oturulmaktadır ?
        4. Kaç sıra tamamen boş kalmıştır.
        5.Oturulan sıralarda kaç adet boş koltuk vardır?

        */
        /*
        int koltuk = 12;
        int sira = 15;
        int toplantiya_Katilan_Sayisi= 113;
        //1.
        int kapasite= koltuk*sira;
        System.out.println("kapasite = " + kapasite);
        //2.
        int bosKoltuk_Sayisi= (kapasite-toplantiya_Katilan_Sayisi);
        System.out.println("bosKoltuk_Sayisi = " + bosKoltuk_Sayisi);
        //3.Kaç adet sırada oturulmaktadır ?
        int oturulanSayisi=toplantiya_Katilan_Sayisi/koltuk + 1 ;
        System.out.println("oturulanSayisi = " + oturulanSayisi);
        //4. Kaç sıra tamamen boş kalmıştır.
        int bosSiraAdeti=sira-oturulanSayisi
        // 5.Oturulan sıralarda kaç adet boş koltuk vardır?
        int oturulansiradakiBosKoltuk=12-(koltuk-(toplantiya_Katilan_Sayisi%12));

         */














    }
}
