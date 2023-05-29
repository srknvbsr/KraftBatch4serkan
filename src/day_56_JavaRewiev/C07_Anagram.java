package day_56_JavaRewiev;

import java.util.Arrays;

public class C07_Anagram {
    public static void main(String[] args) {
        String str1="kitap";

        String str2="katip";

        char[] chars1=str1.toCharArray();


        char[] chars2=str2.toCharArray();

        System.out.println("Arrays.toString(chars1) = " + Arrays.toString(chars1));

        System.out.println("Arrays.toString(chars2) = " + Arrays.toString(chars2));

        Arrays.sort(chars1);
        Arrays.sort(chars2);
        //boolean isAnagram=chars1.equals(chars2);//Bu şekilde iki arrayın kontrolunu yapamzsın
                                                //bunun için Arrays.equals(chars1,chars2) yapman gerekir.
        boolean isAnagram=Arrays.equals(chars1,chars2);
        System.out.println("isAnagram = " + isAnagram);




    }

}
