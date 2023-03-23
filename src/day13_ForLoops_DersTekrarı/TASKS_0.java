package day13_ForLoops_DersTekrarı;

import java.util.Scanner;

public class TASKS_0 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        //Örnek: ekrana 20 adet alt alta «merhaba dünya» yazdırın.
        /*for(int i = 0; i<20;i++){
            System.out.println("merhaba dünya!");


        }

         */
        System.out.println("************************************************************");
        //Örnek: 0 dan 100 e kadar olan sayıları ekrana yazdırın.
        for (int i = 0; i <= 100; i++) {
            //System.out.print(i + " ");
        }
        System.out.println("************************************************************");
        //Örnek: 15 den 100 e kadar olan sayıları ekrana yazdırın.

        for (int i = 15; i <= 100; i++) {
            //System.out.print(i + " ");
        }
        System.out.println("************************************************************");
        //Örnek: 0 dan 100 e kadar olan sayıları tersten ekrana yazdırın. (99
        //98 97 vs)
        for (int i = 99; i >= 0; i--) {
            //System.out.print(i + " ");
        }
        System.out.println("************************************************************");
        //Örnek: 0 dan 100 e kadar olan çift sayıları ekrana yazdırın.

        for (int i = 0; i <= 100; i++) {
            if (i%2==0){
                //System.out.print(i+" ");

            }
        }
        //Örnek: 0 dan 100 e kadar olan tek sayıları ekrana yazdırın
        for (int i = 0; i <= 100; i++) {
            if (i%2==1){
                //System.out.print(i+" ");

            }


            }
        System.out.println("************************************************************");
        //Örnek: 10 ile 1000 arasında olan 10 a tam bölünebilen tüm sayıları ekrana yazdırın.
        for (int i = 10; i <= 1000; i++) {
            if (i%10==0){
                //System.out.print(i+" ");

        }
        }
        System.out.println("************************************************************");
        //Örnek: 6 faktöriyel’in sonucu nedir?
        int fak = 1;
        for(int i = 1;i<=6;i++){
             fak = fak*i;

        }
        System.out.println(fak);
        System.out.println("************************************************************");
        //Örnek: 0 ile 20 arasındaki tüm sayılarının küpleri alarak ekrana
        //yazdırın.
        for(int i = 0;i<=20;i++){
            System.out.println(i+" = "+Math.pow(i,3));
        }
        System.out.println("************************************************************");
        //Örnek: 23 derece ile 50 derece arasında olan tüm Fahrenheit
        //değerlerini ekrana yazdırın. (C=(F-32) / 1.8)<<<<F = (C*1.8) + 32

        for (int i = 23; i<=50;i++){
            double farenheit = (i*1.8) + 32 ;
           // System.out.println(i+" = derece "+farenheit+" = "+"cantigrat derecedir.");

        }
        System.out.println("************************************************************");

        //Örnek: Kullanıcıdan bir kelime alın ve kaç defa yazdırmak istediğini
        //sorun . Kullanıcıdan aldığınız kelimeyi kullanıcının istediği kadar
        // ekrana yazdırın.
       // System.out.println("Lütfen bir kelime giriniz.");
        String word = scan.next();

        System.out.println("Kelimeyi kaç kez yazdırmak istersiniz?");
        int write = scan.nextInt();
        for(int i =1;i<=write;i++){
            System.out.println(word);
        }
        System.out.println("************************************************************");






    }
    }
