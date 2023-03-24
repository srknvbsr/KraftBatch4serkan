package day_19Custommethods_Return;

public class C01_PracticeTasks2 {
    public static void main(String[] args) {
        tlToDollar(25000);
        System.out.println("---------------------------------------------------");
        kgToLb(10);
        System.out.println("---------------------------------------------------");
        SignOfNumber(-60);
        SignOfNumber(60);
        SignOfNumber(0);
        eachCharInString("Serkan");
        calculator(10,2,'+');
        calculator(10,2,'-');
        calculator(10,2,'/');
        calculator(10,2,'*');
        calculator(10,2,'1');



    }

    /**
     *
     * @param TL
     */

    public static void tlToDollar(int TL){
        System.out.println(TL + "TL makes "+Math.round((TL/19.04)*100)/100.0+" USD");

    }
    public static double kgToLb(double kg){
        double result=0;
        result=((kg*2.20462262)*100)/100;
        return result;

    }

    /**
     *  //    3. create a method that can if the given integer is positive, negative or zero.
     * @param number
     */

    public static void SignOfNumber(int number){
        if(number<0){
            System.out.println(number + " is a negative number");
        }else if(number>0){
            System.out.println(number+" is a pposıtıve number ");

        }else{
            System.out.println(number+ " is zero");
        }


    }

    /**
     *
     * @param str
     */
    public static void eachCharInString(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }

    }

    /**
     *
     * @param num1
     * @param num2
     * @param operatıon
     */
    //  5. create a method named calculator that passes three arguments (num1, num2, mathOperator),
//    prints the calculation result
public static void calculator(double num1,double num2,char operatıon){
        boolean valid=operatıon=='+'||operatıon=='-'||operatıon=='*'||operatıon=='/';
        if(valid){
            switch (operatıon){
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

            }
        }else {
            System.err.println("İnvalid operatıon" +operatıon);
        }
}








}

