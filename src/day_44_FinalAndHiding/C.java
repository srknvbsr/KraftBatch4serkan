package day_44_FinalAndHiding;

public class C extends B {
    int a = 5;

   void metodC() {
        System.out.println(super.a);
        System.out.println(b);
        System.out.println(this.a);
        System.out.println(super.a);//B deki a yı çeker.
        System.out.println(super.a);//B deki a yı çeker.
        super.metodA();
        metodA();



    }
    void MetodA(){
        System.out.println(super.a);

        metodA();

    }


    {
        System.out.println("c çalıştı");
    }

    public C(){//constructor.Çünki return tipi yoktur.
        System.out.println("C constructor vaçlışır.");
    }
}
