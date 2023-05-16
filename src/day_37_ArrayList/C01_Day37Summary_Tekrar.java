package day_37_ArrayList;

import java.util.Arrays;

public class C01_Day37Summary_Tekrar {
    public static void main(String[] args) {
        Boolean b= Character.isDigit(Integer.toString(100).split(" ")[0].charAt(0));
        //System.out.println(b);
        String str="asa0s1sdda12sa0sda1,210,as56sdada,ghf312fdg,";
        Arrays.toString(textOfNumber(str));
    }
    /// task2 -- string içindeki sayıları bir array içinde döndüren bir method yazın
    // asa0s1sdda12sa0sda1,210,as56sdada,ghf312fdg,////
    public static int[] textOfNumber(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                result+=str.charAt(i);//"01120112056312"
            }

        }
        String []arr=result.split(" ");//"0""1""1""2""0""1""1""2""0""5""6""3""1""2"
       int []newArray=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i]=Integer.parseInt(arr[i]);

        }
        return newArray;
    }
}
