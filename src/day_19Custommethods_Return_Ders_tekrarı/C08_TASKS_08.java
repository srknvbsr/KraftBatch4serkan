package day_19Custommethods_Return_Ders_tekrarı;

import java.util.Scanner;

public class C08_TASKS_08 {
    public static void main(String[] args) {
        //Kullanıcı tarafından girilen n terimli
        //Fibonacci dizisini yazdıran bir program yazın:
        // 1 1 2 3 5 8 13 21
        // a b c
        //   a b c
        //     a b c
        Scanner scan=new Scanner(System.in);
        int a=1,b=1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < 25; i++) {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c+ " ");

        }

    }

}
