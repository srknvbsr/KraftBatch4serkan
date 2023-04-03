package day_23_StringClass;

import java.util.Scanner;

public class C03_Tasks1_KarakterSayisi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Adınızı Giriniz.");
        String name=scan.nextLine();
        System.out.println(name.length());

    }

}
