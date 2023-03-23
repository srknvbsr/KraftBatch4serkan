package day10_UnaryLogicalOperAndrewiev;

import java.util.Scanner;

public class C01_PositiveOrNegaative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //*************************************************************************
        System.out.println("Lütfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
        boolean isPositive = (sayi>0);
        boolean isNegative = (sayi<0);
        boolean isZero = (sayi==0);

        System.out.println(sayi+ " is pozitive " +isPositive);
        System.out.println(sayi+ " is negative " +isNegative);
        System.out.println(sayi+  " is zero " +isZero);
        //*************************************************************************


    }

}
