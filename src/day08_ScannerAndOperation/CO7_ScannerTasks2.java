package day08_ScannerAndOperation;

import java.util.Scanner;

public class CO7_ScannerTasks2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi Griniz:");
        String isim = scan.nextLine();
        System.out.println("Lütfen Soyisminizi Griniz:");
        String soyisim = scan.nextLine();
        System.out.println("Lütfen yasinizi Griniz:");
        int yas = scan.nextInt();
        scan.nextLine();//int short byte gibi variableslardan sonra boşluk için nextline yazarız.
        System.out.println("Dogum yerinizi giriniz:");
        String dogumYeri = scan.nextLine();
        System.out.println("isim = " + isim);
        System.out.println("soyisim = " + soyisim);
        System.out.println("yas = " + yas);
        System.out.println("dogumYeri = " + dogumYeri);
        System.out.println("Kaydınız basarıyla tamamlanmıştşr.");


    }
}
