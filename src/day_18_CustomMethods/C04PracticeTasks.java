package day_18_CustomMethods;

public class C04PracticeTasks {
    public static void main(String[] args) {
        oddNumbers();
        evenNumbers();
        eligibleForAlcoholPurchase(30);
        eligibleToVote(20, "TR");
        grades(50);
        areaOfCircle(1);
        areaOfSquare(4);
        dollarToTl(1000);

    }
//    1. create a method that can print odd numbers between 1~100 in a same line saperated by space
//    2. create a method that can print even numbers between 1~100 in a same line saperated by space
//    3. create a method that can check if a person is eligible to buy alcohol
//    4. create a method that can check if a person is eligible to vote
//    5. create a method that can calculate the grade of the student based on the score
// score >= 90 grade 'A'
// score >= 80 grade 'B'
// score >= 70 grade 'C'
// score >= 60 grade 'D'
// score < 60 grade 'F'
//    6. create a method that can calculate the area of a circle
//    7. create a method that can calculate the area of a square
//    8. create a method that can convert dollar to TL rate:19.0

    /**
     * 1. create a method that can print odd numbers between 1~100 in a same line saperated by space
     */
    public static void oddNumbers() {
        for (int i = 1; i < 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    /**
     * 2. create a method that can print even numbers between 1~100 in a same line saperated by space
     */
    public static void evenNumbers() {
        for (int i = 2; i < 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    /**
     * 3. create a method that can check if a person is eligible to buy alcohol
     * and age limit is 21
     */

    public static void eligibleForAlcoholPurchase(int age) {
        if (21 <= age) {
            System.out.println("Eligible to buy Alcohol");
        } else {
            System.out.println("İneligible to buy Alcohol");
        }

    }

    /**
     * 4. create a method that can check if a person is eligible to vote
     */
    public static void eligibleToVote(int age, String citizenship) {
        boolean isEligible = age >= 18 && citizenship.equalsIgnoreCase("TR");
        System.out.println("You are ");
        if (!isEligible) {
            System.out.println("not ");
            System.out.print("eligible to vote");
        }
    }
    /**
     *  5. create a method that can calculate the grade of the student based on the score
     * // score >= 90 grade 'A'
     * // score >= 80 grade 'B'
     * // score >= 70 grade 'C'
     * // score >= 60 grade 'D'
     * // score < 60 grade 'F'
     */
    /**
     * @param score
     */
    public static void grades(int score) {
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';

        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else{
            grade = 'F';

        }
        System.out.println("Your score is "+score+" ,and your grade is "+grade);


    }
    /**
     * 6. create a method that can calculate the area of a circle
      */
    public static void areaOfCircle(int radius){
        double area;
        area=Math.round(Math.PI*radius*radius);
        System.out.println("Circle with a radıus "+radius+" cm has an area of "+ area);


    }
    /**
     * 7. create a method that can calculate the area of a square
     */
    public static void areaOfSquare(int side){
        System.out.println("Square with a side of "+side+ " cm has an area of "+ (side*side)+" cm");
    }
    public static void dollarToTl(int dolar){
        System.out.println(dolar+" dolar is "+(19.04*dolar)+ " Tl");
    }
}

