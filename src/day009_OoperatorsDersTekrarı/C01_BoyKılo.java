package day009_OoperatorsDersTekrarı;

import java.util.Scanner;

public class C01_BoyKılo {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Boyunuzu Gİriniz: ");
        double boy = input.nextDouble();
        System.out.println("Kilonuzu Giriniz: ");
        double kilo = input.nextDouble();
        input.nextLine();
        System.out.println("Lütfen İsminizi Giriniz: ");
        String isim = input.nextLine();
        System.out.println("İsminiz" +isim+ " dır. Boyunuz : "+boy+ "cm'dir." + "Kilonuz : "+kilo+"kg'dır.");

        //*********************************************************************************
        //*Scanner sınıfında olan next ile nextline arasındaki afrk şudur:                *
        //*next yazılan yazının ilk boşluğuna kadar olan kısmını alır. örnek olarak       *
        //*serkan ali burada console yazdırılacak olan serkan sadecedir                   *
        //*nnextline ise hepsini yazdırır                                                 *
        //*********************************************************************************



    }
}
