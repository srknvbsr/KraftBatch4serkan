package day10_UnaryLogicalOperAndrewiev;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*int a = 5;
        int b = 7;
        boolean bl ;
        bl =  (a>b)&&(b==7);
        System.out.println("bl = " + bl);
        bl = a/b>0||(b>a);
        System.out.println("bl = " + bl);
        bl= a-b>0&&b>a;
        System.out.println("bl = " + bl);

         */


        //***********************************************************
       /* int age = 20;
        String healt = "healty";
        boolean toBeSoldier = age>=20&&healt=="healty";
        System.out.println("toBeSoldier = " + toBeSoldier);
        toBeSoldier = age==22&&healt=="healty" ||age>19&&healt=="poorly";
        System.out.println("toBeSoldier = " + toBeSoldier);

        */
        //***********************************************************
        /*boolean x = false, y= false,z= true;
        x=!y;
        z=!x&&x==z;
        System.out.println("z = " + z);

         */
        /*int i = 2;
        boolean bl;
        bl =--i==i||i<1;
        System.out.println("bl = " + bl);

         */
        //*************************TASK10*****************************************
        String name = "Ahmet";
        int age = 35;
        String citizen = "American";
        boolean isEligibleAge =age>21 && citizen=="American";
        System.out.println("isEligibleAge = " + isEligibleAge);




    }
}
