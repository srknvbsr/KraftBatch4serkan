package day_19Custommethods_Return_Ders_tekrarı;

import java.util.Scanner;

public class C08_TASKS_11 {
    public static void main(String[] args) {
        //Kullanıcıdan 2 sayı alın ve bu iki sayının en büyük ortak bölenini ekrana
        //yazdırı n . 1 ile 7
        //sonuc 1 6 12(6)
        System.out.println("greatestCommonDivision(6,12) = " + greatestCommonDivision(6, 12));

    }
    public static int greatestCommonDivision(int number1,int number2){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz:");
        number1= scan.nextInt();
        System.out.println("Lütfen ikinci sayiyi giriniz:");
        number2= scan.nextInt();
        int gcd = 0;
        //number1<number2
        for (int i = 1; i <=number1 ; i++) {
            if(number1%i==0&&number2%i==0){
                gcd=i;

            }

        }
        return gcd;




    }
}
