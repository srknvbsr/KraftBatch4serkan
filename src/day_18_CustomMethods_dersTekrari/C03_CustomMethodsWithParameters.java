package day_18_CustomMethods_dersTekrari;

public class C03_CustomMethodsWithParameters {
    public static void main(String[] args) {
        oddNumberOrEvennumber(10);
        birthDay(1985, 2023);
        betweenNumbers(10,20);

    }
//
//
//

    /**
     * a function that can check if a number is odd number or even number
     */

    public static void oddNumberOrEvennumber(int i) {
        if (i % 2 == 0) {
            System.out.println(i + " bir çift sayıdır.");
        } else {
            System.out.println(i + " tek sayıdır.");
        }

    }

    /**
     * a method that can display the age of the person from the birthYear
     */
    public static void birthDay(int birthday, int year) {
        int age = year - birthday;
        System.out.println("Serkan'ın Yaşı " + age + " dir.");
    }
    /**
     * a method that can print all the numbers between X and Y
     */
    public static void betweenNumbers(int x,int y){
        for (int i = x+1; i <y ; i++) {
            System.out.println(i+ " ");

        }

    }
}
