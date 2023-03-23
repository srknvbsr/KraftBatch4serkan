package day009_OoperatorsDersTekrarı;

import java.util.Scanner;

public class C02_BedenKitleİndeksi {
    public static void main(String[] args) {
        //Beden kitle indeksi : Boy/(Kilo*kilo)
        Scanner scan = new Scanner (System.in);
        System.out.println("Kilonuzu giriniz: ");
        int kilo = scan.nextInt();
        System.out.println("Boyunuzu Girinizi: ");
        double boy = scan.nextDouble();
        double bki = kilo/(Math.pow(boy,2));
        System.out.println(bki);

    }
}
