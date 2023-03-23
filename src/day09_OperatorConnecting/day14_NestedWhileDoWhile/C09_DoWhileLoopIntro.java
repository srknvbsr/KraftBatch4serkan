package day09_OperatorConnecting.day14_NestedWhileDoWhile;

public class C09_DoWhileLoopIntro {
    public static void main(String[] args) {
        boolean a = false;

        for (int i = 0;a; ){
            System.out.println("Hello world - for loop");

        }
        System.out.println("--------------------------------------------");
        while(a){
            System.out.println("Hello World - while loop");
        }
        System.out.println("--------------------------------------------");
        do{
            System.out.println("Hello World - doWhileLoop");
        }while (a);
    }
}
