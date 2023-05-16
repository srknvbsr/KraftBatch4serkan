package day_39_ConstructorOverloadıng;

public class C04_CarpetObject {
    public static void main(String[] args) {
        Carpet carpet1=new Carpet(1.90,2.90);
        System.out.println(carpet1.calcPrice());

        Carpet carpet2=new Carpet(3.5,5,500,true);
        System.out.println("carpet2 = " + carpet2);
        System.out.println("carpet2.calcPrice() = " + carpet2.calcPrice());
    }
}
