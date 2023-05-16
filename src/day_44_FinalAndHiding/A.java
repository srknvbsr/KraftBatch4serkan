package day_44_FinalAndHiding;

public class A {
    int a = 20;

    void metodA() {

          System.out.println(a);
    }

    static {
        System.out.println("a static çalıştı");
    }

    {
        System.out.println("a çalıştı");
    }

    {
        System.out.println("a çalıştı");
    }

    public A() {//constructor.Çünki return tipi yoktur.
        System.out.println("A constructor vaçlışır.");
    }


}

