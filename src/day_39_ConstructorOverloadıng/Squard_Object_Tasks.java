package day_39_ConstructorOverloadıng;

public class Squard_Object_Tasks {
    public static void main(String[] args) {

        Squard_Tasks squard1=new Squard_Tasks(4);
        System.out.println("squard1.sideLength = " + squard1.sideLength);
        System.out.println("squard1.calculateArea() = " + squard1.calculateArea());
        System.out.println("squard1.calculatePerimeter() = " + squard1.calculatePerimeter());
        System.out.println("squard1 = " + squard1);

    }
}
