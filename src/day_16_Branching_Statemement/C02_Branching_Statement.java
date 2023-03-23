package day_16_Branching_Statemement;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C02_Branching_Statement {
    public static void main(String[] args) {
        //break continue ve return
        // break içinde bulunduğu loop sonşandırlır.
        // continue ....
        // System.out.println("PROGRAM BAŞLADI");

        /*for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                continue;


            }
            System.out.println("x = " + i);
        }
        System.out.println("Program sonlandı.");


    }


        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                continue;


            }
            System.out.println("x = " + i);
        }
        System.out.println("Program sonlandı.");

        // 0 ve 20 dahil aradaki çift sasyıların toplamını ekrana yazdıran programı yazınız
        int cToplam=0;
        for(int i= 0;i<=20;i++){
            if(i%2==1){

                continue;


            }
            cToplam+=i;

        }
        System.out.print(cToplam+" ");


        // 1 den 100 e kadar 5 in katlarını ekrana yazdıran pro
        for (int i = 1; i < 100; i++) {
            if(!(i%5==0)){

               continue;

            }

            System.out.println("i = " + i);
        }

        for (int i = 0; i < 2; i++) {
            System.out.print("B");
            for (int j = 0; j < 10 ; j++) {
                if(j==5){
                    System.out.println("C");
break;
                }

                if(j>2){
                   continue;

                }

                System.out.print("A");

            }

        }



//   // Şifre tanımlayın ve kullanıcıya ekrandan
//// 5 defa şifreyi girmesini isteyin. Her bulamadığında şifre doğru değildir tekrar deneyin ikazı çıksın.
//// Şifreyi bulursa «tebrikler şifre doğru» yazısı gösterildikten sonra programdan çıkış işlemi gerçekleşsin.

        Scanner scan=new Scanner(System.in);


        String sifre = "Harun123";
        int i =0;
        System.out.println("5 hakkın var");
        while(i<5){
            System.out.println(i+1+".Tahmin:");
            String tahmin =scan.next();
            if(tahmin.equals(sifre)){
                System.out.println("Tebrikler");
                break;
            }
            i++;
            if(i==5){
                System.out.println("Hatalı güle güle");
                continue;
            }
            System.out.println("Hatalı tekrar deneyiniz:");


        }


        //Nested loop kullanarak kullanıcıdan hangi işlemi yapmak
// istediğini sorun. 1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış
// kullanıcının isteğine göre işlem yapın. Kullanıcının seçimine göre Girilen ekrandan
// 2 sayı alın ve işlemin sonucunu ekrana yazın çıkmak sonuç 0  devam etmek için 1 girmesini isteyin.


        // 1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış
        // çıkarma menüsüne hoş geldiniz
        // x:
        // y:
        // result;
        // menüden çıkmak için 0 işlemlere devam etmek için 1 giriniz
}

         */
    }}

