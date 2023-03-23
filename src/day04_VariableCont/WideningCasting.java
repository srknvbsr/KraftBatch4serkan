package day04_VariableCont;

public class WideningCasting {
    public static void main (String[] args){
       //byte<short<int<long<float<double
       int sayi = 9;
       double kur = 18.9;
       kur = sayi; // int tiğindeki 9 değerini atadık buna widening casting oluyor.Küçüğü büyüğe çevirmek

        System.out.println(kur);
        double num1 = 5;
        System.out.println(num1);



    }
}
