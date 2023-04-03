package day_23_StringClass;

import java.util.Scanner;

public class C07_UzunOlan_Kelimeleri_Concat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen üç kelime giriniz.");
        String kelime1 = scan.nextLine();
        String kelime2 = scan.nextLine();
        String kelime3 = scan.nextLine();
        System.out.println("kelime1.length() = " + kelime1.length());
        System.out.println("kelime2.length() = " + kelime2.length());
        System.out.println("kelime3.length() = " + kelime3.length());
        if(kelime1.length()>kelime2.length()&kelime2.length()>kelime3.length()){
            System.out.println("Girilen "+kelime1+ " en büyüktür");
            kelime1.concat(kelime2+kelime3);

        } else if ((kelime1.length()>kelime3.length()&kelime3.length()>kelime2.length())) {
            System.out.println("Girilen "+kelime1+ " en büyüktür");
            System.out.println(kelime1.concat(kelime3 + kelime2));

        }else if ((kelime2.length()>kelime1.length()&kelime1.length()>kelime3.length())) {
            System.out.println("Girilen " + kelime2 + " en büyüktür");
            System.out.println(kelime2.concat(kelime1 + kelime3));

        }else if (((kelime2.length()>kelime3.length()&kelime3.length()>kelime1.length()))) {
            System.out.println("Girilen " + kelime2 + " en büyüktür");
            System.out.println(kelime2.concat(kelime3 + kelime1));
        }else if (((kelime3.length()>kelime1.length()&kelime1.length()>kelime2.length()))) {
            System.out.println("Girilen " + kelime3 + " en büyüktür");
            System.out.println(kelime3.concat(kelime1 + kelime2));
        }else if (((kelime3.length()>kelime2.length()&kelime2.length()>kelime1.length()))) {
            System.out.println("Girilen " + kelime3 + " en büyüktür");
            System.out.println(kelime3.concat(kelime2 + kelime1));
        }else {
            System.out.println("hepsi eşittir.");

        }





    }
}
