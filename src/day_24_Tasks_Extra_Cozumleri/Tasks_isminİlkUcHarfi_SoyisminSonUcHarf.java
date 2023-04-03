package day_24_Tasks_Extra_Cozumleri;

public class Tasks_isminİlkUcHarfi_SoyisminSonUcHarf {
    public static void main(String[] args) {


        //İsminizin ilk 3 harfi ve soy isminizin son 3 harfi ile nickname
        //oluşturan bir method yazın.
        String name = "Serkan";
        String surname = "Çağlar";
        String nickname;
        nickname = name.substring(0, 3).concat(surname.substring(3, 6));
        System.out.println("nickname = " + nickname);

    }
}
