package day_49_Exception_1;

import java.util.Scanner;

public class C02_Exception_2 {



    public static void main(String[] args) {
        /*System.out.println("KOd başladı");
        System.out.println(5/0);//.ArithmeticException. (Exception not Handling)
        System.out.println("Kod devamm ediyor");

         */
       /* System.out.println("Kod başladı");
        try {
            System.out.println(5 / 0);
            System.out.println("kod devam ediyor");//Hatayı yakalar yakalamaz burayı atlar.
        } catch (Exception e) {
            System.out.println("Hata vardır");

        }

        System.out.println("Kod devamm ediyor");

        */


       /* System.out.println("Kod başladı");
        try {
            System.out.println(5 / 1);
            System.out.println("Çalışır");
        } catch (Exception e) {
            System.out.println("Hata vardır");//Hata olmazsa catch bloğuna uğramaz.

        }

        System.out.println("Kod devamm ediyor");

        */

        //faktöriyel hesabı yapan bir try/catch yapan bit metod yazınız.
        //System.out.println(faktoriyelHesaplama(5));
       /* System.out.println("0");
        try {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println(5 / 0);
            System.out.println("5");
        } catch (Exception e) {
            System.out.println("6");
            try {
                System.out.println(5 / 0);
            } catch (Exception f) {
                System.out.println("7");
            }

        }

        System.out.println("8");

        */
        //While ve for looplar kullanmadan kullanıcıya 3 hak verin ve int değerin doğru girmez
        //ise kullanıcıya ikaz vererek programdan atınız.
        System.out.println(sayiGiris());

    }//MAİN METODUNUN SON SÜSLÜ PARANTEZİ

    /*public static int faktoriyelHesaplama(int sayi) {
        try {

            int faktoriyel = 1;
            for (int i = 1; i <= sayi; i++) {
                faktoriyel = faktoriyel * i;

            }
            return faktoriyel;

        }catch (Exception e){
            System.out.println(e.getMessage());
            return -1;
        }

     */
    public static int count = 0;
    public static int sayiGiris() {

        Scanner scan = new Scanner(System.in);
        try {

            System.out.println("Lütfen bir sayı giriniz.");
            int x = scan.nextInt();
            return x;
        } catch (Exception e) {
            count++;
            System.out.println(e.getMessage());
            if (count == 3) {
                System.exit(0);

            }
            System.out.println(3 - count + "Hakkınız kalmıştır.");

        }return sayiGiris();
    }

}






