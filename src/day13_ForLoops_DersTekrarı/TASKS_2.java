package day13_ForLoops_DersTekrarı;

import java.util.Scanner;

public class TASKS_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Örnek: Kullanıcıdan taban ve kuvvet bilgilerini alarak ekrana sonucu
        //yazdıran programı yazdırınız.(2 üzeri 4 =16)
        System.out.println("Lütfen bir taban bilgisi için bir sayi söyleyiniz:");
        int tbn = scan.nextInt();
        System.out.println("Lütfen bir kuvvet bilgisi için bir sayi söyleyiniz:");
        int kuvvet = scan.nextInt();
        int sonuc = 1;

        //double sonuc = Math.pow(tbn,kuvvet); Farklı bir yol
        for(int i = 0;i<kuvvet;i++){
            sonuc= sonuc*tbn;


        }

        System.out.println("Kuvveti alınan sayının karşılığı = "+sonuc);


    }
}
