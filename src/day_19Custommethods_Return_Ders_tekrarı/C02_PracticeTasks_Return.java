package day_19Custommethods_Return_Ders_tekrarı;

public class C02_PracticeTasks_Return {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("dollarToTl(1000) = " + dollarToTl(1000));
        System.out.println("-----------------------------------------------------------");
        System.out.println("evenNumbers() = " + evenNumbers());
        System.out.println("-----------------------------------------------------------");
        System.out.println("oddNumbers() = " + oddNumbers());
        System.out.println("-----------------------------------------------------------");
        System.out.println("eligibleForAlcoholPurchase(20) = " + eligibleForAlcoholPurchase(20));
        System.out.println("-----------------------------------------------------------");
        System.out.println("eligibleToVote(20, \"TR\") = " + eligibleToVote(20, "TR"));
        System.out.println("-----------------------------------------------------------");
        System.out.println("grades(50) = " + grades(50));
        System.out.println("-----------------------------------------------------------");
        System.out.println("areaOfCircle(1) = " + areaOfCircle(1));
        System.out.println("-----------------------------------------------------------");
        System.out.println("areaOfSquare(4) = " + areaOfSquare(4));
        System.out.println("-----------------------------------------------------------");

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
    public static String oddNumbers() {
        String str = " ";
        for (int i = 1; i < 100; i += 2) {
            str += i + " ";
        }
        return str;


    }

    /**
     * 2. create a method that can print even numbers between 1~100 in a same line saperated by space
     */
    public static String evenNumbers() {
        String str = " ";
        for (int i = 2; i < 10; i += 2) {
            str += i + " ";
        }
        return str;


    }

    /**
     * 3. create a method that can check if a person is eligible to buy alcohol
     * and age limit is 21
     */
    /**
     * @param age
     * @return
     */

    public static boolean eligibleForAlcoholPurchase(int age) {
        boolean eligible;
        eligible = 21 <= age;
        return eligible;

    }

    /**
     * 4. create a method that can check if a person is eligible to vote
     */
    /**
     * @param age
     * @param citizenship
     */
    public static boolean eligibleToVote(int age, String citizenship) {
        boolean isEligible = age >= 18 && citizenship.equalsIgnoreCase("TR");
        return isEligible;
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
    public static char grades(int score) {
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';

        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';

        }
        return grade;


    }

    /**
     * 6. create a method that can calculate the area of a circle
     */
    /**
     * @param radius
     * @return
     */
    public static double areaOfCircle(int radius) {
        double area;
        area = Math.round(Math.PI * radius * radius);
        return area;
    }


    /**
     * 7. create a method that can calculate the area of a square
     */
    /**
     * @param side
     */
    public static int areaOfSquare(int side) {
        int area = side * side;
        return area;
    }

    /**
     * @param dolar
     */

    public static double dollarToTl(int dolar) {
        double result = 19.04 * dolar;
        return result;
    }
}

