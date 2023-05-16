package day_33_Arrays_3;

import java.util.Arrays;
import java.util.Random;

public class C03_ArrayMethod_Tekrari {
    public static void main(String[] args) {
        String str = "Merhaba Java insanları";
        String[] sArry = str.split(" ");
        String[] sArry2 = str.split("a");
        String[] sArry3 = str.split(" Java " + " İnsanları");
        String[] sArry4 = new String[]{str};
        System.out.println("Arrays.toString(sArry4) = " + Arrays.toString(sArry4));
        System.out.println("Arrays.toString(sArry) = " + Arrays.toString(sArry));
        System.out.println("Arrays.toString(sArry2) = " + Arrays.toString(sArry2));
        System.out.println("Arrays.toString(sArry3) = " + Arrays.toString(sArry3));



        //copfOfRange
        String[] student = {"Yunus", "Serkan", "Ayşe", "Emine", "Ümit"};
        String[] ourClass = Arrays.copyOfRange(student, 1, 5);
        System.out.println(Arrays.toString(ourClass));
        //Sort
        Random random=new Random();
        int [] number=new int[10];
        for (int i = 0; i < number.length; i++) {
            number[i]=random.nextInt(100);

        }
        System.out.println("Arrays.toString(number) = " + Arrays.toString(number));
        Arrays.sort(number);
        System.out.println("Arrays.toString(number) = " + Arrays.toString(number));
        int min=number[0];
        int max=number[number.length-1];
        System.out.println("number'ın min sayısı "+min+" dir. "+"\n"+"Bu sayının max değeri "+max+" dir.");


    }
}

