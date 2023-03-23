package day12_SwitchCaseDersTekrarı;

import java.util.Scanner;

public class C03_IF_ELSE_Example_HesapMakinesi {
    public static void main(String[] args) {
        //+,-,*,/ dört işlemm yapacak şekilde hesap makinesi yapın
        // kullanıcıdan iki sayı aşınız
        //yapmak istedipi işlemi secsin.
        //hatalı işlem girilerinde kullanıcıya uuyarı versin
        // ekrana sonuç döndürsün.
        Scanner scan = new Scanner(System.in);
        /*System.out.println("Lütfen iki sayi giriniz: ");
        int sayi =scan.nextInt();
        int sayi2=scan.nextInt();
        System.out.println("1.Çarpma\n 2.Bölme\n 3.Toplama\n 4.Çıkarma\n "+"Hangi işlemi Yapmak isterseniz? ");
        int islm = scan.nextInt();
        int sonuc = 0;
        if(islm == 1){
            sonuc=sayi2*sayi;
            System.out.println("sonuc = " + sonuc);
        } else if (islm == 2) {
            sonuc=sayi2/sayi;
            System.out.println("sonuc = " + sonuc);

        }else if (islm == 3) {
               sonuc=sayi2+sayi;
                System.out.println("sonuc = " + sonuc);
        }else if (islm == 4) {
            sonuc=sayi2-sayi;
            System.out.println("sonuc = " + sonuc);

        }else  {
            System.out.println("Yanlış işlem seçtiniz . ");
        }

         */
        System.out.println("Lütfen iki sayi giiniz: ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println("Lütfen işlem yapmak istediğiniz karakteri seçiniz (*,/,+,-) ");
        String islem = scan.next();
        if (islem.equals("*")) {
            System.out.println(x * y);

        } else if (islem.equals("/")) {
            System.out.println(x/y);

        } else if (islem.equals("+")) {
            System.out.println(x+y);

        } else if (islem.equals("-")) {
            System.out.println(x-y);

        }else {
            System.out.println("Yanlış İşlem seçtiniz: ");
        }


    }

}
