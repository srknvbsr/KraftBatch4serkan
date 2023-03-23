package day09_OperatorConnecting.day14_NestedWhileDoWhile;

import java.util.Scanner;

public class C02_MaximumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;//-2147483648
        //System.out.println(max);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Lütfen bir sayi giriniz");
            int sayi = scan.nextInt();
            if (sayi > max) {
                max = sayi;

            }

        }
        System.out.println(max);
    }

}
