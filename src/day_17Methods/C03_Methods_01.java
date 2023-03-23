package day_17Methods;

public class C03_Methods_01 {
    public static void main(String[] args) {
        /*message1();
        message2();
        message3();

         */
        ortalama();

    }
    public static void message1(){
        message3();
        System.out.println("A");
    }
    public static void message2(){
        message1();
        System.out.println("B");

    } public static void message3(){

        System.out.println("AC");

    }

    /**
     * ortalaması alınan metod.A metod prints the average to console.
     * Bir method yazın 3 sayının aritmetik ortalamasını versin
     */

    public static void ortalama(){
        int x=10,y=15,z=25;
        double ort = (x+y+z)/3;
        System.out.println(ort);

    }



}


