package day_33_Arrays_3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C02_Tasks_Tekrari {
    public static void main(String[] args) {
        int[] arry = {10, 5, -400, -6, 8};
        String[] array = {"harun", "Serkan", "Esra", "Busra", "Neva"};
        System.out.println("enBuyukEleman(arry) = " + enBuyukEleman(arry));
        System.out.println("enKucukEleman(arry) = " + enKucukEleman(arry));
        System.out.println("yerDegistir(arry) = " + Arrays.toString(yerDegistir(arry)));
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        System.out.println("Arrays.toString(reversed(array)) = " + Arrays.toString(reversed(array)));
        System.out.println("sumofArray(arry) = " + sumofArray(arry));
        System.out.println("Arrays.toString(bigileriAl ()) = " + Arrays.toString(bigileriAl()));
    }

    //İnt arry in en b ü y ü k elemanının dönd ü ren bir method yazın.
    public static int enBuyukEleman(int[] arry) {
        int max = arry[0];
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] > max) {
                max = arry[i];

            }

        }
        return max;


    }

    public static int enKucukEleman(int[] arry) {
        int min = arry[0];
        for (int i : arry) {
            if (min > i) {
                min = i;
            }
        }
        return min;


    }

    //Bir array oluşturun ve ilk ve son elemanlarını(yer değiştirin).
    public static int[] yerDegistir(int[] arr) {
        // int[] arry = {10, 5, -400, 6, 8};
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;


        return arr;
    }

    //Bir method yazın ve verilen arry in elemanlarını tersden sıralayıp yeni bir array döndürsün.
    public static String[] reversed(String[] str) {
        //String [] array={"harun","Serkan","Esra","Busra","Neva"};
        String[] reversed = new String[str.length];

        for (int i = str.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = str[i];
        }
return reversed;
    }
    //Bir methodla verilen array ın teksayı indexin de bulunan elemanların toplamını alın.
    public static int sumofArray(int [] arr){
        int sum=0;
        for (int i = 1; i < arr.length; i+=2) {
            sum+=arr[i];

        }
        return sum;
    }
    //Kullanıcıdan oluşturmak istediği string array in bilgilerini alarak string array oluşturan
    //bir method yazın. Alınacak bilgiler array ın length i ve elamanları olsun.
    public static int[] bigileriAl(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen oluşturmak istediğiniz dizinin kapasitesini giriniz: ");
        int lenhgt=scan.nextInt();
        int[] arr=new int[lenhgt];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Lüften " +(i+1)+ " indeks numarasını giriniz. ");
           arr[i]= scan.nextInt();
        }
        return arr;
    }
}
