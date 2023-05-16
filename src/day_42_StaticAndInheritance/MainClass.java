package day_42_StaticAndInheritance;

import java.util.Scanner;
import java.util.*;

import static java.lang.Math.*;

public class MainClass {
    public static void main(String[] args) {
        /*A a = new A();
        B b = new B();
        B b1 = new B(4);
        B b2 = new B(5);

         */


//Static İmport Konusu
       /* System.out.println(pow(20, 2));
        System.out.println(max(4, 5));
        System.out.println(min(23, 3));
        System.out.println(PI);
        Scanner scan=new Scanner(System.in);
        //   System.out.println(Math.pow(20, 2));

        System.out.println(DisClass.IcClass.b);
        System.out.println(DisClass.a);





        Animal animal = new Animal();
        System.out.println(bird1.gagaRengi);


        Bird bird1 = new Bird();
        bird1.name = "Harun";
        bird1.yemekYe();
        bird1.name = "yakup";
        bird1.uc();
        Papagan papagan = new Papagan();
        System.out.println(papagan.name);
        papagan.yemekYe();

        */






    /*public static double pow(double a, double b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

     */
        ChildClass childClass= new ChildClass("harun","Tester");
        System.out.println(childClass.meslek);
        System.out.println(childClass.name);


    }
}


