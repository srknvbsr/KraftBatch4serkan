package day05_SummaryandProject;

public class Examples {
    public static void main(String[] args) {
        //int i1=10,i2=5,i3=4;// Tek satırda atama.
        //System.out.println("i1 in değeri= " +i1);
        //******************************SORU 1*****************************************************
        //Soru ; bir eşkenar üçgenin bir kenarı 5 cm ise
        //çevresi kaç cm dir ?
        //ekrana üçgenin çeversini yazınız.
        //int A = 5;
        //int cevre =A*3;
        //System.out.println("Eşkenar üçgenin çevresi =" +cevre);
        //********************************SORU 2*****************************************************
        //ahmet 1999 doğumlu ise şimdi yaşşı kaçtır?
        // int ahmetYas = 2023 - 1999;
        // System.out.println("Ahöet'in şuandaki yaşı : "+ahmetYas+ "dür.");
        //******************************SORU 3**********************************************
        // SORU 3 ; Ahmetin yaşı 12 annesinin yaşı 35 olduğuna göre ikisininn yaşları toplamı kaçtır?
        /*int ahmetYas= 12;
        int anneYas = 35;
        int yaslarToplamı = ahmetYas+anneYas;
        System.out.println("ikisinin Yaşları Toplamı:"  +yaslarToplamı+ "'dir");
         */
        //******************************SORU 4 **********************************************
        // Emel 8 yaşındadır Fatih ise Emelden 7 yaş bbüyüktür.Salih fatihten 5 yaş büyük ise şişmdi Salihin yaşı kaçtır?
        /*int emelYas=8;
        int fatihYas= emelYas+7;
        int salihYas = fatihYas + 5;
        System.out.print("Salih'in şimdiki yaşı:"+salihYas+ "'dir.");
        System.out.println("Emel'den 8  yaş büyüktür.");

         */
        //******************************SORU 5 **********************************************
        /* 60 soruluk sınavda 4 yanlış 1 doğruyu götürmektedir.
        Tüm soruları yanıtlayan öğencinin 51.25 neti vardır.
        öğrenci kaç soruya yanlış cevap vermiştir.
         */
       /* int toplamsoruSayisi = 60;
        double netSayisi = 51.25;
        double yanlisSayisi = ((toplamsoruSayisi - netSayisi) * 4 / 5);
        System.out.println(yanlisSayisi);

        */

        //************************SORU***************************************************
        //Ali sınıfta 7-7 halı saha maçı planlamak ve
        // oynanan maçta hakem olmak istiyor,
        // sınıfta 18 kişi var ise kaç kişi oyun dışı kalacaktır.
       /* int sinifMevcudu = 18;
        int oyuncuSayisi = 14;
        int hakemSayisi = 1;
        int oyunDisiSayisi = sinifMevcudu - (oyuncuSayisi + hakemSayisi);
        System.out.println(oyunDisiSayisi);

        */
        //************************SORU*****************************
        //Ali oynanan maçta 1 hakem olacak şekilde
        // okulda  7-7 halı saha maçıları planlamak istiyor
        // okul mevcudu 188 ise kaç kişi dışarıda kalır.

        /*int sinifMevcudu = 188;
        int oyuncuSayisi = 14;
        int hakemSayisi = 1;
        int oyunDisiSayisi = sinifMevcudu%(oyuncuSayisi + hakemSayisi);
        System.out.println(oyunDisiSayisi);

         */
        /*Bir musluğu A musluğu tek başına 12 saatte, B musluğu 30 saatte dolduruyor,
        c musluğu ise dolu havuzu 9 saatte boşaltıyor.
        Buna göre bu 3 musluk birlikte açıldığında boş havuz kaç saatte dolar.

         */
        double a_MusluguTekBasina = 12 ;
        double b_MusluguTekBasina = 30 ;
        double c_MusluguTekBasina = 9 ;
        double birlikteAcildiginda = 1/((1/(a_MusluguTekBasina)) + (1/(b_MusluguTekBasina)) - (1/(c_MusluguTekBasina)));

        System.out.println("3 musluk birlikte açıldığında = " + birlikteAcildiginda+" saatte dolar.");




    }
}
