package day09_OperatorConnecting.day14_NestedWhileDoWhile;

import java.util.Scanner;

public class C01_Minumumnumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int min= Integer.MAX_VALUE;//2147483647
        //System.out.println(min);
        //kullanıcıdan 5 adet sayı al ve min yazdır.

        for(int i = 1;i<=5;i++){
            System.out.println("Lütfen bir sasyi Gİriniz:");
            int sayi = scan.nextInt();
            if(sayi<min){
               min=sayi;

            }
        }
        System.out.println(min);

    }
}
