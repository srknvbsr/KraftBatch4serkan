package day13_ForLoops_DersTekrarı;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        /*kullanicidan pozitif bir tamsayi alin
        sayi cift ise "sayi cift"
        degilse "tek sayi" yazdirin
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz.");
        int sayi = scan.nextInt();
        if(sayi%2==0){
            System.out.println(sayi+ " Çifttir.");
        }else{
            System.out.println(sayi+ " Tektir.");
        }
    }
}
