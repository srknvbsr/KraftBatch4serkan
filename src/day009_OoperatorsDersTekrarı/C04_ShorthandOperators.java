package day009_OoperatorsDersTekrarı;

public class C04_ShorthandOperators {
    public static void main(String[] args) {
        int number = 20;
        number = 30;
        System.out.println(number);
        String Word="Java Programing Language";
         Word = "Phyton Programing Language";

        Word = "Golden Global";
        System.out.println(Word);
        int x = 100;
        System.out.println("x = " + x);
        x+= 100;
        System.out.println("x = " + x);

        String str = "Golden Global";
        System.out.println("str = " + str);
        str+= " France";
        System.out.println("str = " + str);
        double number1 = 3.5;
        System.out.println("number1 = " + number1);
        number1+= 6.5;
        System.out.println("number1 = " + number1);
        double bakiye = 3500.20;
        bakiye+= 1500;
        System.out.println("bakiye = " + bakiye);
        bakiye-= 1200;
        System.out.println("bakiye = " + bakiye);
        bakiye*=2;
        System.out.println("bakiye = " + bakiye);
        bakiye/=500;
        System.out.println("bakiye = " + bakiye);
        int odenecekMiktar = 1130 ;
        System.out.println("odenecekMiktar = " + odenecekMiktar);
        int ikiYuzlukAdet = 1130/200;
        System.out.println("ikiYuzlukAdet = " + ikiYuzlukAdet);
        int sonKalanOdeme= odenecekMiktar-=(ikiYuzlukAdet*200);

        System.out.println("sonKalanOdeme = " + sonKalanOdeme);
        int yuzlukAdet= sonKalanOdeme/100;
        System.out.println("yuzlukAdet = " + yuzlukAdet);
        int sonKalanOdeme1=sonKalanOdeme%100;
        System.out.println("sonKalanOdeme1 = " + sonKalanOdeme1);
        int yirmilikAdeti= sonKalanOdeme1/20;
        System.out.println("yirmilikAdeti = " + yirmilikAdeti);
        int sonKalanOdeme2= sonKalanOdeme1%20;
        System.out.println("sonKalanOdeme2 = " + sonKalanOdeme2);
        int onlukAdedi= sonKalanOdeme2/10;
        System.out.println("onlukAdedi = " + onlukAdedi);
        int sonKalanOdeme3= sonKalanOdeme2%10;
        System.out.println("sonKalanOdeme3 = " + sonKalanOdeme3);



    }
}
