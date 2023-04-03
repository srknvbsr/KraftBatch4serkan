package day_19Custommethods_Return_Ders_tekrarı;

import java.util.Scanner;

public class C08_TASKS_05 {
    //Kullanıcıdan alınan sayının kaç basamaklı olduğunu bulan metodu yazınız.
    public static void main(String[] args) {
        System.out.println("numberOfDigits(12536) = " + numberOfDigits(12536));
    }
    public static int numberOfDigits(int number){
            int basamakSayisi = 0;
            while (number / 10 >= 1) {
                number = number / 10;
                basamakSayisi++;
            }
            basamakSayisi++;
            return basamakSayisi;
        }

    }


