package day13_Forloops;

import java.util.Scanner;

public class C08_faktöriyel {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Sayi");
        int sayi = scan.nextInt();
        int fak=1;
        for(int i =1; i<=sayi ; i++){
            fak*=i;
            System.out.println("fak = " + fak);
        }
    }

}
