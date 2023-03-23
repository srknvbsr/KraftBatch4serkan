package day10_UnaryLogicalOperAndrewiev;

import java.util.Scanner;

public class C02_EvenlyDivisible {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int number = scan.nextInt();
        boolean isDivisible = (65%2==0);
        boolean isDivisible1 = (65%3==0);
        boolean isDivisible2 = (65%5==0);
        System.out.println(number+ " ikiye bölünebilen bir sayı "+isDivisible);
        System.out.println(number+ " üçe bölünebilen bir sayı "+isDivisible1);
        System.out.println(number+ " beşe bölünebilen bir sayı "+isDivisible2);



    }
}
