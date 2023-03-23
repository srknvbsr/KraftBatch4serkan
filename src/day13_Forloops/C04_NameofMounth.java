package day13_Forloops;

import java.util.Scanner;

public class C04_NameofMounth {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
        String result = "" ;
        if((1<=sayi)&&(sayi<=12)){
            if(sayi==1){
                result="January";
            } else if (sayi==2) {
                result="February";

            } else if (sayi==3) {
                result="March";

            }

        }else if (sayi==4){
            result="Aprıl";
        }else if (sayi==5){
            result="May";
        }else if (sayi==6){
            result="June";
        }else if (sayi==7){
            result="July";
        }else if (sayi==8){
            result="August";
        }else if (sayi==9){
            result="September";
        }else if (sayi==10){
            result="October";
        }else if (sayi==11){
            result="November";
        }else if (sayi==12){
            result="December";
        }

        else {
            result = "Invalid Number";


    }
        System.out.println(result);
        System.out.println("**********************************************************************");
       /* String nameofMonth=(sayi>=1&&sayi<=12)?(sayi==1)?"January":(sayi==2)? "February": (sayi==3)?"March":
                (sayi==4)?"Aprıl":(sayi==5)?"May":(sayi==6)?"June":(sayi==7)?"July":(sayi==8)?"august":(sayi==8)?"september" +
                        :(sayi==9)?"Octeber":(sayi==10)?"November":(sayi==11)?"december":"Invalid Number";

        */



    }
}
