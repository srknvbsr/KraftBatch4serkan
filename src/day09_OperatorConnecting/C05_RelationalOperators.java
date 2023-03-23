package day09_OperatorConnecting;

public class C05_RelationalOperators {
    public static void main(String[] args) {
        boolean result1 = (60>40);
        System.out.println(result1);

        boolean result2 = (200>=300);
        System.out.println(result2);

        boolean result3 = (200>=200);
        System.out.println(result3);
        //findex of 1500
        int findexofscore= 1650;
        boolean isEligibleForLoan= (findexofscore >=1500);
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        boolean isEligibleForLoan1= (findexofscore >=2000);
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);
        System.out.println("********************************************************");
        boolean result4= 100<200;
        System.out.println(result4);
        boolean result5= 300<200;
        System.out.println(result5);
        System.out.println("********************************************************");
        int score = 75;
        boolean hasFailed= score<=59;
        System.out.println("hasFailed = " + hasFailed);

        boolean result6 = 45<=60;
        System.out.println(result6);
        System.out.println("********************************************************");
        int x= 100;
        int y = 200;
        boolean isEqual = x==y;
        System.out.println("isEqual = " + isEqual);
        boolean result7 = "ihsan" == "ahmet";
        System.out.println(result7);

        boolean result8= 'A'=='a';
        System.out.println(result8);

        boolean result9= "Java"=="Java";//Stringlerde == kullanılmaz
         System.out.println(result9);

         boolean result10 =100!=200;
        System.out.println(result10);

        boolean result11= 200!=200;
        System.out.println(result11);
        boolean resultl12= "Java"!="Zor";
        System.out.println(resultl12);

    }
}
