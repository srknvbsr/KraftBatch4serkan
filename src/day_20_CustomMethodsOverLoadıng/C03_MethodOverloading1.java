package day_20_CustomMethodsOverLoadıng;

public class C03_MethodOverloading1 {
    public static void main(String[] args) {
        System.out.println("sum(10,20,30,40) = " + sum(10, 20, 30, 40));


    }

    public static int sum(int num1, int num2) {
        return num1 + num2;

    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;

    }

    public static int sum(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;

    }
}
    /*
        1. create a method that can find the sum of two numbers


        2. create a method that can find the sum of three numbers


        3. create a method that can find the sum of four numbers
 */
