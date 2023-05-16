package day_46_AbstractClassAndİnterface.animal_2;

public class Cat extends Animal implements Playable {

    public Cat(String name, String breed, char gender, int age,
               String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void eat(){
        System.out.println(getName()+"" +
                " is eating liver");
    }

   /*public void drink(){

    }
    final methods cannot be override
    */

    public void meow(){
        System.out.println(getName()+" " +
                "is meowing");
    }

    public void play() {
        System.out.println(getName()+"" +
                " is playing with mouse");

    }

}
