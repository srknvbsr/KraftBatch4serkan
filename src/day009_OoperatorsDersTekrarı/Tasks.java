package day009_OoperatorsDersTekrarı;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
       /* String a="from";
        System.out.println("a = " + a);
        String b= "to";
        System.out.println("b = " + b);
        String c = "is";
        System.out.println("c = " + c);
        System.out.println(" Ucus Biletinizi nereden aldıgınızı giriniz: ");
        String name = java.nextLine();
        System.out.println(" Nereye gideceğinizi giriniz: ");
        String name2 = java.nextLine();
        java.nextLine();
        System.out.println(" Ucus Biletinizi ne kadar'a aldıgınızı giriniz: ");
        int flightTicket=java.nextInt();
        System.out.println("YOLCULUK EDECEĞİNİZ BİLGİLER: " +a+" " +name+" "+b+ " "+name2+" "+c+ " "+flightTicket+"Tl'dir.");

        */

//*******************************************TASK2*******************************************************************************************
        String str="Your phone number is + ";
        System.out.println("str = " + str);
        System.out.println("Lütfen Country code Giriniz :");
        int countryCode = java.nextInt();
        System.out.println("Lütfen Area code Giriniz :");
        int areaCode = java.nextInt();
        System.out.println("Lütfen localnumber Giriniz :");
        int localNumber = java.nextInt();
        System.out.println(str+ "("+countryCode+") "+  areaCode+ "-"+ localNumber);








    }
}
