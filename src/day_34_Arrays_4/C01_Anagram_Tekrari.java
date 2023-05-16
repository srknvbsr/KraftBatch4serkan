package day_34_Arrays_4;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Anagram_Tekrari {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki kelime giriniz:");
        String str1= scan.nextLine();
        String str2= scan.nextLine();
        System.out.println("isAnagram(str1,str2) = " + isAnagram(str1, str2));

    }

    //// write a method that can check if str1 & str2 are build out same characters ANAGRAM
    ////kil  ilk
    //// adam dama
    public static boolean isAnagram(String str1, String str2) {
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        char array1[] = str1.toCharArray();
        char array2[] = str2.toCharArray();
        //System.out.println("Arrays.toString(array1) = " + Arrays.toString(array1));
        //System.out.println("Arrays.toString(array2) = " + Arrays.toString(array2));
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);

    }
}
