package day_56_JavaRewiev;

import java.util.Scanner;

public class C05_LoopRewiev {
    public static void main(String[] args) {
        for (int i = 0; i < 26; i++) {
            if (i % 5 == 0) {
                //break;
                 continue;
                //return;
            }

            System.out.print(i + " ");

        }
        System.out.println("go");
        System.out.println("---------------------------------------");

        Scanner scan = new Scanner(System.in);
        int num=0;
        while (num<100){
            System.out.println("Enter a number");
             num = scan.nextInt();

        }



    }
}
