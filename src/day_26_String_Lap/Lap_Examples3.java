package day_26_String_Lap;

import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.Scanner;

public class Lap_Examples3 {


    //Kullanıcıdan bir kelime alan ve sonucunda yinelenen kelimeleri
    //string
    //olarak
    //return eden methot yazınız.
    //" Java "
    //output:a
    //"
    //Javva " output:av
    //" Derslerime
    //cok calisiyorum " output:erslimco
    //-------------------------Soru 15------------------------------------------------
    //Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki ünlü ve ünsüz harfleri
    //ayrı ayrı ekrana yazan programı yazınız.
    //Ankara ünlü harfler=
    //Aa
    //Ünsüz harfler=
    //nkr
    public static String UnluVeUnsuzHarfAl(String kelime) {
        kelime = kelime.toLowerCase();
        String str = "";
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == 'a' || kelime.charAt(i) == 'e' || kelime.charAt(i) == 'ı' || kelime.charAt(i) == 'i'
                    || kelime.charAt(i) == 'o' || kelime.charAt(i) == 'ö' || kelime.charAt(i) == 'u' || kelime.charAt(i) == 'ü') {
                str += kelime.charAt(i);
            }
            kelime = kelime.replace(str, "");
        }
        return str.concat(kelime);
    }

    //Kullanıcıdan
    //min 3 harf olacak şekilde bir kelime alın ve bu kelimenin ilk 3
    //harfini kelimeden keserek sonuna ekleyin.
    //Merhaba
    //habaMer
    //Ali Ali
    //Soru 16
    //Ders
    //21 22
    public static String kelimeALVeEkle(String kelime) {
        String flag = "false";
        String str;
        if (kelime.length() >= 3) {
            str = kelime.replace(kelime.substring(0, 3), "");
            return str.concat(kelime.substring(0, 3));

        }
        return flag;

    }

    public static String kelimeALVeEkle2(String kelime, int kesilecekKarakter) {
        String flag = "false";
        String str = "";
        if (kelime.length() < 3) {
            return flag;
        }

        for (int i = 0; i < kesilecekKarakter; i++) {
            str += kelime.charAt(i);
        }
        return kelime.substring(0).concat(str);


    }


    //-----------------------------------Soru17----------------------------------------------
    //Kullanıcıdan
    //min 3 harf olacak şekilde bir kelime alın ve bu kelimenin son 3
    //harfini kelimeden keserek kelimenin başına ekleyin.
    //Merhaba
    //abaMerh
    //Ali Ali
    //Soru 17

    public static String kelimeALVeOneEkle(String kelime, int kesilecekKarakter) {
        String flag = "false";
        String str1 = "";
        if (kesilecekKarakter > kelime.length() || kelime.length() < 3)
            return flag;
        int count = kelime.length() - kesilecekKarakter;
        for (int i = count; i < kelime.length(); i++) {
            str1 += kelime.charAt(i);

        }
        return str1.concat(kelime.substring(0, count));


    }


    //-------------------------------------soru18------------------------------------------------
    //Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun. (Büyük
    //küçük harf gözardı edilecek.) Hiçbir harf benzersiz değil ise benzersiz harf yoktur
    //ikazı versin.

    public static String benzersizHarf(String kelime) {
        kelime = kelime.toLowerCase();
        for (; kelime.length() > 0; ) {
            kelime = kelime.replace(kelime.substring(0, 1), "");
        }


        return kelime;
    }


    //--------------------------------------soru19-----------------------------------------------
//Kullanıcıdan iki kelime alın ve bu kelimeler aynı harflerden oluşuyorsa(her harf
//eşit sayıda içerecek,büyük küçük harf göz ardı edilecek) true oluşmuyorsa false
//yazdırın. (anagram kelime ise)
//İftar
//Tarif true
//Zehra
//Ezhar true
//Nefes
//Enfes true
//Selcuk
//Elyase false
//Soru 19
    public static boolean ikiKelimeAl(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (!(str1.length() == str2.length())) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            int index = str2.indexOf(str1.charAt(i));//str1=Enfes,str2=Nefes
            if (index == -1) return false;
            str2 = str2.substring(0, index) + str2.substring(index + 1);
        }
        return true;
    }

    public static void main(String[] args) {
        //System.out.println(UnluVeUnsuzHarfAl("Merhaba"));
        //System.out.println(kelimeALVeEkle("Ali"));
        //System.out.println(kelimeALVeEkle("Ali"));
        // System.out.println(kelimeALVeEkle2("Ali", 3));
        System.out.println(kelimeALVeOneEkle("Ankara", 5));
        System.out.println(kelimeALVeOneEkle("Merhaba", 5));
        System.out.println(kelimeALVeOneEkle("Ali", 5));
        System.out.println(kelimeALVeOneEkle("Al", 5));
        System.out.println(benzersizHarf("nesne"));
        System.out.println(ikiKelimeAl("enfes", "nefes"));
        System.out.println(ikiKelimeAl("enfess", "nnefes"));
        //System.out.println(ikiKelimeGirisi("Ali", "Çam"));


    }
}

    //Kullanıcıdan bir kelime alın ve ardı ardına tekrar eden harfleri döndüren metodu
    //yazın.
    //aabccccseeeeeefff
    //acef
    //abaccb
    //c
    //Arsız ardı ardına tekrar eden harf yoktur
    //amannsız
    //n
    //---------------------------------------------Soru20------------------------------------------

    //Kullanıcıdan 1 ila 4 harf olacak şekilde 2 kelime alın, 1. veya 2. kelimeyi
    //girdiğinde hatalı giriş yaparsa uyarı verin ve kullanıcıya düzeltme imkanı verin.
    //Her kelime için 3 kere hatalı giriş yaparsa programı sonlandırın. Kullanıcı doğru
    //giriş yaparsa 2 kelimeyi arada boşluk olacak şekilde sadece concat () metodu ile
    //birleştirerek yazdırın.
    //Slm
    //Ali
    //Slm
    //Ali
    /*public static String ikiKelimeGirisi(String kelime1, String kelime2) {
        String bosluk=" ";
        String son="";
        if (kelime1.length() >= 1 & kelime1.length() <= 4 || kelime2.length() >= 1 & kelime2.length() <= 4) {
          son= kelime1.concat(bosluk).concat(kelime2);
          return son;

        }

    }
}

     */







