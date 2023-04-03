package day_24_StringClass_Cont;

public class C05_Substring {
    public static void main(String[] args) {
        String str = "Java Programming Language";
        System.out.println(str.length());
        System.out.println("-----------------------------------");
        System.out.println(str.substring(5));
        System.out.println("-----------------------------------");
        System.out.println(str.substring(0));
        System.out.println("-----------------------------------");
        System.out.println(str.substring(17));
        System.out.println("-----------------------------------");
        System.out.println(str.substring(str.length()));
        System.out.println("-----------------------------------");
        System.out.println(str.substring(str.length()-3));
        System.out.println("-----------------------------------");
        System.out.println(str.substring(str.length()-8));
        System.out.println("-----------------------------------");

        //substring(beginning,ending) ending indeks alır ama
        System.out.println(str.substring(2, 4));
        System.out.println("-----------------------------------");
        System.out.println(str.substring(5, 16));
        System.out.println("-----------------------------------");
        System.out.println(str.substring(str.length() - 1, str.length()));
        System.out.println("-----------------------------------");
        System.out.println(str.substring(5, 5));
        System.out.println("-----------------------------------");
        System.out.println(str.substring(4,5));
        System.out.println("-----------------------------------");
        //System.out.println(str.substring(5, 3));StringIndexOutOfBoundsException.


    }
}
