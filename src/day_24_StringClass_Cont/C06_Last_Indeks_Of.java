package day_24_StringClass_Cont;

public class C06_Last_Indeks_Of {
    public static void main(String[] args) {
        String str="Merhaba";
        System.out.println(str.indexOf("a"));//İlk bulunan indeksi getirir
        System.out.println(str.lastIndexOf("a"));//son bulunan a yı yazar.
        int length=str.length();
        System.out.println(length);
        int lengthFinal=str.replace("a","").length();
        //int lengthFinal=str.length();

        System.out.println((str+" İçerisinde a"+(length-lengthFinal)+" adet mevcuttur."));

    }
}
