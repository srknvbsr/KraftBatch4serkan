package day_26_String_Lap;

public class Lap_Examples1 {

    //Kullanıcıdan bir input alın ve girilen inputun ilk 3
    // harfini yazan , 3 kelimeden az ise inputu döndüren bir metot yazınız.
    //Merhaba Mer Ali Ali
    public static String ilkUcHarfGetir(String str) {

        if (str.length() < 3) {
            return str;
        }
        return str.substring(0, 3);
    }

    //Kullanıcıdan bir dize sözcük alın ve her
    // boşluğa % ibaresi ekleyin. Merhaba dünya Merhaba%dünya
    // "   merhaba dünya  "   %%%merhaba%dünya%%
    public static String bosluk(String str) {
        return str.replace(" ", "%");
    }

    //Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını
    // döndüren bir program yazdırın.
    //Sanayagı yagı Mutluluk uluk
    public static String ikinciYari(String str) {
        return str.substring(str.length() - 1 / 2);
    }

    public static String ikinciYari2(String str) {
        if (str.length() % 2 == 0) {
            return str.substring(str.length() / 2);

        } else {
            return str.substring(str.length() / 2 + 1);
        }


    }

    public static String ikinciYari3(String str) {
//                                                (int) 5.0=5
//                                      (int)Math.ceil(4.5 )
        return str.substring((int) Math.ceil((double) str.length() / 2));
    }

    public static String ilkBulduguDegis(String str, String eski, String yeni) {
        return str.replaceFirst(eski, yeni);
    }


    //trim(String str) şeklinde bir metot yazın trim gibi çalışsın
    // ve string döndürsün.  İçerisinde string in hazır metodu olan trim metodunu kullanmayın.
    //"  harun merhaba nasılsın   "
    public static String trim(String str) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                start = i;
                break;
            }
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                end = i;
                break;
            }
        }

        return str.substring(start, end + 1);


    }

    public static String CokluKelimeYazdir(String str, int adet) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < adet; j++) {
                result += str.charAt(i);


            }

        }
        return result;

    }

    public static String subString(String str, int index) {
        String result = "";
        //          3 4  5 6       7
        for (int i = index; i < str.length(); i++) {
            result += str.charAt(i);
        }
        return result;

    }

    //çift index  numarası alan substring metodunu yazınız
    // "Merhaba"     str.substring(3,5)=ha
    //  subString(String str,int start, int end)
    public static String ciftSubstring(String kelime, int x, int y) {
        String result = "";
        for (int i = x; i < y; i++) {
            result += kelime.charAt(i);


        }
        return result;
    }


    //Kullanıcıdan bir kelime ve bir karakter alın
    // ve bu kelimenin istenen karakterin kaç adet olduğunu
    // döndüren metodu yazınız. (büyük küçük harf göz ardı edilecek)
    //Ankara,a 3 Edirne,e 2
    public static int karakterSay(String kelime, char a) {
        int adet = 0;
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == 'a')
                adet++;
        }
        return adet;

    }

    public static String harfKaldir(String kelime, char a) {

        return kelime.replace("a", "");
    }

    public static void main(String[] args) {
        //Kullanıcıdan bir input alın ve girilen inputun ilk 3
        // harfini yazan , 3 kelimeden az ise inputu döndüren bir metot yazınız.
        //Merhaba Mer Ali Ali
        System.out.println(ilkUcHarfGetir("a"));
        System.out.println(bosluk("   MErhaba dünya  "));
        System.out.println(ikinciYari("Serkan"));
        System.out.println(ikinciYari2("Serkanı"));
        System.out.println(ilkBulduguDegis("Merhaba", "er", "ir"));
        System.out.println(CokluKelimeYazdir("Serkan", 10));
        //System.out.println(subString(str,3));
        System.out.println(ciftSubstring("Merhaba", 3, 5));
        System.out.println(karakterSay("ankara", 'a'));
        System.out.println(harfKaldir("Merhaba", 'a'));
        System.out.println(harfiKaldir("Serkan", 'a'));
        System.out.println(harfSil2("Merhaba", 'a'));
    }

    //Kullanıcıdan bir kelime ve bir harf alın
    // kelimenizin içinde bu harfin hepsi kaldırılmış şekilde string döndüren programı yazınız.
    //(Merhaba, a) Merhb
    public static String harfiKaldir(String str, char target) {
        String str2 = target + "";
        return str.replace(str2, "");
    }

    public static String harfSil2(String str, char target) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            //    a     !=a  false
            if (str.charAt(i) != target) {
                result += str.charAt(i);
            }
        }
        return result;


    }
}

