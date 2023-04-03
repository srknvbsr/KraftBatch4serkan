package day_24_StringClass_Cont;

public class C04_StartsWith_EndsWith {
    public static void main(String[] args) {
        String str ="Java is cool";
        System.out.println(str.startsWith("J"));
        System.out.println(str.startsWith("Ja"));
        System.out.println(str.startsWith("Jav"));
        System.out.println(str.startsWith("Java"));
        System.out.println(str.startsWith("j"));
        System.out.println(str.startsWith("Java is cool"));
        System.out.println(str.startsWith(""));
        System.out.println(str.startsWith(" "));
        System.out.println("------------------------------------");
        System.out.println(str.endsWith("l"));
        System.out.println(str.endsWith("oocl"));
        System.out.println(str.endsWith("cool"));
        System.out.println(str.endsWith("lll"));
        System.out.println("------------------------------------");

    }
}
