package day_56_JavaRewiev;

public class C02_WrapperClass {
    public static void main(String[] args) {
        int a=99;
        int b=33;
       // a=b;
       // b=a;


        char ch='%';
        Character ch1=ch;
        System.out.println("--------------------------------------------------------");

        String str="12345";
        int i=Integer.parseInt(str);
        System.out.println("i = " + i);

        Integer j= Integer.valueOf(str);
        System.out.println("j = " + j);
        System.out.println("Integer.max(a,b) = " + Integer.max(a, b));
        System.out.println("Integer .MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Character.isDigit(ch) = " + Character.isDigit(ch));
        System.out.println("Character.isLetter(ch) = " + Character.isLetter(ch));










    }
}
