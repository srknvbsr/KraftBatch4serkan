package day13_ForLoops_DersTekrarı;

import java.util.Scanner;

public class TASKS_3 {
    public static void main(String[] args) {
        //Örnek: a dan z ye kadar olan harfleri ekrana yazdırın.
        Scanner scan =new Scanner(System.in);
        for(char ch='a'; ch<'z';ch++){
            System.out.print(ch+"  ");
        }

    }
}
