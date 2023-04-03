package day_24_StringClass_Cont;

public class C07_Reverse_String {
    public static void main(String[] args) {
        String str="java programlama dili";
        String reversed="";
        for (int i = str.length()-1; i >=0; i--) {
            reversed+=str.charAt(i);


        }
        System.out.println(reversed);
    }
}
