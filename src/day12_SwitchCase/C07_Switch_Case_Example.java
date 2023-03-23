package day12_SwitchCase;

import java.util.Scanner;

public class C07_Switch_Case_Example {
    public static void main(String[] args) {
        /*
        //+,-,*,/ dört işlemm yapacak şekilde hesap makinesi yapın
        // kullanıcıdan iki sayı aşınız
        //yapmak istedipi işlemi secsin.
        //hatalı işlem girilerinde kullanıcıya uuyarı versin
        // ekrana sonuç döndürsün.

        Scanner scan =new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz");
        int number = scan.nextInt();
        System.out.print("Lütfen bir sayi daha giriniz");
        int number2 = scan.nextInt();
        System.out.println("1.Çarpma\n2.Bölme\n3.toplama\n4.Çıkarma\n"+ "Hangi işlemi yapamak istiyorsunuz? ");
        int isl = scan.nextInt();
        int sonuc = 1;
        switch (isl){

        }

         */
        //Haftanın gününü kullanıcıdan alınız ve ekrana o günün ismini yazdırın
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen HAftanın gün numarasını Giriniz:");
        int number = scan.nextInt();
        switch (number) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;

            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cımartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Yanlış sayi Girdiniz:");
                break;


        }
    }


}
