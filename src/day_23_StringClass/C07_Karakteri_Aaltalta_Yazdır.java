package day_23_StringClass;

import java.util.Scanner;

public class C07_Karakteri_Aaltalta_Yazdır {
    public static void main(String[] args) {
        //Aldığınız
        //mesajın her karakterini konsola alt alta yazdırın
        //Kullanıcıdan
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir mesaj giriniz.");
        String message = scan.nextLine();
        System.out.println(message.length());
        for (int i = 0; i <= message.length() - 1; i++) {
            System.out.println(message.charAt(i));

        }

    }
}
