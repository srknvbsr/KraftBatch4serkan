package day_19Custommethods_Return_Ders_tekrarı;

import java.util.Scanner;

public class C04_MethodKullanma {
    public static void main(String[] args) {
        // Kullanicidan 10'dan kucuk iki pozitif tamsayi alip
        // faktoryel degerlerini toplayin
        /*Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir sayi Gİriniz: ");
        int sayi1 = scan.nextInt();
        System.out.println("Lütfen Bir sayi Gİriniz: ");
        int sayi2 = scan.nextInt();
        int fak1=1;
        for (int i = 1; i <sayi1; i++) {
            fak1*=i;

        }
        System.out.println(fak1);
        int fak2=1;
        for (int i = 1; i <sayi2; i++) {
            fak2*=i;

        }
        System.out.println(fak2);
        int result= fak1+fak2;
        System.out.println(result);

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir sayi Gİriniz: ");
        int sayi1 = scan.nextInt();
        System.out.println("Lütfen Bir sayi Gİriniz: ");
        int sayi2 = scan.nextInt();
        int sonuc=C03_Faktoriyel.factoriyel(sayi1)+C03_Faktoriyel.factoriyel(sayi2);
        System.out.println("sonuc = " + sonuc);




    }









}
