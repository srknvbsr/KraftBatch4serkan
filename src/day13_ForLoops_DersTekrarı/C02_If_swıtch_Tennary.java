package day13_ForLoops_DersTekrarı;

import java.util.Scanner;

public class C02_If_swıtch_Tennary {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        /* Kullanicidan bir harf isteyin
         o harfle baslayan gun ismi varsa yazdirin
         yoksa "gecersiz harf" yazdirin*/
        /*String name = "Serkan";
        System.out.println(name);
        System.out.println(name.charAt(0));

         */
       System.out.println("Lütfen bir harf giriniz:");
       char harf =scan.next().charAt(0);

       if(harf=='p' || harf=='P'){
           System.out.println("Perşembe,Pazartesi,Pazar");

       } else if (harf=='s' || harf=='S') {
           System.out.println("Salı");

       }else if (harf=='c' || harf=='C') {
           System.out.println("Carsamba,Cuma");
       }else {
           System.out.println("Yanlış harf girdiniz : ");

       }
        System.out.println("******************************************************************");
       switch (harf){
           case 's','S':
               System.out.println("Salı");
               break;
           case 'c':
           case'C':
               System.out.println("Çarşamba,Cuma,Cumartesi");
               break;
           case 'p':
           case'P':
               System.out.println("Pazar,Pazartesi,Perşembe");
               break;
           default:
               System.out.println("Geçersiz bir harf girdiniz:");
       }
        System.out.println("******************************************************************");
       String result = (harf=='s' || harf=='S')? "Salı":(harf=='p'|| harf=='P')?"Pazar,Pazartesi,Perşembe"
               :(harf=='c'|| harf=='C')? "Cuma":"Yanlış";
        System.out.println(result);

        System.out.println("******************************************************************");


    }
}
