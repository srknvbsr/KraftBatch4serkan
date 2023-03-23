package day10_UnaryLogicalOperAndrewiev;

import java.util.Scanner;

public class C05_LogicalOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name ="Ayse";
        int age = 34;
        String citizen = "Turkey";
        boolean isEligibleVote = (age>18) && (citizen == "Turkey" );
        System.out.println("isEligibleVote = " + isEligibleVote);
        //*******************************************************************
        String name2 =  "Serkan";
        int age2= 35;
        int income = 40000;
        int findexScore = 1500;
        boolean isEligibleforLoan = findexScore>1200&&age2>=18&&income>30000;
        System.out.println("isEligibleforLoan = " + isEligibleforLoan);
        //*******************************************************************




    }
}
