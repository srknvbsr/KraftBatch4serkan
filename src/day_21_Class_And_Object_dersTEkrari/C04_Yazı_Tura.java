package day_21_Class_And_Object_dersTEkrari;

import java.util.Random;
import java.util.Scanner;

public class C04_Yazı_Tura {
    public static void main(String[] args) {
        System.out.println("yaziTura() = " + yaziTura());

    }
    public static String yaziTura(){
        Random random=new Random();
        int x= random.nextInt(100);
        if(x%2==0){
            return "tura";
        }else {
            return "yazı";
        }

    }
}
