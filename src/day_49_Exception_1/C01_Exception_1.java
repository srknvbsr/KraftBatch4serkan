package day_49_Exception_1;

import java.util.Scanner;

public class C01_Exception_1 {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz:");
        try {
            int x = scan.nextInt();

            System.out.println(x * 10);
        } catch (Exception e) {
            System.err.println("Hata alındı");
        }

        System.out.println("kod devann ediyor");
        System.out.println("kod devann ediyor");
        System.out.println("kod devann ediyor");
        System.out.println("kod devann ediyor");

         */

        // System.out.println(bolme(5,0));

        String [] arr={"Harun","Mehmet","Ahmet"};
        try{
            System.out.println(arr[5]);



        }catch (Exception e){

            System.out.println("Hata: "+e.getMessage());
        }


       // System.out.println("kod devann ediyor.");
       // System.out.println(sayiGir());
        Scanner scan=new Scanner(System.in);

        System.out.println("Kod başladı");
        try{
            int x=5/0;

        }catch (Exception e){
            System.out.println("Hata: "+e.getMessage());
            System.out.println("Kararınız nedir?(1 iişleme devam, 2 programı sonlandır)");
            int karar=scan.nextInt();
            if(karar!=1){
                System.exit(-1);
            }





        }
        System.out.println("Kod devam ediyor");


    }
    public static int sayiGir(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi: ");
        int sayi;

        try{
            sayi=scan.nextInt();
            return sayi;


        }catch (Exception e){//Pop uplatın yani kullanıcılara gösterilen hataların yazıldığı yer bırasıdır.
            System.out.println("hatalı giriş Tekrar deneyiniz: ");
            return sayiGir();
        }
    }



   /* public static int bolme(int sayi, int bolen) {
        try {
            return sayi / bolen;
        } catch (Exception e) {
            System.out.println(e.toString());//java.lang.ArithmeticException: / by zero
            return -1;
        }

    }

    */


}
