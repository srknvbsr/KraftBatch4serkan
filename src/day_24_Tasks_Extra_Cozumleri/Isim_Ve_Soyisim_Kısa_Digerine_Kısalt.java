package day_24_Tasks_Extra_Cozumleri;

public class Isim_Ve_Soyisim_Kısa_Digerine_Kısalt {
    //İsminizi ve soyadınız hangisi kısa ise diğerine onun boyuna
    //kısaltın yani fazla karakterleri atın Ve isminizle soy adınızı
    //birleştirin.
    public static void main(String[] args) {
        String name="Esra";
        String surname="Çağlar";
        System.out.println("name.length() = " + name.length());
        System.out.println("surname.length() = " + surname.length());
        if(surname.length()>name.length()){
       String finalSurname=surname.replace("ar","");
            System.out.println("name.concat(finalSurname) =  " + name.concat(finalSurname));

        }else
            return;


    }
}
