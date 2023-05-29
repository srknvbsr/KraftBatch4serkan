package day_56_JavaRewiev;

import java.util.Scanner;

public class C05_LoopRewiev {
    public static void main(String[] args) {
        /*for (int i = 1; i < 26; i++) {
            if (i % 5 == 0) {
                break;
                // continue;
                //return;
            }

            System.out.print(i + " ");

        }

         */

        for (int i = 0; i < 3; i++) {
            System.out.println(i + " ilk for loop ");
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    //break;
                    /*
0 ilk for loop
0 ikinci loop
1 ikinci loop
1 ilk for loop
0 ikinci loop
1 ikinci loop
2 ilk for loop
0 ikinci loop
1 ikinci loop

                     */

                    //continue;
                  /*
0 ilk for loop
0 ikinci loop
1 ikinci loop
1 ilk for loop
0 ikinci loop
1 ikinci loop
2 ilk for loop
0 ikinci loop

                   */
                   // return;
                    /*
0 ilk for loop
0 ikinci loop
1 ikinci loop
                     */
                }
                System.out.println(j + " ikinci loop");
            }

        }


      System.out.println("go");
        System.out.println("---------------------------------------");

        Scanner scan = new Scanner(System.in);
        int num = 0;
        while (num < 100) {
            System.out.println("Enter a number");
            num = scan.nextInt();

        }




    }
}
