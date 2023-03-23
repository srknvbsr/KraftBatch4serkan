package day_16_Branching_Statemement_DersTekarari;

import java.util.Scanner;

public class C01_day_15_Summary {
    public static void main(String[] args) {
        System.out.println("DERSİMİZ BAŞLADI.HERKESE İYİ DERSLER.");
       /* int taban = 0;
        int kuvvet = 0;
        int result = 1;
        String tanımsız="Tanımsız";

        for (int i = 0; i < kuvvet; i++) {
            result *=taban;

        }
        if( taban==0&&kuvvet==0){
            System.out.println(tanımsız);
        }else {
            System.out.println(result);
        }

        */
        //**************************PİRAMİD ÜÇGEN*****************************************
        //for (int i = 5; i>0 ; i--) {
          //  for (int j = 1; j <i ; j++) {
            //    System.out.print(" ");
            //}
            //for (int k = 6-i; k >0 ; k--) {
            //    System.out.print("* ");
        //}
          //  System.out.println();

        //}
        //Örnek:
        //Kullanıcıdan 2 adet sayı alın ve bunları toplayın 2 sayısının
        //toplamı 25 ise programdan çıkış işlemi gerçekleştirin. 25 değil ise
        //program kullanıcıdan iki sayı almaya devam etsin.


        /*int toplam;

        boolean flag=true;
        while (flag){
         System.out.println("Lütfen bir sayi giriniz:");
        int sayi1=scan.nextInt();
        System.out.println("Lütfen bir sayi giriniz:");
        int sayi2=scan.nextInt();
        toplam=sayi1+sayi2;

            if(toplam>=25){
                flag=false;
                System.out.println(toplam+ "= Çıkan sayımızdır.Sayımız 25 ve 25 den büyük olduğu için birazdan programdancaksınız.");
            }
            else {
                System.out.println(toplam+" =");

            }



        }

         */
        Scanner scan=new Scanner(System.in);
        int toplam;
        boolean flag=true;
        System.out.println("PROGRAM BAŞLATILIYOR");
        while (flag){
            System.out.println("Lütfen bir sayi giriniz:");
            int sayi1=scan.nextInt();
            System.out.println("Lütfen bir sayi giriniz:");
            int sayi2=scan.nextInt();
            toplam=sayi1+sayi2;

            if(toplam>=25){

                System.out.println(toplam+ "= Çıkan sayımızdır.Sayımız 25 ve 25 den büyük olduğu için birazdan programdancaksınız.");
                continue;
                //break;//Break hangi loop içerisinde ise o looptan seni dışarı atar.

            }


            else {
                System.out.println(toplam+" =");
                flag=false;
            }





        }
        System.out.println("NEREYE GİDERSİN ZALİM");


    }
}
