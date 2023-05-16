package day_47_Polymorphism;

import day_46_AbstractClassAndİnterface.animal_2.Animal;
import day_46_AbstractClassAndİnterface.animal_2.Cat;
import day_46_AbstractClassAndİnterface.animal_2.Dog;
import day_47_Polymorphism.shape.Circle;
import day_47_Polymorphism.shape.Shape;

public class C01_Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Dog("Panco", "Golden", 'M', 9, "Medium", "Yellow");

        boolean isAnimal = animal instanceof Animal;
        boolean isDog = animal instanceof Dog;
        boolean isCat = animal instanceof Cat;
        System.out.println(isCat);
        System.out.println(isDog);
        System.out.println(isAnimal);
        animal.eat();
        animal.drink();
        System.out.println("-------------------------------");

        System.out.println(animal);
        ((Dog) (animal)).bark();//explicity down casting ,casting suoer type to sub type
        ((Dog) (animal)).play();//explicity down casting ,casting suoer type to sub type

        System.out.println("-------------------------------");
        System.out.println(((Dog) (animal)).toString());

        Circle circle = new Circle(6);
        circle.setRadius(10);
        System.out.println(circle.getRadius());
        System.out.println(circle.area());
        System.out.println(circle);
        Shape shape = new Circle(5);
        System.out.println(shape.getName());//Shape kendi özelliği
        System.out.println(shape.perimeter());//shapenini override edilen özelliği
        System.out.println(shape.area());//shapenini override edilen özelliği
        System.out.println(shape);


    }
}
