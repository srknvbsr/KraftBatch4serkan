package day_57_OOP;
 class A{
    public A() {
        System.out.println("A constructorı çalışıyor. ");
    }


    public int x;
    public static int y=33;
    public void methodA(){
        System.out.println("A");

     }


}
class B extends A{
    public B() {
        super();//default olarak oluşturur.çağırmamıza gerek yok yani yazsakta olur yazmasakta olur.
        System.out.println("B constructorı çalışıyor. ");
    }
    public void methodA(){
        System.out.println("A");


    }
}












public class C04_Intheritance {
    public static void main(String[] args) {
        A obja=new A();
        B objb=new B();
        System.out.println("objb.x = " + objb.x);
objb.methodA();

    }
}
