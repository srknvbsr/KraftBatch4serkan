package day_52_Collection2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ListPalindrom {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("kazık", "adanada", "kazak", "radar", "ses", "harun", "radar","ses"));
        System.out.println("list = " + list);
        System.out.println("findPalindromeInList(list) = " + findPalindromeInList(list));


    }
    ////list içerisinde bulunan palindrom (terside kendisi ile ayni olan kelimeler)
//        // kelimeleri ekrana yazdıran metodu yazınız.
//        //kaşık,adanada,kazak,radar,ses,harun
//        //adanada,kazak,radar,ses
//
//        //list içerisinde bulunan polindrom (terside kendisine ayni  olan kelimeler) kelimeleri string olarak donen
//        // metodu yazınız.(aynı kelimeleri ekrana yazma-sın)

    public static String findPalindromeInList(List<String> list) {
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String reverse = "";
            for (int j = str.length() - 1; j >= 0; j--) {
                reverse += str.charAt(j);

            }
            if (str.equalsIgnoreCase(reverse)) {
                result += str + ", ";
                list.removeAll(Arrays.asList(str));
                i--;
            }
        }

        return Arrays.asList(result).toString();

    }




    /*public static List<String> findPalindromeInList(List<String>list){
        String result="";
        for (int i = 0; i < list.size(); i++) {
            String str=list.get(i);
            String reverse="";
            for (int j = str.length()-1; j >=0 ; j--) {
                reverse+=str.charAt(j);

            }
            if(str.equalsIgnoreCase(reverse)){
                result+=str+" ";
                list.removeAll(Arrays.asList(str));
                i--;
            }
        }

        return result;

    }

     */

    public class StringBuilderExample {
        public static void main(String[] args) {
            String text = "Hello, world!";
            StringBuilder reversedText = new StringBuilder(text).reverse();
            System.out.println("Reversed text: " + reversedText);
        }
    }
}
