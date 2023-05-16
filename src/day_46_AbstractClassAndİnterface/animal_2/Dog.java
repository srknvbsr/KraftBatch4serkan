package day_46_AbstractClassAndİnterface.animal_2;

public class Dog extends Animal implements Playable{
    public Dog(String name, String breed,
               char gender, int age, String size,
               String color) {
        super(name, breed, gender, age,
                size, color);
    }
    public void eat(){
        System.out.println(getName()+"" +
                " is eating bone");
    }

    @Override
    public void play() {
        System.out.println(getName()+ "" +
                " is playing with a ball");
    }


    public void bark(){
        System.out.println(getName()+"" +
                " is barking");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
