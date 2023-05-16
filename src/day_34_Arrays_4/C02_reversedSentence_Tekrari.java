package day_34_Arrays_4;

import java.util.Arrays;

public class C02_reversedSentence_Tekrari {
    public static void main(String[] args) {
        System.out.println(reversedSentence("Today is a perfect day to learn Java"));
    }

    /*
 Write a method that can reverse a sentence
 Ex:
 sentence = "Today is a perfect day to learn Java";

 output:
 Java learn to day perfect a is Today

     */
    public static String reversedSentence(String str) {
        String reversed = "";
        String[] words = str.split(" ");
        //System.out.println(Arrays.toString(words));
        for (int i = words.length-1; i >= 0; i--) {
            reversed += words[i] + " ";

        }
        return reversed;

    }

}
