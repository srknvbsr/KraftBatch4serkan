package day_52_Collection2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class C04_SetPractice2 {
    public static void main(String[] args) {
        /* Set<Integer>set1=new TreeSet<>();
       set1.add(50);
       set1.add(10);
       set1.add(15);
       set1.add(15);
       set1.add(15);
        System.out.println("set1 = " + set1);
        System.out.println("set1.remove(15) = " + set1.remove(15));
        System.out.println("set1 = " + set1);
 */
        //System.out.println("countDistinctChars(str) = " + countDistinctChars(str));
        String str = "";
        System.out.println("uniqueLetterCount(str) = " + uniqueLetterCount(str));

    }


    //Bu string içerisinde kaç farkllı harf var.


    public static int uniqueLetterCount(String str) {
        str = "merhaba nasılsın dünya";
        String[] arr = str.replace(" ", "").split("");
        Set<String> uniqueCharSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            uniqueCharSet.add(arr[i]);

        }

        return uniqueCharSet.size();
    }


   /* public static int countDistinctChars(String str) {

        Set<Character> uniqueChars = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isWhitespace(c)) { // Boşlukları saymamak için kontrol ediyoruz
                uniqueChars.add(c);
            }
        }
        return uniqueChars.size();
    }

    */


}
