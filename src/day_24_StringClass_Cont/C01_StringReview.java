package day_24_StringClass_Cont;

import java.util.Scanner;

public class C01_StringReview {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İsmizini giriniz:");
        String isim = scan.nextLine();
        //ismin son harfini alma
        // Yavuz Selim

        int uzunluk = isim.length();
        char sonHarf = isim.charAt(uzunluk - 1);
        System.out.println(sonHarf);

        //equals()
        System.out.println(isim == " Yavuz Selim ");//referance farklı birini kullnacıdan alıyoruz.(Object olduğu için Heap alanında)
                                                    // Diğeri de heap bölümünde ancak String poolda olan değer.
        System.out.println(isim.equals(isim));//True
        System.out.println(isim.equalsIgnoreCase(" yavUz SeliM "));

        //toUpperCase,toLowerCAse
        System.out.println(isim.toLowerCase());
        System.out.println(isim.toUpperCase());
        //trim
        System.out.println(isim.trim());
        //İndeksOf()
        System.out.println(isim.indexOf("Selim"));
        System.out.println(isim.indexOf(" "));
        System.out.println(isim.lastIndexOf(" "));
        System.out.println(isim.length());
        System.out.println(isim.indexOf("  Selim"));//iki tane boşluk llduğu için -1 dödürün.Bulamadığı için
        int ilkindeks=isim.indexOf("a");
        int sonindeks=isim.lastIndexOf("a");
        if(ilkindeks==sonindeks){
            System.out.println("is Unique");
        }else{
            System.out.println("is not unique");

        }

        //replace
        System.out.println(isim.replace(" ", ""));//Console: YavuzSelim
        System.out.println(isim.replace("a", ""));
        System.out.println(isim.replace("e", ""));
        System.out.println(isim.replace("u", ""));
        System.out.println(isim.replace("i", ""));
       String message = "Merhaba";
        System.out.println(message.replace('a', 'e'));//hepsini değiştirir.


    }
}
