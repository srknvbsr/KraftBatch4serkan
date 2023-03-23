package day09_OperatorConnecting;

import java.util.Scanner;

public class C01_BoyKılo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Lütfen Boyunuzu Girinizi (orn 1,74) : ");
        double boy = scan.nextDouble();


        System.out.println("Lütfen Kilonuzu Giriniz: ");
        double kilo = scan.nextDouble();
        //scan.nextLine();

        System.out.println("Lütfen İsminzi Giriniz: ");
        String name = scan.next();
        scan.nextLine();

        System.out.println("Soyisminizi Girinizi :");
        String soyisim = scan.nextLine();


        System.out.println(name +" " +soyisim+ " Boyunuz " + boy + " Kilonuz " + kilo + "kg");


    }
}
