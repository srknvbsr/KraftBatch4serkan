package day_19Custommethods_Return_Ders_tekrarı;

import java.util.Scanner;

public class C08_TASKS_12 {
    public static void main(String[] args) {
        davetiye();

    }
    public static void davetiye(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki tane kelime giriniz:");
        String str1= scan.next();
        String str2= scan.next();
        if(str1.equals(str2)){
            System.out.println("Lütfen farklı kelimeler Giriniz:");
            davetiye();

        }else{
            System.out.println("**********Serkan&&Esra*************");

        }


    }


}

