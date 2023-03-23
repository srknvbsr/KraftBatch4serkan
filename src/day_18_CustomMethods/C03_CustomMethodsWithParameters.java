package day_18_CustomMethods;

public class C03_CustomMethodsWithParameters {
    public static void main(String[] args) {
        oddOrEven(912);
        ageOfPerson(1985);
        printNUmbers(10,30);

    }
    //     a function that can check if a number is odd number or even number
//     a method that can display the age of the person from the birthYear
//

    /**
     * @param number
     */
    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an even number ");


        } else
            System.out.println(number + " is an odd number ");


    }

    /**
     * a method that can print all the numbers between X and Y
     *
     * @param birthYear
     */
    public static void ageOfPerson(int birthYear) {
        int age = 2023 - birthYear;
        System.out.println("your age is " + age);
    }

    /**
     * @param x
     * @param y
     */
    public static void printNUmbers(int x, int y) {
        for (int i = x + 1; i < y; i++) {
            System.out.print(i+" ");

        }

    }
}
