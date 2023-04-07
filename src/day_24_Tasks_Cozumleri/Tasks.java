package day_24_Tasks_Cozumleri;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        //Bir
        //method yazın dönüş tipi olsun kullanıcıdan 2 string istesin ve
        //eğer stringlerin length i eşitse girdiğiniz kelimelerin karekter
        //sayısı eşit mesajı döndürsün eğer aynı stringler gönderildiyse, bu
        //kelimeler aynı mesajı döndürsün Kelimeler her anlamda farklı
        //ise kullanıcıyı aynı sürece sokun .
        /*Scanner scan = new Scanner(System.in);
        booler:
        while (true) {
            System.out.println("Lütfen iki kelime giriniz: ");
            String kelime1 = scan.nextLine();
            String kelime2 = scan.nextLine();
            System.out.println("kelime1.length() = " + kelime1.length());
            System.out.println("kelime2.length() = " + kelime2.length());

            if (kelime2.length() == kelime1.length()) {
                System.out.println("Girdiğiniz kelimelerin karakter sayısı eşittir.");
                break;
            } else if (kelime1.equals(kelime2)) {
                System.out.println("Bu kelimeler aynıdır");
                break;
            } else {
                System.out.println("Tebrikler kelimler farklı");
                continue booler;
                */
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("1.kelime: ");
            String str5 = scan.nextLine();
            System.out.print("2.kelime: ");
            String str6 = scan.nextLine();
            flag = !soru5(str5, str6);
        }
    }
    public static boolean soru5(String a, String b) {
        if (a.equalsIgnoreCase(b)) {
            System.out.println("kelimeler aynı");
            return true;
        }
        if (a.length() == b.length()) {
            System.out.println("girdiğiniz kelimelerin karekter sayısı eşit");
            return true;
        }
        System.out.println("kelimeler aynı değil ve  uzunlukları aynı değil");
        return false;

    }



}







