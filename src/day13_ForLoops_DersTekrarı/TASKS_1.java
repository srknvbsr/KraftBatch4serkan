package day13_ForLoops_DersTekrarı;

import java.util.Scanner;

public class TASKS_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*// Örnek: Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcın
        //girdiği sayı dahil . 0 dan başlayarak kullanıcının girdiği sayıya kadar
        //olan tamsayıların toplamını ekrana yazdıran programı yazınız.
        System.out.println("Lütfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int toplam = 0;
        for(int i = 0;i<=sayi;i++){
           toplam =i+toplam;
            System.out.println("toplam = " + toplam);
        }

         */
        System.out.println("*************************************************************************");
        //Örnek: Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcın
        //girdiği sayı dahil . 0 dan başlayarak kullanıcının girdiği sayıya kadar
        //tek ve çift tamsayıların toplamını ayrı ayrı ekrana yazdıran programı
        //yazınız.
        System.out.println("Lütfen bir sayi giriniz: ");
        int num = scan.nextInt();
        int csum = 0;
        int tsum= 0;
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                csum = csum + i;


            }else {
                tsum = tsum + i;
            }



        }
        System.out.println("Çift sayıların toplamı = " +csum);
        System.out.println("Tek sayıların toplamı = " +tsum);

}

}