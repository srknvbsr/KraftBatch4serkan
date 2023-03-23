package day13_ForLoops_DersTekrarı;

import java.util.Scanner;
import java.util.SortedMap;

public class C03_Negative_Positive_Ternary {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
        if (sayi>0){
            System.out.println("Bu sayi pozitifitir.");
        }else if (sayi<0){
            System.out.println("Bu sayi negatirtif.");
        }else {
            System.out.println("Bu sayi sıfıra eşittir.");
        }
        System.out.println("***********************************************************************");

      String result =  (sayi>0)? "Pozitiftir.":(sayi<0)?"Negatiftir":"Sıfıra eşittir.";
        System.out.println(result);
        System.out.println("***********************************************************************");


    }
}
