package day_56_JavaRewiev;

import java.util.Scanner;

public class C04_ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen tersini yazdırmak istediğiniz yazıyı giriniz");
        String str = scan.nextLine();//next ve nextline arasındaki fark:next sadece tgek boşkluğu alırken nextline birçok
        // boşluğu alır.

        System.out.println(reverseString(str));
        System.out.println(reverseString1(str));
        System.out.println(reverseString2(str));
        System.out.println(reverseString3(str));
        System.out.println(reverseString4(str));


    }

    public static String reverseString(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);


        }
        return reverse;
    }

    public static String reverseString1(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.substring(i, i + 1);//araba a


        }
        return reverse;
    }

    public static String reverseString2(String str) {//araba
        String reverse = "";
        while (str.length() != 0) {
            reverse += str.charAt(str.length() - 1);//a
            str = str.substring(0, str.length() - 1);

        }
        return reverse;
    }

    public static String reverseString3(String str) {//araba
        StringBuilder stringBuilder = new StringBuilder(str);

        return stringBuilder.reverse().toString();

    }

    public static String reverseString4(String str) {//araba
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();

        return stringBuffer.toString();

    }


}

