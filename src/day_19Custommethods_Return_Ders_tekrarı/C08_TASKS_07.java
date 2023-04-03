package day_19Custommethods_Return_Ders_tekrarı;

import java.util.Scanner;

public class C08_TASKS_07 {
    //100 ile 999 arasındaki tüm Armstrong sayılarını yazdıran bir program yazın. Sayının her
    //basamağının küplerinin toplamı sayının kendisine eşitse bu sayı Armstrong sayısı olarak
    //adlandırılır.
    public static void main(String[] args) {
        for (int i = 100; i < 999; i++) {
            int sayi=i;
            int birlerBasamagi=sayi%10;
            int onlarBasamagi= (sayi/10)%10;
            int yuzlerBasamagi=sayi/100;
            double armstrongSayisi=(Math.pow(birlerBasamagi,3)+Math.pow(onlarBasamagi,3)+
                    Math.pow(yuzlerBasamagi,3));
            if(armstrongSayisi==sayi){
                System.out.println(armstrongSayisi);
            }

        }



    }
}
