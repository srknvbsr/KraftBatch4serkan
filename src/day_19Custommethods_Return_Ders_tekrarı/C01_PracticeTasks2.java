package day_19Custommethods_Return_Ders_tekrarı;

public class C01_PracticeTasks2 {
    public static void main(String[] args) {
        tlToDollar(1500);
        System.out.println("-------------------------------------------");
        System.out.println("kgTolb(10) = " + kgTolb(10));
        double bagWeight = kgTolb(23);
        System.out.println("bagWeight = " + bagWeight);
        System.out.println("--------------------------------------------");
        signOfnumber(10);
        System.out.println("--------------------------------------------");
        signOfnumber(-10);
        System.out.println("--------------------------------------------");
        signOfnumber(0);
        System.out.println("--------------------------------------------");
        eachCharactersofString("Nuratgilin daından atlayamadım.");
        System.out.println("--------------------------------------------");
        calculationResult(10,15,'+');
        System.out.println("--------------------------------------------");
        calculationResult(10,15,'-');
        System.out.println("--------------------------------------------");
        calculationResult(10,15,'*');
        System.out.println("--------------------------------------------");
        calculationResult(10,15,'/');
        System.out.println("--------------------------------------------");
        calculationResult(10,15,'?');
        System.out.println("--------------------------------------------");
        calculationResult(10,15,'&');
        System.out.println("--------------------------------------------");
        calculationResult(10,15,'%');
        System.out.println("--------------------------------------------");




    }

    /**
     * a method that can can convert lira to dollar
     *
     * @param TL
     */
    //	1. create a method that can can convert lira to dollar
    public static void tlToDollar(int TL) {
        System.out.println(TL + (" TL makes to Dollar ") + (Math.round(TL / 19.04) * 100) / 100 + (" USD"));
    }

    /**
     * a method that can convert kg to lb
     *
     * @param kg
     * @return
     */
    //	2. create a method that can convert kg to lb
    public static double kgTolb(double kg) {
        double result = 0;
        result = (Math.round(kg / 2.24)) * 100 / 100;
        return result;


    }

    /**
     *
     * @param number
     */
    //	3. create a method that can determine if the given integer is positive, negative or zero
    public static void signOfnumber(int number) {
        if (number > 0) {
            System.out.println("Number is a positive number");

        } else if (number < 0) {
            System.out.println("Number is a negative number");
        } else {
            System.out.println("Number is a zero");


        }
    }
    //	4. create a method named printEachChar that can print each characters of a string

    /**
     * a method named printEachChar that can print each characters of a string
     * @param str
     */
    public static void eachCharactersofString(String str){

        for (int i = 0; i < str.length()-1; i++) {

                        System.out.println(str.charAt(i));

        }

    }
//  5. create a method named calculator that passes three arguments (num1, num2, mathOperator),
//	prints the calculation result
    public static void calculationResult(int num1,int num2,char operator){

        boolean valid = operator=='+'|| operator=='/'|| operator=='*'||operator=='-';
        if(valid){
            switch (operator){

                case '+':
                    System.out.println(num1+num2);
                    break;
                case '-':
                    System.out.println(num1-num2);
                    break;
                case '*':
                    System.out.println(num1*num2);
                    break;
                case '/':
                    System.out.println(num1/num2);
                    break;
                default:
                    System.out.println("Yanlıi seçim yapıldı.");
            }
        }else {
            System.err.println("Invalid Math Operator "+operator);
        }
    }

}







