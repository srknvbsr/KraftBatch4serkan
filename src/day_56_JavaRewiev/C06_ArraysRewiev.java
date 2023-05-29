package day_56_JavaRewiev;

import java.util.Arrays;

public class C06_ArraysRewiev {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] numbers = {5, 10, 15, 20, 25, 30};
        System.out.println(numbers[3]);
        numbers[5] = 50;
        int number2[] = new int[5];
        for (int i = 0, j = numbers.length - 1; i < number2.length; i++, j--) {
            number2[i] = numbers[j];

        }
        System.out.println(Arrays.toString(number2));

        String[] arr1 = {"Ayşe", "Serkan", "Emine"};
        String[] arr2 = {"Hatice", "salih", "Umit"};
        String[][] arr2D={arr1,arr2};
        System.out.println("Arrays.deepToString(arr2D) = " + Arrays.deepToString(arr2D));


        char[] hollyNameChars="harun".toCharArray();


        for (int i = 0; i < hollyNameChars.length; i++) {
            System.out.println("hollyNameChars[i] = " + hollyNameChars[i]);

        }
        System.out.println("-----------------------------------------------------------------------------");
        for (char hollyNameChar : hollyNameChars) {
            System.out.println(hollyNameChar);
        }


    }


}
