package day_57_OOP;

import java.util.Arrays;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class C02_mportStatements {
    public static void main(String[] args) {
        String[] group = {"Hans", "Sam", "Tony", "Jony", "Hergel", "Frank"};
        System.out.println(Arrays.toString(group));

        Arrays.sort(group);
        System.out.println(Arrays.toString(group));

        System.out.println("Math.PI = " + Math.PI);
        System.out.println("PI = " + PI);//static import method ve vareiable çağırmamız sağlar.
        System.out.println("pow(2,5) = " + (int)pow(2, 5));
        //restAssured nedir Araştır

    }
}
