package day12_SwitchCase;

import java.util.Scanner;

public class C03_IF_ELSE_Example_HesapMakinesi {
    public static void main(String[] args) {
        //+,-,*,/ dört işlemm yapacak şekilde hesap makinesi yapın
        // kullanıcıdan iki sayı aşınız
        //yapmak istedipi işlemi secsin.
        //hatalı işlem girilerinde kullanıcıya uuyarı versin
        // ekrana sonuç döndürsün.
        Scanner scan =new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz");
        double number = scan.nextDouble();
        System.out.print("Lütfen bir sayi daha giriniz");
        double number2 = scan.nextDouble();
        System.out.println("1.Çarpma\n2.Bölme\n3.toplama\n4.Çıkarma\n"
        + "Hangi işlemi yapamak istiyorsunuz? ");
        double isl = scan.nextDouble();
        double sonuc = 1;

        if(isl==1){
           sonuc= number*number2;
            System.out.println("sonuc = " + sonuc);
        } else if (isl==2) {
            sonuc=number/number2;
            System.out.println("sonuc = " + sonuc);

        } else if (isl == 3) {
            sonuc = number+number2;
            System.out.println("sonuc = " + sonuc);

        } else if (isl==4) {
            sonuc=number-number2;
            System.out.println("sonuc = " + sonuc);

        }else {
            System.out.println("Hiç bir işlem Yapmadınız.");
        }

    }
}
