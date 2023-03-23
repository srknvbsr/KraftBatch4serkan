package day011_ControlFlowStatement_IfDersTekrarı;
import java.util.*;

public class C04_IF_ELSE {
    public static void main(String[] args) {
        double fizik = 65;
        double kimya = 45;
        double ort = (fizik+ kimya)/2;
        if(ort>=50){
            System.out.println("Ali sınıfı geçti");
        }else{
            System.out.println("");
        }
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Ders Notlarını Giriniz: ");
        System.out.println("Lüften fizik ders notunu Giriniz: ");
        double fizik1= scan.nextDouble();

        System.out.println("Lüften kimya ders notunu Giriniz: ");
        double kimya1= scan.nextDouble();
        System.out.println("Lüften matematik ders notunu Giriniz: ");
        double matematik = scan.nextDouble();
        double ort1=(fizik1+kimya1+matematik)/3;
        double gecmeNOtu=80;
        if(ort>=gecmeNOtu){
            System.out.println("Sınıfı Geçtiniz: ");
        }else {
            System.out.println("Sınıfta Kaldınız: ");
        }

    }
}
