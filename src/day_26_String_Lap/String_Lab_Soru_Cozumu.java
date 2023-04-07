package day_26_String_Lap;

public class String_Lab_Soru_Cozumu {

    //Kullanıcıdan bir
    //input alın ve girilen inputun ilk 3 harfini yazan , 3 kelimeden az
    //ise inputu döndüren bir metot yazınız.
    //Merhaba
    //Mer
    //Ali Ali
    //Soru 1
    public static String inputAl(String str) {
        if (str.length() < 3) {
            return str;
        }
        return str.substring(0, 3);
    }

    //Kullanıcıdan bir dize sözcük alın ve her boşluğa % ibaresi ekleyin.
    //Merhaba dünya
    //Merhaba%dünya
    //Soru 2
    public static String boslukAl(String str) {
        return str.replace(" ", "%");
    }


    //Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını döndüren bir program
    //yazdırın.
    //Sanayagı    //yagı
    //Mutluluk    //uluk
    //Soru 3
    public static String yarisiniDondur(String str) {
        return str.substring(str.length() / 2);
        //return str.substring(str.length()/2+1);//bu ifsde int değer döndüreceği için
        //örneğin serkanı ibaresinin yarısı 3,5 ancak 3 dönecek ve substring dize 3ten başlayacak
        // kanı ibaresi yazar.
    }

    public static String yarisiniDondur2(String str) {
        return str.substring((int) Math.ceil((double) str.length() / 2));
    }


    //Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve yeni harfi/harfleri
    //alan ve buna göre kelimede/dizede sadece ilk bulduğu yeri değiştiren metodu
    //yazınız.
    //(Merhaba ,a, e)
    //Merheba
    //(Kasaba , a, i)
    //Kisaba
    //Soru 4
    public static String kelimeleriDegistir(String str, String eski, String yeni) {
        return str.replaceFirst(eski, yeni);
    }


    //trim(String str) şeklinde bir metot yazın trim gibi çalışsın
    // ve string döndürsün.  İçerisinde string in hazır metodu olan trim metodunu kullanmayın.
    //"  harun merhaba nasılsın   "

    public static String trimGibiCalis(String str) {
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


    //Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.
    //Merhaba
    //MMMeeerrrhhhaaabbbaaa
    //Ali
    //AAAllliii
    //Soru 5
    public static String CokKereYazdir(String kelime, int indeks) {
        String result = "";
        for (int i = 0; i < kelime.length(); i++) {
            for (int j = 0; j < indeks; j++) {
                result += kelime.charAt(i);
            }
        }
        return result;
    }


    //tek index  numarası alan substring metodunu yazınız
    // "Merhaba"     str.substring(3)=haba
    //  subString(String str,int star)
    public static String subStringTekIndeks(String str, int indeks) {
        String result = "";

        for (int i = indeks; i < str.length(); i++) {
            result += str.charAt(i);

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(inputAl("Serkan"));
        System.out.println(inputAl("ali"));
        System.out.println(inputAl("al"));
        System.out.println("---------------------------------------------------------2");
        System.out.println(boslukAl("Merhaba Dünya Bugün NAsılsın Bkalaım ?"));
        System.out.println("---------------------------------------------------------3");
        System.out.println(yarisiniDondur("Serkanı"));
        System.out.println(yarisiniDondur2("serkanınarabası"));
        System.out.println("---------------------------------------------------------4");
        System.out.println(kelimeleriDegistir("Serkan", "e", "a"));
        System.out.println("---------------------------------------------------------5");
        System.out.println(trimGibiCalis("  Merhaba   serkan   nasılsın  "));
        System.out.println("---------------------------------------------------------6");
        System.out.println(trimGibiCalis("   Merhaba Serkan nasılsın    "));
        System.out.println("---------------------------------------------------------7");
        System.out.println(CokKereYazdir("Merhaba", 10));
        System.out.println("---------------------------------------------------------8");
        System.out.println(subStringTekIndeks("Serkan", 3));
        System.out.println("---------------------------------------------------------9");
        System.out.println(kelimeVekarakterAl("Edirne", 'e'));
        System.out.println(kelimeVekarakterAl2("Edirne", "e"));
        System.out.println(kelimeVekarakterAl3("Edirne", "e"));

    }

    //Kullanıcıdan bir kelime ve bir karakter alın ve bu kelimenin istenen karakterin
    //kaç adet olduğunu döndüren metodu yazınız. (büyük küçük harf göz ardı
    //edilecek)
    //Ankara,a
    //3
    //Edirne,e 2
    public static int kelimeVekarakterAl(String str, char c) {
        String x = c + "";
        int adet = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.substring(i, i + 1).equalsIgnoreCase(x)) {
                adet++;
            }
        }
        return adet;


    }

    public static int kelimeVekarakterAl2(String str, String c) {
        str.toLowerCase();
        c.toLowerCase();
        int adet = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.substring(i, i + 1).equalsIgnoreCase(c)) {
                adet++;
            }
        }
        return adet;
    }

    public static int kelimeVekarakterAl3(String str, String c) {
        str=str.toLowerCase();
        c=c.toLowerCase();
        int startLength = str.length();
        int finalLength = str.replace(c, "").length();
        return startLength - finalLength;


    }
}


