package day_24_Tasks_Extra_Cozumleri;

public class Tasks_Girilen_IkiKelimeden_Kisa_Olani {
    public static void main(String[] args) {

    //Girilen 2 kelimeden kısa olanı uzun olanın başına ve sonuna
    //ekleyen bir method yazın.
    String kelime1="Merhaba";
    String kelime2="Dünya";
        System.out.println("kelime1.length() = " + kelime1.length());
        System.out.println("kelime2.length() = " + kelime2.length());
        if(kelime1.length()>kelime2.length()){
            System.out.println("kelime2.concat(kelime1).concat(kelime2) = " + kelime2.concat(kelime1).concat(kelime2));

        }


    }

}
