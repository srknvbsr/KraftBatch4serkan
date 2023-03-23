package day11_ControlFlowStatements;

import java.util.Scanner;

public class C03_IF_Examples {
    public static void main(String[] args) {
        //Alini fizik dersi=50 kimya ise 30 eğer oralama 50 üzerinde ise geçti  yazsın
        // aştında ise herhangi bir şey yazdırma
       /* double fizik = 50;
        double kimya =55;
        double ort = (fizik+kimya)/2;
        boolean result = (ort>50);

//if(ort>=50)
if(result)
{
    System.out.println("geçti = " + result);

}

        */
        //Alini fizik dersi=50 kimya ise 30 eğer oralama 50 üzerinde ise geçti  yazsın
        // aştında ise herhangi bir şey yazdırma
        Scanner scan =new Scanner(System.in);
        System.out.println("Derst notlarını Giriniz: ");
        System.out.println("Fizik: ");
        double f=scan.nextDouble();
        System.out.println("Kimya: ");
        double k =scan.nextDouble();
        System.out.println("Gecme Notu: ");
        double gecmeNotu = scan.nextDouble();
        double ort =(f+k)/2;
        if(ort>=gecmeNotu){
            System.out.println("sınıfı Geçtiniz Tebrikler");
            System.out.println("Harika");
            System.out.println("Bir üst sınıfta görüşürüz.");

        }


        }


}




