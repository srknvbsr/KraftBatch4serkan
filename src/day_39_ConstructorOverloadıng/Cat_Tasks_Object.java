package day_39_ConstructorOverloadıng;

public class Cat_Tasks_Object {
    public static void main(String[] args) {
        Cat_Tasks cat1=new Cat_Tasks("mavi","tekir",true,true);
        System.out.println("cat1.breed = " + cat1.breed);
        System.out.println("cat1.eyeColor = " + cat1.eyeColor);
        System.out.println("cat1.isFAt = " + cat1.isFAt);
        System.out.println("cat1.isPet = " + cat1.isPet);
        cat1.run();
        cat1.food();
        cat1.sleep();
        System.out.println("cat1 = " + cat1);
    }
}
