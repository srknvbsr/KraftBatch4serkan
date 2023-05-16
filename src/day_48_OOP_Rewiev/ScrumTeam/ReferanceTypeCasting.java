package day_48_OOP_Rewiev.ScrumTeam;

import day_46_AbstractClassAndİnterface.animal_2.Animal;
import day_46_AbstractClassAndİnterface.animal_2.Dog;
import day_47_Polymorphism.shape.*;

public class ReferanceTypeCasting {
    public static void main(String[] args) {


        Shape shape = new Circle(5);
        System.out.println(shape.area());
        System.out.println(shape.perimeter());
        System.out.println(shape);

        Animal animal = new Dog("Lucy", "Aksaray", 'M', 5, "XL", "White");
        animal.eat();
        ((Dog) (animal)).bark();
        ((Dog) (animal)).play();

        Shape shape1 = new Squar(10);
        System.out.println(shape1.perimeter());
        System.out.println(shape1.area());
        System.out.println(shape1.getName());
        Cube cube = new Cube(5);
        cube.setSide(6);
        System.out.println(cube);
        //cube=shape1; bu şekiled bir atama yapamayız.Çünki küp shape göre daha küçük ve onu içersine koyamazsın.
        shape1=cube;
        shape1=shape;
        System.out.println(shape1 = new Circle(5));
        System.out.println(shape1 = new Triange("Üçgen", 3, 4, 5));


    }
}
