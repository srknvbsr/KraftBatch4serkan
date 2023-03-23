package day08_ScannerAndOperation;

import java.util.Scanner;

public class CO5_Scanner {
    public static void main(String[] args) {
        //1. scanner classında scanner objesi oluşturalım.
        Scanner scan = new Scanner(System.in);
        //2. Kullanıcıyı Bilgilendireceğiz.
        System.out.println("Lütfen isminizi giriniz:");
        //3. iinize koyabileceğimiz variable oluşturun.Oluşturulan değişkenin içerisine scanner objesi
        // ile uygun method çagırark veriyi girin.
        String isim= scan.nextLine();
        System.out.println("isim = " + isim);
        scan.close();



    }
}
