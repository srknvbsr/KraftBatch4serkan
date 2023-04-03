package day_19Custommethods_Return_Ders_tekrarı;

import java.util.Scanner;

public class C08_TASKS_06 {
    public static void main(String[] args) {
        //Kullanıcı dan 2 sayı alın. İlk sayı taban, ikinci sayı ise üs olsun
        //mathPow metodu oluşturun işlemler bu metodun
        //içerisinde yapılsın. (Math sınıfının pow metodunu siz yapacaksınız)
        //Math.pow
        System.out.println("mathPow(3,4) = " + mathPow(3, 4));

    }
    public static int mathPow(int taban,int kuvvet){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir taban sayısı giriniz.");
        taban =scan.nextInt();
        System.out.println("Lütfen bir kuvvet sayısı giriniz.");
        kuvvet =scan.nextInt();
        int result=1;
        for (int i = 0; i < kuvvet; i++) {
        result*=taban;

        }
        if(taban==0&&kuvvet==0){
            System.out.println("Tanımsız sayı");

        }
        return result;
    }





}