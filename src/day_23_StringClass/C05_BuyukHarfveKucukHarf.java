package day_23_StringClass;

import java.util.Scanner;

public class C05_BuyukHarfveKucukHarf {
    public static void main(String[] args) {
        //Adınızın
        //ve soyadınızı büyük harfle yazdıran bir method yazın.
        Scanner scan=new Scanner(System.in);
        String name="Serkan";
        String surname="Çağlar";
        System.out.println("name.toLowerCase() = " + name.toLowerCase());
        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        System.out.println("surname.toUpperCase() = " + surname.toUpperCase());
        System.out.println("surname.toLowerCase() = " + surname.toLowerCase());
    }

}
