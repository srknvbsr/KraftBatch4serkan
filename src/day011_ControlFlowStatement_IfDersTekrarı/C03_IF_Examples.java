package day011_ControlFlowStatement_IfDersTekrarı;

import java.security.Key;
import java.util.Scanner;

public class C03_IF_Examples {
    public static void main(String[] args) {
       /* double fizik = 50;
        double kimya = 45;
        double ort = (fizik+ kimya)/2;
        if(ort>=50){
            System.out.println("Ali sınıfı geçti");
        }else{
            System.out.println("");
        }

        */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen Notlarınızı Giriniz: ");
        System.out.println("Fizik notunuzu Giriniz: ");
        double fizik= scan.nextDouble();
        System.out.println("Kimya notunuzu Giriniz: ");
        double kimya = scan.nextDouble();
        double ort = (fizik+kimya)/2;
        double gecmeNotu = 50;

        if(ort>gecmeNotu){
            System.out.println("Sınıııfı geçtiniz: ");
        }else{
            System.out.println("sınıfta Kaldınız: ");
        }


    }
}
