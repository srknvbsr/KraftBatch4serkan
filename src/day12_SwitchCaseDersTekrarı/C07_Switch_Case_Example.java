package day12_SwitchCaseDersTekrarı;

import java.util.Scanner;

public class C07_Switch_Case_Example {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lüfen bir sayi giriniz");
                double sayi1= scan.nextDouble();
        System.out.println("Lüfen bir sayi giriniz");
        double sayi2= scan.nextDouble();
        System.out.println("Lütfen bir işlem seçiniz : (+,-,*,/");
        String str= scan.next();
        switch (str){
            case "+" :
                System.out.println(sayi1+sayi2);
                break;
            case "-":
                System.out.println(sayi1-sayi2);
                break;
            case "*":
                System.out.println(sayi1*sayi2);
                break;
            case "/":
                System.out.println(sayi1/sayi2);
                break;
            default:
                System.out.println("Hatalı bir giriş yaptınız:");
        }


        /*System.out.println("Lütfen haftanın günleri için bir sayi giriniz");
        int sayi=scan.nextInt();

        switch (sayi){
            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Salı");
                break;
            case 3 :
                System.out.println("Çarşamba");
                break;
            case 4 :
                System.out.println("Perşembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Hatalıı bir giriş yaptınız: ");
        }

         */



    }
}
