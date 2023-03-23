package day10_UnaryLogicalOperAndrewiev;

import java.util.*;

public class C03_SwapVariables {
    public static void main(String[] args0) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir a tamsayısı tanımlayınız: ");
        int a = scan.nextInt();
        System.out.println("a = " + a);
        System.out.println("Lütfen bir b tam sayısı giriniz: ");
        int b = scan.nextInt();
        System.out.println("b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
