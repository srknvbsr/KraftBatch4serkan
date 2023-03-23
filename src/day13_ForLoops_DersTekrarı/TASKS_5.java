package day13_ForLoops_DersTekrarı;

import java.util.Scanner;

public class TASKS_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Örnek: Şifre tanımlayın ve kullanıcıya ekrandan 3 defa şifreyi
        //girmesini isteyin şifreyi bulursa «tebrikler şifre doğru» bulamaz ise
        //şifre yanlış ikazı versin.
        int hak = 3;
        String sifre="Serkan";
        String tahmin = " ";


        for(int i = 1;i<=hak;i++){
            System.out.println("Lütfen Tahminde bulununuz.");
            tahmin=scan.next();
            if(tahmin.equals(sifre)){
                System.out.println("Tebrikler bildiniz:");
            }else {
                System.out.println("Yanlış bir parola söylediniz. kalan hak miktarınız: " +(hak-i));
                    if((hak-i==0)){
                        System.out.println("Başka sefere bir daha deneyiniz.");
                    }
            }

        }


    }
}
