package day_26_String_Lap;

public class Lap_Examples2 {

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
    public static boolean iceriyorMu(String kelime) {
        return kelime.substring(0, 4).contains("kin");

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
    public static String kelimeDondur(String str, String str1) {
        /*if (str1.length() < str2.length() & str1.length() != str2.length()) {
            String result = "";
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < str1.length(); j++) {
                    result += str1.charAt(j);

                }

            }
            return result;
        }
        if (str1.length() < str2.length() & str1.length() != str2.length()) {
            String result = "";
            for (int i = 0; i < 30; i++) {
                for (int j = 0; j < str2.length(); j++) {
                    result += str2.charAt(j);

                }

            }
            return result;

        } else if (str1.length() < str2.length() & str1.length() != str2.length()) {
            String result = "";
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < str1.length(); j++) {
                    result += str1.charAt(j);

                }

            }
            return result;

        }
    }
}

         */


        String result = "";
        if (str.length() > str1.length()) {
            for (int i = 0; i < 2; i++) {
                result += str1;
            }
            for (int j = 0; j < 30; j++) {
                result += str;
            }
            for (int i = 0; i < 2; i++) {
                result += str1;
            }
        } else if (str1.length() > str.length()) {
            for (int i = 0; i < 2; i++) {
                result += str;
            }
            for (int j = 0; j < 5; j++) {
                result += str1;
            }
            for (int i = 0; i < 2; i++) {
                result += str;
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
    //Soru 10
    /*public static String noktaIleTamamla(String str) {
        String result = ".";
        if (str.length() < 5) {
            for (int i = 1; i < str.length(); i++) {
                return result;
            }



        }
        return str.concat(result);
    }

     */

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

    public static boolean ilkSonEsitMi(String str) {
        if(str==null||str.length()<2){
            return false;
        }
        return (str.substring(0, 2).equalsIgnoreCase(str.substring(str.length() - 2)));

    }
    public static boolean ilkSonKelimeKontrol(String str,int kararkterSayisi) {
        if(str==null||str.length()<kararkterSayisi){
            return false;
        }
        return (str.substring(0, kararkterSayisi).equalsIgnoreCase(str.substring(str.length() - kararkterSayisi)));

    }
    public static void main(String[] args) {
        System.out.println(iceriyorMu("kinlenmek"));
        System.out.println(iceriyorMu("Kin tutmak"));
        System.out.println(iceriyorMu("Ekin ektim"));
        System.out.println(iceriyorMu("Keskin ilçesinden geçiyorum"));
        System.out.println(kelimeDondur("Ali", "Mehmet"));
        //System.out.println(noktaIleTamamla("Ser"));
        System.out.println(ilkSonEsitMi("Serkan"));
        System.out.println(ilkSonKelimeKontrol("Ankara", 1));

    }
    //Kullanıcının konsoldan ad ve
    //soyad bilgilerini konsoldan alın
    //Ekrana "Soy isminiz ..(
    //soyad ).. dır ." Yazan metodu//İnput    //: Harun Özsoy "
    //Output
    //: "Soy isminiz Özsoy dır ."    //İnput    //:" Harun Kenan Özsoy "
    //Output
    //: "Soy isminiz Özsoy dır ."    //İnput
    //: Harun Kenan Can Özsoy "    //Output
    //: "Soy isminiz Özsoy dır ."    //İnput
    //:" Harun Kenan Can Sami Özsoy "    //Output
    //: "Soy isminiz Özsoy dır ."




    //Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden
    //çıkartarak sonuç döndüren metodu yazınız. (Büyük küçük duyarlı)
    //Merhaba
    //Merhab
    //Ananas
    //Anas

}

















