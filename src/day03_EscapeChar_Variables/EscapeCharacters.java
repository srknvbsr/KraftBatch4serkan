package day03_EscapeChar_Variables;

public class EscapeCharacters {
    public static void main(String[] args) {
        //  \n -->yeni satır açar
        //  \t --> bir tab booşluk bırakır.
        //  \b --> backspace
        //   \" --> " sadece yazar
        //  \\ --> \
        //   \r -->  satır başına kadar olan karakterleri siler
        System.out.println("Merhaba\nDünya!");
        System.out.println("Merhaba \t Dünya!");
        System.out.println("Merhaba\bDünya!\b");
        System.out.println("Merhaba\"Dünya!\"");
        System.out.println("Merhaba\\Dünya!");
        System.out.println("Merhaba\rDünya!");

    }
}
