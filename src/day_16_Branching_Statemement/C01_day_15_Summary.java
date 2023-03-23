package day_16_Branching_Statemement;

import java.util.Scanner;

public class C01_day_15_Summary {
    public static void main(String[] args) {
       /* int taban = 2;
        int kuvvet =0;
        int result = 1;
        if(taban==0&&kuvvet==0){
            result=0;

        }
        for (int i = 0; i < kuvvet; i++)
        {

            result*=taban;


        }
        System.out.println(result);

        */
        //Örnek:
        //Kullanıcıdan 2 adet sayı alın ve bunları toplayın 2 sayısının
        //toplamı 25 ise programdan çıkış işlemi gerçekleştirin. 25 değil ise
        //program kullanıcıdan iki sayı almaya devam etsin.
        Scanner scan=new Scanner(System.in);
        boolean flag= true;

        while(flag){
            System.out.println("x ");
            int x= scan.nextInt();
            System.out.println("y ");
            int y = scan.nextInt();
            int result = x+y;



        }

    }
}
