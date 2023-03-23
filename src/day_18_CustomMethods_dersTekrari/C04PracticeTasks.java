package day_18_CustomMethods_dersTekrari;

public class C04PracticeTasks {
    public static void main(String[] args) {
        oddNumberBtween();
        System.out.println("\n------------------------------------------------------------------------");
        evenNumbersBetween();
        System.out.println("\n------------------------------------------------------------------------");
        isEligibleToBuy(21);
        System.out.println("\n------------------------------------------------------------------------");
        isEligibleToVote(20,"tr");
        System.out.println("\n------------------------------------------------------------------------");
        grade(-1);
        System.out.println("\n------------------------------------------------------------------------");
    }


//    6. create a method that can calculate the area of a circle
//    7. create a method that can calculate the area of a square
//    8. create a method that can convert dollar to TL rate:19.04

    /**
     * //    1. create a method that can print odd numbers between 1~100 in a same line saperated by space
     */
    public static void oddNumberBtween() {
        for (int i = 0; i < 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n------------------------------------------------------------------------");
    }

    /**
     * //    2. create a method that can print even numbers between 1~100 in a same line saperated by space
     */
    public static void evenNumbersBetween(){
        for (int i = 1; i < 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n------------------------------------------------------------------------");
    }
    /**
     * //    3. create a method that can check if a person is eligible to buy alcohol
     */
    public static void isEligibleToBuy(int age){
        if(age>21){
            System.out.println("You are eligible too buy alcohol");
        }else {
            System.out.println("You aren't eligible to buy alcohol");

        }
        System.out.println("\n------------------------------------------------------------------------");

    }

    /**
     * //    4. create a method that can check if a person is eligible to vote
     * @param age
     * @param citiziens
     */
    public static void isEligibleToVote(int age , String citiziens){
        citiziens="TR";

        if(age>18&&citiziens.equalsIgnoreCase("TR")){
            System.out.print("You Are");

        }else {
            System.out.print("You aren't");
        }
        System.out.print(" Eligible to Vote");

        System.out.println("\n------------------------------------------------------------------------");
    }

    /**
     * // score >= 90 grade 'A'
     * // score >= 80 grade 'B'
     * // score >= 70 grade 'C'
     * // score >= 60 grade 'D'
     * // score < 60 grade 'F'
     * @param score
     */
    public static void grade(int score){
       // char puan;
        if(score>=90){
            System.out.println("A");

        } else if (score>=80) {
            System.out.println("B");

        }else if (score>=70) {
            System.out.println("C");

        }else if (score>=60) {
            System.out.println("D");

        }else if (score<60&&score>=-1) {
            System.out.println("F");

        }else{
            System.out.println("Hatalı giriş yaptınız:");
        }


    }

}



