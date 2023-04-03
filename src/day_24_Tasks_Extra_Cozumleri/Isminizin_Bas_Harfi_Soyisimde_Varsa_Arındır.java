package day_24_Tasks_Extra_Cozumleri;

public class Isminizin_Bas_Harfi_Soyisimde_Varsa_Arındır {
    //İsminizin baş harfi soy adınızda varsa soy adınızı isminizin
    //baş harfinden arındırıp yazdıran bir method oluşturun
    public static void main(String[] args) {
        String name="Serkan";
        String surname="Sağlam";
        if(name.charAt(0)==surname.charAt(0)){
            System.out.println("surname.replace(\"S\",\"\") = " + surname.replace("S", ""));

        }else {
            name.concat(surname);
        }
    }
}
