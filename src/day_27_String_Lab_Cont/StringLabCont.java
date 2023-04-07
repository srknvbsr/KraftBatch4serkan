package day_27_String_Lab_Cont;

public class StringLabCont {

    //Kullanıcıdan bir kelime alın ve kin kelimesi başından veya ilk karakterden sonra
    //gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün;
    //Kinlenmek
    //true
    //Kin tutmak
    //true
    //Ekin ektim
    //true
    //Keskin ilçesinden geçiyorum
    //false
    //Neden kin tutuyorsun
    //false
    public static boolean kelimeKontrolEt(String str) {
        str = str.toLowerCase();
        return str.substring(0, 4).contains("kin");

    }

    public static boolean kelimeKontrol2(String str, String target) {
        if (target == null) return false;
        str = str.toLowerCase();
        target = target.toLowerCase();
        return str.substring(0).startsWith(target) || str.substring(1).startsWith(target);
    }


    //Kullanıcıdan 2 kelime alın kısa kelime
//yi başta 2 defa uzun kelimeyi ortada 30
//defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.
//Mehmet
//Ali
//AliAliMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
//hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
//hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
//hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
//hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
//hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
//hmetAliAli
    public static String uzunKisaKelimeleriYaz(String str1, String str2, int ilk, int orta, int son) {
        String result = "";
        if (str1.length() < str2.length()) {
            for (int i = 0; i < ilk; i++) {
                result += str1;
            }
            for (int i = 0; i < orta; i++) {
                result += str2;
            }
            for (int i = 0; i < son; i++) {
                result += str1;

            }

        } else {
            for (int i = 0; i < ilk; i++) {
                result += str2;
            }
            for (int i = 0; i < orta; i++) {
                result += str1;
            }
            for (int i = 0; i < son; i++) {
                result += str2;

            }

        }
        return result;

    }

    //Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın. 5 karakterin
    //altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.
    //Sabun Sabun
    //Merhaba
    //Merha
    //Ali Ali..
    //Hey Hey..
    //Pi Pi…
    public static String KarakterYazdir(String str, int kontrol, char karakter) {
        String str2 = "";
        if (str.length() >= kontrol) {
            return str.substring(0, kontrol);

        } else {
            for (int i = str.length(); i < kontrol; i++) {
                str2 = str += karakter;

            }
        }
        return str2;
    }

    //Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2 harfi sonunda yer alıyorsa
//true
//almıyorsa false yazdırın.
//Ankara
//false
//Kafka
//true
//Salsa
//true
//Saksı
//false
    public static boolean kelimeAl(String str) {
        if ((str.length() < 2) || (str == null || str.length() < 1)) {
            return false;
        }
        return str.substring(0, 2).equalsIgnoreCase(str.substring(str.length() - 2, str.length()));
    }
    //Kullanıcının konsoldan ad ve
    //soyad bilgilerini konsoldan alın
    //Ekrana "Soy isminiz ..(
    //soyad ).. dır ." Yazan metodu
    //İnput
    //: Harun Özsoy "
    //Output
    //: "Soy isminiz Özsoy dır ."
    //İnput
    //:" Harun Kenan Özsoy "
    //Output
    //: "Soy isminiz Özsoy dır ."
    //İnput
    //: Harun Kenan Can Özsoy "
    //Output
    //: "Soy isminiz Özsoy dır ."
    //İnput
    //:" Harun Kenan Can Sami Özsoy "
    //Output
    //: "Soy isminiz Özsoy dır ."



    public static String soyAdAl(String isim) {
        if(isim==null) return null;
        //str=str.trim();
        //return str.substring(str.lastIndexOf(" ")+1);
        isim=isim.trim();
        return isim.substring(isim.lastIndexOf(" ")+1);
    }
    //Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden
    //çıkartarak sonuç döndüren metodu yazınız. (Büyük küçük duyarlı)
    //Merhaba
    //Merhab
    //Ananas
    //Anas
    public static String yineleneHarf(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if(!result.contains(str.substring(i,i+1))){
                result+=str.substring(i,i+1);

            }

        }return result;


    }
    public static String yinelenenHarf2(String str){
        String result="";
        for (; str.length()>0 ;) {
            result+=str.substring(0,1);
            str=str.replace(str.substring(0,1),"");
        }return result;
    }
    //Kullanıcıdan iki kelime alın ve bu kelimeler aynı harflerden oluşuyorsa(her harf
    //eşit sayıda içerecek,büyük küçük harf göz ardı edilecek) true oluşmuyorsa false
    public static void main(String[] args) {
        System.out.println(kelimeKontrolEt("Kinlenmek"));
        System.out.println(kelimeKontrolEt("Ekin Ektim"));
        System.out.println(kelimeKontrolEt("Kin Tutmak"));
        System.out.println(kelimeKontrolEt("Keskin ilçesinden geçiyorum"));
        System.out.println("------------------------------------------------1");
        System.out.println(kelimeKontrol2("Kinlenmek", "kin"));
        System.out.println(kelimeKontrol2("Neden Kin Tutuyorsun", "KİN"));
        System.out.println(kelimeKontrol2("Neden Kin Tutuyorsun", null));
        System.out.println("------------------------------------------------2");
        System.out.println(uzunKisaKelimeleriYaz("ali", "mehmet", 2, 5, 2));
        System.out.println(KarakterYazdir("merh", 5, '.'));
        System.out.println(kelimeAl("Ankara"));
        System.out.println(kelimeAl("a"));
        System.out.println("-----------------------------------------------------------------");
        System.out.println(soyAdAl(" Harun Kenan Can Özsoy  "));
        System.out.println("-----------------------------------------------------------------");
        System.out.println(yineleneHarf("Ananas"));
        System.out.println(yineleneHarf("Serkan"));
        System.out.println(yineleneHarf("Megmet"));
        System.out.println(yineleneHarf("Kafkasya"));
        System.out.println(yinelenenHarf2("Kafkasya"));

    }
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
    //Ders


}

