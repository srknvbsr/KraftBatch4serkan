package day13_Forloops;

import java.util.Scanner;

public class C03_Negative_Positive_Ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi Giribniz: ");
        int sayi = scan.nextInt();
        if(sayi>0){
            System.out.println("Sayimiz Pozitfi number");
        } else if (sayi<0) {
            System.out.println("Sayimiz negatiftir.");

        }else {
            System.out.println("Sayımız zerodur.");
        }
        System.out.println("*************************************************");
        String result = sayi>0? "Pozitif sayidır.": sayi<0? "Sayi negatiftir.":"Sayi zerodur.";

        System.out.println(result);

    }
}
