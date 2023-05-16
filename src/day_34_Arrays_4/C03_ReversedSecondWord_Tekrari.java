package day_34_Arrays_4;

import java.util.Arrays;

public class C03_ReversedSecondWord_Tekrari {
    public static void main(String[] args) {
        System.out.println(reversedSecondWord("I love Java"));

    }

    public static String reversedSecondWord(String str) {
        String result = "";
        String[] words = str.split(" ");
        //System.out.println(Arrays.toString(words));
        String reversed="";
        for (int i = words[1].length()-1; i >=0 ; i--) {
            reversed+=words[1].charAt(i);

        }
        words[1]=reversed;
        for (int i = 0; i <words.length ; i++) {
            result+=words[i]+" ";

        }
return result;
    }
}
