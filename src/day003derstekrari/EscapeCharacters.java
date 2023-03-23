package day003derstekrari;

public class EscapeCharacters {
    public static void main(String[] args) {
         // \n---> yeni satır açar
        //  \t---> bir tab boşluk bırakır.
        //  \b---> backspace.
        //  \"---> "
        //  \\---> \
        //  \r---> bir önceki satıra kadar silme işlemi yapar.
        System.out.println("Merhaba\n Dünya!");
        System.out.println("Merhaba\t Dünya!");
        System.out.println("Merhaba\b Dünya\b");
        System.out.println("Merhaba\t\" Dünya!\t\"");
        System.out.println("Merhaba\t\\ Dünya!");
        System.out.println("anasını sttığımın Merhaba\rDünya!");
    }
}
