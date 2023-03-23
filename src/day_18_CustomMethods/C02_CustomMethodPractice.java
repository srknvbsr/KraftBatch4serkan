package day_18_CustomMethods;

public class C02_CustomMethodPractice {
    public static void main(String[] args) {
        helloWorld5Times();
        countDownTenToZero();
        evenNumbersFrom();

    }

    /**
     *  a function that can print hello world 5 times ==> helloWorld5Times()
     */
    public static void helloWorld5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

    }

    /**
     * a function that print Ten to Zero  ==> countdownTenToZero()
     */
    public static void countDownTenToZero(){
        for (int i = 10; i >=0 ; i--) {
            System.out.print(i+ " ;");

        }
    }

    /**
     *     a function that can print all the even numbers from 1 ~ 100 ==> evenNumbers
     */
    public static void evenNumbersFrom(){
        for (int i = 1; i < 100; i++) {
            if(i%2==0){
                System.out.print("\n"+i+" ");
            }

        }
    }

}



