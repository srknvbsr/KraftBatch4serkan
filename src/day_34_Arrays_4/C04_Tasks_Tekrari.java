package day_34_Arrays_4;

import java.util.Arrays;

public class C04_Tasks_Tekrari {
    public static void main(String[] args) {
        int[] array = {10, 7, 7, 8, 9};
        int[] array1 = {1, 5, 6, 8};
        int[] array2 = {1, 5, 6, 8,2,3,7};
        System.out.println(average(array));
        System.out.println(Arrays.toString(arr(5)));
        System.out.println(Arrays.toString(fillArrayWithSmallest(array1)));
        System.out.println(Arrays.toString(fillArrayWithSmallestExceptBiggest(array2)));

    }
    //Bir method yazın int n parametre olarak alsın. n değeri kadar sayıları sıralı bir
    //biçimde bir array içine yerleştirsin. n = 5 Exm: [0,1,2,3,4]

    public static int[] arr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        return arr;
    }

    //Bir sayı dizisinin en büyük ve
    //en küçük element lerinin aritmetik ortalamasını
    //veren bir method yazın.
    public static double average(int[] arr) {
        double average = 0;
        Arrays.sort(arr);
        int x = arr[0];
        int y = arr[arr.length - 1];
        average = (x + y) / 2;


        return average;
    }

    //Bir sayı dizisinin en küçük sayısı ne ise sayı dizisini onunla dolduran bir
    //method yazın.
    public static int[] fillArrayWithSmallest(int[] arr) {
        Arrays.sort(arr);
        int min = arr[0];
        Arrays.fill(arr, min);
        return arr;
    }

    //Bir sayı dizisinin en küçük elemanı ne ise sayı dizisini (en büyük değer hariç)
    //onunla dolduran bir method yazın.
    public static int[] fillArrayWithSmallestExceptBiggest(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=max){
                arr[i]=min;
            }
        }
        return arr;
    }

}
