package day10_UnaryLogicalOperAndrewiev;

import java.util.Scanner;

public class C04_UnaryOperator {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
       /* int number1 = +3;
        int number2 = -2;
        System.out.println(number1>0);
        System.out.println(number2<0);
        int a = 10;
        ++a;//pre increment
        System.out.println("a = " + a);
        --a;//pre decrement
        System.out.println("a = " + a);

        */
        //**********************************************************************
        int b = 99;
        System.out.println("b = " + b);
        System.out.println("++b = " + ++b);//pre increment.

        int c = 99;
        System.out.println("c = " + c);
        System.out.println(c++);
        System.out.println("c = " + c);

        int x = 201;
        System.out.println("x = " + x);
        System.out.println("--x = " + --x);

        int y = 201;
        System.out.println("y = " + y);
        System.out.println("y-- = " + y--);
        System.out.println("y = " + y);


        int z = 44;
        System.out.println("++z = " + ++z);
        System.out.println("z++ = " + z++);
        System.out.println("z = " + z);
        
        int i = 42;
        System.out.println("--i = " + --i);
        System.out.println("i-- = " + i--);
        System.out.println("i = " + i);



    }
}
