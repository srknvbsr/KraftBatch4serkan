package day_24_Tasks_Extra_Cozumleri;

import java.util.Scanner;

public class Tasks_Girilen_Kelimenin_Reversed {
    public static void main(String[] args) {
        //Girilen kelimeyi tersten yazdıran bir method yazın
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz: ");
        String kelime = scanner.nextLine();
        String reversed = "";
        for (int i = kelime.length() - 1; i >= 0; i--) {
            System.out.print(kelime.charAt(i));


        }
    }
}
