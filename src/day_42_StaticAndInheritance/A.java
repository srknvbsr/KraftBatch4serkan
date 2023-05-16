package day_42_StaticAndInheritance;

public class A {
    public static String staticVariable = "Harun";
    public String normalVariable;


    public static void staticMethod() {
        staticMethod();
        System.out.println(staticVariable);
        System.out.println("Ben bir statik metodum");
    }

    public void normalMetod() {
        staticMethod();
        System.out.println("Ben bir normal metodum");
        System.out.println(staticVariable);
    }
}
