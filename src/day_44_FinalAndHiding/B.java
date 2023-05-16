package day_44_FinalAndHiding;

public class B extends A {

    int b=10;
    {
        System.out.println("b çalıştı");
    }
    static {
        System.out.println("b static instance çalıştı");
    }
   /* void metodB(){
        System.out.println(super.a);
    }

    */

    public B(){
        System.out.println("B constructor vaçlışır.");
    }

}
