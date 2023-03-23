package day12_SwitchCase;

import java.util.Scanner;

public class TASKS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*System.out.println("Lütfen görmek istediğiniz ayların numarasını giriniz.: ");
        int number = scan.nextInt();
        switch (number) {
            case 1:
                System.out.println("OCAK");
                break;
            case 2:
                System.out.println("ŞUBAT");
                break;
            case 3:
                System.out.println("MART");
                break;
            case 4:
                System.out.println("NİSAN");
                break;
            case 5:
                System.out.println("MAYIS");
                break;
            case 6:
                System.out.println("HAZİRAN");
                break;
            case 7:
                System.out.println("TEMMUZ");
                break;
            case 8:
                System.out.println("AĞUSTOS");
                break;
            case 9:
                System.out.println("EYLÜL");
                break;
            case 10:
                System.out.println("EKİM");
                break;
            case 11:
                System.out.println("KASIM");
                break;
            case 12:
                System.out.println("ARALIK");
                break;
            default:
                System.out.println("Yanlış bir seçim yaptıınız: ");


        }

         */
        //*********************************TASK 2*******************************************************
       /* Bir sayı için 5 den 25 den ve 50 den büyük olup olmadığını
        denetimini yapın. Eğer sayı 5 den büyükse 5 den büyük
        olduğunu konsola yazdırın. Sayı 25 den de büyükse hem 5
        hem 25 den büyük olduğunu konsola yazdırın. Sayı 25 den
        kücük 5 den büyükse sayının 5 den büyük ancak 25 den
        küçük olduğunu yazdırın

        */

        System.out.println("Lütfen bir sayi Giriniz");
        int sayi = scan.nextInt();
        if ((sayi>5)&&(sayi<25)) {
            System.out.println("Sayi  5 den büyük ancak 25 den küçük ");

        } else if (sayi>25) {

            System.out.println("Sayi hem 5 hem 25 den büyüktür");

        }else if (sayi>5){
            System.out.println("Bu sayi 5 ten büyüktür");

        }else {
            System.out.println("Hatalı bir sayi girdiniz:");
        }
    }
}
