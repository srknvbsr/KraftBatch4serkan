package day13_Forloops;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        /*kullanicidan pozitif bir tamsayi alin
        sayi cift ise "sayi cift"
        degilse "tek sayi" yazdirin

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir pozitif sayi giriniz");
        int num = scan.nextInt();
        if(num%2==0){
            System.out.println("Çift sayidır");
        }else {
            System.out.println("Tek sayidir" +
                    "");
        }
        System.out.println("**************************************************");
        System.out.println(num%2==0?"Çift sayi":"Tek sayi");
    }
}
