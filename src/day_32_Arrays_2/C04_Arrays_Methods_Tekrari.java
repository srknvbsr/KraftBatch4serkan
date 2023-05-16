package day_32_Arrays_2;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays_Methods_Tekrari {
    public static void main(String[] args) {
        //System.out.println(kelimeDepola()[0]);
        //int[] array = {10, 15, 23, 25, 26, 280};
        int[] array1 = {10, 15, 23};
        int[] array2 = {5, 15, 23};

        //System.out.println(uzunlukKontrol(array));
        //System.out.println(uzunlukKontrol(array1));
        System.out.println("rakamVarMi(array1) = " + rakamVarMi(array1));
        System.out.println("rakamVarMi(array2) = " + rakamVarMi(array2));
        System.out.println("ikiArrayKontrolu(array1,array2) = " + ikiArrayKontrolu(array1, array2));
        System.out.println(yeniArrayYap(array1, array2));//referans numarası yazar.
        System.out.println(Arrays.toString(yeniArrayYap(array1, array2)));
        System.out.println(Arrays.toString(yeniArrayYap1(array1, array2)));
        System.out.println("toplama(array1) = " + toplama(array1));
        System.out.println("Arrays.toString(toplamaVeCarpmaAl(array2)) = " + Arrays.toString(toplamaVeCarpmaAl(array2)));
        System.out.println("Arrays.toString(arrayBirlestir(array1,array2)) = " + Arrays.toString(arrayBirlestir(array1, array2)));
    }

    //Verilen 2 arrayi birleştir ip array döndüren bir method yazın.
    public static int[] arrayBirlestir(int[] arr1, int[] arr2) {
        int[] yeniArray = new int[arr1.length + arr2.length];
        for (int i = 0, j = 0; i < yeniArray.length; i++) {
            if (i < arr1.length) {
                yeniArray[i] = arr1[i];
            } else {
                yeniArray[i] = arr2[j];
                j++;
            }

        }
        return yeniArray;
    }


    //İnt array ın elemanlarının toplamını ve çarpımını yeni bir array içinde döndüren bir method yazın.
    public static int[] toplamaVeCarpmaAl(int[] arr) {
        int[] yeniarray = new int[2];
        int carp = 1;
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
            carp *= arr[i];

        }
        yeniarray[0] = toplam;
        yeniarray[1] = carp;
        return yeniarray;
    }


    //Int array in elemanlarının toplamını veren bir method yazın
    public static int toplama(int[] x) {
        int toplam = 0;
        for (int i = 0; i < x.length; i++) {
            toplam += x[i];
        }
        return toplam;

    }


    //2 array kabul eden bir method yazın ve arraylerin llk elemanları ile yeni bir array döndürsün.
    public static int[] yeniArrayYap(int[] arr1, int[] arr2) {
        int[] array3 = new int[2];
        array3[0] = arr1[0];
        array3[1] = arr2[0];
        return array3;

    }

    public static double[] yeniArrayYap1(int[] x, int[] y) {
        double[] array = {x[0], y[0]};
        return array;

    }

    //Bir method yazın ve 2 array kabul etsin ilk elemanları eşitse true döndürsün
    public static boolean ikiArrayKontrolu(int[] aar1, int[] arr2) {
        if (aar1[0] == arr2[0]) {
            return true;
        }
        return false;
    }


    public static String[] kelimeDepola() {
        String array[] = new String[3];
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Kelime");
        String kelime1 = scan.nextLine();
        array[0] = kelime1;
        System.out.println("2.Kelime");
        String kelime2 = scan.nextLine();
        array[1] = kelime2;
        System.out.println("3.Kelime");
        String kelime3 = scan.nextLine();
        array[2] = kelime3;
        return array;


    }

    //Bir method yazın ve int[] kabul etsin . length i 5 den b ü y ü kse true d ö nd ü rs ü n.

    public static boolean uzunlukKontrol(int[] arr) {
        return arr.length > 5;

    }

    //Bir method yazın int array kabul etsin array in içinde 5 olup olmadı ğ ını kontrol etsin
    public static boolean rakamVarMi(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 5) return true;
        }
        return false;
    }

}

